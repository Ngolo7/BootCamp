//import java.lang.Math;
public class Calculator {
    public static void main(String[] args) {

        CalculateInterest CalInt1 = new CalculateInterest();
        CalculateInterest CalInt2 = new CalculateInterest();
        CalculateInterest CalInt3 = new CalculateInterest();

        CalInt1.setValue(5000, 4,3,2);
        CalInt2.setValue(10000,3.56,4.5,7);
        CalInt3.setValue(5000, 4.2,3.7,5);




     /*   CalInt1.calculate();
        CalInt2.calculate();
        CalInt3.calculate();


        CalInt1.printResult();
        CalInt2.printResult();
        CalInt3.printResult(); */

    }

}

class CalculateInterest{
    private double principal, time, rate, si, ci;
     private int number;

    void setValue(double p, double t, double r, int n){
        principal = p;
        time = t;
        rate = r;
        number = n;
        calculate();
    }
    void calculate(){
        si = (principal*time*rate)/100;
         ci = principal* (Math.pow((1+ rate/100),(time*number))) - principal;


      printResult();
    }
    void printResult(){
        System.out.println("The Principal is : " +principal);
        System.out.println("The Principal is : " +time);
        System.out.println("The Principal is : " +rate);
        System.out.println("The Principal is : " +number);
        System.out.println("The Simple Interest is : " +si);
        System.out.println("The compound Interest is : " +ci);
        System.out.println("...........................");

    }
}
