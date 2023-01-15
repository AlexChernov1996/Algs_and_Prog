public class Lab5V8 {
    static final double eps=1e-4; // из примера в методичке.
    public static double getEInX(double x){
        int n=0;
    double c =Math.pow(-1,n)*Math.pow(x, 2*n); // числитель
    double z=1; // знаменатель
    double sum = c/z;  
    while(c/z > eps){
             for(int i = 1;i<=n; i++){
            z *=i;
        }
         c=Math.pow(-1,n)*Math.pow(x,2*n); 
         sum+=c/z;         
    n++;}
    return sum;
    }
// e = 2.718281828
    public static void main(String[] args) {
        System.out.printf("-------------------------------%n");
        System.out.printf("| x | my_E^-X^2| e^-x^2 |%n");
        System.out.printf("-------------------------------%n");
        for(double x=0.2;x<=0.8;x+=(0.8-0.2)/5){
        System.out.printf("|%8.4f |%8.4f |%8.4f |%n", x, getEInX(x),
        Math.pow(2.718281828,Math.pow(-x,2)));} //e^-x^2
        System.out.printf("-------------------------------%n");
       
        }}






