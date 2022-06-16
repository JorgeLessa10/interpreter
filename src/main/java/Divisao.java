/*
 ** created by: jorge.lessa
 */
public class Divisao implements IInterpretadorExpressao {

    private double x;
    private double y;

    public Divisao (Numero elementoEsquerda, Numero elementoDireita) {
        x = elementoEsquerda.getNumero();
        y = elementoDireita.getNumero();
    }

    public double interpretar() {
        return x / y;
    }
}
