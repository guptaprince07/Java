import java.util.*;
class error{
    public static void main(String args[]){
        int a=20;
        int b=0;
        try{
            int c=a/b;
            System.out.println("res is:"+c);
        }
        catch(Exception e){
            System.out.println("failed to divide.");
            System.out.println("reason"+e);
        }
    }
}