import javax.swing.*;

public class Calculos
{
    private double Area;
    private double Perimetro;
    private double Altura;
    double Hipotenusa;
    boolean Verificacion;

    public void verificacionTrianguloRectangulo(double cateto1, double cateto2)
    {
        double a = cateto1;
        double b = cateto2;
        double c = Hipotenusa;

        if(((a+b)>c) && ((b+c)>a) && ((a+c)>b))
        {
            Verificacion = true;
        }else{
            //JOptionPane.showMessageDialog("No se puede formar un triángulo con los datos proporcionados");
        }
    }

    public void verificaciontrianguloIsosceles(double base, double lado)
    {
        double a = lado;
        double b = base;
        double c = lado;

        if(((a+b)>c) && ((b+c)>a) && ((a+c)>b))
        {
            Verificacion = true;
        }else{
            //JOptionPane.showMessageDialog("No se puede formar un triángulo con los datos proporcionados");
        }
    }

    public void verificaciontrianguloEscaleno(double lado1, double lado2, double lado3)
    {
        double a = lado1;
        double b = lado2;
        double c = lado3;

        if(((a+b)>c) && ((b+c)>a) && ((a+c)>b))
        {
            Verificacion = true;
        }else{
            //JOptionPane.showMessageDialog("No se puede formar un triángulo con los datos proporcionados");
        }
    }

    public void verificaciontrianguloEquilatero(double lado)
    {
        double a = lado;
        double b = lado;
        double c = lado;

        if(((a+b)>c) && ((b+c)>a) && ((a+c)>b))
        {
            Verificacion = true;
        }else{
            //JOptionPane.showMessageDialog("No se puede formar un triángulo con los datos proporcionados");
        }
    }

    public void trianguloRectangulo(double cateto1, double cateto2)
    {
        Hipotenusa = Math.sqrt((Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));

        Altura = (cateto1*cateto2)/Hipotenusa;
        Area = (cateto2*Altura)/2;
        Perimetro = Hipotenusa + cateto1 + cateto2;

        System.out.println("El área es: " + Area +  "\nEl perímetro es: " + Perimetro + "\nLa altura es: " + Altura);
    }

    public void trianguloIsosceles(double base, double lado)
    {
        Altura = Math.sqrt((Math.pow(lado, 2) - (Math.pow(base, 2)/4)));
        Area = (base*Altura)/2;
        Perimetro = 2*lado+base;

        System.out.println("El área es: " + Area +  "\nEl perímetro es: " + Perimetro + "\nLa altura es: " + Altura);
    }

    public void trianguloEscaleno(double lado1, double lado2, double lado3)
    {
        double S;

        S = lado1 + lado2 + lado3;

        Area = Math.sqrt((S*(S-lado1)*(S-lado2)*(S-lado3)));
        Perimetro = lado1 + lado2 + lado3;
        Altura = (2/lado1)*Area;

        System.out.println("El área es: " + Area +  "\nEl perímetro es: " + Perimetro + "\nLa altura es: " + Altura);
    }

    public void trianguloEquilatero(double lado)
    {
        Altura = (Math.sqrt(3)*lado)/2;
        Area = Altura*Math.pow(lado, 2);
        Perimetro = 3*lado;

        System.out.println("El área es: " + Area +  "\nEl perímetro es: " + Perimetro + "\nLa altura es: " + Altura);
    }
}
