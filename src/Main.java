import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        //Declare Int birthMonth as ""
        //output "Please enter your birth month [1-12]: "
        //input birthMonth
        //test if it's an integer then test if it's within the valid range, if not error message
        //output "You entered that your birth month is: " + birthMonth + "."
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        //Now to test value for being a proper integer
        System.out.print("Please enter your birth month [1-12]: ");
        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Please enter a valid month [1-12] not :" + trash);
            System.out.println("Please run the program again with only a number within the proper range.");
            System.exit(0);
        }

        //Now to test values for being in proper range
        if (birthMonth < 1 || birthMonth > 12)
        {
            System.out.println("You entered a number outside of range of months.");
        }
        else
        {
            System.out.println("You entered " + birthMonth + " as your birth month.");
        }
    }
}