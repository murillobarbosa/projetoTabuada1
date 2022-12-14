package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
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

		
		ImageIcon BILL = new ImageIcon(getClass().getResource("calculadora.png"));
		JLabel icon = new JLabel(BILL);
		icon.setBounds(11, 8, 30, 20);
		

		// Pegar o container para colocar componentes dentro dele
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDaTela);
		
	
		// Criar um botão
		JButton buttonCalcularTabuada = new JButton();
		buttonCalcularTabuada.setText("Calcular");
		buttonCalcularTabuada.setBounds(5, 250, 200, 35);
		buttonCalcularTabuada.setForeground(corDoBotao);

		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(210, 250, 200, 35);
		buttonLimpar.setForeground(corDoBotao);

		// Criar os componentes que serão colocados no container(painel)
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setBounds(50, 0, 210, 30);
		labelTabuada.setFont(new Font("Courier new", Font.BOLD, 32));
		labelTabuada.setForeground(new Color(0, 0, 0));

		JLabel labelTexto = new JLabel();
		labelTexto.setText("Com a tabuada 1.0 os seus problemas acabaram.");
		labelTexto.setBounds(25, 30, 600, 30);
		labelTexto.setFont(new Font("Courier new", Font.BOLD, 15));
		labelTexto.setForeground(new Color(0, 0, 0));

		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(60, 80, 200, 30);
		labelMultiplicando.setFont(fonteDosLabels);

		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(200, 80, 200, 30);

		JLabel labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Mínimo Multiplicador:");
		labelMinimoMultiplicador.setBounds(9, 125, 200, 30);
		labelMinimoMultiplicador.setFont(fonteDosLabels);

		JTextField textFieldMinimoMultiplicador = new JTextField();
		textFieldMinimoMultiplicador.setBounds(200, 125, 200, 30);

		JLabel labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Maximo Multiplicador:");
		labelMaximoMultiplicador.setBounds(9, 170, 200, 35);
		labelMaximoMultiplicador.setFont(fonteDosLabels);

		JTextField textFieldMaximoMultiplicador = new JTextField();
		textFieldMaximoMultiplicador.setBounds(200, 170, 200, 30);

		JLabel labelResultadoTabuada = new JLabel();
		labelResultadoTabuada.setText("RESULTADO:");
		labelResultadoTabuada.setBounds(29, 315, 200, 30);
		labelResultadoTabuada.setFont(fonteDosLabels);
		
		
		JList<String> lista = new JList<String>();
		
		JScrollPane scroll = new JScrollPane(lista);
		scroll.setBounds(29, 350, 350, 200);

		// Eventos De Click
		//Lista da tabuada
				JList<String> lista1 = new JList<String>();
				JScrollPane scroll1 = new JScrollPane(lista1);
				
				scroll1.setBounds(29, 350, 350, 200 );
				
				// Eventos de click
				buttonCalcularTabuada.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						Tabuada tabuada = new Tabuada();
						
						
						
						
						
						if (textFieldMaximoMultiplicador.getText().isEmpty() || textFieldMinimoMultiplicador.getText().isEmpty()
								|| textFieldMultiplicando.getText().isEmpty()) {

						JOptionPane.showMessageDialog(null, "Você esqueceu de digitar os valores. Por favor preencha as opções!","Aviso", JOptionPane.WARNING_MESSAGE);
						}else {
						 
						tabuada.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
						tabuada.minimoMultiplicador = Integer.parseInt(textFieldMinimoMultiplicador.getText());
						tabuada.maximoMultiplicador = Integer.parseInt(textFieldMaximoMultiplicador.getText());
						}
						
						if (tabuada.maximoMultiplicador <= tabuada.minimoMultiplicador) {
							JOptionPane.showMessageDialog(null, "Você colocou o Maximo multiplicador menor que o Minimo Multiplicador.Preencha corretamente! ","Aviso", JOptionPane.WARNING_MESSAGE);
							}else {
						String[] resultado = tabuada.getTabuada();
						lista1.setListData(resultado);
						
						scroll1.setVisible(true);
							}
						
						
					}
				});
				
				//Função para limpar as caixas de texto
				buttonLimpar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						String[] limpar = {" "};
						lista1.setListData(limpar);
						textFieldMultiplicando.setText("");
						textFieldMinimoMultiplicador.setText("");
						textFieldMaximoMultiplicador.setText("");
						
					}
				});
				
				//Função para impedir de digitar letras
				
				
				textFieldMaximoMultiplicador.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent e) {
						textFieldMaximoMultiplicador.setText(textFieldMaximoMultiplicador.getText().replaceAll("[^0-9]", ""));
						if (textFieldMaximoMultiplicador.getText().length() > 9) {
							
						}
						
					}
					
					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
				
				textFieldMinimoMultiplicador.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent e) {
						textFieldMinimoMultiplicador.setText(textFieldMinimoMultiplicador.getText().replaceAll("[^0-9]", ""));
						if (textFieldMinimoMultiplicador.getText().length() > 9) {
							
						}
						
						
					}
					
					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
				
				textFieldMultiplicando.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent e) {
						textFieldMultiplicando.setText(textFieldMultiplicando.getText().replaceAll("[^0-9]", ""));
						if (textFieldMultiplicando.getText().length() > 9) {
							
						}
						
						
					}
					
					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
				
				
				
				

				painel.add(buttonCalcularTabuada);
				painel.add(buttonLimpar);
				painel.add(labelTabuada);
				painel.add(labelTexto);
				painel.add(labelMultiplicando);
				painel.add(textFieldMultiplicando);
				painel.add(labelMinimoMultiplicador);
				painel.add(textFieldMinimoMultiplicador);
				painel.add(labelMaximoMultiplicador);
				painel.add(textFieldMaximoMultiplicador);
				painel.add(labelResultadoTabuada);
				painel.add(scroll1);
				painel.add(icon);
				
				tela.setVisible(true);
			}
		}
