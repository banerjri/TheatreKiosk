import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int Age;
        System.out.print("Enter your Age : ");
        if(in.hasNextInt())
        {
            Age = in.nextInt();
            in.nextLine();
            if(Age > 21)
            {
                System.out.print("\nYou get a Wrist Band");
            }
        }
    }
}