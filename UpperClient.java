import java.rmi.*;
import java.util.Scanner;

public class UpperClient
{
    public static void main(String[] args)
    {
        try
        {
            int serverPort = 1900;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a lowercase letter: ");
            char c = scanner.next().charAt(0);

            UpperInterface s = (UpperInterface) Naming.lookup("rmi://127.0.0.1:" + serverPort + "/myapp");
            System.out.println("Output: " + s.toUpper(c));
        }
        catch (ConnectException conEx)
        {
            System.out.println("Unable to connect to server!");
            System.exit(1);
        }
        catch (Exception ex)
        {
            System.out.println("Error: " + ex);
            System.exit(1);
        }
    }
}
