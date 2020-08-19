package mysql;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO
{
    public String getNextInput()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            return reader.readLine();
        }
        catch(IOException e)
        {
            System.out.println("Error when trying to get input from user!");
        }
        return null;
    }
}
