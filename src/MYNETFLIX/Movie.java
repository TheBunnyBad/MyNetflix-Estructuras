/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MYNETFLIX;

import java.awt.Image;

/**
 *
 * @author jham0
 */
public class Movie {
    
    ///////////////////////
    //Atributos
    ///////////////////////
    
    private String tittle,actors,keyWords;
    
    private Image cover;
    
    /////////////////////
    //Metodos
    ////////////////////

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public Image getCover() {
        return cover;
    }

    public void setCover(Image cover) {
        this.cover = cover;
    }

    
    public Movie(String tittle, String actors, String keyWords, Image cover) {
        this.tittle = tittle;
        this.actors = actors;
        this.keyWords = keyWords;
        this.cover = cover;
    }
    
      
    
}
