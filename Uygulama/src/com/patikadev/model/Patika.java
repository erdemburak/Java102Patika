package com.patikadev.model;

import com.patikadev.helper.DbConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Patika {

    private Integer id;
    private String name;

    public Patika(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    public static ArrayList<Patika> getList(){
        ArrayList<Patika> patikaList = new ArrayList<>();
        Patika obj;

        try {
            Statement st = DbConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM patika");
            while (rs.next()){
                obj = new Patika(rs.getInt("id"), rs.getString("name"));
                patikaList.add(obj);
            }
            st.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return patikaList;

    }

    public static boolean add(String name){
        String query = "INSERT INTO patika (name) VALUES (?)";
        boolean key = true;
        try {
            PreparedStatement pr = DbConnector.getInstance().prepareStatement(query);
            pr.setString(1,name);
            key = pr.executeUpdate() != -1;
            pr.close();
            return key;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return key;
    }

    public static boolean update(Integer id, String name){
        String query = "UPDATE patika SET name = ? WHERE id = ?";

        try {
            PreparedStatement pr = DbConnector.getInstance().prepareStatement(query);

            pr.setString(1, name);
            pr.setInt(2,id);

            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;

    }

    public static Patika getFetch(int id){
        Patika obj = null;
        String query = "SELECT * FROM patika WHERE id = ?";
        try {
            PreparedStatement pr = DbConnector.getInstance().prepareStatement(query);
            pr.setInt(1,id);
            ResultSet rs = pr.executeQuery();
            if(rs.next()){
                obj = new Patika(rs.getInt("id"), rs.getString("name"));
            }
            pr.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }
    public static boolean delete(int id){
        String query = "DELETE FROM patika WHERE id = ?";
        ArrayList<Course> courseList = Course.getList();
        for(Course obj : courseList){
            if(obj.getPatika().getId() == id){
                Course.delete(obj.getId());
            }
        }
        try {
            PreparedStatement pr = DbConnector.getInstance().prepareStatement(query);
            pr.setInt(1,id);

            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

}
