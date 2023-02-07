import javax.lang.model.element.Name;

public class SalaryScale {
    public static void main(String[] args) {

        Scale EmployeeObj1 = new Scale();
        Scale EmployeeObj2 = new Scale();
        Scale EmployeeObj3 = new Scale();
        Scale EmployeeObj4 = new Scale();
        Scale EmployeeObj5 = new Scale();

        EmployeeObj1.setEmployee("Sandy", 60000);
        EmployeeObj2.setEmployee("Yangchen", 45000);
        EmployeeObj3.setEmployee("Suresh", 50000);
        EmployeeObj4.setEmployee("Dawa", 19500);
        EmployeeObj5.setEmployee("Unknown",0);



        //EmployeeObj.SalaryScale();



    }
}
class Scale {
    String name;
    private double YourSalary;
    double MinimumSalary = 20000;
    double CommonSalary = 50000;

    void setEmployee(String n, double s){
        name = n;
       YourSalary = s;
        System.out.println("Name of the Employee is :"+name);
        System.out.println(name+ "salary is :" +s);
        SalaryScale();
        System.out.println("----------------------");
    }

    char SalaryScale() {
        if (YourSalary <= 0)
            System.out.println("Invalid salary");

        else if (YourSalary <= MinimumSalary) {
            System.out.println(name+ "salary Scale is :" + 'L');
            return 'L';
        }
        else if (YourSalary > MinimumSalary && YourSalary<= CommonSalary) {
            System.out.println(name+ "salary Scale is :" + 'M');
            return 'M';
        }
        else {
            System.out.println(name + "salary Scale is :" + 'H');
            return 'H';
        }
        return 0;
    }
}






