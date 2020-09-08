package Day11ExceptHand.Ques2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExample {
    public static void main(String[] args) throws IOException

    {
        try
        {
            FileInputStream fis = new FileInputStream("test.txt");
            int data1;
            while((data1 = fis.read()) != -1 )

            {
                System.out.print((char)data1);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }
}
