public class ThrowDemo1 {
    static void main() {
        int age=14;
        validAge(age);
    }
    public static void validAge(int age)
    {
        if(age<18)
        {
            //System.out.println(10/0);
            throw new IllegalArgumentException("age is invalid ");
            //object created by jvm...
            //handover to default Exception
            //but in the case of throw we can create own object using throw
        }
        System.out.println("age is approved :");
    }
}
