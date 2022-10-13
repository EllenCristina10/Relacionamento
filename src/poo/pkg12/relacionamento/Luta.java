/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.pkg12.relacionamento;

import java.util.Random;

/**
 *
 * @author Ellen Cristina
 */
public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int round; 
    private boolean aprovada;
    
    //Método especial
    public void marcarLuta(Lutador desafiado, Lutador desafiante){
        //Verifica se os dois lutadores são diferentes e se a categoria é a mesma, caso forem a luta é aprovada
        if(desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiado != desafiante){
            this.aprovada = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        //Se a luta for aprovada, os lutadores se apresentam
        if(this.aprovada){
            System.out.println("############# DESAFIADO #################");
            this.getDesafiado().apresentar();
            System.out.println("############# DESAFIANTE #############");
            this.getDesafiante().apresentar();
            
            //Irá gerar 3 valores aleatórios: 0,1,2
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); 
            switch(vencedor){
                //Empate
                case 0:
                    System.out.println("-----------------------------------------------");
                    System.out.println("A LUTA EMPATOU!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                //Desafiado Vence    
                case 1:
                    System.out.println("-----------------------------------------------");
                    System.out.println("VITÓRIA DE: " + this.getDesafiado().getNome() + "!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                //Desafiante vence
                case 2:
                    System.out.println("-----------------------------------------------");
                    System.out.println("VITÓRIA DE: " + this.getDesafiante().getNome() + "!!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        }else{
            //Caso a luta não seja aprovada
            System.out.println("A luta não pode acontecer");
        }
    }
    
    //Métodos getters e setters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
