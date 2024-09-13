// import java.util.*;
// class pgm{
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int size=sc.nextInt();
//     int a[]= new int[size];
//     int max=0;
//     for (int i=1;i<size;i++){
//         a[i]=sc.nextInt();
//       if(a[i]>max){
//         max++;
//     }
// }

// System.out.print(max);
// }
// }   



import java.util.*;
class pgm{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int s1=0;
int a=sc.nextInt();
int b=sc.nextInt();
int ar[][]=new int[a][b];
for (int i=0;i<a; i++) {
for(int j=0;j<b;j++){
ar[i][j]=sc.nextInt();
}
}
for(int i=0;i<a;i++){
for(int j=0;j<b;j++){
if(ar[i][i]==1){
continue;
}
else{
s1=1;
break;
}
}
}
if(s1==1){
    System.out.print("Not a Toeplitz matrix");
    }
    else{
    System.out.print("Toeplitz matrix");
    }
    }
}