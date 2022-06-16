/*
 ** created by: jorge.lessa
 */
public class Funcionario {

    private Double salarioTotal;
    private Double impostoRenda;
    private Double inss;
    private Double planoSaude;
    private Double valeAlimentacao;

    public Funcionario(Double salarioTotal, Double impostoRenda, Double inss, Double planoSaude, Double valeAlimentacao) {
        this.salarioTotal = salarioTotal;
        this.impostoRenda = impostoRenda;
        this.inss = inss;
        this.planoSaude = planoSaude;
        this.valeAlimentacao = valeAlimentacao;
    }

    public Double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(Double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public Double getImpostoRenda() {
        return impostoRenda;
    }

    public void setImpostoRenda(Double impostoRenda) {
        this.impostoRenda = impostoRenda;
    }

    public Double getInss() {
        return inss;
    }

    public void setInss(Double inss) {
        this.inss = inss;
    }

    public Double getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(Double planoSaude) {
        this.planoSaude = planoSaude;
    }

    public Double getValeAlimentacao() {
        return valeAlimentacao;
    }

    public void setValeAlimentacao(Double valeAlimentacao) {
        this.valeAlimentacao = valeAlimentacao;
    }

    public Double calcularSalarioLiquidoComBeneficios()
    {
        return Loja.calcularSalarioLiquidoComBeneficios(this.salarioTotal, this.impostoRenda, this.inss, this.planoSaude, this.valeAlimentacao);
    }
}
