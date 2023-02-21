import java.util.Scanner;

public class Lab3V3 {
    public static void main(String [] args){
        int i;
        Scanner scan = new Scanner(System.in);
        //---------------------1
        System.out.println("Введите n ≥ 10");
        int n = scan.nextInt();
        double res= 1 - 1./2;
        for (i=2;i<=n;i++){
            res*= 1- 1./Math.pow(i,2);
        }
        System.out.println("p="+res);
        //------------------------------------2
        System.out.println("Введите x:");
        int x = scan.nextInt();
        res=0;
        for (i=1;i<=n;i++){
            res+=Math.pow(Math.cos(x),i);
        }
        System.out.println("y="+res);
        //---------------------------3
        int result = 0;
        int fact =1;
        for (i = 1; i <= n; i++) {
            fact *= i;
            result += fact;
        }
        System.out.println("1!+2!+...+n!="+result);
    }
}
