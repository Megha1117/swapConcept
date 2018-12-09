package swapcon;

public class SwapStr {

    public static void main(String[]args) {

        String a = "Selenium";
        String b = "Java";

        System.out.println("Befor Swapping");
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);

        a = a+b;
        b = a.substring(0, a.length()-b.length());
        a = a.substring(b.length());

        System.out.println("After Swapping");
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);


    }
}
