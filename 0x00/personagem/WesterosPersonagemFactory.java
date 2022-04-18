public class WesterosPersonagemFactory extends PersonagemFactory {

    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) {

        int inteligencia = 0;
        int forca = 0;
        int vigor = 0;
        int resistencia = 0;
        int destreza = 0;

        if (tipo == TipoPersonagem.MAGO) {

            inteligencia = 8;
            forca = 3;
            vigor = 3;
            resistencia = 3;
            destreza = 4;
        } else if (tipo == TipoPersonagem.LADRAO) {

            inteligencia = 1;
            forca = 8;
            vigor = 7;
            resistencia = 7;
            destreza = 10;

        } else if (tipo == TipoPersonagem.GUERREIRO) {

            inteligencia = 0;
            forca = 9;
            vigor = 7;
            resistencia = 10;
            destreza = 7;
        }
        Personagem personagem = new Personagem(nome, tipo, inteligencia, forca, vigor, resistencia, destreza);
        return personagem;
    }

}

