
public class Guerreiro implements Personagem {

    public float ataque;

    public Guerreiro() {
    }

    public Guerreiro(float ataque) {
        this.ataque = ataque;
    }

    public float getAtaque() {
        return ataque;
    }

    public String getDescricao() {
        return "Guerreiro";
    }

}
