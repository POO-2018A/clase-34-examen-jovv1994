import javax.swing.*;
import java.awt.*;

public class LaminaDatos extends JPanel
{
    public LaminaDatos(String rotulolado1, String rotulolado2, String rotulolado3)
    {
        setLayout(new GridLayout(3,2));

        JLabel lado1 = new JLabel(rotulolado1);
        JLabel lado2 = new JLabel(rotulolado2);
        JLabel lado3 = new JLabel(rotulolado3);

        JTextField ladoa = new JTextField();
        JTextField ladob = new JTextField();
        JTextField ladoc = new JTextField();

        add(lado1);
        add(ladoa);
        add(lado2);
        add(ladob);
        add(lado3);
        add(ladoc);
    }
}
