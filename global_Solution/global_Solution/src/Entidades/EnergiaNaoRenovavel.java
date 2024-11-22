package Entidades;

public class EnergiaNaoRenovavel extends Energia{

    public void tipoEnergia() {
        System.out.println(getNome() + " é uma fonte de energia não renovável.");
    }

    public EnergiaNaoRenovavel() {
    }

    public EnergiaNaoRenovavel(String nome, String descricao) {
        super(nome, descricao);
    }

    @Override
    public String toString() {
        return "EnergiaNaoRenovavel{} " + super.toString();
    }
}
