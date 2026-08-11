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

// class Main{
//     public static void main(String args[]){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// class Main{
//     public static void main(String args[]){
//         int n=5;
//         for(int i=5;i>=0;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// class Main{
//     public static void main(String args[]){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         int n=4;
//         int number=1;
//         for(int i=0;i<=n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print(" "+number);
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         int n = 5; 
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= (n - i); j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 System.out.print("*");}
//             System.out.println();
//         }
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         int a=4;
//         int b=12;
//         int temp=a;
//         a=b;
//         b=temp;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }

//Classes and objects
//class
// class Student{
//     String name;
//     int age;
//     int rollno;
//     void display(){
//         System.out.println("Name: "+name);
//         System.out.println("Age :"+age);
//         System.out.println("Roll no: "+rollno);
//         System.out.println();
//     }
// }
// //object
// class Main{
//     public static void main(String args[]){
//         Student s1=new Student();
// Student s2=new Student();
// s1.name="ABC";
// s1.age=19;
// s1.rollno=40;
// s2.name="PS";
// s2.age=18;
// s2.rollno=33;
// s1.display();
// s2.display();
//     }
// }
//string empty value null all other =0

// class result{
//     int marks1;
//     int marks2;
//     int marks3;
//     void display(){
//         double avg=(marks1+marks2+marks3)/3.0;
//         System.out.println("the average is: "+avg);
//         System.out.println();
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         result r1=new result();
//         result r2=new result();

//         r1.marks1=88;
//         r1.marks2=98;
//         r1.marks3=75;
//         r1.display();
//         r2.marks1=79;
//         r2.marks2=89;
//         r2.marks3=99;
//         r2.display();
//     }
// }

// class Car all features and create 5 methods like start(engine()), stop engine(),goahead().start wiper() ....
// class Car {
//     String brand;
//     String model;
//     String color;
//     boolean isEngineRunning = false;
//     int currentSpeed = 0;
//     void setFeatures(String carBrand, String carModel, String carColor) {
//         brand = carBrand;
//         model = carModel;
//         color = carColor;
//     }
//     void startEngine() {
//         if (!isEngineRunning) {
//             isEngineRunning = true;
//             System.out.println("Engine started.");
//         } else {
//             System.out.println("The engine is already running.");
//         }
//     }
//     void stopEngine() {
//         if (isEngineRunning) {
//             isEngineRunning = false;
//             currentSpeed = 0;
//             System.out.println("Engine turned off safely.");
//         } else {
//             System.out.println("Engine is already off.");
//         }
//     }
//     void goAhead(int speedIncrement) {
//         if (isEngineRunning) {
//             currentSpeed += speedIncrement;
//             System.out.println("Accelerating ahead! Current speed: " + currentSpeed + " km/h");
//         } else {
//             System.out.println("Cannot move. Start the engine first!");
//         }
//     }
//     void startWiper() {
//         System.out.println("Wipers activated. Clearing the windshield.");
//     }
//     void displayCarDetails() {
//         System.out.println("--- Car Details ---");
//         System.out.println("Brand: " + brand);
//         System.out.println("Model: " + model);
//         System.out.println("Color: " + color);
//         System.out.println("Engine Status: " + (isEngineRunning ? "ON" : "OFF"));
//         System.out.println("Speed: " + currentSpeed + " km/h");
//     }
// }
// class Main {
//     public static void main(String[] args) {
//         Car myCar = new Car();
//         myCar.setFeatures("Tesla", "Model S", "Red");
//         myCar.displayCarDetails();
//         myCar.goAhead(20);      
//         myCar.startEngine();    
//         myCar.goAhead(40);     
//         myCar.goAhead(30);      
//         myCar.startWiper();     
//         myCar.stopEngine();    
//     }
// }

// class Students{
//     Students(){
//         System.out.println("qwerty");
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Students std=new Students();
//     }
// }

//create new class constructor and print value
// class Car {
//     String brand;
//     int year;
//     public Car(String carBrand, int carYear) {
//         brand = carBrand; 
//         year = carYear;
//     }
//     public void displayDetails() {
//         System.out.println("Car Brand: " + brand);
//         System.out.println("Car Year: " + year);
//     }
//     public static void main(String[] args) {
//         Car myCar = new Car("Toyota", 2026);
//         myCar.displayDetails();
//     }
// }

//create a class 2 diff method one with this keyword and other without this keyword
// class Student {
//     String name;
//     int age;
//     void detailsWithoutThis(String studentName, int studentAge) {
//         name = studentName; 
//         age = studentAge;
//     }
//     void detailsWithThis(String name, int age) {
//         this.name = name; 
//         this.age = age;
//     }
//     void display() {
//         System.out.println("Name: " + name + ", Age: " + age);
//     }
// }
// class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.detailsWithoutThis("Alice", 20);
//         s1.display();
//         Student s2 = new Student();
//         s2.detailsWithThis("Bob", 22);
//         s2.display(); 
//     }
// }

// create class and constructor value pass then print value
// class Mobile {
//     String model;
//     double price;

//     Mobile(String mobileModel, double mobilePrice) {
//         model = mobileModel;
//         price = mobilePrice;
//     }

//     void printDetails() {
//         System.out.println("Mobile Model: " + model);
//         System.out.println("Mobile Price: ₹" + price);
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Mobile myPhone = new Mobile("iPhone 17", 999.99);
//         myPhone.printDetails();
//     }
// }

//to acces static varribales no class and object is req
//static wale non static ko access nhi kar sakte

//do static var ek static method inka sum

// public class Main{
//     public static int number1 = 15;
//     public static int number2 = 25;
//     public static void printSum() {
//         int sum = number1 + number2;
//         System.out.println(sum);
//     }
//     public static void main(String[] args) {
//         printSum();
//     }
// }

//class employee 2 varribale id and name total employee no static type

// class Employee {
//     int id;
//     String name;
//     public static int totalEmployees = 0;
//     public Employee(int id, String name) {
//         this.id = id;
//         this.name = name;
//         totalEmployees++; 
//     }
// }
// public class Main {
//     public static void printTotalEmployees() {
//         System.out.println("Total Number of Employees: " + Employee.totalEmployees);
//     }
//     public static void main(String[] args) {
//         Employee emp1 = new Employee(101, "XYZ");
//         Employee emp2 = new Employee(102, "ABC");
//         Employee emp3 = new Employee(103, "PS");
//         Employee emp4 = new Employee(104, "qwerty");
//         printTotalEmployees();
//     }
// } 

//incapsulation
// class Employee{
//     String name;
//     int id;
// }
// String getName(){
//     return name;
// }
// int getId(){
//     return id;
// }
// void setName(String name){
//     this.name=name;
// }
// void setId(int id){
//     this.id=id;
// }

//class name student method name incap show using methods create private varriables
// class Student {
//     private String name;
//     private int age;
//     public void setDetails(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
//     public void incap() {
//         System.out.println("Student Name: " + name);
//         System.out.println("Student Age : " + age);
//     }
// }
// class Main {
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.setDetails("John Doe", 21);
//         s.incap();
//     }
// }

//Inheritance
// class Animal{
//    void eat (){
//       System.out.println("hello i am eating ");
//    }
//    void sleep(){
//       System.out.println("hello i am slleping");
//    }
// }
// class Dog extends Animal {

// }
// class Main{
//    public static void main(String args[])
// {
//    Dog dog = new Dog();
//    dog.eat();
//    dog.sleep();
// }}

//parent class name bank child class inherit methods of parent to child money deposit withdraw methods

// class Bank {
//     double balance = 1000.0;
//     void deposit(double amt) {
//         balance += amt;
//         System.out.println("Deposited: " + amt + ", Balance: " + balance);
//     }
//     void withdraw(double amt) {
//         balance -= amt;
//         System.out.println("Withdrew: " + amt + ", Balance: " + balance);
//     }
// }
// class SavingsAccount extends Bank {
// }
// class Main {
//     public static void main(String[] args) {
//         SavingsAccount account = new SavingsAccount();
//         account.deposit(500);
//         account.withdraw(200);
//     }
// }

//single level multi level and heiechary level :types of INHERITANCE

//create class show eg of single multi and herichal 
// class Vehicle {
//     void start() {
//         System.out.println("Vehicle started.");
//     }
// }
// class Car extends Vehicle {
//     void drive() {
//         System.out.println("Driving the car.");
//     }
// }
// class ElectricCar extends Car {
//     void charge() {
//         System.out.println("Charging the electric car battery.");
//     }
// }
// class Truck extends Vehicle {
//     void loadCargo() {
//         System.out.println("Loading heavy cargo into the truck.");
//     }
// }
// class Main {
//     public static void main(String[] args) {
//         Car myCar = new Car();
//         myCar.start(); 
//         myCar.drive(); 

//         ElectricCar myTesla = new ElectricCar();
//         myTesla.start();  
//         myTesla.drive();  
//         myTesla.charge(); 
        
//         Truck myTruck = new Truck();
//         myTruck.start();     
//         myTruck.loadCargo(); 
//     }
// }

//class varr method using super keyword call three
// class Parent {
//     String name = "Parent Variable";
//     Parent() {
//         System.out.println("1. Parent Constructor Called");
//     }
//     void show() {
//         System.out.println("2. Parent Method Called");
//     }
// }
// class Child extends Parent {
//     String name = "Child Variable";
//     Child() {
//         super(); 
//     }
//     void display() {
//         super.show(); 
//         System.out.println("3. Variable accessed: " + super.name); 
//         System.out.println("Local variable was: " + this.name);
//     }
// }
// class Main {
//     public static void main(String[] args) {
//         Child c = new Child(); 
//         c.display();           
//     }
// }

//method overloading
// class Calculator{

//     int add(int a, int b) { return a + b; }
//     int add(int a, int b, int c) { return a + b + c; } 
// }
// class Animal {
//     void sound() { System.out.println("Animal sound"); }
// }
// class Dog extends Animal {
//     @Override
//     void sound() { System.out.println("Bark"); } 
// }
// class Main {
//     public static void main(String[] args) {
//         Calculator cal = new Calculator();
//         System.out.println(cal.add(5, 5));     
//         System.out.println(cal.add(5, 5, 5));  
//         Animal d = new Dog();
//         d.sound();                             
//     }
// }
//complie type polymorphism and runtime polymorphism

// class Calculator {
//     void add(int a, int b) {
//         System.out.println("Sum of 2 numbers: " + (a + b));
//     }
//     void add(int a, int b, int c) {
//         System.out.println("Sum of 3 numbers: " + (a + b + c));
//     }
// }
// class AdvancedCalculator extends Calculator {
//     @Override
//     void add(int a, int b) {
//         System.out.println("Advanced Sum: " + (a + b));
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         AdvancedCalculator calc = new AdvancedCalculator();
//         calc.add(5, 10, 15); 
//         calc.add(5, 10); 
//     }
// }

//sum 1 to n
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int sum=0;
//     for(int i=0;i<=n;i++){
//         sum+=i;
//     }
//     System.out.println("sum is:"+sum);
//     }
// }
//abstract method ke body nhi hoti

//create a class inside class create a constructor inilize 5 instance varriables using constructor
// class Laptop {
//     String brand;
//     String processor;
//     int ramSizeGB;
//     int storageGB;
//     double price;
//     Laptop(String brand, String processor, int ramSizeGB, int storageGB, double price) {
//         this.brand = brand;
//         this.processor = processor;
//         this.ramSizeGB = ramSizeGB;
//         this.storageGB = storageGB;
//         this.price = price;
//     }
//     void displayDetails() {
//         System.out.println( brand);
//         System.out.println(processor);
//         System.out.println(ramSizeGB );
//         System.out.println(storageGB);
//         System.out.println(price);
//     }
// }
// class Main {
//     public static void main(String[] args) {
//         Laptop myLaptop = new Laptop("Dell", "Intel i7", 16, 512, 899000);
//         myLaptop.displayDetails();
//     }
// }

//runtime polymorphism example(method overwrting)

//create two strings differentiating between heap and SCP memory
//create an eg of static keyword(variables,methods and blocks)

//String
//new kwyword se har baar nawa object banega

//input string form user then reverse
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String name=sc.nextLine();
//         String reverse="";
//         for(int i=name.length()-1;i>=0;i--){
//             reverse+=name.charAt(i);
//         }
//         System.out.println(reverse);
//     }
// }

//replace 'a' with '@' in word astigmatism
// class Main{
//     public static void main(String []args){
//         String s="astigmatism";
//         System.out.println(s.replace('a','@'));
//     }
// }

//Abstraction

// abstract class Animal{
//     abstract public void sound();
// }
// class Dog extends Animal{
//     public void  sound(){
//         System.out.println("Dog");
//     }
// }

//interface and abstarct class implement in child class then call via child class object 
// interface Printable {
//     void print();
// }
// abstract class Shape {
//     abstract void draw();
// }
// class Circle extends Shape implements Printable {
//     public void print() { System.out.println("Print"); }
//     void draw() { System.out.println("Draw"); }
// }
// class Main {
//     public static void main(String[] args) {
//         Circle c = new Circle();
//         c.draw();  
//         c.print(); 
//     }
// }

//input a string from and print its characters
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String name=sc.nextLine();
//         for(int i=0;i<=name.length();i++){
//             System.out.println(name.charAt(i));
//         }
//     }
// }

// "@" yourname replace vowels @
// class Main{
//     public static void main(String[] args) {
//         String name="username";
//         System.out.println(name.replace('e','@'));
//     }
// }

//remove space form start and end " Hello World "
// class Main{
//     public static void main(String[] args) {
//         String word=" Hello World ";
//             //System.out.println(word.replace(" ",""));
//             System.out.println(word.trim());
//     }
// }
//count the frequencey of every char in string

// class Main{
//     public static void main(String[] args) {
//         String str="Prince";
//         int freq[]=new int[256];
//         for(int i=0;i<str.length();i++){
//             freq[str.charAt(i)]++;
//         }
//         for (int i = 0; i < 256; i++) {
//             if (freq[i] > 0) {
//                 System.out.println((char) i + " : " + freq[i]);
//             }
//         }
//     }
// }
//find the char with max freq


//rev a string without using built in methods
// class Main{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         String rev="";
//         for(int i=s.length()-1;i>=0;i--){
//             rev+=s.charAt(i);
//         }
//         System.out.println(rev);
//     }
// }

//string immutable ha but jo string builder se bne ho vo muttable hoti ha

//string builder first name pass then add last name using string builder method

// class Main{
//     public static void main(String[] args) {
//         StringBuilder name=new StringBuilder("ABC");
//         name.append(" "+"PS");
//         System.out.println(name);
//     }
// }

//create a string and reverse using string builder
// class Main{
//     public static void main(String[] args) {
//         StringBuilder s=new StringBuilder("QWERTY");
//         System.out.println(s.reverse());
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         StringBuilder s=new StringBuilder("QWERTY");
//         s.setCharAt(0,'@');
//         System.out.println(s);
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         StringBuilder input=new StringBuilder("Programming");
//         input.replace(3,7,"");
//         System.out.println(input);
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         StringBuilder s=new StringBuilder("Hello World");
//         System.out.println(s.reverse());
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         for(int i=1;i<=100;i++){
//             if(i%2!=0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         for(int i=1;i<=1000;i++){
//             if(i%7==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         int n=7;
//         for(int i=n;i>=1;i=i-2){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         String str="aaaaabhhhbddg";
//         int count=1;
//         StringBuilder sb=new StringBuilder();
//         int n=str.length();
//         for(int i=0;i<n;i++){
//             if(i<n-1 && str.charAt(i)==str.charAt(i+1)){
//                 count++;
//             }
//             else{
//                 sb.append(str.charAt(i)).append(count);
//                 count=1;
//             }
//         }
//         System.out.println(sb);
//     }
// }

//find first repeating char: CAMERA
// class Main{
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//                 for (int i = 0; i < str.length(); i++) {
//             char c = str.charAt(i);
//             if (str.indexOf(c) == i && str.lastIndexOf(c) != i) {
//                 System.out.println(c);
//             }
//         }
//     }}

//2-D array
// class Main{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int arr[][]=new int[3][3];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 System.out.println(arr[i][j]+"");
//             }
//             System.out.println();
//         }
//     }
// }

//sum of diagonal elements in 2-d array
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int arr[][]=new int[3][3];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 arr[i][j]=sc.nextInt();
//             }}
//             int n=arr.length;
//             int leftsum=0;
//             int rightsum=0;
//             for(int k=0;k<n;k++){
//                 leftsum+=arr[k][k];
//                 rightsum+=arr[k][n-1-k];
//             }
//             System.out.println("left sum:"+leftsum);
//             System.out.println("right sum:"+rightsum);
//     }
// }

//max in 2-d array
// class Main{
//     public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//         int arr[][]=new int[3][3];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 arr[i][j]=sc.nextInt();
//             }}   
//             int max=arr[0][0];
//             int maxrow=0;
//             int colmax=0;
//             for(int i=0;i<3;i++){
//                 for(int j=0;j<3;j++){
//                     if(arr[i][j]>max){
//                         max=arr[i][j];
//                         maxrow=i;
//                         colmax=j;
//                     }
//                 }
//             }
//             System.out.println("max is:"+max);
//             System.out.println("index:"+maxrow+" "+colmax);
//     }
// }

//Search element at index in 2-d array
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int arr[][]=new int[3][3];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         int key=14;
//         boolean found=false;
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 if(arr[i][j]==key){
//                     System.out.println("Found"+i+" "+j);
//                     found=true;
//                     break;
//                 }
//             }
//             if(found)break;
//         }
//         if(!found){
//             System.out.println("not found");
//         }
//     }
// }

//sum of 2 matrx 
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int r=sc.nextInt();
//         int c=sc.nextInt();
//         int mat1[][]=new int[r][c];
//         int mat2[][]=new int[r][c];
//         int sum[][]=new int [r][c];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 mat1[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 mat2[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 sum[i][j]=mat1[i][j]+mat2[i][j];
//                 System.out.print(sum[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }
//sum of each row and column


//determinant of 2-d array
//q-48 leetcode rotate a matrix
// q-463 && 867 leetcode
//

// class Main {
//     public int addDigits(int num) {
//         if(num==0)return 0;
//         int sum=0;
//         int r=0;
//         while(num>0){
//             r=num%10;
//             sum+=r;
//             num=num/10;
//         }
//         int sum2=0;
//         int p=0;
//         while(sum>0){
//             p=sum%10;
//             sum2+=p;
//             sum2=sum2/10;
//         }
//         return sum2;
//     }
// }

//q-566
//q-26 remove duplicate from sorted array
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         if (nums.length == 0) return 0;
//         int i = 0;
//         for (int j = 1; j < nums.length; j++) {
//             if (nums[j] != nums[i]) {
//                 i++;            
//                 nums[i] = nums[j]; 
//             }
//         }
//         return i + 1;
//     }
// }

//q-3146

//q-3731
// class Solution {
//     public List<Integer> findMissingElements(int[] nums) {
//         if (nums.length == 0) return new ArrayList<>();
//         int max = nums[0];
//         int min = nums[0];
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] > max) max = nums[i];
//             if (nums[i] < min) min = nums[i];
//         }
//         int size = max - min + 1;
//         int res[] = new int[size];
//         int index = 0;
//         for (int i = min; i <= max; i++) {
//             boolean found = false;
//             for (int j = 0; j < nums.length; j++) {
//                 if (nums[j] == i) {
//                     found = true; 
//                     break;        
//                 }
//             }
//             if (!found) {
//                 res[index] = i;
//                 index++;
//             }
//         }
//         List<Integer> list = new ArrayList<>();
//         for (int k = 0; k < index; k++) {
//             list.add(res[k]);
//         }
//         return list;
//     }
// }

//q-414
// class Solution {
//     public int thirdMax(int[] nums) {
//         int n = nums.length;
//         int max = nums[0];
//         for (int i = 0; i < n; i++) {
//             if (nums[i] > max) {
//                 max = nums[i];
//             }
//         }
//         int smax = 0;
//         boolean foundSmax = false;
//         for (int i = 0; i < n; i++) {
//             if (nums[i] != max) {
//                 if (!foundSmax || nums[i] > smax) {
//                     smax = nums[i];
//                     foundSmax = true;
//                 }
//             }}
//         if (!foundSmax) {
//             return max;
//         }
//         int tmax = 0;
//         boolean foundTmax = false;
//         for (int i = 0; i < n; i++) {
//             if (nums[i] != max && nums[i] != smax) {
//                 if (!foundTmax || nums[i] > tmax) {
//                     tmax = nums[i];
//                     foundTmax = true;
//                 }
//             }
//         }
//         return foundTmax ? tmax : max;
//     }
// }

//q-219
// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         //Arrays.sort(nums);
//         if (k==50000) return true;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<=i+k && j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     return true;
//                 }
//             }
//     }
//      return false;
// }
// }

//q-pivot index
// class Solution {
//     public int pivotIndex(int[] nums) {
//         int Lsum=0,Rsum=0;
//         for (int i=0;i<nums.length;i++){
//             Rsum+=nums[i];
//         }
//         for (int i=0;i<nums.length;i++){
//             Rsum-=nums[i];
//             if (Lsum==Rsum) return i;
//             Lsum+=nums[i];
            
//         }
//         return -1;
//     }
// }

//implement the add() method using method overloading and it should accept it 3 int values 5 float values ,4 double values;
//implement the method overriding
// implement multi level inheritance


//q-482
// class Solution {
//     public String licenseKeyFormatting(String s, int k) {
        
//          String clean = s.replace("-", "").toUpperCase();
//           StringBuilder result = new StringBuilder();
//           int len = clean.length();
//             for (int i = 0; i < len; i++){
//                 if (i > 0 && (len - i) % k == 0) {
//                 result.append('-');

//             }
//             result.append(clean.charAt(i));

//     }
//         return result.toString();
// }
// }

//binary search
// public class Main {
//     public static int search(int[] nums, int target) {
//         int left = 0;
//         int right = nums.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2; // Prevents integer overflow

//             if (nums[mid] == target) {
//                 return mid; // Target found at index mid
//             } else if (nums[mid] < target) {
//                 left = mid + 1; // Search in the right half
//             } else {
//                 right = mid - 1; // Search in the left half
//             }
//         }

//         return -1; // Target not found
//     }
// }

//row-wise sum of matrix
// class Main{
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
//             for(int j=0;j<arr[0].length;j++){
//                 rowsum+=arr[i][j];
//             }
//             System.out.println(rowsum);
//         }
//     }
// }

//colum-wise sum
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<c;j++){
            int csum=0;
            for(int i=0;i<r;i++){
                csum+=arr[i][j];
            }
            System.out.println(csum);
        }
    }
}