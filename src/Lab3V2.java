import java.util.Scanner;
public class Lab3V2 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        /*Знайти перший від’ємний член послідовності cos(ctg N), коли Nприймає
значення 1, 2, 3, ....
Знайти, на якому кроці в ряду sinX, sin(sinX), sin(sin(sinX)), ...3
зустрінеться перше число, що за модулем менше за 5·10-2. Надрукувати номер
крока і число.
Обчислити суму квадратів всіх цілих чисел, які потрапляють вінтервал
(lnX, eX), явно, що X повинен бути більше 1. */
//---------------------------------------------------------1

double firstMins =1;
int N=1; 
while(firstMins>=0){
    firstMins = Math.cos(1/Math.tan(N)); // Для котангенса нет своего метода он равен 1/tg
    N++;
}
System.out.println(firstMins);
System.out.println("Ввести x:");
int x = scan.nextInt();
double firstLower = Math.sin(x);
int count =1;
while(Math.abs(firstLower)<5*Math.pow(10,-2)){
    count++;
    firstLower = Math.sin(firstLower);
}
System.out.println("Первое меньше ="+firstLower);
//-----------------------------------------------3
System.out.println("Ввести x(Больше 1):");
 x = scan.nextInt();
 double e = 2.718281828459045;
 int start = (int) Math.log(x);
 int end = (int) Math.pow(e,x);
 int sum = 0;
  for(int i = start; i<=end; i++){
    sum += Math.pow(i, 2);
  }
  System.out.println("Сумма квадратов ="+ sum);
    }
}
