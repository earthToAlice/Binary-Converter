import java.util.Scanner;
import java.util.Arrays;

/**
 * Binary Converter
 * A program that converts between binary and denary numbers.
 * @author earthToAlice
 */

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Please enter 'B' to convert to Binary or 'D' to convert to Denary: ");
        String convType = s.nextLine().toLowerCase();
        
        do
        {
            if (convType.equals("b"))
            {
                do
                {
                System.out.print("Please enter a number up to 255 to convert to binary: ");
                while (!s.hasNextInt())
                {
                    System.out.println("Please enter a valid number.");
                    s.next();
                }
                int input = s.nextInt();

                }
                while (input > 255);
                
                toBinary(input);

            } //if(converting to binary)
            else if (convType.equals("d"))
            {
                do
                {
                System.out.print("Please enter a number up to 11111111 to convert to denary: ");
                while (!s.hasNextInt())
                {
                    System.out.println("Please enter a valid number.");
                    s.next();
                }
                int input = s.nextInt();

                }
                while (input > 11111111);
                
                toDenary(input);

            } //else if(converting to denary)

        }
        while (!convType.equals("b") && !convType.equals("d"));
        

    } //main(String[] args)

} //Main