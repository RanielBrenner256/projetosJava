public class ApocalipseFactory implements  GameFactory {
    public Inimigo criarInimigo() {
        return new Zumbi();
    }

    public Arma criarArma() {
        return new Mordida();
    }
}
