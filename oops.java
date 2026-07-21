class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("pen is working");
    }
    public void color(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;
    int rollno;
    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollno);
    }
}

public class oops{
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="Black";
        pen1.type="Gel";
        pen1.write();
        pen1.color();

        Pen pen2=new Pen();
        pen2.color="Blue";
        pen2.type="Ball";
        pen2.write();
        pen2.color();

        Student s1=new Student();
        s1.name="abc";
        s1.age=18;
        s1.rollno=1234567890;
        s1.print();
    }
}