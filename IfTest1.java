public class IfTest1 {
    public static void main(String[] args) {
        int age = 23;
        int qualifiedAge = 21;
        int maxHumanAge = 120;

        System.out.println("Begin with main");

        //operand1 >= operand2

        if (age < 0 | age > maxHumanAge)
        {
            System.out.println("Invalid human age");
            //System.out.println("Usually human age should not exceed 120");
            }
        else
                if (age >= qualifiedAge && age <= maxHumanAge)
                {
                    System.out.println("You have freedom to drink");
                    System.out.println("Yahoo!!!!");
                }
                else
                {
                    System.out.println("You cannot drink");
                    System.out.println("So sad!!!");
                }

            System.out.println("End of main");

        }
    }

