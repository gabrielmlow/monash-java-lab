public class MasterStudent extends Student {

    private String qualification;

    public MasterStudent(int id, String name, String qualification) {
        super(id, name);
        setQualification(qualification);
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return this.qualification;
    }
}
