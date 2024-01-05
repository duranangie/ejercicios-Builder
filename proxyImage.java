/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author user
 */
public class proxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public proxyImage(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public void Display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
            
        }
        
        System.out.println("el display es: ");
        realImage.Display();
    }
    
    
    
}
