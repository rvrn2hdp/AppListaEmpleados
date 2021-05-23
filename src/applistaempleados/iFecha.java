/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistaempleados;

/**
 *
 * @author pcc
 */
public interface iFecha {
    public int getDia();
    
    public int getMes();
    
    public int getAnio();
    
    public int calcularAniosTranscurridos();
}
