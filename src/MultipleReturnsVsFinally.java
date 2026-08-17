public class MultipleReturnsVsFinally {
    static void main() {
        int res=m1();
        System.out.println(res);
    }
    public static int m1()
    {
        try
        {
            System.out.println(10/0);
            return 111;
        } catch (Exception e) {
            //how to stop finally to execute?
           // System.exit(0);
            //System.exit(0);---->iss line se jvm shutdown ho jayega jisse aage ka code execute nahi hoga..
          return 222;
        }
        finally
        {
            return 7676;
        }
    }
}
//iska output 7676 aayega because catch block ke return ki value jayegi res ke pass but finally ki value
//usko overwrite kar degi jisse iska answer 7676 aayega.
