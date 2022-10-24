/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Designer;

/**
 *
 * @author augus
 */
public class QueueFullException extends RuntimeException{
    public QueueFullException(String err){
        super(err);
    }
    
}
