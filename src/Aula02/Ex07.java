package Aula02;

import javax.swing.*;

public class Ex07 {
    public static void main(String[] args) {
       // O Imposto sobre a Transmissão de Bens Móveis (ITBI)
        // é aplicado sobre o valor de um imóvel a ser negociado.
        // A base de cálculo do ITBI (o valor a ser considerado no
        // cálculo) será o maior valor entre o valor de transação
        // (o valor negociado) e o valor venal de referência (fornecido
        // pela Prefeitura). Com base nisso, elabore uma classe que receba
        // o valor da transação, o valor venal e o percentual de imposto.
        // Após isso, encontre o maior valor e aplique o percentual sobre ele.
        // Ao final, apresente o valor do imposto a ser pago. Observação: o valor
        // do imposto a ser pago é calculado por meio da fórmula: valor do imposto
        // = maior valor * percentual / 100. Para entrada e saída de dados utilize a
        // classe JOptionPane.

        double valorTransacao;
        double valorVenal;
        double valorImposto;
        double percentual;

        String read = JOptionPane.showInputDialog("Inrforme o valor da transação:");
        valorTransacao = Double.parseDouble(read);

        read = JOptionPane.showInputDialog("Inrforme o valor venal:");
        valorVenal= Double.parseDouble(read);

        read = JOptionPane.showInputDialog("Inrforme o percentual de imposto:");
        percentual= Double.parseDouble(read);

        if (valorTransacao>valorVenal){
            valorImposto = valorTransacao*percentual/100;
        }else{
            valorImposto = valorVenal*percentual/100;
        }
        JOptionPane.showMessageDialog(null,"O valor do imposto a ser pago é"+ valorImposto);
    }
}
