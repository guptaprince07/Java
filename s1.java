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
// class s1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String rev="";
//         String s=sc.nextLine();
//         for(int i=s.length()-1;i>=0;i--){
//             rev+=s.charAt(i);
//         }
//         System.out.println(rev);
//     }
// }

//vowels and consonants
// class s1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         int vowel=0;
//         int con=0;
//         s=s.toLowerCase();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                 vowel++;
//             }
//             else{
//                 con++;
//             }
//         }
//         System.out.println("Vowel: "+vowel);
//         System.out.println("Consonant: "+con);
//     }
// }

//anagram
//  class s1 {
//     public static void main(String[] args) {
//         String s1="heart";
//         String s2="earth";
//         char []a=s1.toCharArray();
//         char []b=s2.toCharArray();
//         Arrays.sort(a);
//         Arrays.sort(b);
//         if(Arrays.equals(a, b)){
//             System.out.println("Anagram");
//         }
//         else{
//             System.out.println("Non Anagram");
//         }
//     }
// }

//fibonanci
// class s1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int fibo[]=new int[n];
//         if(n>=1){
//             fibo[0]=0;
//         }
//         if(n>=2){
//             fibo[1]=1;
//         }
//         for(int i=2;i<n;i++){
//             fibo[i]=fibo[i-1]+fibo[i-2];
//         }
//         for(int i=0;i<n;i++){
//             System.out.println(fibo[i]);
//         }

//     }
//     }

//max in array
// class s1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int array[]=new int[n];
//         for(int i=0;i<n;i++){
//             array[i]=sc.nextInt();
//         }
//         int max=array[0];
//         for(int i=0;i<array.length-1;i++){
//             if(array[i]>max){
//                 max=array[i];
//             }
//         }
//         System.out.println("max is: "+max);
//     }
// }

//min in array
class s1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int min=array[0];
        for(int i=array.length-1;i>=0;i--){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("min is:"+min);
    }
}