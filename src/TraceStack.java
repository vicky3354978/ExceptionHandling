public class TraceStack {
    static void main() {
        goTOShowRoom();
    }
    public static void goTOShowRoom()
    {
        System.out.println("go to showroom");
        ChooseCar();

    }
    public static void ChooseCar()
    {
        System.out.println("Choose car");
        testDrive();
    }
    public static void testDrive()
    {
        System.out.println("get the test drive");
        paperwork();
    }
    public static void paperwork()
    {
        System.out.println("paper work is done ");
        try
        {
            payment();
        } catch (Exception e) {
            System.out.println("payment is done");
            e.printStackTrace();
        }

    }
    public static void payment()
    {
        System.out.println(10/0);
        //System.out.println("payment is done");
    }
}
