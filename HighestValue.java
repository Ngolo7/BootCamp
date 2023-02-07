public class HighestValue {
    public static void main(String[] args) {

        //System.out.println("Enter the number:");
        HighestV High = new HighestV();
        HighestV High1 = new HighestV();
        HighestV High2= new HighestV();

        High.setNum(4,8,2);
        High1.setNum(9,-8,10);
        High2.setNum(-7,-7,-6);

        High.FindHighest();
        High1.FindHighest();
        High2.FindHighest();

        High.PrintHigh();
        High1.PrintHigh();
        High2.PrintHigh();



    }
}
class HighestV{
    private int a, b, c;
    int highestValue = 0;

    void setNum(int x, int y, int z){
        a =x;
        b = y;
        c = z;
    }
    void FindHighest(){
        //int highestValue = 0;
        if(a>b && a>c){
            highestValue = a;
        }
        else
            if (b>a && b>c)
                highestValue = b;
            else
                highestValue =c;

    }

    void PrintHigh(){
        System.out.println("The highest number among  "  +a+ "," +b+  " and " +c+  "  is: "  +highestValue);
    }

}
