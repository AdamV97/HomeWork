package zadatci;

import javax.swing.JOptionPane;

public class Zadatak1 {
	public static void main(String[] args) {
		
		//1.	U programu omoguæite unos dva broja, broj sati i minuta. 
		//Ispišite koliko taj broj sati i minuta iznosi u sekundama.

		double sati = Integer.parseInt(JOptionPane.showInputDialog("Broj sati"));
		double minute = Integer.parseInt(JOptionPane.showInputDialog("Broj minuta"));
		
		double sekunde1 = (sati * 3600);
		double sekunde2 = (minute * 60);
		
		double sekunde = (sekunde1 + sekunde2);
		System.out.print(sati);
		System.out.print(" sati");
		System.out.print(" i ");
		System.out.print(minute);
		System.out.print(" minuta");
		System.out.println(" èini ");
		System.out.print(sekunde);
		System.out.print(" sekundi");
		
	}

}
