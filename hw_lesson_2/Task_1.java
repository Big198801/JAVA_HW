// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”
package JAVA.HW_JAVA.hw_lesson_2;

public class Task_1 {
    public static void main(String[] args) {
    String s = "cba";
    int[] index = {3,2,1};
    System.out.println(shuffle(s, index));

    }
    
    public static String shuffle(final String s, final int[] index){
        StringBuilder str = new StringBuilder(s.length());
        for (int i : index) {
            str.append(s.charAt(i-1));            
        }
        String result = str.toString();
        return result;
    }
}
