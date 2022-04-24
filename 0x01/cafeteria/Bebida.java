public abstract class Bebida {
    public abstract String obterIngredientes();
    public abstract double obterPreco();

    @Override
    public String toString() {
        return String.format("Preco: %.2f - Ingredientes: [%s]",  obterPreco(), obterIngredientes() );
    }
}
