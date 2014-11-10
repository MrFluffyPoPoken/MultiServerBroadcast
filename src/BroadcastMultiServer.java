import java.net.*;
import java.util.*;
import java.io.*;

public class BroadcastMultiServer {
	private ArrayList<Player> playerList; 
	private boolean socketConnection;
	
	public static void main(String[] args) throws IOException {

		int nreq = 1;
        try
        {
            ServerSocket sock = new ServerSocket (8080);
            for (;;)
            {
                Socket newsock = sock.accept();
                System.out.println("Creating thread ...");
                Thread t = new BroadcastMultiServerThread(newsock);
                t.start();
            }
        }
        catch (Exception e)
        {
            System.out.println("IO error " + e);
        }
        System.out.println("End!");
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