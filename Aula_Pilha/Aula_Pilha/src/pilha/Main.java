/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula_pilha;

/**
 *
 * @author Dudão
 */
public class Main {

    public static void maon(String[] args) {

        int a = 5, b = 0, div;
        boolean Erro = true;

        try{
            div = a / b;
            Erro = false;
        }catch(ArithmeticException e){
            System.out.println("Erro: Divisão por 0!")
        }
        
        if(!Erro){
        system.out.println("div: "+ div);
}
}
}
