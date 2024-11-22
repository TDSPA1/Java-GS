package Entidades;

import java.util.Objects;

public class EnergiaRenovavel extends Energia{
    private String fonte;


    public void tipoEnergia() {
        System.out.println(getNome() + " é uma fonte de energia renovável.");
    }

    public EnergiaRenovavel() {
    }

    public EnergiaRenovavel(String nome, String descricao, String fonte) {
        super(nome, descricao);
        this.fonte = fonte;
    }


    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnergiaRenovavel that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getFonte(), that.getFonte());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFonte());
    }

    @Override
    public String toString() {
        return "EnergiaRenovavel{" +
                "fonte='" + fonte + '\'' +
                "} " + super.toString();
    }
}

