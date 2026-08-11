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

//q-4
class s2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                count++;
            }
        }
        System.out.printf("%c occured %d times",ch,count);
    }
}