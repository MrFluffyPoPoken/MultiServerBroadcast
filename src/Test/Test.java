package Test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import src.*;

public class Test implements Runnable {
	Socket socket;
	OutputStream out;
	
	public void run() {
		try {
			socket = new Socket("209.140.209.153", 60000);
			String ip = InetAddress.getLocalHost().getHostAddress();
			out = socket.getOutputStream();
			new PrintWriter(out).print(ip);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void sendColorAndTeamName() {
		new PrintWriter(out).print("Color and Name");
	}
}
