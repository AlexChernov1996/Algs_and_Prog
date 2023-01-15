import java.util.Scanner;

public class LabV10L3 {
    public static void main(String [] args){
//-----------------------------------------1
Scanner scan = new Scanner(System.in);
System.out.println("n:");
int n = scan.nextInt();
System.out.println("x:");
int x = scan.nextInt();
double y =0;
for(int i=0;i<=n; i++){
int oneDegr;
if(i%2 ==0){
    oneDegr = 1;
}else oneDegr =-1;
int i2Fact =1;
for(int j =1; j<=i; j++){
    i2Fact *= j;
}
y+= (oneDegr *Math.pow(x,(2*n)))/i2Fact;
}
System.out.println("y ="+y);

//-------------------------------------2
for(int i =1; i<=9;i++){
    for(int j=0; j<=9;j++){
        int doubleSum = (i+j)*2;
        if(doubleSum == (i*j)){
            System.out.println(i*10+j);
        }
    }
}
//------------------------------------3
int sumOfSqr =0;
for(int i=2; i<=20; i+=2){
    sumOfSqr += Math.pow(i, 2);
}
System.out.println("sum ="+sumOfSqr);
    }
}

