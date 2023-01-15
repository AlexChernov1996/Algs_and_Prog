import java.util.Scanner;
import java.lang.Math;

public class LabV13L3 {
    public static void main(String [] args){
//------------------------------1Знайти всі п’ятизначні числа, сума цифр яких більша за N і менша за
//2·N; (1<N<25).
Scanner scan = new Scanner(System.in);
System.out.println("Enter n 1-25:");
int N = scan.nextInt();
int one,two,three,four,five, res;

 for(one =1; one<=9;one++){
    for(two =0; two<=9;two++){
        for(three =0; three<=9;three++){
            for(four =0; four<=9;four++){
                for(five = 0; five<=9; five++){
                    if((one+two+three+four+five) > N && (one+two+three+four+five)< (2*N)){
                        res = one*10000 + two*1000 + three*100 + four *10 + five;
                        System.out.println("This num is -"+res);
                    }
                }
            }
        }
    }
 }

//-----------------------------2
System.out.println("Enter n:");
int n = scan.nextInt();
double p = 1;
for(int i =1;i<=n;i++){
    int iFact = 1;
    for(int j=1; j<=i;j++){
        iFact *=j;
    }
    p *=1+(1/iFact);
    if((1/iFact) > Math.pow(10,-3)) break; // Проверка из условия
}
System.out.println("p ="+ p);

//----------------3 Обчислити 1! + 2·2! + 3·3! + ... + n·n!
int result=0;
for(int i = 1;i<=n;i++){
    int iFact = 1;
    for(int j=1; j<=i;j++){
        iFact *=j;
    }
result +=i* iFact;
}
System.out.println("Result ex3 ="+ result);
    }
}

