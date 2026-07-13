import java.util.*;
// class practice{
//     public static void main(String args[]){
//         System.out.println("Hello World");// println next line ke lyee 
//         System.out.print("Hello World\n");// simple print me \n daldo 
//         System.out.print("Hello World");// print se aise he print hoga agar multiple statements execute kare to
//     }
// }

// class practice{
//     public static void main(String args[]){
//         System.out.println("*");
//         System.out.println("* *");
//         System.out.println("* * *");
//         System.out.println("* * * *");
//     }
// }

// class practice{
//     public static void main(String args[]){
//         String name="Rober Downey Jr.";
//         int a=14;
//         int b=19;
//         int mul=a*b;
//         a=0;//yha a ke value edit bhi kar sakte koi error nhi atta 
//         double price=11.19;
//         int sum=a+b;
//         System.out.println(mul);
//         System.out.println("The sum is:"+sum);
//         System.out.println("The real Iron Man is:"+name);
//     }
// }

// class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String name=sc.nextLine();//next space ke baad wala include nhi karta
//         //nextLine() iss space ke baad wala bhi include hoga
//         System.out.println(name);
//     }

// }

// class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a here:");
//         int a= sc.nextInt();
//         System.out.print("Enter b here: ");
//         int b= sc.nextInt();
//         int sum=a+b;
//         System.out.println(sum);
//         sc.close();
//     }
// }

// class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         sc.nextLine();
//         String name=sc.nextLine();
//         System.out.println(a);
//         System.out.println(name);
//         sc.close();
//     }
// }

// class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int age=sc.nextInt();
//         //Next double me upto 15 places decimal ayega but float me sirf 7 places tak
//         Double salary=sc.nextDouble();
//         String name=sc.next();
//         System.out.println("Age is: "+age);
//         System.out.println("Salary is: "+salary);
//         System.out.println("The name is: "+name);
//         sc.close();
//     }
// }

//Conditional Statement

// class practice{
//     public static void main(String args[]){
//         int age=19;
//         if(age>=18){
//             System.out.println("Can vote and drive");
//         }
//         else if(age>=15 && age<18){
//             System.out.println("Can't vote but have learners license");
//         }
//         else{
//             System.out.println("Nothing");
//         }
//     }
// }

// class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter age here: ");
//         int age=sc.nextInt();
//         if(age>=18){
//             System.out.println("Adult");
//         }
//         else if(age>=12 && age<18){
//             System.out.println("Teenager");
//         }
//         else if(age>=6 && age<12){
//             System.out.println("Child");
//         }
//         else{
//             System.out.println("Baby");
//         }
//         sc.close();
//     }
// }

// class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number here: ");
//         int no=sc.nextInt();
//         if(no%2==0){
//             System.out.println("Even number");
//         }
//         else{
//             System.out.println("Odd number");
//         }
//         sc.close();
//     }
// }

// class practice{
//     //agar if else vagera me sirf ek single statement print karne ha to bina { } iske kar sakte but single he hoge baki nhi hoge miltiple ke lye {} must ha
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a here: ");
//         int a=sc.nextInt();
//         System.out.print("Enter b here: ");
//         int b=sc.nextInt();
//         if(a==b){
//             System.out.println("Equal");
//         }
//         else if(a>b){
//             System.out.println("A is greater than B");
//         }
//         else if(a<b){
//             System.out.println("A is smaller than B");
//         }
//         sc.close();
//     }
// }

// class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int button=sc.nextInt();
//         if(button==1)
//             System.out.println("Hello");
//         else if(button==2)
//             System.out.println("Namaste");
//         else if(button==3)
//             System.out.println("Jai Shree Ram");
//         else 
//             System.out.println("Enter correct button number");
//         sc.close();
//     }
    
// }

//Switch case
// class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter button number here: ");
//         int button=sc.nextInt();
//         switch(button){
//             case 1:
//                 System.out.println("Hello");
//                 break;
//             case 2:
//                 System.out.println("Namaste");
//                 break;
//             case 3:
//                 System.out.println("Jai Shree Ram");
//                 break;
//             default:
//                 System.out.println("Enter correct button number");
//         }
//         sc.close();
//     }
// }

// class practice{
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

//Loops

// class practice{
//     public static void main(String args[]){
//         for(int i=0;i<=5;i++){
//             System.out.println("Radhe Radhe");
//         }
//     }
// }

// class practice{
//     public static void main(String args[]){
//         for(int i=0;i<=10;i++){
//             System.out.println(i);
//         }
//     }
// }

// class practice{
//     public static void main(String args[]){
//         int i=0;
//         while(i<=10){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// class practice{
//     public static void main(String args[]){
//         int i=0;
//         do{
//             System.out.println(i);
//             i++;
//         }
//         while(i<=10);
//     }
// }

// class practice{
//     public static void main(String args[]){
//         int sum=0;
//         for(int i=0;i<=10;i++){
//             sum+=i;
//         }
//         System.out.println(sum);
//     }
// }

// class practice{
//     public static void main(String args[]){
//         int i=0;
//         int sum=0;
//         while(i<=10){
//             sum+=i;
//             i++;
//         }
//         System.out.println(sum);
//     }
// }

// class practice{
//     public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter no here :");
//     int no=sc.nextInt();
//     int sum=0;
//     for(int i=0;i<=no;i++){
//         sum+=i;
//     }
//     System.out.println("Sum is :"+sum);
//     sc.close();
// }
// }

// class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int no=sc.nextInt();
//         for(int i=0;i<=10;i++){
//             //int mul=i*no;
//             System.out.printf("%d X %d =%d\n",no,i,(i*no));
//         }
//         sc.close();
//     }
// }

//Patterns
//Solid rectangle 
// class practice{
//     public static void main(String args[]){
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=5;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//Hollow rectangle
// class practice{
//     public static void main(String args[]){
//         int n=4;
//         int m=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 if(i==1 || j==1 || i==n ||j==m){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//Half pyramid
// class practice{
//     public static void main(String args[]){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//Inverted half pyramid
// class practice{
//     public static void main(String args[]){
//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//Rotated half pyramid
// class practice{
//     public static void main(String args[]){
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// class practice{
//     public static void main(String args[]){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Half pyramid with numbers
// class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter value of n: ");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(" "+j);
//             }
//             System.out.println();
//         }
//     }
// }

//Inverted half pyramid with numbers
// class practice{
//     public static void main(String args[]){
//         int n=5;
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

//Flody's Triangle
// class practice{
//     public static void main(String args[]){
//         int n=5;
//         int number=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(" "+number);
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }

//0-1 Triangle
// class practice{
//     public static void main(String args[]){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 int sum=i+j;
//                 if(sum%2==0)System.out.print("1");
//                 else System.out.print("0");
//             }
//             System.out.println();
//         }
//     }
// }

//Array 
// class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int []marks=new int[10];
//         System.out.print("Enter 10 marks here: ");
//         for(int i=0;i<marks.length;i++){
//             marks[i]=sc.nextInt();
//         }        
//         for(int i=0;i<=marks.length;i++){
//             System.out.println(" "+marks[i]);
//         }
//     }
// }

// class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         double []salary=new double[5];
//         System.out.print("Enter salary for 5 employees: ");
//         for(int i=0;i<salary.length;i++){
//             salary[i]=sc.nextDouble();
//         }
//         System.out.print("Salary of 5 employees are:");
//         for(int i=0;i<salary.length;i++){
//             System.out.println(salary[i]);
//         }
//     }
// }

// class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String []name=new String[5];
//         System.out.print("Enter 5 names: ");
//         for(int i=0;i<name.length;i++){
//             name[i]=sc.nextLine();
//         }
//         System.out.println("the 5 names are:");
//         for(int i=0;i<name.length;i++){
//             System.out.println(name[i]);
//         }
//     }
// }

// class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int []num=new int[10];
//         int sum=0;
//         System.out.print("Enter 10 numbers here: ");
//         for(int i=0;i<num.length;i++){
//             num[i]=sc.nextInt();
//             sum=sum+num[i];
//         }
//         System.out.print("the sum of nums is: ");
//         System.out.print(sum);
//     }
// }

// class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int []rev=new int[6];
//         System.out.print("Enter 6 nos here: ");
//         for(int i=0;i<rev.length;i++){
//             rev[i]=sc.nextInt();
//         }
//         System.out.println("revered array is:");
//         for(int i=rev.length-1;i>0;i--){
//             System.out.println(rev[i]);
//         }
//     }
// }

//rev number
// class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int rev=0;
//         int r=0;
//         while(num>0){
//             r=num%10;
//             rev=rev*10+r;
//             num=num/10;
//         }
//         System.out.println(rev);
//     }
// }

//pallindrome
// class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter no here:");
//         int num=sc.nextInt();
//         int rev=0;
//         int r=0;
//         int temp=num;
//         while(num>0){
//             r=num%10;
//             rev=rev*10+r;
//             num=num/10;
//         }
//         if(temp==rev)System.out.println("Number is pallindrome");
//         else System.out.println("Not a pallindrome");
//     sc.close();
//     }
// }

// class practice {
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

//Functions
// class practice{
//     public static void name(String name){
//     System.out.println("Your name is: "+name);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter your name here: ");
//         String name=sc.nextLine();
//         name(name);
//     }
// }

// class practice{
//     public static void sum(int a,int b) {
//         int sum=a+b;
//         System.out.printf("The sum of %d and %d is: %d",a,b,sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter two numbers here: ");
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         sum(a,b);
//         sc.close();
//     }
// }

// class practice{
//     public static void mul(int a,int b) {
//         int mul=a*b;
//         System.out.printf("The mul of %d and %d is: %d",a,b,mul);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter two numbers here: ");
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         mul(a,b);
//         sc.close();
//     }
// }

// class practice{
//     public static void fact(int n){
//         int fact=1;
//         if(n<0)System.out.print("No factorial for negative numbers");
//         else if(n==0)System.out.print(fact);
//         else{
//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//         }
//         System.out.print("factorial is: "+fact);}
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter no here: ");
//         int n=sc.nextInt();
//         fact(n);
//         sc.close();
//     }
// }

// class practice{
//     public static void avg(int a,int b,int c) {
//         int sum=a+b+c;
//         double avg=(float)sum/3;
//         System.out.print("The avg is: "+avg);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter three nos: ");
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         avg(a,b,c);
//         sc.close();
//     }
// }

//Array
// class practice{
//     public static void main(String args[]){
//         int []marks=new int [5];
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter 5 marks here: ");
//         for(int i=0;i<marks.length;i++){
//             marks[i]=sc.nextInt();
//         }
//         System.out.print("The marks are: ");
//         for(int i=0;i<marks.length;i++){
//              System.out.println(marks[i]);
//         }
//     }
// }

// class practice{
//     public static void main(String args[]){
//         int []marks=new int [5];
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter 5 marks here: ");
//         for(int i=0;i<marks.length;i++){
//             marks[i]=sc.nextInt();
//         }
//         System.out.print("The marks in reversed order are: ");
//         for(int i=marks.length-1;i>=0;i--){
//              System.out.println(marks[i]);
//         }
//     }
// }

//search array index
class practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int []no=new int[5];
        System.out.print("Enter 5 numbers: ");
        for(int i=0;i<no.length;i++){
            no[i]=sc.nextInt();
        }
        System.out.print("enter key here: ");
        int key=sc.nextInt();
        for(int i=0;i<no.length;i++){
        if(no[i]==key){
                System.out.print("Key is at index "+i);
            }
    }
}
}