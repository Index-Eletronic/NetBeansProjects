/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author IndeX
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine(); // Faz ler letras 
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat(); // Faz ler numeros float
        //System.out.println("A nota é: " + nota);
        System.out.printf("A sua nota %s é %.2f \n",nome, nota);
    }
    
}
