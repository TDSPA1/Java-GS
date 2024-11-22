import Entidades.*;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Gabriel","1111111111","masculino", "01-02-2004");
        Usuario usuario2 = new Usuario("fabio","2222222222","masculino","16-03-1980");

        Usuario[] usuarios = {usuario1, usuario2
        };
        for(Usuario usuario : usuarios){
            usuario.exibirDados();
        }

        EnergiaRenovavel energiaSolar = new EnergiaRenovavel("energia solar","Energia gerado através da luz e do calor do sol", "sol");
        EnergiaRenovavel energiaEolica = new EnergiaRenovavel("energia eólica", "energia gerado através do vento", "vento");
        EnergiaRenovavel energiaHidreletrica = new EnergiaRenovavel("energia hidréletrica", "energia gerado através da movimentação da água","água");
        EnergiaRenovavel energiaDaMare = new EnergiaRenovavel("energida da  Maré", "energia gerado através  da movimentação da mare","mare");
        EnergiaRenovavel energiaGeotermica = new EnergiaRenovavel("energia geotérmica", "energia gerado através do calor da terra","calor da terra");
        EnergiaRenovavel energiaBiomassa = new EnergiaRenovavel("energia biomassa", " energia gerada através da queima de materiais orgânicos","materiais orgânicos");

        EnergiaNaoRenovavel petroleo = new EnergiaNaoRenovavel("Petróleo","petróleo é extraido do subsolo e refinado para utilizar como combustíveis");
        EnergiaNaoRenovavel gasNatural = new EnergiaNaoRenovavel("Gás Natural", "Gás Natural é composto por metano e é extraido de depósitos subterrâneos");
        EnergiaNaoRenovavel energiaNuclear = new EnergiaNaoRenovavel("energia Nuclear","Enegia Nuclear é gerada a partir da fissão de átomos");

        EnergiaRenovavel[] energiasRenovaveis = {energiaSolar, energiaEolica, energiaHidreletrica, energiaDaMare, energiaGeotermica, energiaBiomassa
        };
        EnergiaNaoRenovavel[] energiasNaoRenovaveis = { petroleo, gasNatural, energiaNuclear
        };


        Scanner scanner = new Scanner(System.in);
        //menu-principal para o usuario escolher qual opcao ele gostaria de acessar
        int escolha = 0;
        do {
            System.out.println("Bem-Vindo ao EcoConsciente !!!");
            System.out.println("==========================================");
            System.out.println("1-Consultar quais são energias renovaveis");
            System.out.println("2-Consultar quais são as energias não renovaveis");
            System.out.println("3-Quizzes");
            System.out.println("0-Encerrar");
            System.out.println("Qual opção você gostaria de acessar ?");
            System.out.println("===========================================");
            escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("As energias renovaveis são: ");
                    for (EnergiaRenovavel energia : energiasRenovaveis){
                        energia.tipoEnergia();
                    }
                    break;
                case 2:
                    System.out.println("As energias não renovaveis são: ");
                    for (EnergiaNaoRenovavel energia : energiasNaoRenovaveis){
                        energia.tipoEnergia();
                    }
                    break;
                case 3:
                   System.out.println("Bem-vindo ao quizz vamos testar seus conhecimentos!!!");
                   System.out.println("==================================================");
                    // Criando perguntas para o quiz
                    Pergunta p1 = new Pergunta(
                            "Qual das seguintes fontes de energia é renovável?",
                            new String[] {"Petróleo", "Vento", "Carvão", "Gás Natural"},
                            1
                    );
                    Pergunta p2 = new Pergunta(
                            "Qual das seguintes fontes de energia é não renovável?",
                            new String[] {"Solar", "Hidrelétrica", "Petróleo", "Eólica"},
                            2
                    );
                    Pergunta p3 = new Pergunta(
                            "A energia hidrelétrica é uma fonte de energia renovável. Qual o impacto ambiental mais significativo dessa fonte para a construcao de usinas ?",
                            new String[]{"Aumento da poluição do ar","Desmatamento e perda de biodiversidade","Emissão de gases de efeito estufa","Acúmulo de resíduos químicos"},
                            1
                    );
                    Pergunta p4 = new Pergunta(
                            "O que caracteriza uma fonte de energia não renovável?",
                            new String[]{"Sua capacidade de ser regenerada naturalmente","Ela é limitada e não pode ser reposta no curto prazo","Ela pode ser gerada a partir de resíduos","Ela é gerada por processos biológicos"},
                            1
                    );
                    Pergunta p5 = new Pergunta(
                            "O que é a biomassa?",
                            new String[]{"Energia gerada pela decomposição de resíduos orgânicos","Energia gerada pelo calor da Terra","Energia obtida a partir da luz solar","Energia gerada a partir de ventos fortes"},
                            0
                    );
                    Pergunta p6 = new Pergunta(
                            "Qual é a principal desvantagem da energia eólica?",
                            new String[]{"Emissão de gases poluentes","Depende de locais específicos e do clima","Alta eficiência de geração","Altos custos de instalação"},
                            1
                    );
                    Pergunta p7 = new Pergunta(
                            "Qual é a principal vantagem das energias renováveis em relação às fontes fósseis?",
                            new String[]{"São mais baratas de produzir","Não geram impacto ambiental significativo","São mais eficientes","São fáceis de armazenar"},
                            1
                    );
                    Pergunta p8 = new Pergunta(
                            "Qual das fontes abaixo é conhecida por gerar eletricidade a partir do movimento das águas?",
                            new String[]{"Solar","Eólica","Hidrelétrica","Geotérmica"},
                            2

                    );

                    // insanciando o quizz e adicionando perguntas para ele
                    Quizz quizz = new Quizz();

                    quizz.adicionarPergunta(p1);
                    quizz.adicionarPergunta(p2);
                    quizz.adicionarPergunta(p3);
                    quizz.adicionarPergunta(p4);
                    quizz.adicionarPergunta(p5);
                    quizz.adicionarPergunta(p6);
                    quizz.adicionarPergunta(p7);
                    quizz.adicionarPergunta(p8);

                    //Iniciando o quiz
                    quizz.iniciar();//metodo para iniciar o quizz
            }break;

        }while (escolha != 0);








        }
    }

