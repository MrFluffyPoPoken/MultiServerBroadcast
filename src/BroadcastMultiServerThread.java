import java.net.*;
import java.io.*;

import protocol.RegistrationMessageFromPhoneClass;
import protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone;

public class BroadcastMultiServerThread extends Thread {
	private Socket socket = null;
	private boolean registrationActive; 
	private boolean listenForPacket; 
	Player player; 

	public BroadcastMultiServerThread(Socket socket) {
		super("BroadcastMultiServerThread");
		this.socket = socket;
		registrationActive = true; 
		listenForPacket = true; 
		player = new Player(); 
	}
	
	public void run() {
		String playerIP = "";
		String playerInfo = ""; 

		try {
			DatagramSocket socketListeningForPlayer = new DatagramSocket(ProtocolConstants.APP_LISTENING_PORT_NUMBER);
			byte[] receivedData = new byte[1024];

			while(registrationActive){
				DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);
				socketListeningForPlayer.receive(receivedPacket);

				playerIP = receivedPacket.getData().toString();
			}
			System.out.println("Successfully contacted device");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		player.setIPAddress(playerIP);

		sendRegistrationConfirmation(); 
		
//		try {
//			socket = new Socket(player.getIPAddress(), ProtocolConstants.APP_LISTENING_PORT_NUMBER);
//			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			playerInfo = br.readLine().toString();
//			
//			DatagramSocket socketListeningForRegistration = new DatagramSocket(ProtocolConstants.APP_LISTENING_PORT_NUMBER);
//			byte[] receivedData = new byte[1024];
//
//			while(listenForPacket){
//				DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);
//				socketListeningForRegistration.receive(receivedPacket);
//
//				playerInfo = receivedPacket.getData().toString();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		
//		
//		String inputLine, outputLine;
//		BroadcastProtocol bp = new BroadcastProtocol();
//		outputLine = bp.processInput(null);
//
//		while ((inputLine = in.readLine()) != null) {
//			outputLine = bp.processInput(inputLine);
//			if (outputLine.equals("Bye"))
//				break;
//		}
//		socket.close();
	}
	
	/**
	 * Parse input stream to get message.
	 * 
	 * Usage: message.getTeamName() or message.getColorHex();
	 * @param in
	 * @return message contains team name and color.
	 * @throws IOException
	 */
	private RegistrationMessageFromPhone receiveTeamInfo(InputStream in) throws IOException {
		RegistrationMessageFromPhone message = RegistrationMessageFromPhone.parseFrom(in);
		return message;
	}
	
	public void sendRegistrationConfirmation() {
		try {
			String message = "register"; 
			DatagramSocket myServerSocket = new DatagramSocket(ProtocolConstants.APP_LISTENING_PORT_NUMBER); // server socket
			byte[] sendData = new byte[message.length()]; // build msg
			sendData = message.getBytes();
			InetSocketAddress destSocketAddr = new InetSocketAddress(player.getIPAddress(), ProtocolConstants.APP_LISTENING_PORT_NUMBER); // destination socket addr
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, destSocketAddr); // make packet
			myServerSocket.send(sendPacket); // send packet
			//myServerSocket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void endRegistration() {
		registrationActive = false; 
	}
}