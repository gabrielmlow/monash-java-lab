public class Student {

    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        setName(name);
        setID(id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getID() {
        return this.id;
    }


}
