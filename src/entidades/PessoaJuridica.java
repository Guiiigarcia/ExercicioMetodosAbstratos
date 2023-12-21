package entidades;

public class PessoaJuridica extends Contribuinte{

    private Integer numeroDeFuncionarios;

    public PessoaJuridica(String nome, Double rendimentoAnual, Integer numeroDeFuncionarios) {
        super(nome, rendimentoAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double taxas() {
        double taxaBasica;

        if(numeroDeFuncionarios > 10){
            taxaBasica = getRendimentoAnual() * 0.14;
        }else{
            taxaBasica = getRendimentoAnual() * 0.16;
        }

        return taxaBasica;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }
}
