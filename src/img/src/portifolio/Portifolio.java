package portifolio;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Portifolio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portifolio frame = new Portifolio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Portifolio() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				/******************************
				 **** EVENTO ATIVAR JANELA ****
				 ******************************/
				Date data = new Date();
				DateFormat formatador = DateFormat.getDateInstance(DateFormat.DATE_FIELD);
				lblStatus.setText(formatador.format(data));
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(Portifolio.class.getResource("/img/giovanna.png")));
		setForeground(new Color(0, 128, 0));
		setResizable(false);
		setTitle("Portif\u00F3lio de Projetos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 353);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnImc = new JButton("");
		btnImc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnImc.setIcon(new ImageIcon(Portifolio.class.getResource("/img/balan\u00E7a.png")));
		btnImc.setToolTipText("C\u00E1lculo do IMC");
		btnImc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// as linhas abaixo fazem o link com o formulário IMC
				IMC imc = new IMC();
				imc.setVisible(true);
			}
		});
		btnImc.setBounds(277, 98, 64, 64);
		contentPane.add(btnImc);

		JButton btnSobre = new JButton("");
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setIcon(new ImageIcon(Portifolio.class.getResource("/img/sobre.png")));
		btnSobre.setToolTipText("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// as linhas abaixo fazem o link com o formulário Sobre
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnSobre.setBounds(24, 12, 64, 64);
		contentPane.add(btnSobre);

		JButton btnBoletim = new JButton("");
		btnBoletim.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBoletim.setToolTipText("Calculadora da M\u00E9dia");
		btnBoletim.setIcon(new ImageIcon(Portifolio.class.getResource("/img/boletim-64.png")));
		btnBoletim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Boletim boletim = new Boletim();
				boletim.setVisible(true);
			}
		});
		btnBoletim.setBounds(108, 12, 64, 64);
		contentPane.add(btnBoletim);

		JButton btnTemperatura = new JButton("");
		btnTemperatura.setSelectedIcon(new ImageIcon(Portifolio.class.getResource("/img/temperatura.png")));
		btnTemperatura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTemperatura.setToolTipText("Converte para Celsius");
		btnTemperatura.setIcon(new ImageIcon(Portifolio.class.getResource("/img/temperatura.png")));
		btnTemperatura.setFont(new Font("Dialog", Font.BOLD, 12));
		btnTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Temperatura temperatura = new Temperatura();
				temperatura.setVisible(true);
			}
		});
		btnTemperatura.setBounds(108, 178, 64, 64);
		contentPane.add(btnTemperatura);

		JButton btnPorcentagem = new JButton("");
		btnPorcentagem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPorcentagem.setIcon(new ImageIcon(Portifolio.class.getResource("/img/porcentagem-64.png")));
		btnPorcentagem.setToolTipText("C\u00E1lculo da Porcentagem");
		btnPorcentagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Porcentagem porcentagem = new Porcentagem();
				porcentagem.setVisible(true);
			}
		});
		btnPorcentagem.setFont(new Font("Dialog", Font.BOLD, 12));
		btnPorcentagem.setBounds(24, 178, 64, 64);
		contentPane.add(btnPorcentagem);
		
		JButton btnServico = new JButton("");
		btnServico.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnServico.setIcon(new ImageIcon(Portifolio.class.getResource("/img/horaservico.png")));
		btnServico.setToolTipText("C\u00E1lculo da Hora de Trabalho");
		btnServico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HoraServico horaservico = new HoraServico();
				horaservico.setVisible(true);
			}
		});
		btnServico.setBounds(192, 98, 64, 64);
		contentPane.add(btnServico);
		
		JButton btnCombustivel = new JButton("");
		btnCombustivel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCombustivel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Combustivel combustivel = new Combustivel();
				combustivel.setVisible(true);
			}
		});
		btnCombustivel.setToolTipText("Gasolina ou Etanol ?");
		btnCombustivel.setIcon(new ImageIcon(Portifolio.class.getResource("/img/combustivel-64.png")));
		btnCombustivel.setBounds(277, 12, 64, 64);
		contentPane.add(btnCombustivel);
		
		JButton btnEleicao = new JButton("");
		btnEleicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Eleitor eleitor = new Eleitor();
				eleitor.setVisible(true);
			}
		});
		btnEleicao.setToolTipText("Elei\u00E7\u00E3o");
		btnEleicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEleicao.setIcon(new ImageIcon(Portifolio.class.getResource("/img/eleitor_64.png")));
		btnEleicao.setBounds(108, 98, 64, 64);
		contentPane.add(btnEleicao);
		
		JButton btnDado = new JButton("");
		btnDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dado dado = new Dado();
				dado.setVisible(true);
			}
		});
		btnDado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDado.setToolTipText("Dado");
		btnDado.setIcon(new ImageIcon(Portifolio.class.getResource("/img/dado-64.png")));
		btnDado.setBounds(24, 98, 64, 64);
		contentPane.add(btnDado);
		
		JButton btnCep = new JButton("");
		btnCep.setIcon(new ImageIcon(Portifolio.class.getResource("/img/cep-64.png")));
		btnCep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cep cep = new Cep();
				cep.setVisible(true);
			}
		});
		btnCep.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCep.setToolTipText("Busca CEP");
		btnCep.setBounds(192, 12, 64, 64);
		contentPane.add(btnCep);
		
		JButton btnCarta = new JButton("");
		btnCarta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Carta carta = new Carta();
				carta.setVisible(true);
			}
		});
		btnCarta.setIcon(new ImageIcon(Portifolio.class.getResource("/img/carta.png")));
		btnCarta.setBounds(192, 178, 64, 64);
		contentPane.add(btnCarta);
		
		panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 274, 361, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblStatus = new JLabel("");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblStatus.setBackground(new Color(255, 255, 255));
		lblStatus.setForeground(new Color(255, 255, 255));
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setBounds(10, 11, 341, 18);
		panel.add(lblStatus);
		
		JButton btnMapa = new JButton("");
		btnMapa.setIcon(new ImageIcon(Portifolio.class.getResource("/img/sign.png")));
		btnMapa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mapa mapa = new Mapa();
				mapa.setVisible(true);
			}
		});
		btnMapa.setBounds(277, 178, 64, 64);
		contentPane.add(btnMapa);
	} // fim do construtor
}
