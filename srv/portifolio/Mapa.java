package portifolio;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

@SuppressWarnings("unused")
public class Mapa extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtDia;
	private JTextField txtMes;
	private JLabel lblSigno;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Mapa dialog = new Mapa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Mapa() {
		setTitle("Mapa Astral");
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Mapa.class.getResource("/img/signos.png")));
		setResizable(false);
		setBounds(100, 100, 375, 310);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Dia");
		lblNewLabel.setBounds(14, 44, 46, 14);
		contentPanel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("M\u00EAs");
		lblNewLabel_1.setBounds(14, 86, 46, 14);
		contentPanel.add(lblNewLabel_1);

		txtDia = new JTextField();
		txtDia.setBounds(57, 41, 86, 20);
		contentPanel.add(txtDia);
		txtDia.setColumns(10);

		txtMes = new JTextField();
		txtMes.setBounds(57, 83, 86, 20);
		contentPanel.add(txtMes);
		txtMes.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Mapa.class.getResource("/img/descubra.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				descobrir();
			}
		});
		btnNewButton.setBounds(24, 143, 64, 64);
		contentPanel.add(btnNewButton);

		lblSigno = new JLabel("");
		lblSigno.setIcon(new ImageIcon(Mapa.class.getResource("/img/signos.png")));
		lblSigno.setBounds(189, 11, 160, 250);
		contentPanel.add(lblSigno);

		// Restrição dia
		RestrictedTextField dia = new RestrictedTextField(txtDia,
				"1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31");
		dia.setLimit(2);

		RestrictedTextField mes = new RestrictedTextField(txtMes, "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12");

		btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setIcon(new ImageIcon(Mapa.class.getResource("/img/borracha-64.png")));
		btnLimpar.setBounds(100, 143, 64, 64);
		contentPanel.add(btnLimpar);
		mes.setLimit(2);

	} // Fim do método

	void descobrir() {

		// Validação
		if (txtDia.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o dia");
			txtDia.requestFocus();
		} else if (txtMes.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o mês");
			txtMes.requestFocus();
		} else {

			// Variáveis
			int dia, mes;

			// Entrada
			dia = Integer.parseInt(txtDia.getText());
			mes = Integer.parseInt(txtMes.getText());

			// Processamento e Saída
			if (dia >= 21 && mes == 3 || dia <= 20 && mes == 4) {
				lblSigno.setIcon(new ImageIcon(Mapa.class.getResource("/img/aries.png")));
			} else if (dia >= 21 && mes == 4 || dia <= 20 && mes == 5) {
				lblSigno.setIcon(new ImageIcon(Mapa.class.getResource("/img/touro.png")));
			} else if (dia >= 21 && mes == 5 || dia <= 20 && mes == 6) {
				lblSigno.setIcon(new ImageIcon(Mapa.class.getResource("/img/gemeos.png")));
			} else if (dia >= 21 && mes == 6 || dia <= 22 && mes == 7) {
				lblSigno.setIcon(new ImageIcon(Mapa.class.getResource("/img/cancer.png")));
			} else if (dia >= 23 && mes == 7 || dia <= 22 && mes == 8) {
				lblSigno.setIcon(new ImageIcon(Mapa.class.getResource("/img/leao.png")));
			} else if (dia >= 23 && mes == 8 || dia <= 22 && mes == 9) {
				lblSigno.setIcon(new ImageIcon(Mapa.class.getResource("/img/virgem.png")));
			} else if (dia >= 23 && mes == 9 || dia <= 22 && mes == 10) {
				lblSigno.setIcon(new ImageIcon(Mapa.class.getResource("/img/libra.png")));
			} else if (dia >= 23 && mes == 10 || dia <= 21 && mes == 11) {
				lblSigno.setIcon(new ImageIcon(Mapa.class.getResource("/img/escorpiao.png")));
			} else if (dia >= 22 && mes == 11 || dia <= 22 && mes == 12) {
				lblSigno.setIcon(new ImageIcon(Mapa.class.getResource("/img/sagitario.png")));
			} else if (dia >= 22 && mes == 12 || dia <= 19 && mes == 1) {
				lblSigno.setIcon(new ImageIcon(Mapa.class.getResource("/img/capricornio.png")));
			} else if (dia >= 20 && mes == 1 || dia <= 18 && mes == 2) {
				lblSigno.setIcon(new ImageIcon(Mapa.class.getResource("/img/aquario.png")));
			} else if (dia >= 19 && mes == 2 || dia <= 20 && mes == 3) {
				lblSigno.setIcon(new ImageIcon(Mapa.class.getResource("/img/peixes.png")));
			} else {
				lblSigno.setIcon(new ImageIcon(Mapa.class.getResource("/img/signos")));
			}
		}

	} // Fim do método Signo

	void limpar() {

		// Método Limpar
		txtDia.setText(null);
		txtMes.setText(null);
		lblSigno.setIcon(new ImageIcon(Mapa.class.getResource("/img/signos.png")));
		txtDia.requestFocus();
	}
}
// Fim do construtor
