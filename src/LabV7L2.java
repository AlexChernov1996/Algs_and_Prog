import java.util.Scanner;

public class LabV7L2 {
    public static void main(String[] args){
/*7. *Задано коло з радіусом R і прямокутний отвір зі сторонами a,b.
Привласнити f = 1, якщо коло пройде через отвір і f = 0 у противному випадку.
Завдання вирішити з використанням умовної операції.
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите радиус R:");
        int R = scan.nextInt();
        System.out.println("Введите сторону a:");
        int a = scan.nextInt();
        System.out.println("Введите сторону в:");
        int b = scan.nextInt();
        int f;
        if(2*R>a || 2*R>b){
            f = 0;
        } else {
            f =1;
        }
        System.out.println("f = " +f);
        /**Відомо, що із чотирьох чисел a1, a2, a3 і a4 одне відмінне від трьох інших,
рівних між собою; привласнити номер цього числа змінної n.  */

        int a1 =1;
        int a2 =1;
        int a3 =2;
        int a4 =1;
        int n;
        if(a1!= a2 && a1 != a3){
            n=1;
        }else if(a1!= a2 && a2 != a3){
            n =2;
        }else if(a2!= a3 && a1!= a3){
            n =3;
        }else{
            n=4;
        }
        System.out.println("n ="+n);

        /**Є серія вимірів елементів трикутника. Групи елементів пронумеровані. У
        серії в довільному порядку можуть зустрічатися такі групи елементів
        трикутника: 1. Основа та висота; 2. Дві сторони і кут між ними (кут заданий у
        радіанах); 3. Три сторони.
        Розробити програму, яка запитує номер групи елементів, вводить
        відповідні елементи та обчислює площу трикутника. Обчислення припинити,
        якщо введений номер групи 0. */
        System.out.println("Введите группу элементов:1 - основа и высота. 2 - две стороны и угол в радианах. 3 - три стороны.");
        int group = scan.nextInt();
        switch(group){
            case 1:{
            System.out.println("Введите высоту");
            int height = scan.nextInt(); 
            System.out.println("Введите основу");
            int base = scan.nextInt();
            int sq = (height * base)/2;
            System.out.println("Площадь = "+ sq);}
            case 2:{
                System.out.println("Введите сторону");
            int side1 = scan.nextInt(); 
            System.out.println("Введите вторую сторону");
            int side2 = scan.nextInt();
            System.out.println("Введите угол между ними");
            int angle = scan.nextInt();
            double sq = (side1 * side2 * Math.sin(angle))/2;
            System.out.println("Площадь = "+ sq);
            }
            case 3:{
                System.out.println("Введите сторону");
            int side1 = scan.nextInt(); 
            System.out.println("Введите вторую сторону");
            int side2 = scan.nextInt();
            System.out.println("Введите третью сторону");
            int side3 = scan.nextInt();
            int p = (side1 +side2 + side3)/2; //Полупериметр
            double sq = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
            System.out.println("Площадь = "+ sq);
            }
            case 0: break;


        }
    }
}
