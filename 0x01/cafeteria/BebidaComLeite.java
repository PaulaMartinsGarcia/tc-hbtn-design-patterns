import java.util.List;

public class BebidaComLeite extends BebidaDecorator{

    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> cafe = super.obterIngredientes();
        cafe.add("leite");
        return cafe;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 3.2;
    }
}
