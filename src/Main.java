import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
                ArrayList<String> listA = new ArrayList<>();
                ArrayList<String> listB = new ArrayList<>();

                Scanner scannerA = new Scanner(System.in);
               System.out.println("Введите 5 имен: ");
                for (int i = 0; i < 5; i++) {
                    String input = scannerA.nextLine();
                    listA.add(input);
                }
                System.out.println("Список A: ");
                for (String str : listA) {
                    System.out.println(str);
                }

            Scanner scannerB = new Scanner(System.in);
            System.out.println("Введите 5 имен: ");
            for (int i = 0; i < 5; i++) {
            String input = scannerB.nextLine();
            listB.add(input);
            }
            System.out.println("Список B: ");
            for (String str : listB) {
                System.out.println(str);
                }
        ArrayList<String> listC = new ArrayList<>();
      
        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(listB.size() - 1 - i));
        }

        System.out.println("Список C:");
        for (String str : listC) {
            System.out.println(str);
        }

        listC.sort(Comparator.comparingInt(String::length));

        System.out.println("Отсортированный список C");
        for (String str : listC) {
            System.out.println(str);
        }
   }
}
