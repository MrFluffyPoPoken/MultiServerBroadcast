import java.net.*;
import java.util.*;
import java.io.*;

public class BroadcastMultiServer {
	private ArrayList<Player> playerList;
	private static boolean socketConnection;

	public static void main(String[] args) throws IOException {

		try {
			socketConnection = true;
			ServerSocket sock = new ServerSocket(ProtocolConstants.APP_LISTENING_PORT_NUMBER);
			while (socketConnection) {
				Socket newsock = sock.accept();
				System.out.println("Creating thread ...");
				Thread t = new BroadcastMultiServerThread(newsock);
				t.start();
			}
			sock.close();
		} catch (Exception e) {
			System.out.println("IO error " + e);
		}
		System.out.println("End!");
	}

	public void addPlayer(Player player) {
		playerList.add(player);
	}

	public Player getPlayer(String ip) {
		for (Player player : playerList) {
			if (player.getIPAddress().equals(ip)) {
				return player;
			}
		}
		return null;
	}

	public void endSocketListener() {
		socketConnection = false;
	}
}