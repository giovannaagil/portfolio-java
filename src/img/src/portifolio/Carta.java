package portifolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Carta extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblFace;
	private JLabel lblNipeCentro;
	private JLabel lblNipe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carta dialog = new Carta();
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
	public Carta() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Carta.class.getResource("/img/carta.png")));
		setTitle("Cartas");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 450, 411);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(171, 24, 220, 323);
		getContentPane().add(panel);
		panel.setLayout(null);

		lblFace = new JLabel("");
		lblFace.setHorizontalAlignment(SwingConstants.CENTER);
		lblFace.setFont(new Font("Arial", Font.BOLD, 22));
		lblFace.setBounds(10, 11, 28, 20);
		panel.add(lblFace);

		lblNipe = new JLabel("");
		lblNipe.setHorizontalAlignment(SwingConstants.CENTER);
		lblNipe.setFont(new Font("Arial", Font.BOLD, 32));
		lblNipe.setBounds(10, 35, 28, 29);
		panel.add(lblNipe);

		lblNipeCentro = new JLabel("");
		lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/jocker.PNG")));
		lblNipeCentro.setFont(new Font("Arial", Font.PLAIN, 90));
		lblNipeCentro.setBounds(39, 43, 160, 250);
		panel.add(lblNipeCentro);

		JButton btnCarta = new JButton("");
		btnCarta.setIcon(new ImageIcon(Carta.class.getResource("/img/buscar-64.png")));
		btnCarta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortearCarta();
			}
		});
		btnCarta.setBounds(42, 96, 64, 64);
		getContentPane().add(btnCarta);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Limpar ();
			}
		});
		btnNewButton.setIcon(new ImageIcon(Carta.class.getResource("/img/borracha-64.png")));
		btnNewButton.setBounds(42, 192, 64, 64);
		getContentPane().add(btnNewButton);

	} // Fim do construtor

	void sortearCarta() {
		String[] nipes = { "♥", "♦", "♣", "♠"};
		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "C" };

		Random carta = new Random();

		int indiceFace = carta.nextInt(faces.length);
		int indiceNipe = carta.nextInt(nipes.length);
		// System.out.println(faces[14] + nipes[4]);
		// Exibir a carta
		lblFace.setText(faces[indiceFace]);
		lblNipe.setText(nipes[indiceNipe]);
		lblNipeCentro.setText(nipes[indiceNipe]);

		// Trocar a cor
		if (indiceNipe == 0 || indiceNipe == 1) {
			lblFace.setForeground(Color.RED);
			lblNipe.setForeground(Color.RED);
			lblNipeCentro.setForeground(Color.RED);
		} else {
			lblFace.setForeground(Color.BLACK);
			lblNipe.setForeground(Color.BLACK);
			lblNipeCentro.setForeground(Color.BLACK);

		}

		// Exibir imagens Valete, Damas, Reis e Coringa
		if (indiceFace == 10) {
			lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/valete.png")));
		} else if (indiceFace == 11) {
			lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/dama.png")));
		} else if (indiceFace == 12) {
			lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/rei.png")));
		} else if (indiceFace == 13) {
			lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/jocker.png")));
		} else {
			lblNipeCentro.setIcon(null);
			lblNipeCentro.setText("  " + nipes[indiceNipe]);
		}		

	} // Fim do Método Sortear Carta
	
	void Limpar() {
		
		// Método Limpar
		lblFace.setIcon(new ImageIcon(Carta.class.getResource("/img/jocker.png")));
		lblNipe.setIcon(new ImageIcon(Carta.class.getResource("/img/jocker.png")));
		lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/jocker.png")));
	}
	
} // Fim do código

