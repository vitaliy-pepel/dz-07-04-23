//   2. Пусть дан список сотрудников:
//        Иван Иванов
//        Светлана Петрова
//        Кристина Белова
//        Анна Мусина
//        Анна Крутова
//        Иван Юрин
//        Петр Лыков
//        Павел Чернов
//        Петр Чернышов
//        Мария Федорова
//        Марина Светлова
//        Мария Савина
//        Мария Рыкова
//        Марина Лугова
//        Анна Владимирова
//        Иван Мечников
//        Петр Петин
//        Иван Ежов
//    Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

import java.util.*;

public class less5_2 {
   public static void main(String[] args) {
       String[] arr = {
               "Иван Иванов",
               "Светлана Петрова",
               "Кристина Белова",
               "Анна Мусина",
               "Анна Крутова",
               "Иван Юрин",
               "Петр Лыков",
               "Павел Чернов",
               "Петр Чернышов",
               "Мария Федорова",
               "Марина Светлова",
               "Мария Савина",
               "Мария Рыкова",
               "Марина Лугова",
               "Анна Владимирова",
               "Иван Мечников",
               "Петр Петин",
               "Иван Ежов"
       };

       Map<String, Integer> mp = new HashMap<String, Integer>();
       for (String row : arr) {
           String[] arr1 = row.split(" ");
           for (String string : arr1) {
               if (mp.keySet().contains(string)) {
                   mp.put(string, mp.get(string) + 1);
               } else {
                   mp.put(string, 1);
               }
           }
       }

       Map<String, Integer> not_original = new HashMap<String, Integer>();
       for (Map.Entry<String, Integer> entry : mp.entrySet()) {
           if (entry.getValue() != 1) {
               not_original.put(entry.getKey(), entry.getValue());
           }
       }

       not_original.entrySet().stream()
               .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
               .forEach(System.out::println);
   }
}