package ga.mmbh.cfgs.ficheros.views;

import javax.swing.JFrame;

public class ForgotPasswordView {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public ForgotPasswordView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
