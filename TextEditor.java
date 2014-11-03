 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TextEditor {
    private static ActionListener listener;

    public static void main(String[] args) {
        final Text1 link = new Text1();
        JFrame frame = new JFrame("ПРОГРАММА ДЛЯ СОЗДАНИЯ И УДАЛЕНИЯ ТЕКСТА");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 300, 300);
        frame.setLayout(null);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        frame.setContentPane(panel);


        final JTextArea area = new JTextArea();
        area.setText("");
        area.setBounds(100, 300, 100, 300);
        JButton button = new JButton("Кнопка");
        button.setBounds(10, 10, 30, 30);
        button.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                link.Text2();
            }
        });
        frame.add(button);
        button.addActionListener(listener);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.getContentPane().add(BorderLayout.NORTH, area);
        frame.setVisible(true);
    }
}
class Text1  {
    public void Text2 () {
        JFrame frame = new JFrame();
        int a = (int) (Math.random() * 1000);
        int b = (int) (Math.random() * 350);
        int c = (int) (Math.random() * 1000);
        int d = (int) (Math.random() * 350);
        double MethodRandom = (Math.random()*a*a*b*b/c*c*b*b/1);
        if (MethodRandom == 0){
            a++;
        }
        if (MethodRandom >0){
            b++;
        }
        frame.setBounds(a, b, c, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JTextArea text = new JTextArea();

        JButton button2 = new JButton("Очистить Все");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
            }
        });
        frame.getContentPane().add(BorderLayout.SOUTH, button2);
        frame.getContentPane().add(BorderLayout.NORTH, text);
        frame.setVisible(true);
    }
}
