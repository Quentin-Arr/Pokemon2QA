
public enum TypePokemon {
	EAU("eau"),
	FEU("feu"),
	PLANTE("plante");
	
	private String nom;
	
	private TypePokemon(String nom) {
		this.nom=nom;
	}
	
	public String toString() {
		return (this.nom);
	}
}
