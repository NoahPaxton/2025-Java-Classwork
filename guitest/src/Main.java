import javax.swing.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(800, 600);
        JButton button = new JButton("Load");
        frame.add(button);
        if (button.equals(true)) {
            System.out.println("test");
        }
    }
}
