/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista15.q2;

/**
 *
 * @author gabri
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Cliente cliente = new Cliente("teste", "endereço");
        ContaBancaria conta = new ContaBancaria("123", 0, cliente);
        conta.depositar(100);
        Thread.sleep(2000);
        conta.sacar(30);
        Thread.sleep(2000);
        conta.sacar(5);
        conta.getMovimentos().forEach(e -> System.out.println(e.getTipoMovimento().toString() + " " +
            e.getData().toString() + " " + e.getHora().toString()));
        
        System.out.println("\n");
        
        conta.ordenaMovimentosHoraDecrescente();
        conta.getMovimentos().forEach(e -> System.out.println(e.getTipoMovimento().toString() + " " +
            e.getData().toString() + " " + e.getHora().toString()));
    }
    
}
