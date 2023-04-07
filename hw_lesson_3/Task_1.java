package HW_JAVA.hw_lesson_3;
import java.util.Random;
import java.util.ArrayList;
public class Task_1 {
    public static void main(String[] args) {
        Random rnd = new Random(); int rndNumbers;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int size = 20;
        for (int i = 0; i < size; i++) {
            rndNumbers = rnd.nextInt(0, 100);//заполняем случайными числами
            list.add(rndNumbers);
        }
        System.out.println(list);

        int min = 1000;// 0 не подходит, т.к. при отсутствии 0 в листе - значение не перезапишется
        int max = 0;
        int avg = 0;
        for (Integer i : list) {
            if (i > max){
                max = i;
            }
            if (i < min) {
                min = i;
            }
        avg += i;            
        }
        avg = avg / list.size();
        System.out.printf("мини знач: %d, макс знач: %d, среднее знач: %d\n", min, max, avg);
    }
}
