package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {

	public String titulo;
	public int altura;
	public int largura;
	public Color corDeFundoDaTela;
	public Font fonteDosLabels;
	public Color corDoTextoDoBotao;
	public Color corDoBotao;

	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		// Pegar o container para colocar componentes dentro dele
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDaTela);
		
		
		
		// Criar os componentes que serão colocados no container(painel)
				JLabel labelTabuada = new JLabel();
				labelTabuada.setText("Tabuada 1.0");
				labelTabuada.setBounds(30, 10, 300, 30);
				labelTabuada.setFont(new Font("Courier new", Font.BOLD, 32));
				labelTabuada.setForeground(new Color(113, 32, 61));
				
				JLabel labelMultiplicando = new JLabel();
				labelMultiplicando.setText("Multiplicando:");
				labelMultiplicando.setBounds(60, 80, 200, 30);
				labelMultiplicando.setFont(fonteDosLabels);
				
				JTextField textFieldMultiplicando = new JTextField();
				textFieldMultiplicando.setBounds(200, 80, 200, 30);
				
				JLabel labelMinimoMultiplicador = new JLabel();
				labelMinimoMultiplicador.setText("Mínimo Multiplicador");
				labelMinimoMultiplicador.setBounds(200, 100, 200, 30);
				labelMinimoMultiplicador.setFont(fonteDosLabels);

				JTextField textFieldMinimoMultiplicador = new JTextField();
				textFieldMinimoMultiplicador.setBounds(200, 130, 200, 30);
				
				JLabel labelMaximoMultiplicador = new JLabel();
				labelMaximoMultiplicador.setText("Maximo Multiplicador");
				labelMaximoMultiplicador.setBounds(220, 160, 200, 30);
				labelMaximoMultiplicador.setFont(fonteDosLabels);

				JTextField textFieldMaximoMultiplicador = new JTextField();
				textFieldMaximoMultiplicador.setBounds(200, 190, 200, 30);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				painel.add(labelTabuada);
				painel.add(labelMultiplicando);
				painel.add(textFieldMultiplicando);
				painel.add(labelMinimoMultiplicador);
				painel.add(textFieldMinimoMultiplicador);
				painel.add(labelMaximoMultiplicador);
				painel.add(textFieldMaximoMultiplicador);
				tela.setVisible(true);
	}
}
