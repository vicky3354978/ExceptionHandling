import java.io.BufferedReader;
import java.io.IOException;

public class ThrowsDemo2 {
    static void main() {
        try
        {
            readFile();
        }
       catch (IOException e)
       {
           System.out.println("file not found "+e.getMessage());
       }
    }
    public static void readFile()throws IOException
    {
        BufferedReader br=new BufferedReader(new java.io.FileReader("data.txt"));
        String line= br.readLine();
        System.out.println("first line is :"+line);

    }
    //in this program readfile ne apne caller ko exception throw karne ko kah diya
    //fir usne exception ka handle kiya
    //throws ka use tab karte hai jab hume apne caller function se exception handle karani ho
}
