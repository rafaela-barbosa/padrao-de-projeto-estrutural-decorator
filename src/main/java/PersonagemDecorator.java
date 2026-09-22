
public abstract class PersonagemDecorator implements Personagem{

    private Personagem personagem;
    public String descricao;

    public PersonagemDecorator(Personagem personagem) {
        this.personagem = personagem;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem)
    {
        this.personagem = personagem;
    }

    public abstract float getPercentualAtaque();

    public float getAtaque() {
        return this.personagem.getAtaque() * (1 + (this.getPercentualAtaque() / 100));
    }

    public abstract String getNomeDescricao();

    public String getDescricao() {
        return this.personagem.getDescricao() + "/" + this.getNomeDescricao();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
