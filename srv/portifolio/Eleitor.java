package portifolio;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Atxy2k.CustomTextField.RestrictedTextField;

public class Eleitor extends JDialog {
	private static final long serialVersionUID = 1L;
	private JTextField txtIdade;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eleitor dialog = new Eleitor();
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
	public Eleitor() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("Verifica Status do Eleitor");
		setResizable(false);
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Eleitor.class.getResource("/img/eleitor_64.png")));
		setBounds(100, 100, 297, 200);
		getContentPane().setLayout(null);

		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(51, 14, 39, 15);
		getContentPane().add(lblIdade);

		txtIdade = new JTextField();
		txtIdade.setHorizontalAlignment(SwingConstants.CENTER);
		txtIdade.setBounds(120, 11, 114, 19);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);

		JButton btnVerifica = new JButton("");
		btnVerifica.setToolTipText("Verificar");
		btnVerifica.setIcon(new ImageIcon(Eleitor.class.getResource("/img/eleitor_64.png")));
		btnVerifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verifica();
			}
		});
		btnVerifica.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVerifica.setBounds(51, 40, 64, 64);
		getContentPane().add(btnVerifica);

		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Dialog", Font.BOLD, 12));
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setEditable(false);
		txtResultado.setBounds(48, 120, 184, 19);
		getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpar();
			}
		});
		btnLimpar.setIcon(new ImageIcon(Eleitor.class.getResource("/img/eraser.png")));
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.setBounds(166, 40, 64, 64);
		getContentPane().add(btnLimpar);
		
		// Uso da Biblioteca Atxy2k
				RestrictedTextField validar = new RestrictedTextField(txtIdade, "0123456789");
				validar.setLimit(2);

	} // Fim do Construtor

	void verifica() {
		// Validação
		if (txtIdade.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira a idade");
			txtIdade.requestFocus();
		} else {

			// Variáveis
			int idade;

			// Entrada
			idade = Integer.parseInt(txtIdade.getText());

			// Processamento e Saída
			if (idade < 16) {
				txtResultado.setText(String.valueOf("Voto proibido"));
				JOptionPane.showMessageDialog(null, "Voto proibido",
						JOptionPane.ERROR_MESSAGE);
			} else if (idade > 17 && idade < 71) {
				txtResultado.setText(String.valueOf("Voto obrigatório"));
				JOptionPane.showMessageDialog(null, "Voto obrigatório",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				txtResultado.setText(String.valueOf("Voto facultativo"));
				JOptionPane.showMessageDialog(null, "Voto facultativo",
						JOptionPane.QUESTION_MESSAGE);
			}
		}
	} // Fim do método verifica

	/** Método para Limpar **/
	void limpar() {
		txtIdade.setText(null);
		txtResultado.setText(null);
		txtIdade.requestFocus();
	} // Fim do método limpar
}// Fim
