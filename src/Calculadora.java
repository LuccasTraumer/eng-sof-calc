public class Calculadora {
    public static Double SOMAR(final Double primeiroValor, final Double segundoValor) throws NumberFormatException {
        if (primeiroValor != null && segundoValor != null)
            return primeiroValor + segundoValor;

        throw new NumberFormatException("Valores invalidos");
    }

    public static Double SUBTRAIR(final Double primeiroValor, final Double segundoValor) throws NumberFormatException {
        if (primeiroValor != null && segundoValor != null)
            return primeiroValor - segundoValor;

        throw new NumberFormatException("Valores invalidos");
    }

    public static Double MULTIPLICAR(final Double primeiroValor, final Double segundoValor) throws NumberFormatException {
        if (primeiroValor != null && segundoValor != null)
            return primeiroValor * segundoValor;

        throw new NumberFormatException("Valores invalidos");
    }

    public static Double DIVIDIR(final Double primeiroValor, final Double segundoValor) throws NumberFormatException {
        if (primeiroValor != null && segundoValor != null)
            return primeiroValor / segundoValor;

        throw new NumberFormatException("Valores invalidos");
    }
}
