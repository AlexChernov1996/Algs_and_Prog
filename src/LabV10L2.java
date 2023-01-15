import java.util.Scanner;

public class LabV10L2 {
    public static void main(String [] args){
        /**Скласти програму обчислення кореня 𝑦 = √3 − 6𝑥 з використанням
умовної операції.
*Дано відрізки [a, b] и [c, d] і точка A з координатою х. Визначити, чи
належить дана точка одному із цих відрізків, обом або лежить поза них.
 */
Scanner scan = new Scanner(System.in);
//----------------------------------------1
System.out.println("x:");
int x = scan.nextInt();
if(3-6*x >=0){
    System.out.println("y="+Math.sqrt(3-6*x));
}
//---------------------------------2
int a =0;
int b = 8;
int c =6;
int d = 12;
System.out.println("A:");
int A = scan.nextInt();
if(A>=a && A<=b && A>=c && A<=d){
    System.out.println("А принадлежит 2м отрезкам");
}else if(A>=a && A<=b){
    System.out.println("А принадлежит Первому отрезку");
}else if(A>=c && A<=d){
    System.out.println("А принадлежит Второму отрезку");
}else  System.out.println("А лежит вне отрезков");


/**Нехай елементами рівностороннього трикутника є: 1) сторона a; 2) площа
S; 3) висота h; 4) радіус вписаного кола r; 5) радіус описаного кола R. Скласти
програму, що по заданому номеру і значенню відповідного елемента
обчислювала б значення всіх інших елементів трикутника. */

System.out.println(" 1) сторона a; 2) площаS; 3) висота h; 4) радіус вписаного кола r; 5) радіус описаного кола R");
int type = scan.nextInt();
double side, S,h,r,R;
System.out.println("Значение");
int value = scan.nextInt();
switch(type){
    case 1:{
        
        S = (Math.pow(value,2)*Math.sqrt(3))/4;
        System.out.println("S="+S);
        h = (value * Math.sqrt(3))/2;
        System.out.println("h="+h);
        r = (S/2)/(value*3);
        System.out.println("r="+r);
        R = (S/Math.pow(value,3)) /4;
        System.out.println("R="+R);
        break;
    }
    case 2:{
        side =  Math.sqrt((4*value)/Math.sqrt(3));
        System.out.println("side ="+side);
        h = (side * Math.sqrt(3))/2;
        System.out.println("h="+h);
        r = (value/2)/(side*3);
        System.out.println("r="+r);
        R = (value/Math.pow(value,3)) /4;
        System.out.println("R="+R);
        break;
    }
    case 3:{
        r = value;
        S = Math.pow(r,2)* 3*Math.sqrt(3);
        System.out.println("S="+S);
        side =  Math.sqrt((4*S)/Math.sqrt(3));
        System.out.println("side ="+side);
        R = (S/Math.pow(S,3)) /4;
        System.out.println("R="+R);
        h = (side * Math.sqrt(3))/2;
        System.out.println("h="+h);
        break;
    }
    case 4:{
        R = value;
        S = (Math.pow(R, 2) * 3 *Math.sqrt(3))/4;
        System.out.println("S="+S);
        side =  Math.sqrt((4*S)/Math.sqrt(3));
        System.out.println("side ="+side);
        h = (side * Math.sqrt(3))/2;
        System.out.println("h="+h);
        r = (S/2)/(side*3);
        System.out.println("r="+r);
        break;
    }
}
    }
}
