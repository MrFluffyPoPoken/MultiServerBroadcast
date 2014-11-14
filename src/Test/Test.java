package Test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import src.*;

public class Test {

	public static void main(String[] args) {
		Socket socket;
		try {
			socket = new Socket("209.140.209.166", 60000);
			String ip = InetAddress.getLocalHost().getHostAddress();
			OutputStream out = socket.getOutputStream();
			new PrintWriter(out).print(ip);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
