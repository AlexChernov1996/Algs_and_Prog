import java.util.Scanner;

public class LabV6L3 {
    public static void main(String [] args){
//-------------------1
Scanner scan = new Scanner(System.in);
System.out.println("Введите x");
int x = scan.nextInt();
int y =0;
for(int i =1,j=10; i<=11&&j>=0;i++,j--){
int xInJ = 1;// x в степени j
for(int k =1;k<=j;k++){  
    xInJ*= x;
}
y+= i*xInJ;
}
System.out.println("y ="+y);
//-------------------2
System.out.println("Введите n(больше 0):");
int n = scan.nextInt();
int res = 1;
for(int i =2;i<=2*n;i+=2){  
    res*=i;
}
System.out.println("y="+res);
//----------------3
System.out.println("Введите целое число N");
int N = scan.nextInt();
boolean simple = true;
for(int i =2; i<N;i++){                        
    if(N%i==0) {
        simple = false;
    }
}
System.out.println("N простое число -"+ simple);
    }    
}
