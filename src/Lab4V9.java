import java.util.Scanner;

public class Lab4V9 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
System.out.println("Ввести n");
int n = scan.nextInt();
 int array[] = new int [n];
int i,j;
 for ( i =0; i<n;i++){ 
    array[i] =(int) Math.round(Math.random()*50 -25);
}
 System.out.println("Initial array ");
 for(i=0;i<n;i++){ //Output array
     System.out.print(array[i]+" ");
     if(i%10==9) System.out.print("\n");
 }
 System.out.print("\n");
 System.out.println("Ввести k");
int k = scan.nextInt();
 int count=0;

boolean equality = true;
 for(i=0; i<n-2; i++){
    if(array[i]>array[i+1] ||array[i+1]>array[i+2]){
        equality = false;
    }else equality = true; 
 }
 for(i=0; i<n;i++){
    if(array[i] % k !=0) count++;
 }
 System.out.println("відношення a[i]<=a[i+1]<=a[i+2] -"+equality);
 int arrayFiltered[] = new int [n-count];
 int col=0;
 for(i=0; i<n;i++){
    if(array[i] % k == 0){
        arrayFiltered[col] = array[i];
        col ++;
    }
 }
 System.out.println("Filtered array ");
 for(i=0;i<arrayFiltered.length;i++){ //Output array
     System.out.print(arrayFiltered[i]+" ");
     if(i%10==9) System.out.print("\n");
 }
 System.out.print("\n");
 int x;
 for (i=1; i < arrayFiltered.length; i++){
    x = arrayFiltered[i];
    for ( j=i-1; j>=0 && arrayFiltered[j] > x; j--)
    arrayFiltered[j+1] = arrayFiltered[j]; arrayFiltered[j+1] = x;
    }
    System.out.println("Sorted array ");
    for(i=0;i<arrayFiltered.length;i++){ //Output array
        System.out.print(arrayFiltered[i]+" ");
        if(i%10==9) System.out.print("\n");
    }
//-----------------------------------------------------------2
System.out.println( "Strings");
        int strings=scan.nextInt();
        System.out.println("Columns:");
        int columns=scan.nextInt();
        double array2[][]=new double[columns][strings];
        int orderArray [] = new int[strings];
       double maxMinusEls [] = new double[columns];
        for( i = 0;i<columns;i++){ 
            for(j=0;j<strings;j++){
                array2[i][j] =(Math.random()*10-5);
            }
        }
        System.out.println("Array2: ");
        for( i=0;i<strings;i++) {
        for(j=0;j<columns;j++)
        System.out.printf("%6.1f",array2[j][i]);
        System.out.println();
        }
        for( i=0;i<strings;i++) {
            for(j=0;j<columns;j++)
            if(array2[j][i] == 0) orderArray[i]++;
            }
        System.out.println("Order array:");
        for(i=0; i<strings; i++){
            System.out.print(orderArray[i]+" ");
        }
        System.out.println();
        int nom;
        double c[]=new double[columns];
int min;
for(  i=0; i < array2.length-1; i++) {
nom=i; min=orderArray[i];
for( j=i+1; j < strings; j++)
if ( orderArray[j] < min ) {
nom=j; min=orderArray[j]; }
orderArray[nom] = orderArray[i]; orderArray[i] = min;
c=array2[nom]; array2[nom]=array2[i]; array2[i]=c;}

System.out.println("Array2: ");
        for( i=0;i<strings;i++) {
        for(j=0;j<columns;j++)
        System.out.printf("%6.1f",array2[j][i]);
        System.out.println();
        }
        for( i=0;i<columns;i++) {
            double maxMinus = array2[i][0]; 
            for(j=0;j<strings;j++){
                if(array2[i][j]<0 && array2[i][j]>maxMinus) maxMinus = array2[i][j];
            }
            if(maxMinus<0){
            maxMinusEls[i] = maxMinus;
        }else maxMinusEls[i] = 0; // Если нет отрицательных элементов в столбце - запишется 0
            }
            System.out.println("MaxMin array:");
        for(i=0; i<columns; i++){
            System.out.printf("%6.1f",maxMinusEls[i]);
        }
    }
}
