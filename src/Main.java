import java.awt.*;
        import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws AWTException, InterruptedException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        Robot robot = new Robot();
        Random random = new Random();

        while (true) {
            robot.mouseMove(random.nextInt(1200), random.nextInt(800));
            Thread.sleep(300000);
        }
    }
}