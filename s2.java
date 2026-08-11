import java.util.*;

//q-1
// class s2{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         int count=1;
//         s=s.toUpperCase();
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)==' '){
//                 count++;
//             }
//         }
//         System.out.println(s);
//         System.out.println(count);
//     }
// }

//q-2

// class s2{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int r=sc.nextInt();
//         int c=sc.nextInt();
//         int arr[][]=new int[r][c];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         int max=0;
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 if(arr[i][j]>max){
//                     max=arr[i][j];
//                 }
//             }
//         }
//         System.out.println("max is: "+max);
//     }
// }

//q-3
// interface Vehicle {
//     double fuelEfficency(double dis,double fuelUsed);
// }
// class Car implements Vehicle{
//     @Override
//     public double fuelEfficency(double dis, double fuelUsed) {
//         return dis/fuelUsed;
//     }
// }
// class Bike implements Vehicle{
//     @Override
//     public double fuelEfficency(double dis, double fuelUsed){
//         return dis/fuelUsed;
//     }
// }
// public class s2{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int choice=sc.nextInt();
//         double dis=sc.nextDouble();
//         double fuelUsed=sc.nextDouble();
//         Vehicle veh=null;
//         if(choice==1){
//             veh=new Car();
//         }
//         else if(choice==2){
//             veh=new Bike();
//         }
//         if(veh!=null){
//             double efficency=veh.fuelEfficency(dis, fuelUsed);
//             System.out.printf("%.2f",efficency);
//         }
//     }
// }

//q-4
// class s2{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         char ch=sc.next().charAt(0);
//         int count=0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)==ch){
//                 count++;
//             }
//         }
//         System.out.printf("%c occured %d times",ch,count);
//     }
// }

//q-5
//q-6
// class Employee {
//     protected double baseSalary;

//     public Employee(double baseSalary) {
//         this.baseSalary = baseSalary;
//     }
//     public double calculateSalary() {
//         return baseSalary;
//     }
// }
// class Manager extends Employee {
//     public Manager(double baseSalary) {
//         super(baseSalary);
//     }
//     @Override
//     public double calculateSalary() {
//         return baseSalary + 5000;
//     }
// }
// class Developer extends Employee {
//     private int projects;
//     public Developer(double baseSalary, int projects) {
//         super(baseSalary);
//         this.projects = projects;
//     }
//     @Override
//     public double calculateSalary() {
//         return baseSalary + (projects * 2000);
//     }
// }

// public class s2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int choice = sc.nextInt();
//         double baseSalary = sc.nextDouble();
//         Employee emp = null;
//         if (choice == 1) {
//             emp = new Manager(baseSalary);
//         } else if (choice == 2) {
//             int projects = sc.nextInt();
//             emp = new Developer(baseSalary, projects);
//         }
//         if (emp != null) {
//             System.out.println(emp.calculateSalary());
//         }
//     }
// }

//q-7
// class s2{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.next();
//         String rev="";
//         String temp=s;
//         for(int i=s.length()-1;i>=0;i--){
//             rev+=s.charAt(i);
//         }
//         if(temp.equals(rev)){
//             System.out.println("Pallindrome");
//         }
//         else{
//             System.out.println("Not Pallindrome");
//         }
//     }
// }

//q-8

// class s2{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int r=sc.nextInt();
//         int c=sc.nextInt();
//         int arr[][]=new int[r][c];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         int sum=0;
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 sum+=arr[i][j];
//             }
//         }
//         System.out.println("the sum is:"+sum);
//     }
// }

//q-9
abstract class Shape{
     public abstract double area();
}

class Circle extends Shape{
    private double r;
    public Circle(double r){
        this.r=r;
    }
    public double area(){
        return 3.14*r*r;
    }
}

class Rectangle extends Shape{
    private double l;
    private double b;
    public Rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    public double area(){
        return l*b;
    }
}

class s2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Shape shape=null;
        if(n==1){
            double r=sc.nextDouble();
            shape=new Circle(r);
        }
        else if(n==2){
            double l=sc.nextInt();
            double b=sc.nextInt();
            shape=new Rectangle(l, b);
        }
        if(shape!=null){
            System.out.printf("%.2f\n",shape.area());
        }
    }
}
//q-15
// class s2{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int r=sc.nextInt();
//         int c=sc.nextInt();
//         int arr[][]=new int[r][c];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             int rowsum=0;
//             for(int j=0;j<arr[i].length;j++){
//                 rowsum+=arr[i][j];  
//             }
//             System.out.println(rowsum);
//         }
//     }
// }

