public class ReturnVSFinallyBlock {
    static void main() {
        display();
    }
    public static void display()
    {
        try
        {
            System.out.println("this is try block");
            return;
        }catch (Exception e)
        {
            System.out.println("exception handled ");
        }
        finally {
            //this block always execute whether we have return or any kind of exception
            System.out.println("this is finally block ");
        }
    }

}
