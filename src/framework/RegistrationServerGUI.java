package framework;

import java.net.InetAddress;

import src.Player;

/**
 * Any GUI who uses this API should implement this.
 * 
 * That way, the server can update GUI.
 * @author Shinnosuke
 *
 */
public interface RegistrationServerGUI {
	/**
	 * Inform GUI with accepted IP address.
	 * @param ip
	 */
	void addClientIPAddress(InetAddress ip);
	/**
	 * Inform GUI with an added player.
	 * @param player
	 */
	void addPlayer(Player player);
}
