/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobile;

/**
 *
 * @author Conviidado
 */
public class Computador {
    
    String nome;
    int clock;

    public Computador(String nome, int clock) {
        this.nome = nome;
        this.clock = clock;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }

    public Computador() {
    }
    
    
    
}
