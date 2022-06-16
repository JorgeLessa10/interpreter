/*
 ** created by: jorge.lessa
 */
public class Multiplicacao implements IInterpretadorExpressao {

    private double x;
    private double y;

    public Multiplicacao (Numero elementoEsquerda, Numero elementoDireita) {
        x = elementoEsquerda.getNumero();
        y = elementoDireita.getNumero();
    }

    public double interpretar() {
        return x * y;
    }
}
