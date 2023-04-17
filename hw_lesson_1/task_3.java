/*
 * Task_3. 
Реализовать простой калькулятор (+,-,=,*), только с целыми числами.
 */
package HW_JAVA.hw_lesson_1;
import java.util.Scanner;
public class task_3 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            while (true) {
            System.out.println("+ для сложения\n- для вычитания\n* для умножения\n/ для деления\n= для получения результата");
            System.out.println("введите первое число:");
            int x = scn.nextInt(); 
            System.out.println("операция ....");
            char oper = scn.next().charAt(0);       
            System.out.println("введите второе число: ");
            int y = scn.nextInt();
            int result = 0;
            switch (oper) {
                case ('-'):
                    result = x - y;
                    break;
                case('+'):
                    result = x + y;
                    break;
                case('*'):
                    result = x * y;
                    break;
                case('/'):
                    result = x / y;
                    break;
            
                default:
                    break;
            }
            
            char res = scn.next().charAt(0);
            if (res == '=') {
                System.out.println(result);
            }

            }
        }  
        
    }
    
}
