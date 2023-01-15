import java.util.Scanner;

public class Lab4V6 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввести n:"); // Задаем кол-во элементов в массиве
int n = scan.nextInt();
 int array[] = new int [n];
int i,j;
 for ( i =0; i<n;i++){ 
    array[i] =(int) Math.round(Math.random()*10 -5);
}
 System.out.println("Initial array ");
 for(i=0;i<n;i++){ //Output array
     System.out.print(array[i]+" ");
     if(i%10==9) System.out.print("\n");
 }
 System.out.print("\n");
 int sum=0;
 for(i=0;i<n;i++){
    sum+= Math.pow(array[i],n-i);
 }
 System.out.println("Багаточлен = "+sum);
 int countOf0 =0;
 for(i=0;i<n;i++){
   if(array[i] == 0) countOf0++;
 }
 int n1 =n-countOf0;
 int filteredArray[] = new int[n1];
 int col =0;
 for(i=0;i<n;i++){
    if(array[i] != 0){
        filteredArray[col] = array[i];
        col++;
    }
 }
 
 for(i=0;i<n1;i++){ //Output array
    System.out.printf("%7d",filteredArray[i]);
    if(i%10==9) System.out.print("\n");
}
System.out.println();
int x1;
for (i=1; i < n1; i++){
    x1 = filteredArray[i];
    for ( j=i-1; j>=0 && filteredArray[j] < x1; j--)
    filteredArray[j+1] = filteredArray[j]; filteredArray[j+1] = x1;
    }
    System.out.println("Sorted Array");
    for(i=0;i<n1;i++){ //Output array
        System.out.printf("%7d",filteredArray[i]);
        if(i%10==9) System.out.print("\n");
    }
System.out.println();
 //---------------------------------------------------------------2
System.out.println( "Стовпці");
         n=scan.nextInt();
        System.out.println("Рядки:");
         int m=scan.nextInt();
        int array2[][]=new int[n][m];
        int startEls [] = new int[n];
        for( i = 0;i<n;i++){ 
            for(j=0;j<m;j++){
                array2[i][j] =(int)(Math.random()*50-25);
            }
        }
        System.out.println("Масивт ");
        for( i=0;i<n;i++) {
        for(j=0;j<m;j++)
        System.out.printf("%8d",array2[i][j]);
        System.out.println();
        }
        System.out.println();
        System.out.println("Масив початкових елементів");
        for(i=0;i<n;i++){
            startEls[i] = array2[i][0];
            System.out.printf("%8d",startEls[i]);
        }
        System.out.print("\n");
        int x;
        int c [] = new int [m];
        for (i=1; i < n; i++) {
            x = startEls[i]; c=array2[i];
            for ( j=i-1; j>=0 && startEls[j] < x; j--){
                startEls[j+1] = startEls[j]; array2[j+1]=array2[j];
            }
            startEls[j+1] = x; array2[j+1]=c;
            }
            System.out.println("Відсортований масив: ");
        for( i=0;i<n;i++) {
        for(j=0;j<m;j++)
        System.out.printf("%8d",array2[i][j]);
        System.out.println();
        }
        int maxInColumns [] = new int[m];
        for(i=0;i<m;i++){
            int max=array2[0][i];
            for(j=0;j<n;j++){
                if(array2[j][i]> max) max = array2[j][i];
            }
            maxInColumns[i] = max;
        }
        System.out.println("Масив початкових елементів");
        for(i=0;i<m;i++){
            System.out.printf("%8d",maxInColumns[i]);
        }
        System.out.println();
        int unEven = 0;
        for(i=0; i<n;i++){
            for(j=0;j<m;j++){
                if(array2[i][j]%2 !=0) unEven++;
            }
        }
        System.out.println("Непарних елементів у матриці - "+ unEven);
    }
}
