import java.util.*;
// class error{
//     public static void main(String args[]){
//         int a=20;
//         int b=0;
//         try{
//             int c=a/b;
//             System.out.println("res is:"+c);
//         }
//         catch(Exception e){
//             System.out.println("failed to divide.");
//             System.out.println("reason"+e);
//         }
//     }
// }

// class error{
//     public static void main(String[] args) {
//         int marks[]=new int[3];
//         marks[0]=75;
//         marks[1]=89;
//         marks[2]=99;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter array index: ");
//         int index=sc.nextInt();
//         System.out.println("number divide: ");
//         int num=sc.nextInt();

//         try{
//             System.out.println("value of entered index: "+marks[index]);
//             System.out.println("divide result:"+marks[index]/num);
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("ArrayIndexoutOfbound occured");
//             System.out.println("reason: "+e);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Aritematic error occured");
//             System.out.println("reason: "+e);
//         }
//         catch(Exception e){
//             System.out.println("error occured");
//             System.out.println("reason: "+e);
//         }
//     }
// }

// class error{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         try{
//             int c=a/b;
//             System.out.println(c);
//         }
//         catch(ArithmeticException e){
//             System.out.println("division by zero is not valid");
//         }
//     }
// }

// class error{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int index=sc.nextInt();
//         try{
//                 System.out.println(arr[index]);
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//                     System.out.println(e);
//                 }
//     }
// }

// class error{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.next();
//         try{
//             int i=Integer.parseInt(s);
//             System.out.println("output: "+i);
//         }
//         catch(NumberFormatException e){
//             System.out.println(e);
//         }
//     }
// }

// class error{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int age=sc.nextInt();
//         try{
//             if(age<18){
//                 throw new IllegalArgumentException();
//             }
//             else{
//                 System.out.println("eligible");
//             }
//         }
//         catch(IllegalArgumentException e){
//             System.out.println("not eligible");
//         }
//     }
// }

// class error{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int marks=sc.nextInt();
//         try{
//             if(marks<0 || marks>100){
//                 throw new IllegalArgumentException();
//             }
//             System.out.println("marks: "+marks);
//         }
//         catch(IllegalArgumentException e){
//             System.out.println("Invalid marks");
//         }
//     }
// }

// class error{
//      static int div(int a,int b)throws ArithmeticException{
//         return a/b;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         try{
//             int res=div(a, b);
//             System.out.println("result is: "+res);
//         }
//         catch(ArithmeticException e){
//             System.out.println("can't divide by zero");
//         }
//     }
// }

// class error{
//      static void method3(){
//             int res=10/0;
//             System.out.print(res);
//         }
//         static void method2(){
//             method3();
//         }
//         static void method1(){
//             method2();
//         }
//     public static void main(String[] args) {
//         try{
//             method1();
//         }
//         catch(ArithmeticException e){
//             System.out.println("Exception handled in main");
//         }
//     }
// }

class error{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        try{
            int res=0;
            if(no<0){
                throw new IllegalArgumentException();
            }
            res+=no*no;
            System.out.println("sq is: "+res);
        }
        catch(IllegalArgumentException e){
            System.out.println(("Number cannot be negative"));
        }
    }
}