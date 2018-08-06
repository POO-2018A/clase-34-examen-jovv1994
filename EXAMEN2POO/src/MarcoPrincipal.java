import javax.swing.*;

public class MarcoPrincipal extends JFrame
{
    public MarcoPrincipal()
    {
        setTitle("TRIÁNGULOS");
        setBounds(700,500,300,200);
        add(new LaminaPrincipal());
        setVisible(true);
    }
}
