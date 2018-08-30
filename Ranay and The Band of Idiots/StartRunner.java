import java.util.Scanner;
public class StartRunner
{
    public static void main(String[] args)
    {
        opening x = new opening();
        x.warning();
        Scanner in = new Scanner(System.in);
        String statement = in.nextLine();
        if (statement != "exit")
        {
            x.startMenu();
            statement = in.nextLine();
        }

    }
}