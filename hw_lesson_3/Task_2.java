/*
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */
package HW_JAVA.hw_lesson_3;
import java.util.ArrayList;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Random rnd = new Random(); int rndNumbers;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int size = 11;
        for (int i = 0; i < size; i++) {
            rndNumbers = rnd.nextInt(0, 100);//заполняем случайными числами
            list.add(rndNumbers);
        }
        System.out.println(list);
        
        for (int index = 0; index < list.size(); index++) {            
            if (list.get(index) %2 != 0) {
                list.remove(index);
                index -= 1; // сдвигаем на индекс на -1, чтобы не пропустить вставший на его место новый элемент
            }       
        }   
        System.out.println(list);     
    }
}

