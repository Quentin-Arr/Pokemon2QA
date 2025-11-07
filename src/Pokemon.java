import java.util.Random;

public abstract class Pokemon {
	private String nom;
	private static java.util.Random random = new Random();
	private int niveau =  random.nextInt(1, 11);
	protected int hp;
	private int atk;
	private static int niveauMax=10; 
	private TypePokemon type;
	
	public Pokemon (String nom, TypePokemon type) {
		this.nom=nom;
		this.hp= niveau*2;
		this.atk=(niveau/2)+1;
		this.type=type;
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
	
	public TypePokemon getType() {
		return type;
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
	
	public abstract void attaquer(Pokemon p);
	public abstract void subir(Pokemon p);
	
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