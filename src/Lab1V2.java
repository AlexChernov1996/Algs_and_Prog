import java.util.Scanner;

public class Lab1V2 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        //------------------------------------------------1
        System.out.println("Ввести дробное число:");
        double x = scan.nextDouble();
        int d =(int) (x*10)%10;
        System.out.println(d);
        //-----------------------------------------------2
        System.out.println("сторона а:");
        int a = scan.nextInt();
        System.out.println("сторона b:");
        int b = scan.nextInt();
        System.out.println("сторона c:");
        int c = scan.nextInt();
        if( a ==b || b ==c || c ==a){
                System.out.println("Равнобедренный");
        } else System.out.println("Не равнобедренный");
        //---------------------------------------------3 
        System.out.println("Ввести n:");
        int n = scan.nextInt();
        double y = ((2*n + n)*(n+1)) /2;
        System.out.println("y="+y);
        //---------------------------------------------4
        System.out.println("Ввести угол А:");
        int A = scan.nextInt();
        double z1 = (Math.sin(2*A)+Math.sin(5*A)-Math.sin(3*A))/(Math.cos(A)+1-2*Math.pow(Math.sin(2*A),2));
        double z2 = 2*Math.sin(A);
        System.out.println("Z1= "+Math.rint(z1));
        System.out.println("Z2= "+Math.rint(z2));
        //--------------------------------------------5
        double a1= Math.random()*100 +100;
        double a2= Math.random()*100 +100;
        double a3= Math.random()*100 +100;
        double a4= Math.random()*100 +100;
        double a5=Math.random()*100 +100;
        System.out.println("a1="+Math.round(a1)+" a2="+Math.round(a2)+"a3="+Math.round(a3));
        System.out.print("a4="+Math.round(a4)+" a5="+Math.round(a5));
    }
}
