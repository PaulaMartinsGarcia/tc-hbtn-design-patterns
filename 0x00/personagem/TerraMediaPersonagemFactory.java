public class TerraMediaPersonagemFactory extends PersonagemFactory {

    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) {
        int inteligencia = 0;
        int forca = 0;
        int vigor = 0;
        int resistencia = 0;
        int destreza = 0;

        if (tipo == TipoPersonagem.MAGO) {
            inteligencia = 10;
            forca = 2;
            vigor = 5;
            resistencia = 3;
            destreza = 4;
        } else if (tipo == TipoPersonagem.LADRAO) {
            inteligencia = 2;
            forca = 6;
            vigor = 8;
            resistencia = 5;
            destreza = 10;
        } else if (tipo == TipoPersonagem.GUERREIRO) {
            inteligencia = 1;
            forca = 8;
            vigor = 5;
            resistencia = 10;
            destreza = 6;
        }
        Personagem personagem = new Personagem(nome, tipo, inteligencia, forca, vigor, resistencia, destreza);
        return personagem;

    }
}
