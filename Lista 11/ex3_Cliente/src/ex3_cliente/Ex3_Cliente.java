/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_cliente;

/**
 *
 * @author montanari
 */
public class Ex3_Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Client cl = new Client();
        Thread clT = new Thread(cl);
    }
    
}
