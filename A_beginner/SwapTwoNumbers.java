import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of variable a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of variable b: ");
        int b = sc.nextInt();

        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Swapped Values of a : " + a + "\n" + "Swapped Value of b :" + b);

        //---------------------------------------------------------------------------------

        //Without creating a temp variable.

        int c = 10;
        int d = 20;

        System.out.println("Before swap: c = " + c + ", d = " + d);

        c = c + d; // c = 10 + 20 = 30
        d = c - d; // d = 30 - 20 = 10
        c = c - d; // c = 30 - 10 = 20
        System.out.println("After swap: c = " + c + ", d = " + d);
    }
}
