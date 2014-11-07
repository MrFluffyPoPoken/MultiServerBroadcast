import java.net.*;
import java.util.*;
import java.io.*;

public class BroadcastMultiServer {
	private ArrayList<Player> playerList; 
	
	public static void main(String[] args) throws IOException {

//		if (args.length != 1) {
//			System.err.println("Usage: java KKMultiServer <port number>");
//			System.exit(1);
//		}
		
		int portNumber = ProtocolConstants.APP_LISTENING_PORT_NUMBER;
		boolean listening = true;
		
		try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
			if(listening == true) {
				new BroadcastMultiServerThread(serverSocket.accept()).start();
			}
			serverSocket.close();
		} catch (IOException e) {
			System.err.println("Could not listen on port " + portNumber);
			System.exit(-1);
		}
	}
	
	public void addPlayer(Player player) {
		playerList.add(player); 
	}
	
	public Player getPlayer(String ip) {
		for(Player player: playerList) {
			if(player.getIPAddress().equals(ip)) {
				return player; 
			}
		}
		return null; 
	}
}