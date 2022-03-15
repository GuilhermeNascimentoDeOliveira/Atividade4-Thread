package view;

import javax.swing.JOptionPane; 

import controller.ati4;

public class ex4 {

	public static void main(String[] args) {
		double percurso = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do percurso: "));
		
		for(int idfrog = 0; idfrog < 5; idfrog++) {
				ati4 m = new ati4(idfrog, percurso);
				m.start();
			}
			
				
		
		}

	}
