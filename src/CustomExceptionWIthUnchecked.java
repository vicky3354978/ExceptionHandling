public class CustomExceptionWIthUnchecked {
    static int bal=10000;

    static void main() {
        int amount=100000;
        withdraw(amount);
    }
    public static void withdraw(int amount)
    {
        if(bal<amount)
        {
            throw new LowBalanceException("insufficient balance");
        }
        System.out.println("the total amount after withdraw :"+(bal-amount));
    }

}
class LowBalanceException extends RuntimeException
{
   public LowBalanceException(String message)
    {
        super(message);
    }

}
