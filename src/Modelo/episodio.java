/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Aluado JK
 */
public class episodio implements classificavel {
    private String nome;
    private int numero;
    private Serie serie;
    private int totalVizualicacao;

    public int getTotalVizualiacoes() {
        return totalVizualicacao;
    }

    public void setTotalVizualiacoes(int totalVizualiacoes) {
        this.totalVizualicacao = totalVizualiacoes;
    }

    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    
    public int getClassificacao(){
        if(totalVizualicacao > 100){
            return 4;
        }else{
            return 2;
        }
    }
}
