import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch(fruit){
            case "mango":
                System.out.println("Yellow");
                break;
            case "apple":
                System.out.println("Red");
                break;
            default:
                System.out.println("Something else");
        }
    }
}
