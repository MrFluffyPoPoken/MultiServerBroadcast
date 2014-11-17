package framework;

/**
 * The interface of the server.
 * 
 * GUI access the server from here.
 * @author Shinnosuke
 *
 */
public interface RegistrationServer {
	/**
	 * Set GUI for the server.
	 * 
	 * This method needs to be called at first. 
	 * @param gui
	 */
	void setGUI(RegistrationServerGUI gui);
	/**
	 * Start listening TCP connections made to the server.
	 */
	void startListening();
	/**
	 * Stop registration, terminating the server.
	 */
	void endRegistration();
}
