import java.util.Scanner;

public class Lab5V12 {
    static final double eps=1e-4;
    
    public static double my_log(double x ) {
        double sum = (x - 1) / x;
        double c = x - 1;
        double z;
        int n = 1;
        while (Math.abs(c / n) > eps) {
            n++;
            c *= -(x - 1);
            z = Math.pow((n * (Math.E - 1) + 1) / (n - 1), n - 1);
            sum += c / (n * z);
        }
        return sum;
    }
    static int count =0;
    static int n1=0,n2=1,n3=0;
    static int fib(int x) {
        if(x>0){
            n3 =n1+n2;
            n1 = n2;
            n2 = n3;
            if(n3>=5 && n3 <= 45) count++;
            fib(x-1);
        }
        return count;
}
    public static void main(String[] args) {
    System.out.printf("-------------------------------%n");
    System.out.printf("| x | my_log(x)| log(x) |%n");
    System.out.printf("-------------------------------%n");
    for(double x=0.6;x<=0.9;x+=(0.9-0.6)/5){
    System.out.printf("|%8.4f |%8.4f |%8.4f |%n", x, my_log(x),
    Math.log(x));}
    System.out.printf("-------------------------------%n");
    System.out.print(fib(10));
    }}
