/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classificadordeimc_vicky;

import java.util.Scanner;

public class ClassificadorDeIMC_Vicky {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("CLASSIFICADOR DE IMC");

        
        System.out.print("->Digite o peso em kg (ex: 70.5): ");
        double peso = scanner.nextDouble();

        System.out.print("->Digite a altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();

        
        double imc = peso / (altura * altura);
        System.out.printf("\n->Seu IMC calculado e: %.2f\n", imc);

        
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25.0) {
            classificacao = "Peso normal";
        } else if (imc < 30.0) {
            classificacao = "Sobrepeso";
        } else if (imc < 35.0) {
            classificacao = "Obesidade";
        } else {
            classificacao = "Obesidade grave";
        }
        System.out.println("Classificacao: " + classificacao);

        // 3. Operador Ternário (teste ? valor_se_verdadeiro : valor_se_falso)
        String statusFaixaIdeal = (imc <= 24.9) ? "Dentro ou abaixo da faixa ideal" : "Acima da faixa ideal";
        System.out.println("Status da faixa ideal: " + statusFaixaIdeal);

        
        System.out.println("\n--- Selecione a Faixa Etária ---");
        System.out.println("1 - Crianca/Adolescente");
        System.out.println("2 - Adulto");
        System.out.println("3 - Idoso");
        System.out.print("Opcao desejada: ");
        int opcaoEtaria = scanner.nextInt();

        System.out.print("->Recomendacao: ");
        switch (opcaoEtaria) {
            case 1:
                System.out.println("->Acompanhe o crescimento com apoio pediatrico e incentive habitos saudaveis.");
                break;
            case 2:
                System.out.println("->Mantenha uma rotina de exercicios regulares e alimentacao balanceada.");
                break;
            case 3:
                System.out.println("->Foque na manutencao de massa magra, saude ossea e consultas periodicas.");
                break;
            default:
                System.out.println("->Opção de faixa etaria invalida.");
                break;
        }

        scanner.close();
    }
}
