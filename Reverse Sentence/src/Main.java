import java.util.Scanner;
public class Main {
    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);
        String[] word;
        System.out.println("Please Enter Your Sentence");
        String sen = read.nextLine();
        word = sen.split(" ");


        //String rev = "";

        for(int i = word.length - 1; i >= 0; i--)
        {
            System.out.print(word[i]+" ");
        }

    }
}
