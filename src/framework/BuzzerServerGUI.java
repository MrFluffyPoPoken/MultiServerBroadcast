package framework;

import java.util.Date;

import src.Player;

/**
 * GUI that is updated by the server.
 * 
 * Any GUI who uses BuzzerServer needs to implement this.
 * @author Shinnosuke
 *
 */
public interface BuzzerServerGUI {
	
	/**
	 * Return players as player answer.
	 * 
	 * This method is intended to provide a temporal and possibly
	 * inaccurate result, because of the time-unsure nature of co-current process.
	 * @param player
	 * @param submitTime
	 * @param problemID
	 */
	void addAnswer(Player player, Date submitTime, int problemID);
}
