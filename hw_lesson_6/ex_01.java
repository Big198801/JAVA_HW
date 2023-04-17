package HW_JAVA.hw_lesson_6;
import HW_JAVA.hw_lesson_6.Notebook;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("apple", "macBook air", 8,
         256, "macos", "gold", 899));
        notebooks.add(new Notebook("acer", "aspire 13", 4, 1000, "Windows 11", "black",
        499));
        notebooks.add(new Notebook("Asus", "Rog13", 16, 512, "noOS", "black", 999));
        notebooks.add(new Notebook("HP", "Envy14", 16, 256, "Windows 11", "Blue", 799));
        viewAll(notebooks);
                
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\tкритерии выбора по: ");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - HDD/SSD");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Марка");
        System.out.println("\tили 0 для завершения ввода:  ");
        
        Map<String,Object> critery = new HashMap<>();
        int choice = sc.nextInt();
        while (choice > 0 && choice < 5) {
            switch (choice) {
                case (1):
                    System.out.println("введите минимальный объем ОЗУ:");
                    int ram = sc.nextInt();
                    critery.put("ram", ram);    
                    break;
                case (2):
                    System.out.println("введите минимальный объем HDD/SSD:");
                    int pzu = sc.nextInt();
                    critery.put("storage", pzu);
                    break;  
                case (3):
                    System.out.println("необходимая ОС: ");
                    String os = sc.next();
                    critery.put("storage", os);
                    break;
                case (4):
                    System.out.println("введите производителя: ");
                    String manufact = sc.next();
                    critery.put("brand", manufact);
                    break;
                default:
                    System.out.println("введен неверный номер критерия, повторите ввод");
                    break;
            }
        System.out.println("Введите номер критерия (или 0 для завершения ввода):");
        choice = sc.nextInt();
        }
        System.out.println("\nИспользуются следующие критерии для поиска:");
        for (Map.Entry<String,Object> item : critery.entrySet()){
            System.out.printf("%s: %s\n", item.getKey(), item.getValue() );
                   
        }
    }
    
    public static void viewAll(Set<Notebook>notebooks) {
        for (Notebook notebook : notebooks) {
            System.out.printf("%s %s/ %dгб/ %dгб/ %s/ %s/  %d $\n",
            notebook.getBrand(), notebook.getModel(),notebook.getRam(),
            notebook.getStorage(), notebook.getOStype(), notebook.getColour(),notebook.getPrice());
            }
        
    }
    
    


}

