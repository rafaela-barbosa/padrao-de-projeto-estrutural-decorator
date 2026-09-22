
public class AmuletoDaSorte extends PersonagemDecorator{

    public AmuletoDaSorte(Personagem personagem) {
        super(personagem);
    }

    public float getPercentualAtaque() {
        return 10.0f;
    }

    public String getNomeDescricao() {
        return "Amuleto da Sorte";
    }
}
