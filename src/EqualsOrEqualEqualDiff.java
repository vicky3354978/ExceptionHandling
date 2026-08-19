public class EqualsOrEqualEqualDiff {
    static void main() {
        //primitive data types == content compare
        //objects == reference compare
        //primitive data types Equals() not used .
        // object equals() content compare ho ta hai
        int a=10;
        int b=20;
        int c=10;
        System.out.println(a==b);//false
        System.out.println(b==c);//false
        System.out.println(a==c);//true

        String s1="vicky";
        String s2="java";
        String s3="java";
        System.out.println(s1.equals(s2));//false because content diff hai.
        System.out.println(s2.equals(s3));//true because content is same.
        System.out.println(s2==s3);//false
        //jab string literal se create karte hai toh object scp main banta hai
        // refrance means address dekhta hai
        //kiyoki ye String contant pool mai bana object hai or usmai same object
        //nahi hote isliye satck mai jo String reffrence hota hai woh
        //scp ke same java object ko point kar raha hai is liye false aayega..


        String s4=new String("hello");
        String s5=new String("hello");
        System.out.println(s4==s5);//false
        System.out.println(s4.equals(s5));//true

    }
}
