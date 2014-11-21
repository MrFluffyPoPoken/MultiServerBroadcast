package src;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class RegistrationListenerMultiThreadedServer implements Runnable {

	protected int serverPort;
	protected ServerSocket serverSocket = null;
	protected boolean isStopped = true;
	protected Thread runningThread = null;

	public RegistrationListenerMultiThreadedServer(int port) {
		serverPort = port;
	}

	public void run() {
		synchronized (this) {
			this.runningThread = Thread.currentThread();
		}
		openServerSocket();
		while (!isStopped()) {
			Socket clientSocket = null;
			try {
				clientSocket = this.serverSocket.accept();
				String clientIP = clientSocket.getRemoteSocketAddress().toString();
				System.out.println("Accepted socket connection at: " + clientIP + "  On port: " + serverSocket.getLocalPort());
			} catch (IOException e) {
				if (isStopped()) {
					System.out.println("Server Stopped.");
					return;
				}
				throw new RuntimeException("Error accepting client connection", e);
			}
			new Thread(new RegistrationListenerWorkerRunnable(clientSocket, "Multithreaded Server")).start();
			System.out.println("Spun off a new Thread.");
		}
		System.out.println("Server Stopped.");
	}

	private synchronized boolean isStopped() {
		return this.isStopped;
	}

	public synchronized void stop() {
		this.isStopped = true;
		try {
			this.serverSocket.close();
		} catch (IOException e) {
			throw new RuntimeException("Error closing server", e);
		}
	}

	private void openServerSocket() {
		try {
			serverSocket = new ServerSocket(serverPort);
			System.out.println("Opened a new socket");
		} catch (IOException e) {
			throw new RuntimeException("Cannot open port " + serverPort, e);
		}
	}

	public void BeginReg() {

		isStopped = false;
	}

}