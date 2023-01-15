import java.util.Scanner;

public class Lab4V1 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
System.out.println("Размер массива n:");
int n = scan.nextInt();
int i, j;
       double a [] = new double[n];
       int m = n%2 ==0? n/2 : n/2+1 ;
        System.out.println(m);
       double b [] = new double[m]; //new array for filtration and sort

       for ( i =0; i<a.length;i++){ 
           a[i] = Math.random()*50 + 1;
       }
        System.out.println("Initial array ");
        for(i=0;i<a.length;i++){ //Output array
            System.out.printf("%7.2f",a[i]);
            if(i%10==9) System.out.print("\n");
        }
        System.out.print("\n");
        int multOfArray = 1;
        for(i = 0; i<n;i++){
            multOfArray*= a[i];
        }
        System.out.println("Корень степени"+n+"От произведения всех чисел в массиве ="+Math.pow(multOfArray, 1./n));
            int col = 0;
        for(i=0; i<a.length; i++){
            if(i%2 == 0){
             b[col] = a[i] ;
             col ++;
            }
        }
        for(i = 0; i<m; i++){ 
            System.out.printf("%7.2f",b[i]);
            if(i%10==9) System.out.print("\n");
        }
        System.out.print("\n");

        double prom;// промежуточное значение для сортировки
        for(i =0; i<m;i++){
            for(j=i+1; j<m;j++){
                if(b[i]>b[j]){
                    prom = b[i];
                    b[i] = b[j];
                    b[j] = prom;
                }
            }
        }
        System.out.println("Sorted Array ");
        for(i=0;i<b.length;i++){ //Output array
            System.out.printf("%7.2f",b[i]);
            if(i%10==9) System.out.print("\n");
        }
        System.out.println("Колонки");
        int columns = scan.nextInt();
        System.out.println("Строки");
        int strings = scan.nextInt();
        double array1[][]=new double[columns][strings];

        for( i = 0;i<columns;i++){ 
            for(j=0;j<strings;j++){
                array1[i][j] =(Math.random()*20-10);
            }
        }

       System.out.println("Array1: ");
       for( i=0;i<strings;i++) {
       for(j=0;j<columns;j++)
       System.out.printf("%6.1f",array1[j][i]);
       System.out.println();
       }
        System.out.print("\n");
        double max[] = new double[strings];
        for(i = 0; i<strings; i++){
            double maxInString = array1[0][i];
            for(j = 1; j< columns; j++){
                if(maxInString < array1[j][i]){
                     maxInString = array1[j][i];
            } 
            max[i] = maxInString; 
        }}
        System.out.println("Array or max");
        for(i=0;i<max.length;i++){
            System.out.printf("%6.1f",max[i]);
       }
       System.out.println();
int nom;
double min;
double c[]=new double[columns];
for(  i=0; i < strings-1; i++) {
    nom=i; min=max[i];
    for( j=i+1; j < strings; j++)
    if ( max[j] < min ) {
    nom=j; min=max[j];
    }
    max[nom] = max[i]; max[i] = min;
    for(int k=0;k<columns;k++){
    c[k]=array1[k][nom]; array1[k][nom]=array1[k][i]; array1[k][i]=c[k];}}
    
    
    System.out.println("Sorted Array: ");
    for( i=0;i<strings;i++) {
    for(j=0;j<columns;j++)
    System.out.printf("%6.1f",array1[j][i]);
    System.out.println();
    }
    double mult2[] = new double [columns];
    for(i=0; i<columns; i++){
        double columMult =1;
        for(j=0; j<strings; j++){
            if(Math.abs(array1[i][j])> 2){
                columMult*= array1[i][j];
            }
        }
        mult2[i] = columMult;
    }
    System.out.println("добуток елементів, які за модулем більше 2, у кожному стовпці матриці:");
        for(i=0;i<columns;i++){
            System.out.printf("%8.1f",mult2[i]);
       }
    }
}
