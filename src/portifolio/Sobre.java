package portifolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		getContentPane().setBackground(Color.WHITE);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/sobre.png")));
		setTitle("Sobre");
		setModal(true);
		setBounds(100, 100, 450, 418);
		getContentPane().setLayout(null);

		JTextPane txtpnSobre = new JTextPane();
		txtpnSobre.setEditable(false);
		txtpnSobre.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtpnSobre.setText(
				"Ol\u00E1! Eu sou a Giovanna! \r\nTrabalho com Marketing e sou apaixonada por tecnologia.\r\nEstes s\u00E3o os meus primeiros passos em desenvolvimento de sistemas.\r\n\r\nHello! My name is Giovanna!\r\nI work with Marketing and I'm in love with technology.\r\nThese are my first steps in systems development.");
		txtpnSobre.setBounds(24, 52, 253, 305);
		getContentPane().add(txtpnSobre);

		JLabel lblSobALicena = new JLabel("Sob a licen\u00E7a MIT");
		lblSobALicena.setBounds(295, 207, 131, 15);
		getContentPane().add(lblSobALicena);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Sobre.class.getResource("/img/mit.png")));
		lblLogo.setBounds(295, 57, 131, 128);
		getContentPane().add(lblLogo);

		JLabel lblSobre = new JLabel("Sobre");
		lblSobre.setFont(new Font("Dialog", Font.BOLD, 24));
		lblSobre.setBounds(182, 12, 84, 28);
		getContentPane().add(lblSobre);

		JLabel lblVersao = new JLabel("Vers\u00E3o 5.0");
		lblVersao.setBounds(315, 234, 91, 15);
		getContentPane().add(lblVersao);

	}
}
