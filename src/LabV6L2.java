import java.util.Scanner;

public class LabV6L2 {
    public static void main(String [] args){
////---------------------------1
Scanner scan = new Scanner(System.in);
System.out.println("Введите x:");
int x = scan.nextInt();
if((3*x -6) > 0){ // Задание в том,чтобы считать логарифм только из числа больше 0. Из отрицательных мы считать его не можем
    System.out.println("y ="+Math.log(3*x -6));
}
//-------------------------------------2

if(x>=0){
    double sinX = Math.sin(x);
    double cosX = Math.cos(x);
    double lnX = Math.log(x);
    if(sinX >= cosX && sinX >=lnX){
        if(cosX >= lnX){
            System.out.println("sinX="+sinX+"cosX="+cosX+"lnX="+lnX);
        }else System.out.println("sinX="+sinX+"lnX="+lnX+"cosX="+cosX);
    }else if(cosX >=sinX && cosX>=lnX){
        if(sinX>=lnX){
            System.out.println("cosX="+cosX+"sinX="+sinX+"lnX="+lnX);
        }else System.out.println("cosX="+cosX+"lnX="+lnX+"sinX="+sinX);
    }else if(lnX > sinX && lnX>cosX){
        if(cosX>sinX){
            System.out.println("lnX="+lnX+"cosX="+cosX+"sinX="+sinX);
        }else System.out.println("lnX="+lnX+"sinX="+sinX+"cosX="+cosX);
    }
}else System.out.println("Не существует значений"); // не существует т.к. мы не можем посчитать косинус, синус и логарифм отрицательного числа

//-----------------------------3
int a = 5;
int b = 6;
int c =7;
System.out.println("Введите p:");
int p = scan.nextInt();
int per = a+b+c;// перриметр
switch(p){
    case 1:{
        System.out.println("Периметр ="+ per);
        break; // прерываем switch чтобы он не шел дальше
    } 
    case 2:{
        double halfPer = per/2; //полуперриметр. нужен для формулы Герона
        double sqr = Math.sqrt(halfPer*(halfPer-a)*(halfPer -b)*(halfPer-c)); // формула Герона
        System.out.println("Площадь ="+ sqr);
        break;
    }
    case 3:{
        double cosA = (Math.pow(b,2)+Math.pow(c,2) - Math.pow(a,2)) / (2*a*c);// нашли косинус
        double A = Math.asin(cosA); // Нашли арксинус - он будет равен нашему углу в Радианах
        System.out.println("A ="+A+" радиан");
        break;
    }
    default:System.out.println("треугольник");

}
    }
}
