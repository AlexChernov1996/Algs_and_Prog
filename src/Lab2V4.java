import java.util.Scanner;

public class Lab2V4 {
    public static void main(String[] args) {
        //------------------------------1
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите x:");
        int x = scan.nextInt();
        int y =5*x -4;
        if(y>=0){
            System.out.println("y="+y);
        }
        //--------------------2
        System.out.println("Введите x и y для A:");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("Введите x и y для B:");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        System.out.println("Введите x и y для C:");
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)){
            System.out.println("Точки на одной прямой");
        }else {
            double A = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
            double B = Math.sqrt(Math.pow((x2-x3),2)+Math.pow((y2-y3),2));
            double C = Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2));
            System.out.println("Перриметр = "+(A+B+C));
        }
        //-----------------------------------------------3
        System.out.println("Введите n:");
        int n = scan.nextInt();
        int length =0;
        int temp = n;
        while (temp>0){
            length++;
            temp = temp/10;
        }
        switch (length){
            case 1: {
                System.out.println(n);
                break;
            }
            case 2:{
                int first = n/10;
                int second = n%10;
                System.out.println(first*second);
                break;
            }
            case 3:{
                int first = n/100;
                int second = n%100/10;
                int third = n%10;
                System.out.println(first*second*third);
            }
            case 4:{
                int first = n/1000;
                int second = n%1000/100;
                int third = n%100/10;
                int fourth =n%10;
                System.out.println(first*second*third*fourth);
                break;
            }
            case 5:{
                int first = n/10000;
                int second = n%10000/1000;
                int third = n%1000/100;
                int fourth =n%100/10;
                int fifth = n%10;
                System.out.println(first*second*third*fourth*fifth);
                break;
            }
            default: System.out.println("Число должно быть меньше 6 знаков");
        }
    }
}