package src;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ServRun extends Frame implements WindowListener, ActionListener {
	JTextArea text = new JTextArea(5, 40);
	Button beginReg, endReg;

	public static void main(String[] args) {
		ServRun myWindow = new ServRun("Quiz Show");
		myWindow.setSize(500, 400);
		myWindow.setVisible(true);
	}

	public ServRun(String title) {

		super(title);
		setLayout(new FlowLayout());
		addWindowListener(this);
		final RegistrationListenerMultiThreadedServer server = new RegistrationListenerMultiThreadedServer(
				ProtocolConstants.APP_LISTENING_PORT_NUMBER);
		beginReg = new Button("Begin Registration Period");
		add(beginReg);
		add(text);
		beginReg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				server.BeginReg();
				new Thread(server).start();
				System.out.println("Starting new server");
			}
		});

		endReg = new Button("End Registration Period");
		add(endReg);
		endReg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				server.stop();
				if (server.isStopped) {
					System.out.println("Stopping server");
				}
			}
		});
	}

//	public void actionPerformed(ActionEvent e) {
//		text.setText("Searching for Devices...");
//		RegistrationListenerMultiThreadedServer server = new RegistrationListenerMultiThreadedServer(
//				ProtocolConstants.APP_LISTENING_PORT_NUMBER);
//		server.BeginReg();
//		new Thread(server).start();
//		text.setText("I love cock!");
//		try {
//			Thread.sleep(20 * 1000);
//		} catch (InterruptedException i) {
//			i.printStackTrace();
//		}
//		text.setText("Stopping Server");
//		server.stop();
//	}

	public void windowClosing(WindowEvent e) {
		dispose();
		System.exit(0);
	}

	public void windowOpened(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}