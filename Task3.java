import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(x % 2 == 0 ? "Вы ввели четное число" : "Вы ввели нечетное число");
    }
}
