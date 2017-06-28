package sistema_unisinos;
import java.util.Scanner;

public class Inscricao {

    public Candidato[] candidatos_lista;
    public int contador;

    public Inscricao(int tamanho)
    {
        candidatos_lista = new Candidato[tamanho];
    }

    public void app()
    {

        int selected;
        Scanner scan = new Scanner(System.in);

        do
        {
            menu();
            selected = scan.nextInt();

            if(selected >= 0 && selected <= 3)
            {
                switch(selected)
                {
                    case 1:

                        Candidato candidato = new Candidato(
                                Teclado.leInt("Digite o número do cadastro: "),
                                Teclado.leString("Digite o nome: "),
                                Teclado.leString("Digite o curso: "),
                                Teclado.leString("Digite a data: "),
                                new Campus(
                                        Teclado.leInt("Digite o id: "),
                                        Teclado.leString("Digite o nome: "),
                                        Teclado.leString("Digite a descrição: ")
                                )
                        );

                        adicionar_candidato(candidato);

                    break;
                    case 2:

                        mostrar_candidatos();

                    break;
                    case 3:

                        candidatos_por_campus(Teclado.leString("Digite o nome do campus: "));

                    break;
                    default: break;
                }
            }
            else
            {
                System.out.println("Opção inválida. Escolha uma das opções abaixo.");
            }

        }
        while(selected!=0);

        System.out.println("== Até mais ==");

    }

    private void menu()
    {
        System.out.println("===============");

        System.out.println("i.   1 - Adicionar candidato");
        System.out.println("ii.  2 – Visualizar candidatos inscritos");
        System.out.println("iii. 3 – Pesquisar candidato por campus");
        System.out.println("iv.  0 – Encerrar.");

        System.out.println("===============");
    }

    public void adicionar_candidato(Candidato candidato)
    {
        candidatos_lista[contador] = candidato;
        contador++;
        Log.out("Candidato adicionado com sucesso!");
    }

    public void mostrar_candidatos()
    {
        if(contador == 0)
        {
            Log.out("Você ainda não adicionou candidatos.");
        }
        else
        {
            for (int i=0;i < contador;i++)
            {
                candidatos_lista[i].info();
            }
        }
    }

    public void candidatos_por_campus(String nome)
    {
        int contador_campus = 0;

        for (int i=0;i < contador;i++)
        {
            String campus = candidatos_lista[i].getCampus().getNome();

            if(campus.equals(nome))
            {
                candidatos_lista[i].info();
                contador_campus++;
            }
        }

        if(contador_campus == 0)
        {
            Log.out("Não foram encontrados campus com este nome.");
        }
        else
        {
            if(contador_campus == 1)
            {
                Log.out("1 candidato foi encontrado matriculado neste campus.");
            }
            else
            {
                Log.out("Foram encontrados " + contador_campus + " candidatos matriculados neste campus.");
            }
        }

    }

}
