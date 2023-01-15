import java.util.Scanner;
import java.lang.Math;

public class LabV13L2 {
    public static void main(String [] args){
        /*Скласти програму обчислення модуля у=|5-4x| с використанням
        умовної операції */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = scan.nextInt();
        if( (5-4*x)>=0){
            System.out.println("y ="+ (5-4*x));
        }else System.out.println("5 - 4x - lower then zero");
  
/*Дано квадрат зі стороною а і півколо радіуса R. Визначите, чи
знаходиться півколо повністю у квадраті (рис. б) і, якщо це так, то знайдіть, яку
частину площі квадрата (в %) займає півколо, інакше знайдіть кут перетинання
квадрата і півколо (рис. а) */
    System.out.println("Enter a:");
    int a = scan.nextInt(); //Side of sqr
    System.out.println("Enter R:");
    int R = scan.nextInt(); //Radius
    if(2*R <= a){
        System.out.println("Inside");
        double sSqr = Math.pow(a,2);
        double sCircle = (Math.PI*Math.pow(R,2)) /2;                                  
        double percents = (sCircle / sSqr) * 100;
        System.out.println("percents = "+ percents);
    }else{
        System.out.println("Outside");
    }

    /* *Написати програму, яка б за введеним номером пори року (1 – зима, 2 –
весна, 3 – літо, 4 – осінь) видавала відповідні цієї порі року місяці ікількість днів
у кожному з місяців. */
        System.out.println("Enter num 1-4");
        int num = scan.nextInt();
        switch(num){
            case 1:{
                 System.out.println("Winter");
                 System.out.println("Dec - 31days");
                 System.out.println("Jan - 31days");
                 System.out.println("Feb - 28days");
                 break;
                }
            case 2:{ 
                System.out.println("Spring");
                System.out.println("Mar - 31days");
                System.out.println("Apr - 30days");
                System.out.println("May - 31days");
                break;
            }
            case 3: {
                System.out.println("Summer");
                System.out.println("Jun - 30days");
                System.out.println("Jul - 31days");
                System.out.println("Aug - 31days");
                break;
        }
            case 4: {
                System.out.println("Autumn");
                System.out.println("Sep - 30days");
                System.out.println("Oct - 31days");
                System.out.println("Nov - 30days");
                break;
        }
        default:System.out.println("Not 1-4");
        }


}
}