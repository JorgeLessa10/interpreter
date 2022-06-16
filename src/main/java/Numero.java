/*
 ** created by: jorge.lessa
 */
public class Numero implements IInterpretadorExpressao {

    private double numero;

    public Numero(double numero) {
        this.numero = numero;
    }

    public double interpretar() {
        return numero;
    }

    public double getNumero() {
        return this.numero;
    }
}
