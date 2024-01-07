package app;

import app.data.DataProvider;
import app.data.Product;
import app.services.DataService;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class App {

    static List<Product> list;
    static Scanner scanner;

    public static void main(String[] args) {
        DataProvider provider = new DataProvider();
        list = provider.getData();
        DataService service = new DataService();
        getOutput(formOutput(service.sortData(list,
                getDataInput()), list));
    }

    private static double getDataInput() {
        scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Enter price (x.xx): ");
        return scanner.nextDouble();
    }

    private static String formOutput(int index, List<Product> list) {
        System.out.print("Initial data:\n");
        AtomicInteger count = new AtomicInteger(1);
        for (Product product : list)
            System.out.println(count.getAndIncrement() + ") " +
                    product.getName() + ", USD " + product.getPrice());
        System.out.println("------------------------");
        String output;
        if (index < 0) {
            output = "No data.";
        } else {
            output = "Product: " + list.get(index).getName() +
                    ", price USD " + list.get(index).getPrice();
        }
        return output;
    }

    private static void getOutput(String output) {
        scanner.close();
        System.out.println(output);
    }
}
