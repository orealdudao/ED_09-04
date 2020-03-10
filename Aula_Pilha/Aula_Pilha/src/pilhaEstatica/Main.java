package pilhaEstatica;

import pilhaEstatica.Stack;
/**
 *
 * @author Siabreu
 */
public class AppPilhaEstatica {
    public static void main(String[] args) {
        Stack pilha = new Stack(4);
        
        //empilhar
        try{
            pilha.push(10);
            pilha.push(20);
            pilha.push(30);
            pilha.push(40);
            pilha.push(50);  ///exceção
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        
        //desempilhar
        try{
            System.out.println("desempilhou");
            System.out.println(pilha.pop());
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("=== DADOS DA PILHA ===\n"+pilha 
                          +"======================\n");
    }   
}
