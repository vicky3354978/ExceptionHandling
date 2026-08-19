public class MultipleCatch {
    static void main() {
        String a=null;
        String name="vicky";
        int[] arr={1,2,3};
        try
        {
            System.out.println(a.length());
            int b=Integer.parseInt(name);
            System.out.println(b);
            System.out.println(arr[4]);
        }
        catch(NullPointerException e)
        {
            System.out.println("null error");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("index out of bound");
        } catch (NumberFormatException e) {
            System.out.println("worng input ");;
        }
    }
}
