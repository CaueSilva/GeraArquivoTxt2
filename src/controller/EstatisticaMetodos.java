package controller;

import model.Estatistica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class EstatisticaMetodos {

	public Estatistica[] EscreveArquivo(Estatistica[] estatistica) throws IOException {
		String fileName = "Estatística.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
		for (int i = 0; i < estatistica.length; i++) {
			estatistica[i] = new Estatistica();
		}
		for (int i = 0; i < estatistica.length; i++) {
			estatistica[i].nomeCidade = JOptionPane.showInputDialog("Digite o nome da cidade.");
			writer.write(estatistica[i].nomeCidade);
			writer.newLine();
			estatistica[i].ufCidade = JOptionPane.showInputDialog("Digite a UF da cidade.");
			writer.write(estatistica[i].ufCidade);
			writer.newLine();
			estatistica[i].populacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a população da cidade."));
			writer.write(Integer.toString(estatistica[i].populacao));
			writer.newLine();
			estatistica[i].acidentes = Integer
					.parseInt(JOptionPane.showInputDialog("Digite o número de acidentes da cidade."));
			writer.write(Integer.toString(estatistica[i].acidentes));
			writer.newLine();
		}
		writer.close();
		return estatistica;
	}

	public Estatistica[] LeArquivo(Estatistica[] estatistica) throws IOException {
		String fileName = "Estatística.txt";
		BufferedReader read = new BufferedReader(new FileReader(fileName));
		for (int i = 0; i < estatistica.length; i++) {
			estatistica[i] = new Estatistica();
		}
		for (int i = 0; i < estatistica.length; i++) {
			estatistica[i].nomeCidade = read.readLine();
			estatistica[i].ufCidade = read.readLine();
			estatistica[i].populacao = Integer.parseInt(read.readLine());
			estatistica[i].acidentes = Integer.parseInt(read.readLine());
			JOptionPane.showMessageDialog(null,
					"Cidade: " + estatistica[i].nomeCidade + " \n" + "UF: " + estatistica[i].ufCidade + " \n"
							+ "População: " + estatistica[i].populacao + " \n" + "Número de Acidentes: "
							+ estatistica[i].acidentes);
		}
		read.close();
		return estatistica;
	}

}
