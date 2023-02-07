public class IfTest {
    public static void main(String[] args) {
        int age = 19;
        int qualifiedAge = 21;
        int maxHumanAge = 120;

        System.out.println("Begin with main");
        //operand1 >= operand2

        if (age < 0)
            System.out.println("Invalid human age");
        else {

            if (age > maxHumanAge) {
                System.out.println("Usually human age should not exceed 120");
            } else {
                if (age >= qualifiedAge) {
                    System.out.println("You have freedom to drink");
                    System.out.println("Yahoo!!!!");
                } else {
                    System.out.println("You cannot drink");
                    System.out.println("So sad!!!");
                }
            }
            System.out.println("End of main");

        }
    }
}
