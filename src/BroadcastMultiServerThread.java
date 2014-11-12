import java.net.*;
import java.nio.charset.StandardCharsets;
import java.io.*;

import Protocol.RegistrationMessageFromPhoneClass.*;

public class BroadcastMultiServerThread extends Thread {
	private Socket socket = null;
	private boolean registrationActive, listenForClients, playGame, gameActive;
	Player player;

	public BroadcastMultiServerThread(Socket socket) {
		super("BroadcastMultiServerThread");
		this.socket = socket;
		registrationActive = listenForClients = playGame = gameActive = false;
		player = new Player();
	}

	public void run() {
		String playerIP = "";

		listenForClients = true;
		gameActive = true;
		while (gameActive) {
			while (listenForClients) {
				try (PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
						BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {

					String inputLine;

					while ((inputLine = in.readLine()) != null) {
						inputLine = in.readLine();
						if (inputLine != null) {
							playerIP = inputLine;
							System.out.println("Player IP is: " + playerIP);
							player.setIPAddress(playerIP);
						}
					}
					System.out.println("Successfully contacted device");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			while (registrationActive) {
				try (PrintWriter out = new PrintWriter(socket.getOutputStream(), true);) {
					String outputLine = ProtocolConstants.REGISTER_START;
					out.println(outputLine);
					System.out.println("Sent registration message");
					try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {
						String message;
						while ((message = in.readLine()) != null) {
							message = in.readLine();
							if (message != null) {
								InputStream stream = new ByteArrayInputStream(message.getBytes(StandardCharsets.UTF_8));
								player.setTeamName(receiveTeamInfo(stream).getTeamName());
								player.setTeamColor(receiveTeamInfo(stream).getColorHex());
								System.out.println("Player Name is: " + player.getTeamName());
								System.out.println("Player Color is: " + player.getTeamColor());
								out.println("Successfully registered");
							}
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					out.println(ProtocolConstants.REGISTER_END);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			while (playGame) {
				try (PrintWriter out = new PrintWriter(socket.getOutputStream(), true);) {
					String outputLine = ProtocolConstants.QUESTION_START;
					out.println(outputLine);
					System.out.println("Sent start signal");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		try {
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println(ProtocolConstants.GAME_END);
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Parse input stream to get message.
	 * 
	 * Usage: message.getTeamName() or message.getColorHex();
	 * 
	 * @param in
	 * @return message contains team name and color.
	 * @throws IOException
	 */
	private RegistrationMessageFromPhone receiveTeamInfo(InputStream in) throws IOException {
		RegistrationMessageFromPhone message = RegistrationMessageFromPhone.parseFrom(in);
		return message;
	}

	public void endListeningForClientsAndStartRegistration() {
		registrationActive = true;
		listenForClients = false;
		playGame = false;
	}

	public void endListenforRegistrationInformation() {
		playGame = true;
		registrationActive = false;
		listenForClients = false;
	}

	public void endPlay() {
		gameActive = false;
		playGame = false;
		registrationActive = false;
		listenForClients = false;
	}

}