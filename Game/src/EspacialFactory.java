
public class EspacialFactory implements GameFactory {
    public Inimigo criarInimigo() {
        return new Alien(); }
    public Arma criarArma() {
        return new ArmaLaser(); }
}

