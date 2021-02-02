package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {

        String alice = new String("Alice was beginning to get very tired of sitting by her sister on the " +
                "bank, and of having nothing to do: once or twice she had peeped into the " +
                "book her sister was reading, but it had no pictures or conversations in " +
                "it, 'and what is the use of a book,' thought Alice 'without pictures or " +
                "conversation?'");
        Scanner input = new Scanner(System.in);

        // promps the user
        System.out.println("Enter a term to search in the paragraph: ");

        String term = input.nextLine().toLowerCase();
        String lowerCaseString = alice.toLowerCase();

        if (alice.contains(term)) {
            System.out.println("Congrats, your term is in the Alice paragraph!");
        } else {
            System.out.println("Sorry, that term is not in the Alice paragraph");
        }

        Integer index = lowerCaseString.indexOf(term);
        Integer length = term.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");

        String modifiedString = lowerCaseString.replace(term, "");
        System.out.println(modifiedString);
    }

}