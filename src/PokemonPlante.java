
public class PokemonPlante extends Pokemon{

	public PokemonPlante(String nom) {
		super(nom, TypePokemon.EAU);
	}

	@Override
	public void attaquer(Pokemon p) {
		p.subir(this);
		this.log("J'attaque "+p.getNom());
	}

	@Override
	public void subir(Pokemon p) {
		switch (p.getType()) {
		case PLANTE: {
			this.hp-=p.getAtk();
			p.log("L'attaque est normalement efficace");
			break;
			}
		case EAU: {
			this.hp-=(p.getAtk()/2);
			p.log("Cette attaque n'est pas très efficace");
			break;
			}
		case FEU: {
			this.hp-=(p.getAtk()*2);
			p.log("Cette attaque est super efficace");
			break;
			}
		}
		if (this.isKO()==true) {
			this.log("Je n'ai plus d'HP");
		}
	}
}