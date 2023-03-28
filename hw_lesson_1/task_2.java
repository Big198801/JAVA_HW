/* 
Task_2. 
Вводится число n, затем n чисел целых, по одному на каждой строке. 
Затем вводится число, на которое нужно умножить все введённые выше числа. 
Выведите на экран результат умножения построчно.
Sample Input:
4
1
2
3
5
2

Sample Output:
2
4
6
10
*/

package JAVA.HW_JAVA.hw_lesson_1;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.printf("размерность массива:");
    int size = scan.nextInt();
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
        System.out.printf("элеммент массива: ");
        array[i] = scan.nextInt();
    }
    System.out.printf("\nмножитель: ");
    int mult = scan.nextInt();
    System.out.println();
    for (int i : array) {
        i = i * mult;
        System.out.println(i);
    }
    scan.close();
    }
}
