
package Test;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JTextArea;


public class RunTest extends Frame implements WindowListener, ActionListener {
		JTextArea text = new JTextArea(5, 40);
		Button beginTest, sendInfo;

		public static void main(String[] args) {
			RunTest myWindow = new RunTest("Run Test");
			myWindow.setSize(500, 400);
			myWindow.setVisible(true);
		}

		public RunTest(String title) {

			super(title);
			setLayout(new FlowLayout());
			addWindowListener(this);
			final Runnable test = new Test(); 
			beginTest = new Button("Send IP");
			add(beginTest);
			add(text);
			beginTest.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					new Thread(test).start();
					System.out.println("Starting new test");
				}
			});
			
//			add(sendInfo);
//			sendInfo.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent arg0) {
//					
//				}
//			}
		}

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
