package entidades;

public class PessoaFisica extends Contribuinte{

    private Double despesasComSaude;

    public PessoaFisica(String nome, Double rendimentoAnual, Double despesasComSaude) {
        super(nome, rendimentoAnual);
        this.despesasComSaude = despesasComSaude;
    }

    @Override
    public Double taxas() {

        if(getRendimentoAnual() < 20000.00){
            return getRendimentoAnual() * 0.15 - despesasComSaude * 0.5;
        }else{
            return getRendimentoAnual() * 0.25 - despesasComSaude * 0.5;
        }
    }

    public Double getDespesasComSaude() {
        return despesasComSaude;
    }

    public void setDespesasComSaude(Double despesasComSaude) {
        this.despesasComSaude = despesasComSaude;
    }
}
