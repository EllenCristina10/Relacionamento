/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.pkg12.relacionamento;

/**
 *
 * @author Ellen Cristina
 */
public class Lutador {
    //Atributo
    private String nome;
    private String nacionalidade;
    private int idade;
    private  float altura;
    private  float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    //Método especial: construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        //Como o método categoria é privado e também definida pelo peso, chama o setPeso passando o peso
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    //Métodos públicos
    public void apresentar(){
        System.out.println("-------------------------------------------------");
        System.out.println("CHEGOU A HORA! Aprensentamos o lutador " + this.getNome());
        System.out.println("Diretamento da " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " +this.getAltura() + " de altura");
        System.out.println("pesando " + this.getPeso() + " kg");
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getEmpates() + " empates e");
        System.out.println(this.getDerrotas() + " derrotas");
    }
    public void status(){
        System.out.println(this.getNome() + " é da categoria " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
        
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+ 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+ 1);
    }
    
    //Métodos getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    //Ao passar o peso, é chamado o método setCategoria, onde verificará o peso
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    //Método privado onde recebe o peso e define a categoria
    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
