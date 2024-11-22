package Entidades;

import java.util.Objects;

public class Energia {
    private String nome;
    private String descricao;

    public Energia() {
    }

    public Energia(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Energia energia)) return false;
        return Objects.equals(getNome(), energia.getNome()) && Objects.equals(getDescricao(), energia.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao());
    }

    @Override
    public String toString() {
        return "Energia{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
