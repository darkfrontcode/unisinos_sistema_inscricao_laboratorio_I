package sistema_unisinos;

import java.util.Scanner;

public class Inscricao {

    public Candidato[] candidatos_lista;
    public int contador;
    private static int[] validOptions = {0,1,2,3};

    public Inscricao(int tamanho)
    {
        candidatos_lista = new Candidato[tamanho];
    }

    public void app()
    {

        int selectedOption;
        boolean isValidOption = false;
        Scanner scan = new Scanner(System.in);

        do
        {
            menu();
            selectedOption = scan.nextInt();

            if(selectedOption >= 0 && selectedOption <= 3)
            {
                switch(selectedOption)
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
                                        Teclado.leString("Digite a descrilção: ")
                                )
                        );

                        adicionar_candidato(candidato);

                    break;

                    case 2: mostrar_candidatos(); break;

                    // case 3: findFriendByPhone() ; break;

                    default: break;
                }
            }
            else
            {
                System.out.println("Opção inválida. Porfavor escolha uma das opções abaixo.");
            }

        }
        while(selectedOption!=0);

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
            for (Candidato candidato : candidatos_lista) candidato.info();
        }
    }

}
