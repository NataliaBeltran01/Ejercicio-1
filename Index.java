/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 * Esta clase contiene la parte logica del ejercicio del mensaje, 
 * que es en donde se procesa y se muestra el mensaje
 * @author Natalia Beltran
 */
@Named(value = "index")//Direcciona la clase hacia su componente grafica
@RequestScoped
@ManagedBean
public class Index implements Serializable{
    /**
     * Variable que representa la frase que se escribe en el campo de texto
     */
    private String frase;
    /**
     * Método que captura la variable frase es decir el mensaje escrito
     * @return 
     */
    public String getFrase() {
        return frase;
    }
    /**
     * Método que devuelve el variable frase es decir el mensaje escrito
     * @param frase
     */
    public void setFrase(String frase) {
        this.frase = frase;
    }
     /**
     * Método que muestra en pantalla lo digitado en el campo de texto
     */
    public void guardarFrase() {
        FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Envio exitoso",  "Su mensaje es: " + frase) );
    }
}
    