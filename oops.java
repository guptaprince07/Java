// // class Pen{
// //     String color;
// //     String type;

// //     public void write(){
// //         System.out.println("pen is working");
// //     }
// //     public void color(){
// //         System.out.println(this.color);
// //     }
// // }
// // class Student{
// //     String name;
// //     int age;
// //     int rollno;
// //     public void print(){
// //         System.out.println(this.name);
// //         System.out.println(this.age);
// //         System.out.println(this.rollno);
// //     }
// //     Student(String name,int age,int rollno){
// //         this.name=name;
// //         this.age=age;
// //         this.rollno=rollno;
// //     }//student constructor
// // }

// // public class oops{
// //     public static void main(String[] args) {
// //         Pen pen1=new Pen();
// //         pen1.color="Black";
// //         pen1.type="Gel";
// //         pen1.write();
// //         pen1.color();

// //         Pen pen2=new Pen();
// //         pen2.color="Blue";
// //         pen2.type="Ball";
// //         pen2.write();
// //         pen2.color();

// //         Student s1=new Student("abc",18,123456789); //by using constructor
// //         // s1.name="abc";
// //         // s1.age=18;
// //         // s1.rollno=1234567890;
// //         s1.print();
// //     }
// // }

// public class oops{
//     public int age;
//     public String name;
//     public int id;
//     public int subs;

//     public void study(){
//         System.out.println(name+"Studying");
//     }
//     public void bunk(){
//         System.out.println(name+"bunk");
//     }
//     public void sleep(){
//         System.out.println(name+"sleeping");
//     }
// }

// class Employee{
//     int salary;
//     String name;
//     public int getSalary(){
//         return salary;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setName(String n){
//         name=n;
//     }
// }

// class sq{
//     int side;
//     public int area(){
//         return side*side;
//     }
//     public int peri(){
//         return 4*side;
//     }
// }

// class rec{
//     int l;
//     int b;
//     public int area(){
//         return l*b;
//     }
//     public int peri(){
//         return 2*(l+b);
//     }}

// class cylinder{
//     private int radius;
//     private int height;

//     public int getRaidus(){
//     return radius;
// }
// public void setRaidus(int radius){
//     this.radius =radius;
// }

// public int getHeight(){
//     return height;
// }
// public void setHeight(int height){
//     this.height=height;
// }
// }

class circle{
    public int r;
    public float area;

    public int getR(){
        return r;
    }
    public void setR(int r){
        this.r=r;
    }

    public float getArea(){
        return (float)3.14*r*r;
    }
}

class cylinder extends circle{
    public int h;

    public int getH(){
        return h;
    }
    public void setH(int h){
        this.h=h;
    }
}
class oops{
    public static void main(String[] args) {
        // Employee e1=new Employee();
        // e1.setName("Prince");
        // e1.getName();
        // e1.salary=5000000;
        // e1.getSalary();
        // System.out.println(e1.getSalary());
        // System.out.println(e1.getName());
        //  s1=new sq();
        // s1.side=40;
        // s1.area();
        // System.out.println(s1.area());
        // s1.peri();
        // System.out.println(s1.peri());
        // rec s1=new rec();
        // s1.l=40;
        // s1.b=30;
        // s1.area();
        // System.out.println(s1.area());
        // s1.peri();
        // System.out.println(s1.peri());
        // cylinder c1=new cylinder();
        // c1.setHeight(100);
        // c1.setRaidus(45);

        // c1.getHeight();
        // c1.getRaidus();
        // System.out.println(c1.getHeight());
        // System.out.println(c1.getRaidus());

        cylinder cy1=new cylinder();
        cy1.setH(14);
        cy1.getH();
        System.out.println(cy1.getH());
        cy1.setR(45);
        cy1.getR();
        cy1.getArea();
        System.out.println(cy1.getArea());
    }
} 