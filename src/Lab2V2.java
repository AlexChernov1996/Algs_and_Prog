import java.util.Scanner;
public class Lab2V2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
int x =2;
int y =4;
System.out.println("Ввести радиус:");
int R = scan.nextInt();
int a = 5;
int b = 3;
double distant = Math.sqrt(Math.pow((x-a),2)+Math.pow((y-b),2)); // Расстояние между точками по формуле из методичке
int z;
if(R>distant){
    z =1;
} else z = 0;
//------------------------------------------------------2
System.out.println("Ввести  a1:");
int a1 =scan.nextInt();
System.out.println("Ввести  a2:");
int a2 =scan.nextInt();
System.out.println("Ввести  b1:");
int b1 =scan.nextInt();
System.out.println("Ввести  b2:");
int b2 =scan.nextInt();
System.out.println("Ввести  c1:");
int c1 =scan.nextInt();
System.out.println("Ввести  c1:");
int c2 =scan.nextInt();
if(a1/a2 == b1/b2 && b1/b2 == c1/c2){
    int xPer = (c1*b2 - c2*b1)/(b1*a2 - b2*a1); // Точки пересечения тоже из методички
    int yPer = (c2*a1 - c1*a2)/(b1*a2 - b2*a1);
    System.out.println("x="+xPer+" y="+yPer);
}else if(a1/a2 == b1/b2 && b1/b2 != c1/c2){
    System.out.println("Параллельны");
}else System.out.println("Не пересекаются");
//----------------------------------------------------3
System.out.println("Номер дня:");
int day = scan.nextInt();
switch(day){
    case 1:{
        System.out.println("Понедельник. Рабочий");
        break;
    }
    case 2:{
        System.out.println("Вторник. Рабочий");
        break;
    }
    case 3:{
        System.out.println("Среда. Рабочий");
        break;
    }
    case 4:{
        System.out.println("Четверг. Рабочий");
        break;
    }
    case 5:{
        System.out.println("Пятница. Рабочий");
        break;
    }
    case 6:{
        System.out.println("Суббота. Выходной");
        break;
    }
    case 7:{
        System.out.println("Воскресенье. Выходной");
        break;
    }
}








    }

}
