import java.util.Scanner; //availing it for your use
public class LoopTest {
    public static void main(String[] args) {

        System.out.println("DreamPlaces where I want to go:");
        System.out.println("-------");
        System.out.println("1. Korea");
        System.out.println("2. Thailand");
        System.out.println("3. Indonesia");
        System.out.println("4. Switzerland");
        Scanner scanner = new Scanner(System.in); //Keyboard
        System.out.print("Select the choice:");
        int choice = scanner.nextInt(); //accept value from the user

        switch (choice)
        {
            case 1: System.out.println("Seoul");
                System.out.println("Damn!! bro we are finally in Seoul");; break;
            case 2:
                System.out.println("Bangkok");
                System.out.println("one of the best place to visit");break;
            case 3: System.out.println("Bali");
                System.out.println("Dream place to visit");
                System.out.println("its a heaven");break;
            case 4:
                System.out.println("Out of money!");break;
            default:
                System.out.println("Wrong input");break;

        }
    }
}