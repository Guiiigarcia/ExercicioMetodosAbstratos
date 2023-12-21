package aplicacao;

import entidades.Contribuinte;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Contribuinte> list = new ArrayList<>();

        System.out.print("Entre com o número de contribuintes: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Contribuinte: # ("+(i+1)+")");
            System.out.print("Pessoa Jurídica ou Física (J/F): ");
            char p = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Rendimento anual: ");
            double rendimentoAnual = sc.nextDouble();

            if(p == 'F'){
                System.out.print("Despesas com saúde: ");
                double despesasComSaude = sc.nextDouble();

                Contribuinte contribuinte = new PessoaFisica(nome, rendimentoAnual, despesasComSaude);
                list.add(contribuinte);
            }else if(p == 'J') {
                System.out.print("Número de funcionários: ");
                int numeroDeFuncionarios = sc.nextInt();

                Contribuinte contribuinte = new PessoaJuridica(nome,rendimentoAnual,numeroDeFuncionarios);
                list.add(contribuinte);
            }else{
                System.out.println("Desculpe, funcionário não cadastrado! ");
            }
        }

        System.out.println();
        System.out.println("Taxas pagas: ");

        for(Contribuinte c: list){
            System.out.println(c.getNome() +": R$"+String.format("%.2f",c.taxas()));
        }

        System.out.println();
        System.out.println("Total de taxas: ");


        double totalTaxas = 0;

        for(Contribuinte total: list){

            totalTaxas += total.taxas();
        }

        System.out.println(String.format("%.2f",totalTaxas));

        sc.close();
    }
}
