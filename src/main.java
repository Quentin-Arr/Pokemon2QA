
public class main {
	public static void main(String[] args) {
		System.out.println("Test");
		Pokemon p1 = new Pokemon("Rhinovolve");
		Pokemon p2 = new Pokemon("Chovsourir");
		p1.log(p1.toString());
		p2.log(p2.toString());
		p1.attaquer(p2);
		p2.log(p2.toString());
	}
}
