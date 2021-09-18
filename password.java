import java.util.Scanner;

class Password {

    /*
    Generates a random password that:
    Has at least one capital letter
    Is at least 8 characters long
    Has at least one number
    Has at least one of the following symbols: ., $, %, @, #
    */
    public void genPass()
    {

    }

    /*
    Checks password to see if it meets requirements.
    Must:
    Have at least one capital letter
    Be at least 8 characters long
    Have at least one number
    Have at least one of the following symbols: ., $, %, @, #
    */
    public void checkPass()
    {

    }

    public Password()
    {

    }

    public static void main (String[] args)
    {
        /*Initializes scanner and asks user for an auto generated password.
         If user says "yes", program generates password.
         If user says "no", user must create a password that matches certain criteria. If password does not meet requirements, system prints "invalid password".
         If user says anything else, print "Invalid input" and loops back.
        */
        Password pass = new Password();
        boolean validInput = false;
        Scanner scan = new Scanner(System.in);    
        while (validInput == false)
        {
            System.out.println("Would you like me to generate a password for you? 'yes' or 'no'");
            String input = scan.nextLine();
            if (input.equals("yes"))
            {
                pass.genPass();
            }
            else if (input.equals("no"))
            {
                System.out.println("Please enter a password that:");
                System.out.println("    Has at least one capital letter");
                System.out.println("    Is at least 8 characters long");
                System.out.println("    Has at least one number");
                System.out.println("    Has at least one of the following symbols: ., $, %, @, #");
            }
            else
            {
                System.out.println("Invalid input");
                System.out.println(input);
            }
        }
        scan.close();
    }
}
