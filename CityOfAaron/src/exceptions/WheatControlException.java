/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author haleyashcroft
 */
public class WheatControlException extends Exception {
    public WheatControlException() {
        
    }
    
    public WheatControlException(String message) {
        super(message);
    }
    
    public WheatControlException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public WheatControlException(Throwable cause) {
        super(cause);
    }
    
    public WheatControlException(String message, Throwable cause, boolean enableSupression, boolean writableStackTrace) {
        super(message, cause, enableSupression, writableStackTrace);
    }
}
