import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число a: ");
        double a = scanner.nextInt();
        System.out.println("Введіть число b: ");
        double b = scanner.nextInt();
        System.out.println("Введіть число х: ");
        double x = scanner.nextInt();
        System.out.println("Введіть число у: ");
        double y = scanner.nextInt();


        if (x <=-3 && y <= 3) {
            System.out.println("Результат: " + Math.sqrt(3*Math.pow(x,2)-a));
        }else if (x == 3) {
            System.out.println("Результат: " + -b*x+3);
        }else if (x <= 3 && y == 8) {
            System.out.println("Результат: " + Math.cos(x-4));
        }else {
            System.out.println("Не вірні дані");
        }



    }
}
