package zadatci;

import javax.swing.JOptionPane;

public class Zadatak2 {
	public static void main(String[] args) {
		
		//U programu omogu�ite unos dvije stranice pravokutnika i izra�unajte njegovu povr�inu i opseg.

		
		double prvaStranica = Integer.parseInt(JOptionPane.showInputDialog("Duljina prve stranice u cm"));
		double drugaStranica = Integer.parseInt(JOptionPane.showInputDialog("Duljina druge stranice u cm"));
		
		double povrsina = (prvaStranica * drugaStranica);
		double opseg = (2 * (prvaStranica + drugaStranica));
		
		System.out.print("Povr�ina pravokutnika iznosi ");
		System.out.print(povrsina);
		System.out.println(" cm");
		
		System.out.println(" ");
		
		System.out.print("Opseg pravokutnika iznosi ");
		System.out.print(opseg);
		System.out.print(" cm");
	
	}
	
	
	


}
