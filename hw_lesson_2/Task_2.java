package JAVA.HW_JAVA.hw_lesson_2;
public class Task_2 {
    public static void main(String[] args) {
        String[] recepies = {
            "Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его.Посыпьте измельчённый арахис на мороженое.",
            "Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни." };
        String[] replases = { "арахис - колбаса", "клубника - вишня", "сгущенка - молоко" };
    
        for (String recepie : recepies) {
          String recepiesResult = recepie;
          for (String replase : replases) {
            String[] replasesPare = replase.split("[-]");
            recepiesResult = recepiesResult.replace(replasesPare[0].trim(), replasesPare[1].trim())
                .replace(replasesPare[0].trim().substring(0, 1).toUpperCase() + replasesPare[0].trim().substring(1),
                    replasesPare[1].trim().substring(0, 1).toUpperCase() + replasesPare[1].trim().substring(1));
          }
          System.out.println(recepiesResult);
        }
        }
        
    }
    
    

