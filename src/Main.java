import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");

        if (in.hasNextInt())
        {
            int firstNum = in.nextInt();
            in.nextLine();
            System.out.println("Enter second number: ");

            if(in.hasNextInt())
            {
                int secondNum = in.nextInt();
                in.nextLine();

                if (firstNum > secondNum)
                {
                    System.out.println("The first number " + firstNum + " is greater than the second number " + secondNum);
                }
                else if (secondNum > firstNum)
                {
                    System.out.println("The second number " + secondNum + " is greater than the first number " + firstNum);
                }
                else
                {
                    System.out.println("The first number " + firstNum + " and the second number " + secondNum + " are equals");
                }
            }
            else
            {
                System.out.println("The second number is invalid, please rerun the program");
            }
        }
        else
        {
            System.out.println("The first number is invalid, please rerun the program");
        }
    }
}