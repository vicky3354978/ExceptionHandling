import java.util.Scanner;

public class UserInputAndWrapperClass {
    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter your name ");
        String name=in.next();
        System.out.println("my name is :"+name);

        System.out.println("enter your age ");
        int age=in.nextInt();
        System.out.println("my age is :"+age);

        System.out.println("enter your percentage ");
        float per=in.nextFloat();
        System.out.println("your percentage :"+per);


        String s="44.5";
        float marks=Float.parseFloat(s);
        System.out.println("float number is :"+marks);

        //jo hum console se inout late hai woh String ho ti hai
        //bu jvm usko convert de ta hai int float jesa hum ch hate hai us ke li ye woh wrapper class ka
        //use kar ta hai
    }
}
