package HW_JAVA.hw_lesson_6;
import HW_JAVA.hw_lesson_6.Notebook;
import java.util.HashSet;
import java.util.Set;

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
        
    }
    
    public static void viewAll(Set<Notebook>notebooks) {
        for (Notebook notebook : notebooks) {
            System.out.printf("%s %s/ %dгб/ %dгб/ %s/ %s/  %d $\n",
            notebook.getBrand(), notebook.getModel(),notebook.getRam(),
            notebook.getStorage(), notebook.getOStype(), notebook.getColour(),notebook.getPrice());
            }
        
    }
}

