package sistema_unisinos;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class Test{

    public Inscricao inscricao;

    @Before
    public void before()
    {
        inscricao = new Inscricao(3);

        Candidato candidato = new Candidato(
                1,
                "Ueslei de Souza",
                "Análise de Sistemas",
                "06/28/2017",
                new Campus(
                        1,
                        "Unisinos",
                        "Universidade do Vale do Rio dos Sinos"
                )
        );

        Candidato candidato2 = new Candidato(
                2,
                "Ueslei de Souza",
                "Análise de Sistemas",
                "06/28/2017",
                new Campus(
                        1,
                        "Feevale",
                        "Conhecimento para inovar o mundo"
                )
        );

        Candidato candidato3 = new Candidato(
                3,
                "Ueslei de Souza",
                "Análise de Sistemas",
                "06/28/2017",
                new Campus(
                        1,
                        "Unisinos",
                        "Universidade do Vale do Rio dos Sinos"
                )
        );

        inscricao.adicionar_candidato(candidato);
        inscricao.adicionar_candidato(candidato2);
        inscricao.adicionar_candidato(candidato3);

    }

    @org.junit.Test
    public void test()
    {
        assertEquals(inscricao.candidatos_lista.length, 3);
        assertEquals(inscricao.candidatos_lista[0].getNome(), "Ueslei de Souza");
        assertEquals(inscricao.candidatos_lista[0].getCampus().getNome(), "Unisinos");
    }
}
