//   1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class less5_1 {
   public static void main(String[] args) {

       HashMap<String, List<String>> map = new HashMap<String, List<String>>(Map.of());

       List<String> values_1 = new ArrayList<String>();
       values_1.add("+71231234567");
       values_1.add("+74903216554");
       List<String> values_2 = new ArrayList<String>();
       values_2.add("+13219875678");
       List<String> values_3 = new ArrayList<String>();
       values_3.add("88005553535");
       map.put("Иванов", values_1);
       map.put("Петрова", values_2);
       map.put("Козлодоев", values_3);

       Scanner n = new Scanner(System.in);
       System.out.print("Введите фамилию: ");
       String k = n.nextLine();
       boolean search = map.containsKey(k);
       if (search == true) {
           System.out.println(map.get(k));
       }
       else {
           System.out.println("Типок с такой фамилией не значится");
       }
   }
}
