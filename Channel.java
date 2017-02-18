/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1;

/**
 *
 * @author mbibi.bese14seecs
 */
public class Channel
{
   private String value;
  private Channel nextChannel;
  
  public Channel()
  {
    
  }				//end constructor
  
  public Channel(String value, Channel newChannel)
  {
   this.value = value;
   this.nextChannel = newChannel;
  }				//end constructor
  
  public String getValue(){
      return value;
  }
  
   public void setValue(String v){
      value =v;
  }
  
  public Channel getNext(){
      return nextChannel;
  }
  
  public void setNext(Channel c){ 
      nextChannel=c;
  }
  
  public String print(){
    return value;
  }
}
