/**
 * 
 */
package celltower;

/**
 * @author hemanth
 *
 */
public interface Sim {
	
	public void sendSMS(String message,String mobilenumber);
	
	public void dialACall(String mobilenumber);
}
