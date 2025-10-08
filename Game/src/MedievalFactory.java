public class MedievalFactory implements  GameFactory{
    public Inimigo criarInimigo() {
        return new Orc(); }
    public Arma criarArma() {
        return new Espada(); }
}
