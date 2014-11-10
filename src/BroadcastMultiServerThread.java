import java.net.*;
import java.io.*;

public class BroadcastMultiServerThread extends Thread {
	private Socket socket = null;
	private boolean registrationActive, listenForClients,
			listenForRegistrationInfo;
	Player player;

	public BroadcastMultiServerThread(Socket socket) {
		super("BroadcastMultiServerThread");
		this.socket = socket;
		registrationActive = listenForClients = listenForRegistrationInfo = false;
		player = new Player();
	}

	public void run() {
		String playerIP = "";
		String playerInfo = "";

		listenForClients = true;
		while (listenForClients) {
			try (PrintWriter out = new PrintWriter(socket.getOutputStream(),
					true);
					BufferedReader in = new BufferedReader(
							new InputStreamReader(socket.getInputStream()));) {

				String inputLine, outputLine;
				outputLine = "IP address confirmed";
				out.println(outputLine);

				while ((inputLine = in.readLine()) != null) {
					inputLine = in.readLine();
					if (inputLine != null) {
						playerIP = inputLine;
						System.out.println("Player IP is: " + playerIP);
					}
				}
				System.out.println("Successfully contacted device");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		player.setIPAddress(playerIP);

		while (registrationActive) {
			try (PrintWriter out = new PrintWriter(socket.getOutputStream(),
					true);) {
				String outputLine = "register";
				out.println(outputLine);
				System.out.println("Sent registration message");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//Working on registration right now
		while (listenForRegistrationInfo) {
			try (PrintWriter out = new PrintWriter(socket.getOutputStream(),
					true);
					BufferedReader in = new BufferedReader(
							new InputStreamReader(socket.getInputStream()));) {
				
				String inputLine, outputLine;
				
				while ((inputLine = in.readLine()) != null) {
					inputLine = in.readLine();
					if (inputLine != null) {
						playerIP = inputLine;
						System.out.println("Player IP is: " + playerIP);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// sendRegistrationConfirmation();

		// try {
		// socket = new Socket(player.getIPAddress(),
		// ProtocolConstants.APP_LISTENING_PORT_NUMBER);
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(socket.getInputStream()));
		// playerInfo = br.readLine().toString();
		//
		// DatagramSocket socketListeningForRegistration = new
		// DatagramSocket(ProtocolConstants.APP_LISTENING_PORT_NUMBER);
		// byte[] receivedData = new byte[1024];
		//
		// while(listenForPacket){
		// DatagramPacket receivedPacket = new DatagramPacket(receivedData,
		// receivedData.length);
		// socketListeningForRegistration.receive(receivedPacket);
		//
		// playerInfo = receivedPacket.getData().toString();
		// }
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		//
		//
		//
		// String inputLine, outputLine;
		// BroadcastProtocol bp = new BroadcastProtocol();
		// outputLine = bp.processInput(null);
		//
		// while ((inputLine = in.readLine()) != null) {
		// outputLine = bp.processInput(inputLine);
		// if (outputLine.equals("Bye"))
		// break;
		// }
		// socket.close();
	}

	public void sendRegistrationConfirmation() {

	}

	public void endListeningForClients() {
		listenForClients = false;
	}
	
	public void startRegistration() {
		registrationActive = true;
	}
	
	public void endRegistration() {
		registrationActive = false;
	}
	
	public void listenForRegistrationInformation() {
		registrationActive = true;
	}
	
	public void endListenforRegistrationInformation() {
		registrationActive = false;
	}
	
}