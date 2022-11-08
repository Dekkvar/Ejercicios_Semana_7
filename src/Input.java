import java.util.Scanner;

public class Input {
    Scanner input = new Scanner(System.in);

    public String text() {
        String text = input.nextLine();
        return text;
    }

    public int num() {
        int num = input.nextInt();
        return num;
    }
}
