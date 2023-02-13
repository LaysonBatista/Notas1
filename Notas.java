/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas;

import java.io.DataInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author layson
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        String s = "";

        float nota1 = 0;
        float nota2 = 0;
        float media = 0;
        float frequencia;

        DataInputStream dado;

        JOptionPane.showInputDialog(null,"Entre com a nota 1:");
        dado = new DataInputStream(System.in);//inicializa para pegar informação do teclado

        s = dado.readLine();//Lê uma linha do teclado
        nota1 = Float.parseFloat(s);//Converte de string para float
        JOptionPane.showInputDialog(null,"Entre com a nota 2: ");
        s = dado.readLine();
        nota2 = Float.parseFloat(s);

        //calcule a média das notas
        media = (nota1 + nota2) / 2;
        JOptionPane.showMessageDialog(null,"Média: " + media);
        
       JOptionPane.showInputDialog(null, "Informe a frequencia: ");
        s = dado.readLine();
        frequencia = Float.parseFloat(s);

        if (media >= 6 &&  frequencia >= 70){
            JOptionPane.showMessageDialog(null, "Parabéns! Você passou!");
        } else {
            JOptionPane.showMessageDialog(null, "Infelizmente reprovou.");
        }

    }
   
}
