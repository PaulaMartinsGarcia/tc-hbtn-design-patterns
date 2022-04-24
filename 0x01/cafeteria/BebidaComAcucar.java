import java.util.List;

public class BebidaComAcucar extends BebidaDecorator{

    public BebidaComAcucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> cafe = super.obterIngredientes();
        cafe.add("acucar");
        return cafe;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 1.9;
    }
}
