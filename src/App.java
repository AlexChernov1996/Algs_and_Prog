import java.util.Scanner;

public class App {
    public static void main(String[] args){
        /*
      * Дано масив дійсних чисел, що містить n елементів. Підрахувати
кількість елементів, для яких виконується нерівність i*i<a[i]<i!. "Стиснути "
масив, видаливши елементи, що задовольняють даній умові. Упорядкувати
новий масив за убуванням методом вставки.
* *Дано двовимірний дійсний масив. Упорядкувати стовпці матриці за
зростанням кількості елементів, що лежать у діапазоні від А до B, у стовпцях.
Сортування методом лінійного сортування. Знайти максимум у кожному рядку
матриці.

         */
        //-------------------------1;
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the n:");
       int n = scan.nextInt();
       int i, j;
       double a [] = new double[n];

       double b [] = new double[n]; //new array for filtration and sort

       for ( i =0; i<a.length;i++){ //Creating array with random values
           a[i] = Math.random()*50;
       }

        System.out.println("Initial array ");
        for(i=0;i<a.length;i++){ //Output array
            System.out.printf("%7.2f",a[i]);
            if(i%10==9) System.out.print("\n");
        }
        System.out.print("\n");

        int count = 0;
        int col =0;
        for( i = 0; i<a.length; i++){
            int iFact=1;
            for( j =1;j<=i;j++){ //Getting i factorial
                iFact *= j;
            }
          
            //Getting filtered array
            if(i*i<a[i] && a[i]<iFact){
                count++;
            }else {
                   b[col] = a[i];
                   col++;
                }
            }
        


        System.out.println("count = "+count);
        double x;
        for (i=1; i < b.length; i++){
             x = b[i];
             j=i;
             while(j>0 && b[j-1] < x){
                b[j] = b[j-1];
                j--;
             }
             b[j]=x;
        }
        
        for( i=0; i<b.length-count; i++){ //Output array
            System.out.printf("%7.2f",b[i]);
            if(i%10==9) System.out.print("\n");
        }
        System.out.print("\n");
        
                    /*Дано двовимірний дійсний масив. Упорядкувати стовпці матриці за
                    зростанням кількості елементів, що лежать у діапазоні від А до B, у стовпцях.
                    Сортування методом лінійного сортування. Знайти максимум у кожному рядку
                    матриці.*/

                    System.out.println( "Strings");
        int strings=scan.nextInt();
        System.out.println("Columns:");
        int columns=scan.nextInt();
        System.out.println("Enter A:");
        int A = scan.nextInt();
        System.out.println("Enter B:");
        int B = scan.nextInt(); 
        double array2[][]=new double[columns][strings];
        int orderArray [] = new int[columns];
       
        for( i = 0;i<columns;i++){ 
            for(j=0;j<strings;j++){
                array2[i][j] =(Math.random()*20-10);
            }
        }
        System.out.println("Array2: ");
        for( i=0;i<strings;i++) {
        for(j=0;j<columns;j++)
        System.out.printf("%6.1f",array2[j][i]);
        System.out.println();
        }

        for(i =0;i<columns;i++){
            for(j=0;j<strings;j++){
                if(array2[i][j]>=A && array2[i][j]<=B){
                    orderArray[i]++;
                }
            }
        }

        System.out.println("orderArray:");
            for(i=0;i<columns;i++){
                System.out.print(" "+orderArray[i]);
            }
        double x1 [] = new double [strings];
       int x2;
        for( i=0; i < columns-1; i++) { 
            for( j = i+1; j < columns; j++) { 
            if ( orderArray[i] > orderArray[j] ) {
                x2=orderArray[i]; orderArray[i]=orderArray[j]; orderArray[j]=x2;
                
                x1=array2[i];
                array2[i]=array2[j];
                array2[j]=x1; 
            }
        }
        } 
            System.out.println();
            System.out.println("Sorted:");

            for( i=0;i<strings;i++) {
                for(j=0;j<columns;j++)
                System.out.printf("%6.1f",array2[j][i]);
                System.out.println();
                }
                double max[] = new double[strings];
                double current;
                for(i=0;i<strings;i++){
                    current = array2[0][i];
                    for(j=0;j<columns;j++){
                        if(current<array2[j][i]){
                            current = array2[j][i];
                        }
                    }
                    max[i] =current;
                }
                System.out.println("max:");
                for(i=0;i<strings;i++){
                    System.out.printf("%6.1f",max[i]);
                }
}
}