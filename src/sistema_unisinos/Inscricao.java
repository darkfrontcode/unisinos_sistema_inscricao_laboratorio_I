package sistema_unisinos;

public class Inscricao {

    public Candidato[] candidatos_lista;
    public int contador;

    public void Inscricao(int tamanho)
    {
        candidatos_lista = new Candidato[tamanho];
    }

    public void adicionar_candidato(Candidato candidato)
    {
        if(candidatos_contador == 0)
        {
            Log.out("Você ainda não adicionou candidatos.");
        }
        else
        {
            candidatos_lista[contador] = candidato;
            contador++;
            Log.out("Candidato adicionado com sucesso!");
        }
    }

    public mostrar_candidatos(int i)
    {
        for (Candidato candidato : candidatos_lista) candidato.info();
    }

}
