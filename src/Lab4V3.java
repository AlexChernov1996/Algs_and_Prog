import java.util.Scanner;

public class Lab4V3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввести n:"); // Задаем кол-во элементов в массиве
        int n = scan.nextInt();
        int array[] = new int[n];
        int i, j;
        for (i = 0; i < n; i++) {
            array[i] = (int) Math.round(Math.random() * 90 + 10);
        }
        System.out.println("Initial array ");
        for (i = 0; i < n; i++) { //Output array
            System.out.print(array[i] + " ");
            if (i % 10 == 9) System.out.print("\n");
        }
        System.out.print("\n");
        int sum = 0;
        for (i = 0; i < n; i++) {
            sum += array[i] * array[array.length - (i + 1)];
        }
        System.out.println("Сума = " + sum);
        System.out.println("Ввести цифру k:");
        int k = scan.nextInt();
        int count = 0;
        for (i = 0; i < n; i++) {
            if (array[i] % 10 == k) count++;
        }
        int[] arrayFin = new int[count];
        count = 0;
        for (i = 0; i < n; i++) {
            if (array[i] % 10 == k) {
                arrayFin[count] = array[i];
                count++;
            }
        }
        int x;
        for (i = 1; i < arrayFin.length; i++) {
            x = arrayFin[i];
            for (j = i - 1; j >= 0 && arrayFin[j] > x; j--)
                arrayFin[j + 1] = arrayFin[j];
            arrayFin[j + 1] = x;
        }
        System.out.println("Final array ");
        for (i = 0; i < arrayFin.length; i++) { //Output array
            System.out.print(arrayFin[i] + " ");
            if (i % 10 == 9) System.out.print("\n");
        }
        //---------------------------------------------------------------2
        System.out.println("Рядки");
        n = scan.nextInt();
        System.out.println("Стовбці:");
        int m = scan.nextInt();
        int array2[][] = new int[n][m];
        int startEls[] = new int[n];
        int maxEls[] = new int[n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                array2[i][j] = (int) (Math.random() * 50 - 25);
            }}
        System.out.println("Масив: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                System.out.printf("%8d", array2[i][j]);
            System.out.println();
        }
        System.out.println();
        for (i = 0; i < n; i++) {
            startEls[i] = array2[i][0];
        }
        System.out.println("ассив начальных  эллементов: ");
        for (i = 0; i < n; i++) {
            System.out.print(startEls[i] + " ");
            if (i % 10 == 9) System.out.print("\n");
        }
        int[] c;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (startEls[i] > startEls[j]) {
                    x = startEls[i];
                    startEls[i] = startEls[j];
                    startEls[j] = x;
                    c = array2[i];
                    array2[i] = array2[j];
                    array2[j] = c;
                }
            }
        }
        System.out.println("Масив: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                System.out.printf("%8d", array2[i][j]);
            System.out.println();
        }
        count = 0;
        int temp = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (Math.abs(array2[i][j]) > Math.abs(temp)) {
                    temp = array2[i][j];
                }
            }
            maxEls[i] = temp;
            temp = 0;
        }
        System.out.println("Массив максимальных по модулю  эллементов: ");
        for (i = 0; i < n; i++) {
            System.out.print(maxEls[i] + " ");
            if (i % 10 == 9) System.out.print("\n");
        }
        System.out.print("\n");
        count =0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
            if(array2[i][j]% 7 == 0){
                count++;
            }
            }
        }
        System.out.println("Кратны 7 - "+count+" эллементов");
    }
}