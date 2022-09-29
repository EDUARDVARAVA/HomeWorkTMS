import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Введите температуру на улице(t): ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x > -5) {
            System.out.println("Тепло");
        } else if (x <= -5 || x > -20) {
            System.out.println("Нормально");
        } else if (x <= -20) {
            System.out.println("Холодно");
        }
    }
}
