import org.junit.jupiter.api.Test;
import lombok.SneakyThrows;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    void quandoSomarValoresValidos_deveExecutarComSucesso() {
        assertEquals(8D, Calculadora.SOMAR(4D,4D));
    }

    @Test
    @SneakyThrows
    void quandoSomarUmDosValoresInvalidos_deveLancarExcecao() {
        assertThrows(NumberFormatException.class, () -> Calculadora.SOMAR(null,4D));
    }

    @Test
    @SneakyThrows
    void quandoSomarTodosValoresInvalidos_deveLancarExcecao() {
        assertThrows(NumberFormatException.class, () -> Calculadora.SOMAR(null,null));
    }

    @Test
    void quandoSubtrairValoresValidos_deveExecutarComSucesso() {
        assertEquals(0D, Calculadora.SUBTRAIR(4D,4D));
    }

    @Test
    @SneakyThrows
    void quandoSubtrairUmDosValoresInvalidos_deveLancarExcecao() {
        assertThrows(NumberFormatException.class, () -> Calculadora.SUBTRAIR(2D,null));
    }

    @Test
    @SneakyThrows
    void quandoSubtrairTodosValoresInvalidos_deveLancarExcecao() {
        assertThrows(NumberFormatException.class, () -> Calculadora.SUBTRAIR(null,null));
    }

    @Test
    void quandoDividirValoresValidos_deveExecutarComSucesso() {
        assertEquals(2D, Calculadora.DIVIDIR(4D,2D));
    }

    @Test
    @SneakyThrows
    void quandoDividirUmDosValoresInvalidos_deveLancarExcecao() {
        assertThrows(NumberFormatException.class, () -> Calculadora.DIVIDIR(2D,null));
    }

    @Test
    @SneakyThrows
    void quandoDividirTodosValoresInvalidos_deveLancarExcecao() {
        assertThrows(NumberFormatException.class, () -> Calculadora.DIVIDIR(null,null));
    }

    @Test
    void quandoMultiplicarValoresValidos_deveExecutarComSucesso() {
        assertEquals(8D, Calculadora.MULTIPLICAR(4D,2D));
    }

    @Test
    @SneakyThrows
    void quandoMultiplicarUmDosValoresInvalidos_deveLancarExcecao() {
        assertThrows(NumberFormatException.class, () -> Calculadora.MULTIPLICAR(1D,null));
    }

    @Test
    @SneakyThrows
    void quandoMultiplicarTodosValoresInvalidos_deveLancarExcecao() {
        assertThrows(NumberFormatException.class, () -> Calculadora.MULTIPLICAR(null,null));
    }
}