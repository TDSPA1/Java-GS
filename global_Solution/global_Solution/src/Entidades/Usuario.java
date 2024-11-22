package Entidades;

import java.util.Objects;

public class Usuario {
    private String nome;
    private String cpf;
    private String genero;
    private String data_nascimento;

    public void exibirDados(){ //exibir dados do usuario

        System.out.println("Nome: " +getNome());
        System.out.println("cpf: " +getCpf());
        System.out.println("genero: " +getGenero());
        System.out.println("data de nascimento: " +getData_nascimento());
        System.out.println("==========================");
    }

    public Usuario() {
    }

    public Usuario(String nome, String cpf, String genero, String data_nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.data_nascimento = data_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;
        return Objects.equals(nome, usuario.nome) && Objects.equals(cpf, usuario.cpf) && Objects.equals(genero, usuario.genero) && Objects.equals(data_nascimento, usuario.data_nascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, genero, data_nascimento);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", genero='" + genero + '\'' +
                ", data_nascimento='" + data_nascimento + '\'' +
                '}';
    }
}
