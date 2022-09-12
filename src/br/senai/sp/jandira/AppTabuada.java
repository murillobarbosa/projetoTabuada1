package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Tabuada;
import java.awt.Color;
import java.awt.Font;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.altura = 750;
		tela.largura = 450;
		tela.corDeFundoDaTela = new Color(150, 37, 150);
		tela.fonteDosLabels = new Font("Cooper Black", Font.ITALIC, 16);
		tela.corDoTextoDoBotao = new Color(0, 200, 80);
		tela.corDoBotao = new Color(150, 37, 150);
		tela.criarTela();
		
		Tabuada tabuada = new Tabuada();
		tabuada.multiplicando = 2;
		tabuada.minimoMultiplicador = 8;
		tabuada.maximoMultiplicador = 14;
		
		String[] resultado = tabuada.getTabuada();
		
		int contador = 0;
		while(contador < resultado.length) {
			System.out.println(resultado[contador]);
			contador++;
		}

	}

}
