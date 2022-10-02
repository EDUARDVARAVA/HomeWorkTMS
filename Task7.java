import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        x = x * (x + 1) / 2;
        System.out.print("Сумма чисел равна: " + x);
    }
}
