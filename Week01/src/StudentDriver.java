public class StudentDriver {

    public static void main(String[] args) {
        Student student = new Student(32277679, "John Doe");
//
//        student.setName("John Doe");
//        student.setID(32277679);

        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getID());
        System.out.println("************************************");


        MasterStudent masterStudent = new MasterStudent(31166787, "Lee Lee", "BSC in ComSci");

        System.out.println("ID: " + masterStudent.getID());
        System.out.println("Name: " + masterStudent.getName());
        System.out.println("Qualification: " + masterStudent.getQualification());
    }
}
