/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Patrick L Teixeira
 */
public class Gridpanes {
    private Double leitura;
    private String alerta;
    private Double soma = 0.0;
    private Double media;
    
    public Gridpanes(){
        media = leitura;
    }

    public Double getLeitura() {
        return leitura;
    }

    public void setLeitura(Double leitura) {
        this.leitura = leitura;
    }

    public String getAlerta() {
        return alerta;
    }

    public Double getSoma() {
        return soma;
    }

    public void setSoma(Double soma) {
        this.soma = soma;
    }

    public Double getMedia() {
        return media;
    }
    
    public void calcMedia(Integer div){
        this.media = soma/div;
    }
    
    public void medirAlerta(Double total){
        Double porc = (leitura*100)/total;
        
        if(porc <= 30){
            alerta = "baixo uso";
        }else if(porc<70){
            alerta= "medio uso";
        }else{
            alerta = "alto uso";
        }
    }
}