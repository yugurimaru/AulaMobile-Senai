
package mobile;


public class Main {

    
    public static void main(String[] args) {
     
        
        Computador pc = new Computador();
        
//        pc.setNome("Pedro");
//        pc.setClock(1200);
        pc.nome = "Pedro";
        pc.clock = 1200;
           
        
        
        System.out.printf("\nNome: %s",pc.getNome());
        System.out.printf("\nClock: %d\n",pc.getClock());
        
        
    }
    
}
