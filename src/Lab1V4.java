import java.util.Scanner;
public class Lab1V4 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
//----------------------------------------------1
System.out.println("Ввести дробное число x:");
double x = scan.nextDouble();
int first = (int)(x *10) % 10;
int second = (int)(x *100) % 10;
int third = (int)(x *1000) % 10;
if(first == 0 || second ==0 || third ==0){
    System.out.println("Есть 0");
}else System.out.println("Нет 0");
//---------------------------------------------2
System.out.println("Ввести количество часов(0-12):");
int h = scan.nextInt();
System.out.println("Ввести количество минут(0-60):");
int m = scan.nextInt();
System.out.println("Ввести количество секунд(0-60):");
int s = scan.nextInt();
double hDeg = h * 30;
double mDeg = (30./60)*m;
double sDeg = (30./(60 *60))*s;
double res = hDeg + mDeg +sDeg;
        System.out.println(res+"Градусов");

        //----------------------------------------------------3
        System.out.println("Ввести n");
        int n = scan.nextInt();
        
        double y = (Math.pow(n, 2)*Math.pow(n+1, 2)*2) /4;
        System.out.println("y="+y);
        //-----------------------------------------------------4
        System.out.println("Ввести угол A");
        int A = scan.nextInt();
        double z1 = 1 - (1/4)*Math.sin(2*A) + Math.cos(2*A);
        double z2 = Math.pow(Math.cos(A),2) + Math.pow(Math.cos(A),4);
        System.out.println("Z1= "+Math.rint(z1));
        System.out.println("Z2= "+Math.rint(z2));
        //--------------------------------------------5
        double a1= Math.random()*20 -10;
        double a2= Math.random()*20 -10;
        double a3= Math.random()*20 -10;
        double a4= Math.random()*20 -10;
        double a5=Math.random()*20 -10;
        System.out.println("a1="+Math.round(a1)+" a2="+Math.round(a2));
        System.out.println("a3="+Math.round(a3)+" a4="+Math.round(a4));
        System.out.print(" a5="+Math.round(a5));
    }
}
