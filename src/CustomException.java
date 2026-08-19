public class CustomException {
    static void main() {
        int marks=-1;
        try
        {
            check(marks);
        }
        catch (InvaildMarksException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void check(int marks) throws InvaildMarksException
    {
        if(marks<0||marks<100 )
        {
            throw new InvaildMarksException("invalid marks ");
        }
        System.out.println("marks is between 1 to 100");

    }

}
class InvaildMarksException extends Exception{
    public InvaildMarksException(String message)
    {
        super(message);
    }

}
