import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 ** created by: jorge.lessa
 */
class FuncionarioTest {

    @Test
    void deveCalcularSalarioComBeneficios()
    {
        Funcionario funcionario = new Funcionario(
            5000.0,
                500.0,
                500.0,
                320.0,
                850.0
        );
        assertEquals(4530.0, funcionario.calcularSalarioLiquidoComBeneficios());
    }

}