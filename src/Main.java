import java.util.Scanner;
import ru.netology.service.CustomsService;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("Здравствуйте " + name + "!");

        System.out.print("Ведите стоимость товара (в руб.): ");
        int price = scanner.nextInt();
        System.out.println("Cтоимость товара (в руб.): " + price);

        System.out.print("Ведите вес товара (в кг.): ");
        int weight = scanner.nextInt();
        System.out.println("Вес товара (в кг.): " + weight);

        CustomsService.calculateCustoms(price, weight);

        scanner.close();
    }
}
