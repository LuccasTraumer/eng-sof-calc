public class Calculadora {
    /**
     * Metodo irá efetuar a Soma de Dois valores, ambos que foram passados por parametros
     * */
    public static Double SOMAR(final Double primeiroValor, final Double segundoValor) throws NumberFormatException {
        if (primeiroValor != null && segundoValor != null)
            return primeiroValor + segundoValor;

        throw new NumberFormatException("Valores invalidos");
    }
    /**
     * Metodo irá efetuar a Subtração de Dois valores, ambos que foram passados por parametros
     * */
    public static Double SUBTRAIR(final Double primeiroValor, final Double segundoValor) throws NumberFormatException {
        if (primeiroValor != null && segundoValor != null)
            return primeiroValor - segundoValor;

        throw new NumberFormatException("Valores invalidos");
    }
    /**
     * Metodo irá efetuar a Multiplicação de Dois valores, ambos que foram passados por parametros
     * */
    public static Double MULTIPLICAR(final Double primeiroValor, final Double segundoValor) throws NumberFormatException {
        if (primeiroValor != null && segundoValor != null)
            return primeiroValor * segundoValor;

        throw new NumberFormatException("Valores invalidos");
    }
    /**
     * Metodo irá efetuar a Divisão de Dois valores, ambos que foram passados por parametros
     * */
    public static Double DIVIDIR(final Double primeiroValor, final Double segundoValor) throws NumberFormatException {
        if (primeiroValor != null && segundoValor != null)
            return primeiroValor / segundoValor;

        throw new NumberFormatException("Valores invalidos");
    }
}
