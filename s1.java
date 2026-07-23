 import java.util.*;
//Q-1
// class s1{
//     public static void main(String [] arg){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         long fact=1;
//         for(int i=1;i<=n;i++){
//             fact*=i;
//         }
//         System.out.println(fact);
//     }
// }

//Q-2
// class s1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         if(sc.hasNextInt()){
//             int n=sc.nextInt();
//             int total=0;
//             for(int i=0;i<=n;i++){
//                 total+=sc.nextInt();
//             }
//             System.out.println(total);
//         }
//     }
// }

//Q-3
// class s1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         boolean prime=true;
//         if(n<=1){
//             prime=false;
//         }
//         else{
//             for(int i=2;i*i<=n;i++){
//                 if(n%i==0){
//                     prime=false;
//                     break;
//                 }
//             }     
//         }
//         if(prime){
//                 System.out.println("Prime");
//             }
//             else{
//                 System.out.println("Not prime");
//             }
//     }
// }

//Q-4
class s1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String rev="";
        String s=sc.nextLine();
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println(rev);
    }
}