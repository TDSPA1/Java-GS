package Entidades;

import java.util.Arrays;
import java.util.Objects;

public class Pergunta {
    private String pergunta;
    private String[] alternativas;
    private int respostaCorreta;

    public boolean verificarResposta(int resposta) {
        return resposta == respostaCorreta;
    }

    public Pergunta() {
    }

    public Pergunta(String pergunta, String[] alternativas, int respostaCorreta) {
        this.pergunta = pergunta;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String[] alternativas) {
        this.alternativas = alternativas;
    }

    public int getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(int respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pergunta pergunta1)) return false;
        return getRespostaCorreta() == pergunta1.getRespostaCorreta() && Objects.equals(getPergunta(), pergunta1.getPergunta()) && Objects.deepEquals(getAlternativas(), pergunta1.getAlternativas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPergunta(), Arrays.hashCode(getAlternativas()), getRespostaCorreta());
    }

    @Override
    public String toString() {
        return "Pergunta{" +
                "pergunta='" + pergunta + '\'' +
                ", alternativas=" + Arrays.toString(alternativas) +
                ", respostaCorreta=" + respostaCorreta +
                '}';
    }
}
