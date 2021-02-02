package exercises;

import java.util.HashMap;
import java.util.Map;

public class CountStudio {
    public static void main(String[] args) {

        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> myMap = new HashMap<>();

        for(int i = 0; i < str.length() - 1; i++){
            if (myMap.containsKey(str.charAt(i))) {
                int count = myMap.get(str.charAt(i));
                myMap.put(str.charAt(i), ++count);
            } else {
                myMap.put(str.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> character: myMap.entrySet()){
            System.out.println(character.getValue() + ":" + character.getKey());
        }
    }
}
