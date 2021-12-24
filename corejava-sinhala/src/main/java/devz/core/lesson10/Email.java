/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devz.core.lesson10;

/**
 *
 * @author devzo
 */
public class Email {
    
    String subject;
    String to;
    String cc;
    String bcc;
    
    Email(String sub,String to){
        this.subject = sub;
        this.to = to;
    }
    
    Email(String sub,String to,String cc){
        
    }
    
     Email(String sub,String to,String cc,String bcc){
    }
    
    
}
