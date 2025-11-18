
public class main {
	/*private static void testPokemon0() {
	    Pokemon p1 = new Pokemon("Rhinolove");
	    Pokemon p2 = new Pokemon("Chovsourir");
	    p1.log(p1.toString());
	    p2.log(p2.toString());
	    p1.attaquer(p2);
	    p2.log(p2.toString());
	}*/

	private static void testPokemonTypes() {
	    PokemonEau eau = new PokemonEau("PokéEau");
	    PokemonFeu feu = new PokemonFeu("PokéFeu");
	    eau.log(eau.toString());
	    feu.log(feu.toString());
	    eau.attaquer(feu);
	    feu.attaquer(eau);
	    eau.log(eau.toString());
	    feu.log(feu.toString());
	}

	public static void main(String[] args) {
	    //System.out.println("\nTEST POKEMON0 \n");
	    //testPokemon0();

	    System.out.println("\nTEST POKEMON TYPES \n");
	    testPokemonTypes();
	}

}
