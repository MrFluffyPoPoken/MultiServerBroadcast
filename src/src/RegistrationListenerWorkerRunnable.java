package src;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

import Protocol.*;
import Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone;

/**
	
 */
public class RegistrationListenerWorkerRunnable implements Runnable {

	protected Socket clientSocket = null;
	protected String serverText = null;
	String appInfo;
	Player player;

	public RegistrationListenerWorkerRunnable(Socket clientSocket, String serverText) {
		this.clientSocket = clientSocket;
		this.serverText = serverText;
		this.player = new Player();
	}

	public void run() {
		try {
			InetAddress ipAddress = clientSocket.getInetAddress();
			String remoteIP = ipAddress.getHostAddress();
			System.out.println(remoteIP);
			player.setIPAddress(remoteIP);
			if (!(player.getIPAddress().equals(null))) {
				System.out.print("Player IP is: " + player.getIPAddress());
			}
			OutputStream registerStartOutput = clientSocket.getOutputStream();
			new PrintWriter(registerStartOutput).println(ProtocolConstants.REGISTER_START);
			registerStartOutput.close();

			BufferedReader registrationStringReader = new BufferedReader(new InputStreamReader(
					clientSocket.getInputStream()));
			String input = registrationStringReader.readLine();
			while (input == null) {
				input = registrationStringReader.readLine();
			}
			InputStream stream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
			player.setTeamName(receiveTeamInfo(stream).getTeamName().toString());
			player.setTeamColor(receiveTeamInfo(stream).getColorHex().toString());
			if (!(player.getTeamName().equals("") && player.getTeamColor().equals(""))) {
				System.out.print("Player team name is: " + player.getTeamName());
				System.out.print("Player color is: " + player.getTeamColor());
			}
			registrationStringReader.close();
			stream.close();

			OutputStream registerEndOutput = clientSocket.getOutputStream();
			new PrintWriter(registerEndOutput).println(ProtocolConstants.REGISTER_END);
			registerEndOutput.close();

			System.out.println("Ended Registration. Closing Socket.");
			clientSocket.close();
			if (clientSocket.isClosed()) {
				System.out.println("Socket closed");
			}

		} catch (IOException e) {
			// report exception somewhere.
			e.printStackTrace();
		}
	}

	private RegistrationMessageFromPhone receiveTeamInfo(InputStream in) throws IOException {
		RegistrationMessageFromPhone message = RegistrationMessageFromPhone.parseFrom(in);
		return message;
	}
}
//
// import java.net.*;
// import java.nio.charset.StandardCharsets;
// import java.io.*;
//
// import Protocol.RegistrationMessageFromPhoneClass.*;
// public class BroadcastMultiServerThread extends Thread {
// private Socket socket = null;
// private boolean registrationActive, listenForClients, playGame, gameActive;
// Player player;
//
// public BroadcastMultiServerThread(Socket socket) {
// super("BroadcastMultiServerThread");
// this.socket = socket;
// registrationActive = listenForClients = playGame = gameActive = false;
// player = new Player();
// }
//
// public void run() {
// String playerIP = "";
// System.out.println("Starting thread run");
// listenForClients = true;
// gameActive = true;
// if (gameActive) {
// System.out.println("Game is active");
// if (listenForClients) {
// System.out.println("Listening for clients");
// try (BufferedReader in = new BufferedReader(new
// InputStreamReader(socket.getInputStream()));) {
// System.out.println("Starting listening for clients");
// String inputLine;
// System.out.println("Socket is connected: " +socket.isConnected());
// inputLine = in.readLine();
// System.out.println("This is the inputLine: " + inputLine);
//
// while ((inputLine = in.readLine()) != null) {
// inputLine = in.readLine();
// if (inputLine != null) {
// playerIP = inputLine;
// System.out.println("Player IP is: " + playerIP);
// player.setIPAddress(playerIP);
// }
// }
// System.out.println("Successfully contacted device");
// } catch (Exception e) {
// e.printStackTrace();
// }
// }
//
// if (registrationActive) {
// try (PrintWriter out = new PrintWriter(socket.getOutputStream(), true);) {
// String outputLine = ProtocolConstants.REGISTER_START;
// out.println(outputLine);
// System.out.println("Sent registration message");
// try (BufferedReader in = new BufferedReader(new
// InputStreamReader(socket.getInputStream()));) {
// String message;
// while ((message = in.readLine()) != null) {
// message = in.readLine();
// if (message != null) {
// InputStream stream = new
// ByteArrayInputStream(message.getBytes(StandardCharsets.UTF_8));
// player.setTeamName(receiveTeamInfo(stream).getTeamName());
// player.setTeamColor(receiveTeamInfo(stream).getColorHex());
// System.out.println("Player Name is: " + player.getTeamName());
// System.out.println("Player Color is: " + player.getTeamColor());
// out.println("Successfully registered");
// }
// }
// } catch (Exception e) {
// e.printStackTrace();
// }
// out.println(ProtocolConstants.REGISTER_END);
// } catch (Exception e) {
// e.printStackTrace();
// }
// }
//
// if (playGame) {
// try (PrintWriter out = new PrintWriter(socket.getOutputStream(), true);) {
// String outputLine = ProtocolConstants.QUESTION_START;
// out.println(outputLine);
// System.out.println("Sent start signal");
// } catch (Exception e) {
// e.printStackTrace();
// }
// }
// }
// try {
// PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
// out.println(ProtocolConstants.GAME_END);
// // socket.close();
// } catch (IOException e) {
// e.printStackTrace();
// }
//
// }
//
// /**
// * Parse input stream to get message.
// *
// * Usage: message.getTeamName() or message.getColorHex();
// <<<<<<< HEAD
// *
// =======
// >>>>>>> f34870f24e6a16aba8880b0ca3805a44f98b714f
// * @param in
// * @return message contains team name and color.
// * @throws IOException
// */
//
//
//
//
// // public void endListeningForClientsAndStartRegistration() {
// // registrationActive = true;
// // listenForClients = false;
// // playGame = false;
// // }
// //
// // public void endListenforRegistrationInformation() {
// // playGame = true;
// // registrationActive = false;
// // listenForClients = false;
// // }
// //
// // public void endPlay() {
// // gameActive = false;
// // playGame = false;
// // registrationActive = false;
// // listenForClients = false;
// // }
//
// // }