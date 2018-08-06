import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaPrincipal extends JPanel
{
    JComboBox combotriangulos;
    LaminaDatos laminadatos;
    Calculos calculos;

    public LaminaPrincipal()
    {
        setLayout(new BorderLayout());

        JPanel laminacombo = new JPanel();

        combotriangulos = new JComboBox();
        combotriangulos.addActionListener(new GestionEventos());
        //**************************************
        combotriangulos.addItem("Rectángulo");
        combotriangulos.addItem("Isósceles");
        combotriangulos.addItem("Escaleno");
        combotriangulos.addItem("Equilátero");
        //**************************************
        laminacombo.add(combotriangulos);

        JButton calcular = new JButton("CALCULAR");
        laminacombo.add(calcular);
        calcular.addActionListener(new GestionEventos());

        add(laminacombo, BorderLayout.NORTH);
    }

    public class GestionEventos implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(combotriangulos.getSelectedItem().equals("Rectángulo"))
            {
                laminadatos = new LaminaDatos("Cateto 1", "Cateto 2", null);
                add(laminadatos, BorderLayout.CENTER);
                calculos = new Calculos();

            }else if(combotriangulos.getSelectedItem().equals("Isósceles")){
                laminadatos = new LaminaDatos("Base", "Lado repetido", null);
                add(laminadatos, BorderLayout.CENTER);
                calculos = new Calculos();
            }else if(combotriangulos.getSelectedItem().equals("Escaleno")){
                laminadatos = new LaminaDatos("Lado 1", "Lado 2", "Lado 3");
                add(laminadatos, BorderLayout.CENTER);
                calculos = new Calculos();

            }else if(combotriangulos.getSelectedItem().equals("Equilátero")){
                laminadatos = new LaminaDatos("Lado", null, null);
                add(laminadatos, BorderLayout.CENTER);
                calculos = new Calculos();

            }
        }
    }
}
