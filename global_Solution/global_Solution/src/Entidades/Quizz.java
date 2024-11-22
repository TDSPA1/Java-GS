package Entidades;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Quizz {
    private List<Pergunta> perguntas = new ArrayList<>();

    public void adicionarPergunta(Pergunta pergunta) { //metodo para adicionar perguntas
        perguntas.add(pergunta);
    }
    public void removerPergunta(Pergunta pergunta){ //metodo para remover perguntas
        perguntas.remove(pergunta);
    }
    public void iniciar() {  //metodo para iniciar o quizz
        Scanner scanner = new Scanner(System.in);
        int pontuacao = 0; //pontuacao do usuario

        for (Pergunta pergunta : perguntas) {
            System.out.println(pergunta.getPergunta());
            String[] alternativas = pergunta.getAlternativas();
            for (int i = 0; i < alternativas.length; i++) {
                System.out.println((i + 1) + ". " + alternativas[i]);
            }

            System.out.print("Escolha a alternativa correta: ");
            int resposta = scanner.nextInt() - 1; // -1 pois as alternativas comecam com indice 0, mas nas questoes as alternativas comecam com 1 para o usuario,

            if (pergunta.verificarResposta(resposta)) {
                System.out.println("Resposta correta!");
                System.out.println("=================");
                pontuacao++;
            } else {
                System.out.println("Resposta incorreta.");
                System.out.println("===================");
            }
        }

        System.out.println("\nVocê acertou " + pontuacao + " de " + perguntas.size() + " perguntas.");
    }

    public Quizz() {
    }

    public Quizz(List<Pergunta> perguntas) {
        this.perguntas = perguntas;
    }

    public List<Pergunta> getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(List<Pergunta> perguntas) {
        this.perguntas = perguntas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quizz quizz)) return false;
        return Objects.equals(perguntas, quizz.perguntas);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(perguntas);
    }

    @Override
    public String toString() {
        return "Quizz{" +
                "perguntas=" + perguntas +
                '}';
    }
}

