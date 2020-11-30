package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CandidatoGUI extends JFrame {
	
	private JButton btnEnviar;
	private JButton btnLimpar;
	private JLabel lblTitle;
	private JLabel lblNome;
	private JLabel lblCpf;
	private JLabel lblCargo;
	private JTextField textCpf;
	private JTextField textNome;
	
	public CandidatoGUI() {
		setTitle("CONCURSO - INSCRI\u00C7\\u00C3O");
		getContentPane().setBackground(new Color(230, 230, 250));
		setBounds(100, 100, 450, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		Ouvinte ouvinte = new Ouvinte();
		
		lblTitle = new JLabel("INSCRICAO DE CANDIDATO");
		lblTitle.setFont(new Font("Gotham", Font.BOLD, 15));
		lblTitle.setBounds(105, 32, 230, 31);
		getContentPane().add(lblTitle);
		
		lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Gotham", Font.BOLD, 14));
		lblNome.setBounds(105, 99, 45, 31);
		getContentPane().add(lblNome);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Gotham", Font.BOLD, 14));
		lblCpf.setBounds(105, 183, 45, 31);
		getContentPane().add(lblCpf);
		
		lblCargo = new JLabel("CARGO");
		lblCargo.setFont(new Font("Gotham", Font.BOLD, 14));
		lblCargo.setBounds(105, 294, 54, 31);
		getContentPane().add(lblCargo);
		
		textCpf = new JTextField();
		textCpf.setBounds(105, 225, 230, 31);
		getContentPane().add(textCpf);
		textCpf.setColumns(10);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(105, 141, 230, 31);
		getContentPane().add(textNome);
	
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Professor Ensino Fundamental");
		rdbtnNewRadioButton.setBackground(new Color(230, 230, 250));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBounds(105, 332, 230, 23);
		getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnProfessorEnsinoFundamental = new JRadioButton("Professor Ensino M\u00E9dio");
		rdbtnProfessorEnsinoFundamental.setBackground(new Color(230, 230, 250));
		rdbtnProfessorEnsinoFundamental.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnProfessorEnsinoFundamental.setBounds(105, 358, 192, 23);
		getContentPane().add(rdbtnProfessorEnsinoFundamental);

		JRadioButton rdbtnProfessorEnsinoSuperior = new JRadioButton("Professor Ensino Superior");
		rdbtnProfessorEnsinoSuperior.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnProfessorEnsinoSuperior.setBackground(new Color(230, 230, 250));
		rdbtnProfessorEnsinoSuperior.setBounds(105, 384, 192, 23);
		getContentPane().add(rdbtnProfessorEnsinoSuperior);
		
		btnLimpar = new JButton("LIMPAR");
		btnLimpar.setFont(new Font("Gotham", Font.BOLD, 14));
		btnLimpar.setBounds(105, 454, 89, 27);
		btnLimpar.addActionListener(ouvinte);
		getContentPane().add(btnLimpar);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setFont(new Font("Gotham", Font.BOLD, 14));
		btnEnviar.setBounds(246, 454, 89, 27);
		btnEnviar.addActionListener(ouvinte);
		getContentPane().add(btnEnviar);
		
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

	}
	
	public void limpar() {
		textNome.setText("");
		textCpf.setText("");
	}
	
	public class Ouvinte implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnLimpar) {
				limpar();
			} else {
				
				if(e.getSource()==btnEnviar) {
					String nome = textNome.getText();
					String cpf = textCpf.getText();
					
					if((nome.equals("")) || (cpf.equals(""))) {
						JOptionPane.showMessageDialog(getContentPane(), "Todos os campos devem ser preenchidos", "Atenção!", 1, null);
						
					} else {
						JOptionPane.showMessageDialog(getContentPane(), "Usuário cadastrado com sucesso", "Bem-vindo!", 1, null);
						
					}
				}
			}
		}
	}	
}