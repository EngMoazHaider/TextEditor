import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        TextEditor te = new TextEditor();
        int choice;

        do
        {
            System.out.println("Enter your choice");
            System.out.println("1. Add new text");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            choice = in.nextInt();
            in.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Text: ");
                    String newText = in.nextLine();
                    String[] words = newText.split(" ");
                    for (int i =0; i < words.length; i++)
                        te.write(words[i]+" " );
                    break;

                case 2:
                    te.undo();
                    break;
                case 3:
                    te.redo();
                    break;
            }

            System.out.println("\nYour TXT: " + te.getText());

        } while (choice > 0 && choice <= 3);
    }
}