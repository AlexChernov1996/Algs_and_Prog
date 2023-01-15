import java.util.Scanner;
public class Lab4V8 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
System.out.println("Ввести n");
int n = scan.nextInt();
 double array[] = new double [n];
int i,j;
 for ( i =0; i<n;i++){ 
    array[i] =Math.random()*50 -25;
}
 System.out.println("Initial array ");
 for(i=0;i<n;i++){ //Output array
    System.out.printf("%6.1f",array[i]);;
     if(i%10==9) System.out.print("\n");
 }
 System.out.print("\n");
 int count=0;
 double midleAr;
 double sum = 0;
 for(i=0; i<n;i++){
 sum+=array[i];
 }
 midleAr = sum/n;
 for(i=0; i<n;i++){
    if(array[i]>midleAr) count++;
 }
 System.out.println("Больше,чем среднее арифметическое - "+count);
 int col=0;
 for(i=0; i<n;i++){
    if(array[i]>0){
        col++;
    }
 }
 double filteredArr[] = new double[col];
 int col1=0;
 for(i=0; i<n;i++){
    if(array[i]>0){
        filteredArr[col1] = array[i];
        col1++;
    }
 }
 for( i=0; i<filteredArr.length; i++){ 
    System.out.printf("%7.1f",filteredArr[i]);
    if(i%10==9) System.out.print("\n");
}
System.out.print("\n");
double min;
int nom;
for( i=0; i < (filteredArr.length/2) -1; i++) {
nom=i; min=filteredArr[i];
for( j=i+1; j < filteredArr.length/2; j++) if ( filteredArr[j] > min ) {
nom=j; min=filteredArr[j];
}
filteredArr[nom] = filteredArr[i]; filteredArr[i] = min;
}
for( i=0; i<filteredArr.length; i++){ 
    System.out.printf("%7.1f",filteredArr[i]);
    if(i%10==9) System.out.print("\n");}
    System.out.print("\n");

//-----------------------------------------------------------2
System.out.println( "Columns");
        int m=scan.nextInt();
        System.out.println("Strings:");
         n=scan.nextInt();
        int array2[][]=new int[n][m];
        int orderArray [] = new int[n];
      
        for( i = 0;i<n;i++){ 
            for(j=0;j<m;j++){
                array2[i][j] =(int)(Math.random()*50-25);
            }
        }
        System.out.println("Array2: ");
        for( i=0;i<n;i++) {
        for(j=0;j<m;j++)
        System.out.printf("%8d",array2[i][j]);
        System.out.println();
        }
        System.out.println();
        for(i=0;i<n; i++){
            for(j=0;j<m;j++){
                if(array2[i][j] %2 == 0){
                    orderArray[i]++;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.printf("%8d",orderArray[i]);
        }
        System.out.println();
        int x2;
        int x1[] = new int [n];
       
            for( i=0; i < n-1; i++) { 
                for( j = i+1; j < n; j++) { 
                if ( orderArray[i] > orderArray[j] ) {
                    x2=orderArray[i]; orderArray[i]=orderArray[j]; orderArray[j]=x2;
                    x1=array2[i];
                    array2[i]=array2[j];
                    array2[j]=x1; 
                }
            }}
            System.out.println("SortedArray2: ");
            for( i=0;i<n;i++) {
            for(j=0;j<m;j++)
            System.out.printf("%8d",array2[i][j]);
            System.out.println();
        }
        int maxPosOfString[] = new int[m];
        for(i=0;i<m;i++){
            int minPos = 100;
            for(j = 0; j<n; j++){
                if(array2[j][i]>=0 && array2[j][i]<minPos){
                    minPos =array2[j][i];
                }
            }
            maxPosOfString[i] = minPos;
        }
        System.out.println("Минимальные число больше 0 по столбцам(Если нет таких - 100): ");
        for(i=0;i<m;i++){
            System.out.printf("%8d",maxPosOfString[i]);
        }
    }
}
           
    

