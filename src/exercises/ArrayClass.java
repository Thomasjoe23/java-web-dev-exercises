package exercises;


import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] randomNumber = {1, 1, 3, 4, 5, 8};
        for(int i = 0; i < randomNumber.length; i++) {
            System.out.println(randomNumber[i]);
        };
        for(int i = 0; i < randomNumber.length; i++){
            if(randomNumber[i] %2 != 0){
                System.out.println(randomNumber[i]);
            }
        }

    String str = new String("I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.");
    String[] rhymeArray = str.split("\\. ");
    System.out.println(Arrays.toString(rhymeArray));


    }
}

