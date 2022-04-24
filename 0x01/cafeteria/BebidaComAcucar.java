public class BebidaComAcucar extends BebidaDecorator{

    public BebidaComAcucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String obterIngredientes() {
        return super.obterIngredientes() + ", acucar";
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 1.9;
    }
}
