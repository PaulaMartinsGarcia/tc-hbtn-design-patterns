public class BebidaComLeite extends BebidaDecorator{

    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String obterIngredientes() {
        return super.obterIngredientes() + ", leite";
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 3.2;
    }
}
