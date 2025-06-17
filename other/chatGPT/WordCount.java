package chatGPT;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String sentence = scanner.nextLine();

        String[] sentenceArray = sentence.trim().split("\\s+");
        System.out.println("The word count: " + sentenceArray.length);
    }
}
