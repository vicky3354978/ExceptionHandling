public class FinallyBlock {
    static void main() {
        int res=div(10,0);
        System.out.println(res);
    }
    public static int div(int a,int b)
    {
        int result=0;
        try
        {
            System.out.println("inside the try block");
            result=a/b;
            System.out.println("exception raised");//this line not execute

        }catch (ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println("exception occured");
        }
        finally {
            //this is used to put clean up code like close db connection and deletion of objects etc...
            System.out.println("this finally block always execute whether exception occur or not ");
        }
        return result;
    }

}
