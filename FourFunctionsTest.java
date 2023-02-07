public class FourFunctionsTest {
   /*  public static void main(String[] args) {
        int x = 500;
       int y = 300;

        System.out.println("value of x :"+ x);
        System.out.println("value of y :" + y);

        int z = x + y; // sum
        System.out.println("sum of x and y :" + z);

        z = x-y; // subtract
        System.out.println("substraction of x and y :" + z);

        z = x * y; // multiplication
        System.out.println("Multiplication of x and y :" + z);

        z = x / y; // division
        System.out.println("x is divided by y :" + z);
    } */

    public static void main(String[] args) {
        int a = 500;
        int b = 200;

        Calculator Cal = new Calculator();
        Cal.AddThem(a,b);
        Cal.AddThem(300, 30);

        Cal.Substract(a, b);
        Cal.Substract(100, 20);

        Cal.Multiply(a, b);
        Cal.Multiply(20, 40);

        Cal.Division(a, b);
        Cal.Division(20 ,3 );


    }
}
 class Calculator{

    void AddThem(int x, int y){
        int z = x + y;
        System.out.println("sum of "+x+" and "+y+" :" + z);
    }

     void Multiply(int x, int y){
         int z = x * y;
         System.out.println("Multiplication of x and y :" + z);
     }

     void Substract(int x, int y){
         int z = x - y;
         System.out.println("Substraction of x and y :" + z);
     }

     void Division(int x, int y){
         int z = x/y;
         System.out.println("Division of x and y :" + z);
     }
}
