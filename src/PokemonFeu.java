
public class PokemonFeu extends Pokemon {
	
	public PokemonFeu(String nom) {
		super(nom, TypePokemon.FEU);
	}

	@Override
	public void attaquer(Pokemon p) {
		if (this.isKO()==false) {
			this.log("J'attaque "+p.getNom());
			p.subir(this);
		}
		else {
			this.log("Je ne peux pas attaquer je suis KO");
		}
	}

	@Override
	public void subir(Pokemon p) {
		switch (p.getType()) {
		case FEU: {
			this.hp-=p.getAtk();
			p.log("L'attaque est normalement efficace");
			break;
			}
		case PLANTE: {
			this.hp-=(p.getAtk()/2);
			p.log("Cette attaque n'est pas très efficace");
			break;
			}
		case EAU: {
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
