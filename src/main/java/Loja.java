/*
 ** created by: jorge.lessa
 */
public class Loja {

    public static String formula = "salarioTotal - impostoRenda - inss - planoSaude + valeAlimentacao";

    public static double calcularSalarioLiquidoComBeneficios(Double salario, Double impostoRenda, Double inss, Double planoSaude, Double valeAlimentacao) {
        String expressao;
        expressao = formula.replace("salarioTotal", Double.toString(salario));
        expressao = expressao.replace("impostoRenda", Double.toString(impostoRenda));
        expressao = expressao.replace("inss", Double.toString(inss));
        expressao = expressao.replace("planoSaude", Double.toString(planoSaude));
        expressao = expressao.replace("valeAlimentacao", Double.toString(valeAlimentacao));
        IInterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }

}
