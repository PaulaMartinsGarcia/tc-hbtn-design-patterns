public  class Personagem {
    private String nome;
    private TipoPersonagem tipo;
    private int inteligencia;
    private int forca;
    private int vigor;
    private int resistencia;
    private int destreza;

    public Personagem(){

    }
    public Personagem(String nome, TipoPersonagem tipo, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        this.nome = nome;
        this.tipo = tipo;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.vigor = vigor;
        this.resistencia = resistencia;
        this.destreza = destreza;
    }

    private double danoAtaque;
    public Personagem(double DanoAtaque){
        this.danoAtaque = danoAtaque;
    }

    public double getDanoAtaque() {
        switch (this.tipo){
            case MAGO:
                danoAtaque = (getInteligencia () * 0.8) + (getForca() * 0.05) + (getDestreza() * 0.05) + (getVigor() * 0.1);
                break;
            case LADRAO:
                danoAtaque = (getForca() * 0.5) +  (getDestreza() * 0.35) + (getVigor() * 0.1) + (getInteligencia() * 0.05);
                break;
            case GUERREIRO:
                danoAtaque = (getForca() * 0.8) + (getVigor() * 0.05) + (getDestreza() * 0.1) + (getInteligencia() * 0.05);
                break;
        }
        return danoAtaque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public TipoPersonagem getTipo() {

        return tipo;
    }

    public void setTipo(TipoPersonagem tipo) {

        this.tipo = tipo;
    }

    public int getInteligencia() {

        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {

        this.inteligencia = inteligencia;
    }

    public int getForca() {

        return forca;
    }

    public void setForca(int forca) {

        this.forca = forca;
    }

    public int getVigor() {

        return vigor;
    }

    public void setVigor(int vigor) {

        this.vigor = vigor;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {

        this.resistencia = resistencia;
    }

    public int getDestreza() {

        return destreza;
    }

    public void setDestreza(int destreza) {

        this.destreza = destreza;
    }

    public void setDanoAtaque(double danoAtaque) {

        this.danoAtaque = danoAtaque;
    }

    @Override
    public String toString() {
        return   "Personagem { " +
                "nome = " + nome +
                ", tipo = " + tipo +
                ", inteligencia = " + inteligencia +
                ", forca = " + forca +
                ", vigor = " + vigor +
                ", resistencia = " + resistencia +
                ", destreza = " + destreza +
                ", dano ataque = " + String.format("%.2f", getDanoAtaque())+
                '}';
    }
}
