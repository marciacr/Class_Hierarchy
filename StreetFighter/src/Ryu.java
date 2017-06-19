
public class Ryu extends Personagem {

	public Ryu(){
		setNome("Ryu");
		setPower(4);
		setHealth(3);
		setMobility(3);
		setTechniques(2);
		setRange(4);
	}

	public void especial(){
		System.out.println("Personagem soltando especial!! HADOUKEEEN!!");
	}

	public void superEspecial(){
		System.out.println("Personagem soltando SUPER ESPECIAL!! SUPEEER HADOUKEEEN!!");
	}
}