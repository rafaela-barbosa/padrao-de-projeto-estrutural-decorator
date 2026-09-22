
public class EspadaRara extends PersonagemDecorator{

    public EspadaRara(Personagem personagem) {
        super(personagem);
    }

    public float getPercentualAtaque() {
        return 20.0f;
    }

    public String getNomeDescricao() {
        return "Espada Rara";
    }
}
