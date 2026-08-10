public class ExceptionTry {
    static void main() {
        System.out.println("before try");
        try
        {
            System.out.println("inside the try block");
            System.out.println(10/0);
            //is line ke baad koi bhi code try block execute nahi hoga
            //wohside catch block exe kar dega because of riskky code
            System.out.println("next line of risky code ");
        } catch (Exception e) {
            System.out.println("this is catch block");
            ///catch block tabhi chalega jo exception occur hogi
            e.printStackTrace();
        }
        System.out.println("program is completed");
    }
}
