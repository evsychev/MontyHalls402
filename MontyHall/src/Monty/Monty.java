/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monty;

import Door.Door;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author sychev
 */
public class Monty {
    
    public void openNullDoor(ArrayList<Door> d) {
            
        int rn;
        Random randNumber2 = new Random();
        
        while (true){
            rn = randNumber2.nextInt(d.size());
            if (!d.get(rn).isOpen() && !d.get(rn).isBingo()){
                d.get(rn).setOpen(true);
                break;
            }
            
        }
    }
}
