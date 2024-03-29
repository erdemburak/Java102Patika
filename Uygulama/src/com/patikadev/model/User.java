package com.patikadev.model;

import com.patikadev.helper.DbConnector;
import com.patikadev.helper.Helper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class User {

    private Integer id;
    private String name;
    private String uname;
    private String pass;
    private String type;

    public User (){}

    public User(Integer id, String name, String uname, String pass, String type) {
        this.id = id;
        this.name = name;
        this.uname = uname;
        this.pass = pass;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static ArrayList<User> getList(){
        ArrayList<User> userList = new ArrayList<>();
        String query = "SELECT * FROM tbl_user";
        User obj;
        try {
            Statement st = DbConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                obj = new User();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUname(rs.getString("uname"));
                obj.setPass(rs.getString("pass"));
                obj.setType(rs.getString("type"));
                userList.add(obj);
            }

            st.close();
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }

    public static boolean add(String name, String uname, String pass, String type) {

        String query = "INSERT INTO tbl_user (name,uname,pass,type) VALUES(?,?,?,?)";

        User findUser = User.getFetch(uname);
        if(findUser != null){
            Helper.showMessage("Kullanıcı adı mevcut!!");
            return false;
        }

        try {
            PreparedStatement pr = DbConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            pr.setString(2, uname);
            pr.setString(3, pass);
            pr.setString(4, type);
            int response = pr.executeUpdate();

            if(response == -1){
                Helper.showMessage("error");
            }
            pr.close();
            return response != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static User getFetch(String uname){
        User obj = null;
        String query = "SELECT * FROM tbl_user WHERE uname = ?";

        try {
            PreparedStatement pr = DbConnector.getInstance().prepareStatement(query);
            pr.setString(1,uname);
            ResultSet rs = pr.executeQuery();

            if (rs.next()){
                obj = new User();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUname(rs.getString("uname"));
                obj.setPass(rs.getString("pass"));
                obj.setType(rs.getString("type"));
            }

            pr.close();
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return obj;
    }

    public static User getFetch(int id){
        User obj = null;
        String query = "SELECT * FROM tbl_user WHERE id = ?";

        try {
            PreparedStatement pr = DbConnector.getInstance().prepareStatement(query);
            pr.setInt(1,id);
            ResultSet rs = pr.executeQuery();

            if (rs.next()){
                obj = new User();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUname(rs.getString("uname"));
                obj.setPass(rs.getString("pass"));
                obj.setType(rs.getString("type"));
            }

            pr.close();
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return obj;
    }

    public static User getFetch(String uname,String pass){
        User obj = null;
        String query = "SELECT * FROM tbl_user WHERE uname = ? AND pass = ? ";

        try {
            PreparedStatement pr = DbConnector.getInstance().prepareStatement(query);
            pr.setString(1,uname);
            pr.setString(2,pass);
            ResultSet rs = pr.executeQuery();

            if (rs.next()){
                switch (rs.getString("type")){
                    case "operator":
                        obj = new Operator();
                        break;
                    default:
                        obj = new User();
                }
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUname(rs.getString("uname"));
                obj.setPass(rs.getString("pass"));
                obj.setType(rs.getString("type"));
            }

            pr.close();
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return obj;
    }

    public static boolean delete(int id){
        String query = "DELETE FROM tbl_user WHERE id = ?";
        ArrayList<Course> courseList = Course.getListByUser(id);
        for(Course c : courseList){
            Course.delete(c.getId());
        }

        boolean key = true;
        try {
            PreparedStatement pr = DbConnector.getInstance().prepareStatement(query);
            pr.setInt(1,id);

            key = pr.executeUpdate() != -1;
            pr.close();
            return key;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return key;
    }

    public static boolean update(int id, String name, String uname, String pass,String type){
        String query = "UPDATE tbl_user SET name =?,uname=?,pass=?,type=? WHERE id =?";
        String[] typeList = {"operator", "student", "educator"};

        User findUser = User.getFetch(uname);

        for (String s : typeList) {
            if (!s.equals(type) && findUser.getId() != id) {
                return false;
            }
        }
        if(findUser != null && findUser.getId() != id){
            Helper.showMessage("Kullanıcı adı mevcut!!");
            return false;
        }


        boolean key = true;
        try {
            PreparedStatement pr = DbConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            pr.setString(2, uname);
            pr.setString(3, pass);
            pr.setString(4, type);
            pr.setInt(5, id);
            key = pr.executeUpdate() != -1;
            pr.close();
            return key;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return key;
    }

    public static ArrayList<User> searchUserList(String query){
        ArrayList<User> userList = new ArrayList<>();
        User obj;
        try {
            Statement st = DbConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                obj = new User();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUname(rs.getString("uname"));
                obj.setPass(rs.getString("pass"));
                obj.setType(rs.getString("type"));
                userList.add(obj);
            }

            st.close();
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }

    public static String searchQuery(String name, String uname, String type){
        String query = "SELECT * FROM tbl_user WHERE uname LIKE '%{{uname}}%' AND name LIKE '%{{name}}%'";
        query = query.replace("{{uname}}", uname);
        query = query.replace("{{name}}", name);

        if(!type.isEmpty()){
            query += "AND type = '{{type}}'";
            query = query.replace("{{type}}", type);
        }

        return query;
    }

}
