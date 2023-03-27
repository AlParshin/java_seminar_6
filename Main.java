package java_projects.java_seminar_6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Notebook> notes = Arrays.asList(
                new Notebook("Asus", 8, 500, "Windows 8.1", "Серый"),
                new Notebook("Acer", 8, 500, "Windows 10", "Белый"),
                new Notebook("Dell", 16, 1000, "Windows 11", "Серебристый"),
                new Notebook("Samsung", 4, 250, "Windows 7", "Черный"),
                new Notebook("Lenovo", 8, 750, "Windows 10", "Красный"),
                new Notebook("Apple", 16, 1500, "MacOS", "Серый"),
                new Notebook("Asus", 6, 500, "Windows 8.1", "Белый"),
                new Notebook("Apple", 8, 500, "MacOS", "Серебристый"),
                new Notebook("HP", 4, 250, "Linux", "Синий"),
                new Notebook("Lenovo", 32, 2000, "Windows 11", "Серый"),
                new Notebook("Huawei", 12, 1000, "Windows 10", "Белый"),
                new Notebook("Acer", 6, 1000, "Windows 11", "Красный"),
                new Notebook("Dell", 24, 2500, "Linux", "Черный"),
                new Notebook("Apple", 32, 3000, "MacOS", "Синий"),
                new Notebook("Acer", 12, 1000, "Linux", "Серебристый"));

        System.out.println("Выберите критерии, по которым нужно поиск фильтровать: ");
        System.out.println("'1' - поиск по марке: ");
        System.out.println("'2' - поиск по размеру оперативной памяти: ");
        System.out.println("'3' - поиск по размеру жесткого диска: ");
        System.out.println("'4' - поиск по цвету: ");
        Scanner scan = new Scanner(System.in, "cp866");
        String text = scan.next();
        switch (text) {
            case "1":
                System.out.println("Введите предпочитаемую марку ноутбука: ");
                String m = scan.next();
                notes.stream()
                        .filter(p -> (p.getMarka() == m.intern()))
                        .collect(Collectors.toList())
                        .forEach(System.out::println);
                break;
            case "2":
                System.out.println("Введите минимальный желаемый размер ОЗУ (в Гб): ");
                Integer z1 = scan.nextInt();
                System.out.println("Введите максимальный желаемый размер ОЗУ (в Гб): ");
                Integer z2 = scan.nextInt();
                notes.stream()
                        .filter(p -> (p.getOzu() >= z1) && (p.getOzu() <= z2))
                        .collect(Collectors.toList())
                        .forEach(System.out::println);
                break;
            case "3":
                System.out.println("Введите минимальный желаемый размер HDD (в Гб): ");
                Integer r1 = scan.nextInt();
                System.out.println("Введите максимальный желаемый размер HDD (в Гб): ");
                Integer r2 = scan.nextInt();
                notes.stream()
                        .filter(p -> (p.getZhd() >= r1) && (p.getZhd() <= r2))
                        .collect(Collectors.toList())
                        .forEach(System.out::println);
                break;
            case "4":
                System.out.println("Введите предпочитаемый цвет ноутбука: ");
                String c = scan.next();
                notes.stream()
                        .filter(p -> (p.getColor() == c.intern()))
                        .collect(Collectors.toList())
                        .forEach(System.out::println);

                break;
        }
    }
}