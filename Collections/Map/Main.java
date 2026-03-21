package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Double> m = new HashMap<>();
        m.put("Livro", 35.00);
        m.put("Revista", 12.00);
        m.put("Jornal", 5.00);

        for(Map.Entry<String,Double> i:m.entrySet()){
            System.out.println(i.getKey()+ ": "+ i.getValue());
        }
    }
}
