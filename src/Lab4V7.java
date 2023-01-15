import java.util.Scanner;

public class Lab4V7 {
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
    double sum =0;
    for(i=0;i<=n/2; i+=2){
        sum+= array[i]*array[i+1];
    }
    if(n%2 !=0) sum+=array[n-1]; //Якщо у масиві непарна кількість ел. - останній просто додамо. Можна прибрати. Не знаю як краще, в умові не написано
    System.out.println();
    System.out.printf("Сума добутку парних на не парі = %6.1f",sum);
    double arraySort[] = new double [n];
    int col =0;
    int count = 0; 
    for(i=0; i<n; i++){
        if(array[i]>0){
            arraySort[col] = array[i]; // Спочатку записуємо в новий масив додатні елементи
            col++; count++;
        }
    } 
    for(i=0; i<n; i++){
        if(array[i]==0){
            arraySort[col] = array[i]; // так само нульові
            col++; count++;
        }
    } 
    for(i=0; i<n; i++){
        if(array[i]<0){
            arraySort[col] = array[i]; // і відємні
            col++;
        }
    } 
double x;
for( i=count; i < n-1; i++) { 
    for( j = i+1; j < n; j++) {
    if ( arraySort[i] > arraySort[j]) {
         x=arraySort[i]; arraySort[i]=arraySort[j]; arraySort[j]=x;
    }}}
    System.out.print("\n");
    System.out.println("Final array ");
    for(i=0;i<n;i++){ //Output array
       System.out.printf("%6.1f",arraySort[i]);;
        if(i%10==9) System.out.print("\n");
}
//-----------------------------------------------2
System.out.println( "Стовпці");
         n=scan.nextInt();
        System.out.println("Рядки:");
         int m=scan.nextInt();
        double array2[][]=new double[n][m];
        double startEls [] = new double[n];
        for( i = 0;i<n;i++){ 
            for(j=0;j<m;j++){
                array2[i][j] =(int)(Math.random()*50-25);
            }
        }
        System.out.println("Масив: ");
        for( i=0;i<n;i++) {
        for(j=0;j<m;j++)
        System.out.printf("%6.1f",array2[i][j]);
        System.out.println();
        }
        System.out.println();
       System.out.println("Масив мінімальних елементів у рядках:");
        for(i=0;i<n;i++) {
            double min = array2[i][0];
            for(j =1;j<m;j++){
                if(array2[i][j]<min) min =array2[i][j];
            }
            startEls[i] = min;
            System.out.printf("%6.1f",startEls[i]);
        }
        System.out.println();
        double c [] = new double [m];
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
        System.out.printf("%6.1f",array2[i][j]);
        System.out.println();
        }
        int countLow0[] = new int[m];
        System.out.println("Масив кількості елементів менше 0 у стовбцях:");
for(i=0;i<m;i++){
    count = 0;
    for(j=0;j<n;j++){
        if(array2[j][i]<0)count++;
    }
    countLow0[i]=count;
    System.out.printf("%8d",countLow0[i]);
}
    }}