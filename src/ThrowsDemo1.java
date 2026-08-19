import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo1 {
    public static void main()throws IOException {
        m1();
    }
    public static void m1 ()throws IOException
    {
        m2();
    }
   public static void m2 ()throws IOException
    {
        readFile();
    }
    public static void readFile()throws IOException
    {
            BufferedReader br=new BufferedReader(new java.io.FileReader("data.txt"));
            String line= br.readLine();
            System.out.println("first line is :"+line);

    }
    //in this flow first readFile() ki exception hai woh us ne ap ne caller ko throws kar di
    //us ke baad m2() ne ap ne caller ko throws kar di
    //us ke baad m1() ne ap ne caller main() ko throws kar di
    //fir main ne pass handling code nahi is liye jvm n default exception ko throws kar di
    // this is not a good practise
    //this handled proper in ThrowsDemo2 file


}
