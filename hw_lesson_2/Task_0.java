// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
package JAVA.HW_JAVA.hw_lesson_2;
public class Task_0 {
    public static void main(String[] args) {
    String a = "aB";
    String b = "aaaAbbbB";
    
    System.out.println(findJewelsInStones(a, b));
    }
    
    public static String  findJewelsInStones(String jewels, String stones) {
        String[] temp_arr = new String[jewels.length()];
        int count = 0;
        for (int i = 0; i < jewels.length(); i ++) {
            count = 0;
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count += 1;                   
                }
            }
            temp_arr[i] = jewels.charAt(i) + Integer.toString(count);            
        }
        String result = String.join("", temp_arr);
        return result;
    }
}

