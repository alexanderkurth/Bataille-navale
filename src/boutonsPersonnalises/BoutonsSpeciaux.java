package boutonsPersonnalises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;

import bateauxBatailleNavale.Bateau;
import bateauxBatailleNavale.BateauPorteAvion;

public class BoutonsSpeciaux extends JRadioButton{
	
	private String nom;
	private int id;

	public BoutonsSpeciaux(String nom, int id) { 
		this.nom = nom;
		this.id = id;
		
		switch(id) {
		case 1: 
			this.setText("Porte Avion");
			break;
		
		case 2: 
			this.setText("Croiseur");
			break;
			
		case 3: 
			this.setText("Sous Marin");
			break;
		
		case 4: 
			this.setText("Torpilleur");
			break;
			
		case 5: 
			this.setText("Grille � 11 cases");
			break;
		}
	}

	public int getId() {
		return id;
	}	
}
