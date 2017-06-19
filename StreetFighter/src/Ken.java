
public class Ken extends Personagem{

	public Ken(){

		setNome("Ken");
		setPower(3);
		setHealth(3);
		setMobility(4);
		setTechniques(2);
		setRange(3);
	}

	public void especial(){
		System.out.println("Personagem soltando especial!! HADOUKEEEN!!");
	}

	public void superEspecial(){
		System.out.println("Personagem soltando SUPER ESPECIAL!! SUPEEER HADOUKEEEN!!");
	}
}
