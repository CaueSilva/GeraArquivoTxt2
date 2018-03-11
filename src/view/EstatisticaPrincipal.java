package view;

import java.io.IOException;
import model.Estatistica;
import controller.EstatisticaMetodos;

import javax.swing.JOptionPane;

public class EstatisticaPrincipal {

	public static void main(String args[]) throws IOException {
		Estatistica[] estatistica = new Estatistica[3];
		EstatisticaMetodos e = new EstatisticaMetodos();
		int opc = 0;
		while (opc != 9) {
			opc = Integer
					.parseInt(JOptionPane.showInputDialog(" 1 - Gera Arquivo \n" + " 2 - Lê Arquivo \n" + " 9 - Fim"));
			switch (opc) {
			case 1:
				e.EscreveArquivo(estatistica);
				break;
			case 2:
				e.LeArquivo(estatistica);
				break;
			case 9:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma opção válida.");
			}
		}
	}

}
