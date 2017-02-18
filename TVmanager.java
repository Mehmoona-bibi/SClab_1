/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package lab_1;
import java.io.IOException;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements; 
/**
 *
 * @author mbibi.bese14seecs
 */
public class TVmanager {
    
  Channel head = null;
    Channel tem=null; 
    
    public TVmanager(){}
    
    void addChannel(String value){
        
        if(head==null){
            head=new Channel(value, tem);
        }else{
        
            Channel temp=new Channel(value, tem);
            Channel cur = head;     
                
            if(cur!=null){
                while(cur.getNext()!=null){
            
                    cur=cur.getNext();
                }
                cur.setNext(temp);
            }
        }
          	
    }
    
    void printChannel(){
        if(head==null){
            System.out.print("NO ELEMENTS");
        }else{      
            Channel cur = head;     
                
            if(cur!=null){
              System.out.print(cur.print());
                     System.out.print("\n");
                while(cur.getNext()!= null){
                    cur=cur.getNext();
                    System.out.print(cur.print());
                     System.out.print("\n");
                    
                }
               
            }
        }
          	
    }
        
    
    
    void replaceChannel(String v,String replace ){
        if(head==null){
            System.out.print("NO ELEMENTS");
        }else{      
            Channel cur = head;     
                
            if(v==cur.getValue()){
              cur.setValue(replace);
            }else{
              while(cur.getNext()!= null){
                cur=cur.getNext();
                if(v==cur.getValue()){
              cur.setValue(replace);
                    
                }
              }
            }
            
            this.printChannel();
        }
               
    }
    
    void deleteChannel(String v){
        
        if(head==null){
            System.out.print("NO ELEMENTS");
        }else{      
            Channel cur = head;     
                
            if(v==cur.getValue()){
                 cur.setValue(cur.getNext().getValue());
                 cur.setNext(cur.getNext().getNext());
                 
            }else{
              while(cur.getNext()!= null){
                cur=cur.getNext();
                if(v==cur.getValue()){
               cur.setValue(cur.getNext().getValue());
                 cur.setNext(cur.getNext().getNext());                    
                }
              }
            }
            
            this.printChannel();
        }
               
    }
    
    void description() throws IOException{
        if(head==null){
            System.out.print("NO ELEMENTS");
        }else{      
            Channel cur = head;     
                
            if(cur!=null){
                des(cur.getValue());
                    
                while(cur.getNext()!= null){
                    cur=cur.getNext();
                    des(cur.getValue());
                    
                }
               
            }
        }
    }
    
    void des(String v) throws IOException{
        Document doc = Jsoup.connect("https://www.youtube.com/user/"+v+"/about").get();
        System.out.println("\nDescription of "+v+":");
        Elements eles = doc.select("div.about-description");
        System.out.println(eles.text());

    }
    
}
        
        
        
    

  
    

