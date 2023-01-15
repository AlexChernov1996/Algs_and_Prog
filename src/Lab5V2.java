public class Lab5V2 {
    static final double eps=1e-4;
    public static double my_EInX(double x){
        int n=1;
        double sum=1,c =1;
        double z=1;
        while(Math.abs(c/n) > eps){
            z *=n;
            c*=-x;
            sum+=c/z;
            n++;
        }
        return sum;}
    public static void main(String[] args) {
        System.out.printf("-------------------------------%n");
        System.out.printf("| x | my_E^-X| e^-x |%n");
        System.out.printf("-------------------------------%n");
        for(double x=0.5;x<=0.9;x+=(0.9-0.5)/5){
            System.out.printf("|%8.4f |%8.4f |%8.4f |%n", x, my_EInX(x),
                    Math.pow(Math.E,-x));}
        System.out.printf("-------------------------------%n");
    }}