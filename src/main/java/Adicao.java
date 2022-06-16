/*
 ** created by: jorge.lessa
 */
public class Adicao implements IInterpretadorExpressao {

    private double x;
    private double y;

    public Adicao (Numero elementoEsquerda, Numero elementoDireita) {
        x = elementoEsquerda.getNumero();
        y = elementoDireita.getNumero();
    }

    public double interpretar() {
        return x + y;
    }
}
