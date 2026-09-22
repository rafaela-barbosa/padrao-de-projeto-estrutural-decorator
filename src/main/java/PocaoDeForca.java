
public class PocaoDeForca extends PersonagemDecorator{

    public PocaoDeForca(Personagem personagem) {
        super(personagem);
    }

    public float getPercentualAtaque() {
        return 50.0f;
    }

    public String getNomeDescricao() {
        return "Poção de Força";
    }
}
