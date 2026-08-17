public class TryWithMultipleCatchBlock {
    static void main() {
        int res=data();
        System.out.println(res);
    }
    public static int data()
    {
        int arr[]={1,0,2,3,4,5,6,78};
        try
        {
            //int res=arr[0]/arr[1];
            int res=arr[20];
        }catch (ArithmeticException ex)
        {
            System.out.println("ArithmeticException ");
            ex.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ea) {
            System.out.println("ArrayIndexOutOfBoundsException");
            ea.printStackTrace();
        }catch (Exception e)
        {
            System.out.println("exception");
            e.printStackTrace();
        }
        return 0;
    }

}
