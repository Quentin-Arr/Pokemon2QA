import java.util.Random;

public class Pokemon {
	private String nom;
	private static java.util.Random random = new Random();
	private int niveau =  random.nextInt(1, 11);
	private int hp;
	private int atk;
	
	public Pokemon (String nom) {
		this.nom=nom;
		this.hp= niveau*2;
		this.atk=(niveau/2)+1;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getNiveau() {
		return niveau;
	}
	
	public boolean isKO() {
		if (this.hp<=0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void soigner() {
		this.hp=niveau*2;
		System.out.println("[Pokemon "+this.nom+"] : Je me soigne"); 
	}
	
	public void attaquer(Pokemon p) {
		p.hp=p.hp-this.atk;
		System.out.println("[Pokemon "+this.nom+"] : J'attaque "+p.nom);
	}
	
	public String toString() {
		return("Je m'appelle "+this.nom+ ""
				+ " je suis de niveau "+this.niveau+""
						+ " j'ai "+this.hp+" points de vie "
								+ "mon attaque de base est  de "+this.atk);		
	}
	
	public void log(String msg) {
		System.out.println("[Pokemon "+this.nom+"] : "+msg);
	}
}