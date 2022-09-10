import java.util.HashMap;

public class MapAndHashMap {
    public static void main(String[] args) {


        HashMap <String,Integer> empIds = new HashMap<>();

        empIds.put("John",12345);
        empIds.put("Halil",180);
        empIds.put("Jerry",1231239);
        System.out.println(empIds);

        System.out.println(empIds.get("Jerry"));
        System.out.println(empIds.containsKey("Jerry"));
        System.out.println(empIds.containsKey("lol"));
        System.out.println(empIds.containsValue(180));
        empIds.put("Halil",181); //the new value of halil is 181
        System.out.println(empIds);
        empIds.replace("Halil",190);


        empIds.replace("lol",190);//since lol doesn't exist in our map yet it won't do anythinh
        System.out.println(empIds);


        empIds.putIfAbsent("Halil",999);// this does only only work if the key value pair is not currently in the map
        System.out.println(empIds);
        empIds.remove("Halil");
        System.out.println(empIds);



    }
}
