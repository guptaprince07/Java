// // class Main{
// //     public static void main(String[] args) {
// //         int a=12;
// //         int b=20;
// //         a+=b+10;
// //         System.out.println(a);
// //     }
// // }

// class Main {
//     public static void main(String[] args) {

//         int a = 20;
//         int b = 10;

//         System.out.println("a + b = " + (a + b));
//         System.out.println("a - b = " + (a - b));
//         System.out.println("a * b = " + (a * b));
//         System.out.println("a / b = " + (a / b));
//         System.out.println("a % b = " + (a % b));

//         System.out.println("++a = " + (++a));
//         System.out.println("a++ = " + (a++));
//         System.out.println("After a++ = " + a);

//         System.out.println("--b = " + (--b));
//         System.out.println("b-- = " + (b--));
//         System.out.println("After b-- = " + b);

//         int x = 10;
//         System.out.println("Initial x = " + x);

//         x += 5;
//         System.out.println("x += 5  -> " + x);

//         x -= 3;
//         System.out.println("x -= 3  -> " + x);

//         x *= 2;
//         System.out.println("x *= 2  -> " + x);

//         x /= 4;
//         System.out.println("x /= 4  -> " + x);

//         x %= 3;
//         System.out.println("x %= 3  -> " + x);
//         int p = 15;
//         int q = 20;

//         System.out.println("p == q : " + (p == q));
//         System.out.println("p != q : " + (p != q));
//         System.out.println("p > q  : " + (p > q));
//         System.out.println("p < q  : " + (p < q));
//         System.out.println("p >= q : " + (p >= q));
//         System.out.println("p <= q : " + (p <= q));

//         boolean first = true;
//         boolean second = false;

//         System.out.println("first && second = " + (first && second));
//         System.out.println("first || second = " + (first || second));
//         System.out.println("!first = " + (!first));
//         System.out.println("!second = " + (!second));
//     }
// }

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println();
//         sc.close(); 
//     }
// }

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        double sum        = num1 + num2;
        double difference = num1 - num2;
        double product    = num1 * num2;
        double quotient   = num1 / num2;
        double remainder  = num1 % num2;
        
        System.out.println("(+):" + sum);
        System.out.println("(-):" + difference);
        System.out.println("(*):" + product);
        System.out.println("(/):" + quotient);
        System.out.println("(%): " + remainder);
        sc.close();
    }
}