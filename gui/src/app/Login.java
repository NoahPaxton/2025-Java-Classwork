package app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Login {
    public JPanel loginpanel;
    private JLabel name;
    private JButton colorbutton;
    private JTextArea sampletext;
    private JButton fontbutton;
    private JButton boldbutton;
    private JButton rainbowbackground;



    public Login() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTK   LookAndFeel");
        } catch (Exception e) {

        }
        colorbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();
                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();
                Color randomColor = new Color(r, g, b);
                sampletext.setForeground(randomColor);
            }
        });

        fontbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
                Random fontrand = new Random();
                int randint = fontrand.nextInt(0, fonts.length);
                sampletext.setFont(new Font(fonts[randint], Font.PLAIN, 11));
            }
        });

        boldbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (sampletext.getFont().getStyle() == Font.BOLD) {
                   sampletext.setFont(sampletext.getFont().deriveFont(Font.PLAIN));
                } else if (sampletext.getFont().getStyle() == Font.PLAIN) {
                    sampletext.setFont(sampletext.getFont().deriveFont(Font.BOLD));
                }
            }
        });
    rainbowbackground.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            SwingWorker sw1 = new SwingWorker() {
                    protected String doInBackground() throws Exception {
                        while (true) {
                            Thread.sleep(200);
                            Random rand = new Random();
                            float r = rand.nextFloat();
                            float g = rand.nextFloat();
                            float b = rand.nextFloat();
                            Color randomColor = new Color(r, g, b);
                            sampletext.setBackground(randomColor);
                        }
                    }

                };
                sw1.execute();
        }
    });

    }
}
