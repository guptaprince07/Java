import java.util.*;
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

// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         double num1 = sc.nextDouble();
//         System.out.print("Enter second number: ");
//         double num2 = sc.nextDouble();
//         double sum        = num1 + num2;
//         double difference = num1 - num2;
//         double product    = num1 * num2;
//         double quotient   = num1 / num2;
//         double remainder  = num1 % num2;
        
//         System.out.println("(+):" + sum);
//         System.out.println("(-):" + difference);
//         System.out.println("(*):" + product);
//         System.out.println("(/):" + quotient);
//         System.out.println("(%): " + remainder);
//         sc.close();
//     }
// }

// class Main{
//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int age=sc.nextInt();
//         if(age>=18){
//             System.out.println("You are eligible to vote");
//         }
//         else{
//             System.out.println("You are not eligible to vote");
//         }
// }
// }

// class Main{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int no=sc.nextInt();
//         if(no >0 && no<=10){
//             System.out.println("range 0-10");
//         }
//         else if(no>10 && no<=20){
//             System.out.println("range 11-20");
//         }
//         else if(no>20 && no<=30){
//             System.out.println("range 21-30");
//         }
//         else if(no>30 && no<=40){
//             System.out.println("range 31-40");
//         }
//         else if(no>40 && no<=50){
//             System.out.println("range 41-50");
//         }
//     }
// }

// class Main{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int day=sc.nextInt();
//         switch (day){
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thrusday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Enter valid day");
//         }
//     }
// }

// class Main{
//     public static void main(String args[]){
//         for(int i=0;i<=10;i++){
//             System.out.println("Hello");
//         }
//     }
// }

// class Main{
//     public static void main(String args[]){
//         int n=2;
//         for(int i=0;i<=10;i++){
//             System.out.printf("%d X %d= %d\n",n,i,(i*n));
//         }
//     }
// }

// class Main{
//     public static void main(String args[]){
//         int i=100;
//         while(i>0){
//             System.out.println(i);
//             i--;
//         }
//     }
// }

// class Main{
//     public static void main(String args[]){
//         int i=9;
//         do{
//             System.out.println("Hello world");
//         }while(i>10);
//     }
// }

//simple calculator
//multiplication table of 5

// class Main{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a here :");
//         int a=sc.nextInt();
//         System.out.print("Enter b here :");
//         int b=sc.nextInt();
//         System.out.print("Enter operation here :");
//         String ch=sc.next();
//         float divide=((float)a/b);
//         switch (ch){
//             case "+":
//                 System.out.println("Sum is :"+(a+b));
//                 break;
//             case "-":
//                 System.out.println("Difference is :"+(a-b));
//                 break;
//             case "*":
//                 System.out.println("Product  is :"+(a*b));
//                 break;
//             case "/":
//                 System.out.println("Divide is :"+divide);
//                 break;
//             default:
//                 System.out.println("Enter correct operation ");
//         }
//         sc.close();
//     }
// }

// class Main{
//     public static void main(String args[]){
//         for(int i=1;i<=10;i++){
//             System.out.printf("%d X %d= %d\n",5,i,(i*5));
//         }
//     }
// }

// class Main{
//     public static void sum(int a,int b){
//         int sum=a+b;
//         System.out.print(sum);
//         }
//         public static void main(String args[]){
//             int a=15;
//             int b=78;
//             sum(a,b);
//         }
//     }

// class Main{
//     public static void fact(int n){
//         int fact=1;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//         }
//         System.out.print(fact);
//     }
//     public static void main(String args[]){
//         int n=5;
//         fact(n);
//     }
// }

// class Main{
//     public static void sum(int a,int b){
//         int sum=a+b;
//         System.out.print("The sum is: "+sum);
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         sum(a,b);
//     }
// }

// class Main{
//     public static void mkc(int n){
//         for(int i=1;i<=n;i++){
//             System.out.printf(" %d College Walo ke MKC 100 baar !!!\n",i);
//         }
//     }
//     public static void main(String main[]){
//         int n=100;
//         mkc(n);
//     }
// }

// class Main{
//     public static void table(int n){
//         for (int i=1;i<=10;i++){
//             System.out.printf("%d X %d =%d \n",n,i,(i*n));
//         }
//     }
//     public static void main(String args[]){
//         int n=10;
//         table(n);
//     }
// }

// class Main{
//     public static void even(int a){
//         if(a%2==0)System.out.print("Even");
//         else System.out.print("Odd");
//     }
//     public static void main(String args[]){
//         int a=44;
//         even(a);
//     }
// }

// class Main{
//     public static void bigger(int a,int b){
//         if(a>b)System.out.print("A is bigger "+a);
//         else System.out.print("B is bigger"+b);
//     }
//     public static void main(String args[]){
//         int a=14;
//         int b=20;
//         bigger(a, b);   
//     }
// }

// class Main{
//     public static void first(String s){
//         char firstChar=s.charAt(0);
//         System.out.print(firstChar);
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         first(s);
//     }
// }

//Area of recatangle
// class Main{
//     public static void area(int l,int b){
//         int area=2*(l+b);
//         System.out.print(area);
//     }
//     public static void main(String args[]){
//         int l=10;
//         int b=25;
//         area(l,b);
//     }
// }
//area of circle
// class Main{
//     public static void area(float r){
//         float area=3.14f*r*r;
//         System.out.print(area);
//     }
//     public static void main(String args[]){
//         float r=24.65f;
//         area(r);
//     }
// }
//no is -ve or +ve
// class  Main{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter no here: ");
//         int n=sc.nextInt();
//         if(n>0)System.out.print("No is positive");
//         else if(n<0)System.out.print("No is negative");
//         else System.out.print("No is zero");
//     }
// }
//vol of cylinder
// class Main{
//     public static void vol(float r,float h){
//         float vol=3.14f*r*r*h;
//         System.out.print(vol);
//     }
//     public static void main(String args[]){
//         float r=14.78f;
//         float h=23.1f;
//         vol(r,h);
//     }
// }

//Array
// class Main{
//     public static void main(String args[]){
//         String []name=new String[5];
//         name[0]="Name 1";
//         name[1]="Name 2";
//         name[2]="Name 3";
//         name[3]="Name 4";
//         name[4]="Name 5";
//         for(int i=0;i<name.length;i++)System.out.println(name[i]);
//     }
// }

// class Main{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int []marks= new int[5];
//         System.out.print("enter 5 marks: ");
//         for(int i=0;i<marks.length;i++){
//             marks[i]=sc.nextInt();
//         }
//         int sum=0;
//         int average=0;
//         for(int i=0;i<marks.length;i++){
//             sum=sum+marks[i];
//             average=sum/5;
//         }
//         System.out.print("Average is:"+average);
//     }
// }

// class  Main{
//     public static void main(String args[]){
//      String name="name1";
//      String name1="name1";//made by string literals
     
//      String name2=new String("name1");
//      String name3=new String("name1");

//      System.out.println(name==name1); //checks memory reference if same or not
//      System.out.println(name.equals(name1));//contents check karta ha
     
//      System.out.println(name2==name3);
//      System.out.println(name2.equals(name3));
//     }
// }//new keyword se har baar new memory allocation hoga

// class Main{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter 5 no's :");
//         int []no=new int[5];
//         for(int i=0;i<no.length;i++){
//             no[i]=sc.nextInt();
//         }
//         for(int i=no.length-1;i>=0;i--){//reverse array
//             System.out.println("reversed array is "+no[i]);
//         }
//     }
// }

//largest no in array
//smallest no in array
//sum of elements in array
// class Main{
//     public static void main(String args[]){
//         int sum=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter 5 nos: ");
//         int []nos=new int[5];
//         for(int i=0;i<nos.length;i++){
//             nos[i]=sc.nextInt();
//             sum=sum+nos[i];
//         }
//         System.out.print("the sum is: "+sum);
//     }
// }

// class Main{
//     public static void main(String args[]){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

class Main{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}