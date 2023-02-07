public class Student {
    public static void main(String[] args) {

        StudentInfo St1 = new StudentInfo();
        StudentInfo St2 = new StudentInfo();
        StudentInfo St3 = new StudentInfo();
        StudentInfo St4 = new StudentInfo();

        St1.setStudentInfo("Kamal Gurung", "Computer Science", 34647 );
        St2.setStudentInfo("Dhawa Lama", "Mathematics", 5367 );
        St3.setStudentInfo("Samridha Malla", "Computer Science", 34647 );
        St4.setStudentInfo("shailesh Ghale", "Economics", 578438 );

        St1.PrintInfo();
        St2.PrintInfo();
        St3.PrintInfo();
        St4.PrintInfo();

    }

}
class StudentInfo{
    private String name;
    private String faculty;
    private int SectionNumber;

    void setStudentInfo(String x, String y, int z){
        name = x;
        faculty = y;
        SectionNumber = z;

    }
    void PrintInfo() {
        System.out.println("My name is:" + name);
        System.out.println("My faculty is:" + faculty);
        System.out.println("My class section is:" + SectionNumber);
        System.out.println(".............................");


    }
}