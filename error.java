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

class error{
    public static void main(String[] args) {
        int marks[]=new int[3];
        marks[0]=75;
        marks[1]=89;
        marks[2]=99;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array index: ");
        int index=sc.nextInt();
        System.out.println("number divide: ");
        int num=sc.nextInt();

        try{
            System.out.println("value of entered index: "+marks[index]);
            System.out.println("divide result:"+marks[index]/num);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexoutOfbound occured");
            System.out.println("reason: "+e);
        }
        catch(ArithmeticException e){
            System.out.println("Aritematic error occured");
            System.out.println("reason: "+e);
        }
        catch(Exception e){
            System.out.println("error occured");
            System.out.println("reason: "+e);
        }
    }
}