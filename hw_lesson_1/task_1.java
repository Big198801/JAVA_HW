/**Task_1.Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. 
Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
Sample Input:
8
11
Sample Output:
512
1331
**/
package JAVA.HW_JAVA.hw_lesson_1;
import java.util.Scanner;
public class task_1 {
   public static void main(String[] args) {
    int[][] nums_and_cubes = new int[1000][2]; // через цикл будем закидывать в двумерный массив число и его куб
    for (int i = 0; i < 1000; i++) {        
            nums_and_cubes[i][0] = i+1; //число
            nums_and_cubes[i][1] = (i+1) * (i+1) * (i+1); // куб этого числа
        } 
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("целое число(1 - 1000) : ");
    int x = iScanner.nextInt();  
    System.out.printf("еще целое число(1 - 1000): ");
    int y = iScanner.nextInt(); 
    iScanner.close();
    boolean res = false;
    for (int i = 0; i < nums_and_cubes.length; i ++ ){
            if ((x == nums_and_cubes[i][0]) || (y == nums_and_cubes[i][0])){
                System.out.printf("%d", nums_and_cubes[i][1]);
                System.out.println();
                res = true;
                }   
        }  
    if (res == false){
        System.out.println("было введено неверное значение");
        }
    }
    
   }


