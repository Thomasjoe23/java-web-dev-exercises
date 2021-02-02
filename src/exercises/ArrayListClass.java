package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListClass {

    public static void main(String[] args) {
        ArrayList<Integer> someIntegers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 33, 42, 101, 1138));
        System.out.println(sumEven(someIntegers));

        Scanner input = new Scanner(System.in);
        System.out.println("How many characters should I search for?");
        int length = input.nextInt();

        ArrayList<String> words = new ArrayList<String>();
        words.add("pumpkin");
        words.add("coffee");
        words.add("latte");
        words.add("wizard");
        words.add("spice");
        printWords(words, length);
    }

    public static void printWords(ArrayList<String> words, int length){
        for(String word: words){
            if(word.length() == length) {
                System.out.println(word);
            }
        }
    }

    public static int sumEven(ArrayList<Integer> arr){
        int total = 0;
        for(int integer: arr){
            if(integer %2 == 0){
                total += integer;
            }
        }
        return total;
    }
}
