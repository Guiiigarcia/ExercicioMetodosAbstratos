package entidades;

public abstract class Contribuinte {

    private String nome;
    private Double RendimentoAnual;

    public Contribuinte(String nome, Double rendimentoAnual) {
        this.nome = nome;
        RendimentoAnual = rendimentoAnual;
    }

    public abstract Double taxas();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendimentoAnual() {
        return RendimentoAnual;
    }

    public void setRendimentoAnual(Double rendimentoAnual) {
        RendimentoAnual = rendimentoAnual;
    }
}
