import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] b = new int[7];
        boolean test = false;

        b[0] = 3;
        b[1] = 6;
        b[2] = 4;
        b[3] = 7;
        b[4] = 2;
        b[5] = 1;
        b[6] = 9;

        System.out.println("Введите одну из цифр: 3,6,4,7,2,1,9");

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 0; i < 7; i++) {
            if (num == b[i]) {
                test = true;
                System.out.println("Индекс числа в массиве соответствует " + i);
            }
        }
        if (!test) {
            System.out.println("Введено некорректное число");
        }

        System.out.println("-----------------------------------------------");

        int sum = 0;

        for (int i = 0; i < 7; i++) {

            sum = sum + b[i] * b[i];
        }
        System.out.println("Сумма квадратов элементов массива равна " + sum);
    }
}