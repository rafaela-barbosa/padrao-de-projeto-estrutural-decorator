
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonagemTest {

    @Test
    void deveRetornarAtaquePersonagem() {
        Personagem personagem = new Guerreiro(1000.0f);

        assertEquals(1000.0f, personagem.getAtaque());
    }

    @Test
    void deveRetornarAtaquePersonagemComEspadaRara() {
        Personagem personagem = new EspadaRara(new Guerreiro(1000.0f));

        assertEquals(1200.00001f, personagem.getAtaque());
    }

    @Test
    void deveRetornarAtaquePersonagemComPocaoDeForca() {
        Personagem personagem = new PocaoDeForca(new Guerreiro(1000.0f));

        assertEquals(1500.0f, personagem.getAtaque());
    }

    @Test
    void deveRetornarAtaquePersonagemComAmuletoDaSorte() {
        Personagem personagem = new AmuletoDaSorte(new Guerreiro(1000.0f));

        assertEquals(1100.0f, personagem.getAtaque());
    }

    @Test
    void deveRetornarAtaquePersonagemComEspadaRaraMaisPocaoDeForca() {
        Personagem personagem = new PocaoDeForca(new EspadaRara(new Guerreiro(1000.0f)));

        assertEquals(1800.0f, personagem.getAtaque());
    }

    @Test
    void deveRetornarAtaquePersonagemComEspadaRaraMaisAmuletoDaSorte() {
        Personagem personagem = new AmuletoDaSorte(new EspadaRara(new Guerreiro(1000.0f)));

        assertEquals(1320.0f, personagem.getAtaque());
    }

    @Test
    void deveRetornarAtaquePersonagemComPocaoDeForcaMaisAmuletoDaSorte() {
        Personagem personagem = new PocaoDeForca(new AmuletoDaSorte(new Guerreiro(1000.0f)));

        assertEquals(1650.0f, personagem.getAtaque());
    }

    @Test
    void deveRetornarAtaquePersonagemComEspadaRaraMaisPocaoDeForcaMaisAmuletoDaSorte() {
        Personagem personagem = new AmuletoDaSorte(new PocaoDeForca(new EspadaRara(new Guerreiro(1000.0f))));

        assertEquals(1980.0f, personagem.getAtaque());
    }

    @Test
    void deveRetornarDescricaoPersonagem() {
        Personagem personagem = new Guerreiro();

        assertEquals("Guerreiro", personagem.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPersonagemComEspadaRara() {
        Personagem personagem = new EspadaRara(new Guerreiro());

        assertEquals("Guerreiro/Espada Rara", personagem.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPersonagemComPocaoDeForca() {
        Personagem personagem = new PocaoDeForca(new Guerreiro());

        assertEquals("Guerreiro/Poção de Força", personagem.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPersonagemComAmuletoDaSorte() {
        Personagem personagem = new AmuletoDaSorte(new Guerreiro());

        assertEquals("Guerreiro/Amuleto da Sorte", personagem.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPersonagemComEspadaRaraMaisPocaoDeForca() {
        Personagem personagem = new PocaoDeForca(new EspadaRara(new Guerreiro()));

        assertEquals("Guerreiro/Espada Rara/Poção de Força", personagem.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPersonagemComEspadaRaraMaisAmuletoDaSorte() {
        Personagem personagem = new AmuletoDaSorte(new EspadaRara(new Guerreiro()));

        assertEquals("Guerreiro/Espada Rara/Amuleto da Sorte", personagem.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPersonagemComPocaoDeForcaMaisAmuletoDaSorte() {
        Personagem personagem = new PocaoDeForca(new AmuletoDaSorte(new Guerreiro()));

        assertEquals("Guerreiro/Amuleto da Sorte/Poção de Força", personagem.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPersonagemComEspadaRaraMaisPocaoDeForcaMaisAmuletoDaSorte() {
        Personagem personagem = new AmuletoDaSorte(new PocaoDeForca(new EspadaRara(new Guerreiro())));

        assertEquals("Guerreiro/Espada Rara/Poção de Força/Amuleto da Sorte", personagem.getDescricao());
    }

}
