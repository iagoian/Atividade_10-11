package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JRadioButton;

private JPanel contentPane;
private JTextField txtTtututtu;
private JButton btnNewButton;
private JTextField textField;
private JTextField textField_1;

	public class CandidatoGUI extends JFrame {
		private JTextField txtInscricaoDeCandidato;
		private JTextField textField;
		public CandidatoGUI() {
			setTitle("CONCURSO - INSCRI\u00C7\u00C3O");
			getContentPane().setBackground(new Color(230, 230, 250));
			getContentPane().setLayout(null);
			
			txtInscricaoDeCandidato = new JTextField();
			txtInscricaoDeCandidato.setFont(new Font("Gotham", Font.BOLD, 15));
			txtInscricaoDeCandidato.setBounds(105, 131, 230, 31);
			getContentPane().add(txtInscricaoDeCandidato);
			txtInscricaoDeCandidato.setColumns(10);
			
			JTextPane txtpnInscricaoDeCandidato = new JTextPane();
			txtpnInscricaoDeCandidato.setBackground(new Color(230, 230, 250));
			txtpnInscricaoDeCandidato.setFont(new Font("Gotham", Font.BOLD, 15));
			txtpnInscricaoDeCandidato.setText("INSCRICAO DE CANDIDATO");
			txtpnInscricaoDeCandidato.setBounds(105, 39, 230, 20);
			getContentPane().add(txtpnInscricaoDeCandidato);
			
			JButton btnNewButton = new JButton("ENVIAR");
			btnNewButton.setFont(new Font("Gotham", Font.BOLD, 14));
			btnNewButton.setBounds(246, 454, 89, 27);
			getContentPane().add(btnNewButton);
			
			JTextPane txtpnNome = new JTextPane();
			txtpnNome.setBackground(new Color(230, 230, 250));
			txtpnNome.setText("NOME");
			txtpnNome.setFont(new Font("Gotham", Font.BOLD, 15));
			txtpnNome.setBounds(106, 100, 55, 20);
			getContentPane().add(txtpnNome);
			
			textField = new JTextField();
			textField.setFont(new Font("Gotham", Font.BOLD, 15));
			textField.setColumns(10);
			textField.setBounds(105, 217, 230, 31);
			getContentPane().add(textField);
			
			JTextPane txtpnCpf = new JTextPane();
			txtpnCpf.setText("CPF");
			txtpnCpf.setFont(new Font("Gotham", Font.BOLD, 15));
			txtpnCpf.setBackground(new Color(230, 230, 250));
			txtpnCpf.setBounds(105, 186, 45, 20);
			getContentPane().add(txtpnCpf);
			
			JTextPane txtpnCargo = new JTextPane();
			txtpnCargo.setText("CARGO");
			txtpnCargo.setFont(new Font("Gotham", Font.BOLD, 15));
			txtpnCargo.setBackground(new Color(230, 230, 250));
			txtpnCargo.setBounds(105, 276, 66, 20);
			getContentPane().add(txtpnCargo);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("Professor Ensino Fundamental");
			rdbtnNewRadioButton.setBackground(new Color(230, 230, 250));
			rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
			rdbtnNewRadioButton.setBounds(105, 303, 230, 23);
			getContentPane().add(rdbtnNewRadioButton);
			
			JRadioButton rdbtnProfessorEnsinoFundamental = new JRadioButton("Professor Ensino M\u00E9dio");
			rdbtnProfessorEnsinoFundamental.setBackground(new Color(230, 230, 250));
			rdbtnProfessorEnsinoFundamental.setFont(new Font("Tahoma", Font.PLAIN, 13));
			rdbtnProfessorEnsinoFundamental.setBounds(105, 339, 192, 23);
			getContentPane().add(rdbtnProfessorEnsinoFundamental);
			
			JRadioButton rdbtnProfessorEnsinoSuperior = new JRadioButton("Professor Ensino Superior");
			rdbtnProfessorEnsinoSuperior.setFont(new Font("Tahoma", Font.PLAIN, 13));
			rdbtnProfessorEnsinoSuperior.setBackground(new Color(230, 230, 250));
			rdbtnProfessorEnsinoSuperior.setBounds(105, 377, 192, 23);
			getContentPane().add(rdbtnProfessorEnsinoSuperior);
			
			JButton btnLimpar = new JButton("LIMPAR");
			btnLimpar.setFont(new Font("Gotham", Font.BOLD, 14));
			btnLimpar.setBounds(105, 454, 89, 27);
			getContentPane().add(btnLimpar);
		}
}
