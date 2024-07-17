package com.api.demo;
import java.util.Scanner;

public class Lista02 {

    public enum UnidadeFederativa {
        AC("Acre" , Regiao.NORTE),
        AL("Alagoas" , Regiao.NORDESTE),
        AP("Amapá" , Regiao.NORTE),
        AM("Amazonas",Regiao.NORTE ),
        BA("Bahia" , Regiao.NORDESTE),
        CE("Ceará" , Regiao.NORDESTE),
        DF("Distrito Federal" , Regiao.CENTRO_OESTE),
        ES("Espírito Santo" , Regiao.SUDESTE),
        GO("Goiás" , Regiao.CENTRO_OESTE),
        MA("Maranhão" , Regiao.NORDESTE),
        MT("Mato Grosso" , Regiao.CENTRO_OESTE),
        MS("Mato Grosso do Sul" , Regiao.CENTRO_OESTE),
        MG("Minas Gerais" , Regiao.SUDESTE),
        PA("Pará" , Regiao.NORTE),
        PB("Paraíba" , Regiao.NORDESTE),
        PR("Paraná" , Regiao.SUL),
        PE("Pernambuco" , Regiao.NORDESTE),
        PI("Piauí" , Regiao.NORDESTE),
        RJ("Rio de Janeiro" , Regiao.SUDESTE),
        RN("Rio Grande do Norte" , Regiao.NORDESTE),
        RS("Rio Grande do Sul" , Regiao.SUL),
        RO("Rondônia" , Regiao.NORTE),
        RR("Roraima" , Regiao.NORTE),
        SC("Santa Catarina" , Regiao.SUL),
        SP("São Paulo" , Regiao.NORTE),
        SE("Sergipe" , Regiao.NORDESTE),
        TO("Tocantins" , Regiao.NORTE);

        private String nomePorExtenso;
        private Regiao regiao;

        UnidadeFederativa(String nomePorExtenso , Regiao regiao) {
            this.nomePorExtenso = nomePorExtenso;
            this.regiao = regiao;
        }

        public String getnomePorExtenso() {
            return nomePorExtenso;
        }
        
        public Regiao getregiao() {
            return regiao;
        }
    }

    public enum Regiao {
        NORTE,
        SUL,
        NORDESTE,
        SUDESTE,
        CENTRO_OESTE
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma unidade federativa (sigla): ");

        for (UnidadeFederativa uf : UnidadeFederativa.values()) {
            System.out.print(uf.name() + " ");
        }
        System.out.println();

        String escolha = scanner.nextLine().toUpperCase();

        try {
            UnidadeFederativa ufEscolhida = UnidadeFederativa.valueOf(escolha);
            System.out.println("Você escolheu: " + ufEscolhida.getnomePorExtenso());
        } catch (IllegalArgumentException e) {
            System.out.println("Unidade federativa inválida!");
        
        }
        

        //EXERCÍCIO 02
        System.out.println("Escolha uma região (NORTE, NORDESTE, CENTRO_OESTE, SUDESTE, SUL): ");
        for (Regiao regiao : Regiao.values()) {
            System.out.print(regiao.name() + " ");
        }
        System.out.println();

        String regiaoEscolha = scanner.nextLine().toUpperCase();
        try {
            Regiao regiaoEscolhida = Regiao.valueOf(regiaoEscolha);
            System.out.println("Estados na região " + regiaoEscolhida + ":");
            for (UnidadeFederativa uf : UnidadeFederativa.values()) {
                if (uf.getregiao() == regiaoEscolhida) {
                    System.out.println(uf.getnomePorExtenso());
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Região inválida!");
        }


        scanner.close();
    }
}