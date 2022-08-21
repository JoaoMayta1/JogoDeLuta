/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoDeLuta;

/**
 *
 * @author User
 */
public class Personagem {
    IPoder motor;
    
    Personagem(IPoder m){
        this.motor = m;
    }
    public String acertar(){
    return this.motor.acertar();
            
    }
}
