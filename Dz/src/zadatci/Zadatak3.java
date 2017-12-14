package zadatci;

import javax.swing.JOptionPane;

public class Zadatak3 {
	
	public static void main(String[] args) {
		
		//3. U programu omoguæite unos broja sekundi i ispišite odgovarajuæe vrijeme u satima, minutama i sekundama.
		
		int sekunde = Integer.parseInt(JOptionPane.showInputDialog("Broj sekundi"));
		
		int Sati = sekunde / 3600;
		int Minute = (sekunde % 3600) / 60;
		int Sekunde = sekunde % 60;

		
		System.out.print(Sati);
		System.out.println(" Sati");
		System.out.print(Minute);
		System.out.println(" Minute");
		System.out.print(Sekunde);
		System.out.println(" Sekunde");
	}

}
