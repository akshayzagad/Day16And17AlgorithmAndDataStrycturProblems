package bridgelabz.bridgelabz.linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String paragraph = "Read from file the list of Words and take user input to search a Text";
        String[] paraArray = paragraph.split(" ");
        UnOrderedList<String> file = new UnOrderedList<>();
        for (String word:paraArray) {
            file.push(word);
        }
        file.Display();
        System.out.println(" Put the word which you want Delete");
        Scanner scanner=new Scanner(System.in);
        file.searchAndDelete(scanner.next());
        file.Display();
        System.out.println(" Put the word which you want Add");
        file.searchAndAdd(scanner.next(), scanner.next());
        file.Display();
    }
}