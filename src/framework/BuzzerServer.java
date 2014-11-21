package framework;

import java.util.Collection;

import src.Player;

/**
 * The server used for actual game.
 * @author Shinnosuke
 *
 */
public interface BuzzerServer {
	/**
	 * Set GUI for the server.
	 * 
	 * This method needs to be called at first. 
	 * @param gui
	 */
	void setGUI(BuzzerServerGUI gui);
	
	/**
	 * Set players.
	 * 
	 * This method needs to be called first.
	 * @param players
	 */
	void setPlayers(Collection<Player> players);
	/**
	 * Establish TCP socket connection to each player.
	 */
	void makeConnections();
	/**
	 * Start a question.
	 * @param problemID
	 */
	void startQuestion(int problemID);
	/**
	 * End the game, quit the server.
	 */
	void endGame();
}
