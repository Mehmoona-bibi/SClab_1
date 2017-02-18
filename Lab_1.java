/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1;

import java.io.IOException;

/**
 *
 * @author mbibi.bese14seecs
 */
public class Lab_1 {

  
    public static void main(String[] args) throws IOException {
       TVmanager t1=new TVmanager();
     //System.out.print("Channels:\n");
       t1.addChannel("nbcHannibal");
       t1.addChannel("bbc");
       t1.addChannel("amazon");
       
      System.out.print("\nPRINT CHANNELS:\n"); 
       t1.printChannel();
       System.out.print("\nREPLACE CHANNELS:\n");
       t1.replaceChannel("amazon","google");
       
       System.out.print("\nDELETE CHANNELS: REMAINING CHANNELS\n");
       t1.deleteChannel("bbc");
       
       System.out.print("\nDESCRIPTION OF CHANNELS:\n");
       t1.description();
       
       
             
    }
    
}
