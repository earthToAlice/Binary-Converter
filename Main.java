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

        String convType = typeToConvertTo(s);
        int input = convPrompt(s, convType);
        String result = (convType.equals("b")) ? toBinary(input) : toDenary(input);

        System.out.println(result);

    } //main(String[] args)

    static String typeToConvertTo(Scanner s)
    {
        String convType = "";

        do
        {
            System.out.print("Please enter 'B' to convert to Binary or 'D' to convert to Denary:\n");

            while (!s.hasNextLine())
            {
                System.out.println("Please enter a valid letter.");
            }

            convType = s.nextLine().toLowerCase();

        }
        while (!convType.equals("b") && !convType.equals("d"));

        return convType;

    } //typeToConvertTo(Scanner s)

    static int convPrompt(Scanner s, String convType)
    {
        int input;
        String IN_TYPE;
        String CONV_TYPE;

        switch (convType)
        {
            case "b":
                CONV_TYPE = "binary";
                IN_TYPE = "denary";
                break;
            
            case "d":
                CONV_TYPE = "denary";
                IN_TYPE = "binary";
                break;

            default:
                CONV_TYPE = "";
                IN_TYPE = "";
        } //switch(convType)
        
        do
        {
            System.out.printf("Please enter a %s number to convert to %s:\n", IN_TYPE, CONV_TYPE);
            while (!s.hasNextInt())
            {
                System.out.println("Please enter a valid number.");
                s.next();
            }
            input = s.nextInt();

        } //do while (invalid binary num);
        while(IN_TYPE.equals("binary") && !validBinary(input));

        return input;

    } //convPrompt(char convType)

    static boolean validBinary(int in)
    {
        int input = in;

        for (int i = Integer.toString(in).length() - 1; i >= 0; i--)
        {
            if ((input % 10 != 0) && (input % 10 != 1)) return false;
            input /= 10;

        } //for(i)

        return true;

    } //validBinary(int in)

    static String toBinary(int in)
    {
        float input = in;
        String result = "";

        while (input >= 1)
        {
            if ((input % 2) >= 1)
            {
                result = "1" + result;
            }
            else if ((input % 2) < 1)
            {
                
                result = "0" + result;
            }

            input /= 2;

        } //while(input >= 1)
        
        return result;
    
    } //toBinary(int in)

    static String toDenary(int in)
    {
        int result = 0;
        int input = in;
        
        for (int i = 0; i < Integer.toString(in).length(); i++)
        {
            if (input % 10 == 1) result += (int) Math.pow(2, i);
            input /= 10;

        } //for(i)
        
        return Integer.toString(result);
        
    } //toDenary(int in)

} //Main