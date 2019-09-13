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

        char convType = typeToConvertTo(s);

    } //main(String[] args)

    static char typeToConvertTo(Scanner s)
    {
        String convType = "";

        do
        {
            System.out.print("Please enter 'B' to convert to Binary or 'D' to convert to Denary: ");

            while (!s.hasNextLine())
            {
                System.out.println("Please enter a valid letter.");
            }

            convType = s.nextLine().toLowerCase();

        }
        while (!convType.equals("b") && !convType.equals("d"));

        return convType;

    } //typeToConvertTo(Scanner s)

    static void convPrompt(char convType)
    {
        int MAX_NUM;
        String CONV_TYPE;

        switch (convType)
        {
            case 'b':
                MAX_NUM = 255;
                CONV_TYPE = "binary";
                break;
            
            case 'd':
                MAX_NUM = 11111111;
                CONV_TYPE = "denary";
                break;

            default:
                MAX_NUM = 0;
                CONV_TYPE = "";
        }

        do
        {
            System.out.printf("Please enter a number up to %i to convert to %s: ", MAX_NUM, CONV_TYPE);
            while (!s.hasNextInt())
            {
                System.out.println("Please enter a valid number.");
                s.next();
            }
            int input = s.nextInt();

        } //do while(invalid input)
        while (input > MAX_NUM);

    } //convPrompt(char convType)

} //Main