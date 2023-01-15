import java.util.Scanner;

public class LabV7L3 {
    public static void main(String [] args){
        /*Обчислити за схемою Горнера значення багаточлена виду:
y=11x10 + 10x9 + 9x8+...+2x + 1.


Логічній змінній присвоїти true, якщо введене ціле число N являється
простим. Інакше логічна змінна повинна отримати значення false */
Scanner scan = new Scanner(System.in);
System.out.println("Введите х:");
int x = scan.nextInt();
int res = 0;
for(int i = 10; i>0;i--){
 int xInI = 1; // x в степени i
 for(int j = i; i>0; i--){
    xInI *= x;
 }
 res+=i+1+xInI;
}
System.out.println("y ="+res);

// Обчислити y=(2n-1)!!=1·3·5·...·(2n-1), n ввести (n> 0).
System.out.println("Введите n больше 0:");
int n = scan.nextInt();
for(int i = 1; i<=2*n-1; i+=2){
 res += i;
}
System.out.println("y ="+res);
/*Визначити кількість п’ятизначних натуральних чисел, сума цифр яких
дорівнює заданому числу N (видно, що 1<=N<=45). При обчисленнях неможна
використовувати операції ділення (/, %).*/
System.out.println("Введите N от 1 до 45");
int N = scan.nextInt();
int count =0;
int one;
int two;
int three;
int four;
int five;
for(one =1; one<=9; one++){
    for( two =0; two<=9;two++){
        for(three =0; three<=9; three++){
            for(four =0; four<=9; four++){
                for(five =0; five<=9; five++){
                    if((one + two + three + four + five) ==N){
                        count++;
                    }
                }
            }
        }
    }
}
System.out.println("Количество таких чисел - "+count);
    }
}
