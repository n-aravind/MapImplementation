import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] keys = {"India","USA","Canada","Australia"};
        String[] values = {"NewDelhi","Washington","Ottawa","Canberra"};

        Map<String,String> myMap = new HashMap<String,String>();

        for(int i=0; i<keys.length; i++){
            myMap.put(keys[i],values[i]);
        }

        for(String key: myMap.keySet()){
            System.out.println(key);
        }

        for(String value: myMap.values()){
            System.out.println(value);
        }

        for(Map.Entry<String, String> map : myMap.entrySet()){
            System.out.println(map.getKey() +" : "+ map.getValue());
        }


    }
}
