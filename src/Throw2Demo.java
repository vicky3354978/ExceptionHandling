public class Throw2Demo {
    static void main() {
        String password="1234";
        checkPass(password);
    }
    public static void checkPass(String pass)
    {
        if(pass.length()<6)
        {
            throw new RuntimeException("password is too short ");
        }
        System.out.println("your password is strong ");
    }
}
