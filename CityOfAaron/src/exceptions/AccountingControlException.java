
package exceptions;

/**
 *
 * @author Stuehser
 */
public class AccountingControlException extends Exception{
    public AccountingControlException() {
        
    }
    
    public AccountingControlException(String message) {
        super(message);
    }
    
    public AccountingControlException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public AccountingControlException(Throwable cause) {
        super(cause);
    }
    
    public AccountingControlException(String message, Throwable cause, boolean enableSupression, boolean writableStackTrace) {
        super(message, cause, enableSupression, writableStackTrace);
    }
}
