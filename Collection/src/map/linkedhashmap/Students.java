package map.linkedhashmap;

public class Students {
    private Integer no;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    private String name;
    private Integer note;

    public Students(Integer no, String name, Integer note) {
        this.no = no;
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }
}
