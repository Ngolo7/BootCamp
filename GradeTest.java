public class GradeTest {
    public static void main(String[] args) {

        Student1 studentObj1 = new Student1();
        Student1 studentObj2 = new Student1();
        Student1 studentObj3 = new Student1();

        studentObj1.setStudent("Dawa Lama", 56.56f);
        studentObj2.setStudent("Samridha Malla", 95.56f);
        studentObj3.setStudent("Shailesh Ghale", 85.56f);

        studentObj1.CalculateGrade1();
        studentObj2.CalculateGrade1();
        studentObj3.CalculateGrade1();

        studentObj1.Message();
        studentObj2.Message();
        studentObj3.Message();

        studentObj1.Message1();
        studentObj2.Message1();
        studentObj3.Message1();


    }
}
class Student1{
    char YourGrade;
    String YourName;
    float YourMarks;

    public void setStudent(String yn, float ym){
     YourName = yn;
     YourMarks = ym;
    }

    void CalculateGrade1()
    {
     if(YourMarks >=1 && YourMarks <35) // 34.99999999999999999 is included, but not 35
     YourGrade='F';
        else if(YourMarks >=35 && YourMarks <45)
     YourGrade='E';
        else if(YourMarks >=45 && YourMarks <65)
     YourGrade='D';
        else if(YourMarks >=65 && YourMarks <75)
     YourGrade='C';
        else if(YourMarks >=75 && YourMarks <90)
     YourGrade='B';
        else if(YourMarks >=90 && YourMarks <=100)
     YourGrade='A';

     printGradeCard(); //no need of .(dot) here ...

 }
 void printGradeCard(){
     System.out.println(YourName+", your marks are :"+YourMarks+" hence your grade is : "+YourGrade);
 }
 void Message(){
        if(YourMarks > 65){
            System.out.println(YourName+"You are pass!!");
        }
 }
 void Message1(){
        if(YourMarks<65){
            System.out.println("Sorry" +YourName+"You are fail!!");

        }
 }
 }
