
public class Personagem {

	private String nome;
	private int power;
	private int health;
	private int mobility;
	private int techniques;
	private int range;



	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		if(power>0 && power<6)
			this.power = power;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(power>0 && power<6)
			this.health = health;
	}

	public int getMobility() {
		return mobility;
	}

	public void setMobility(int mobility) {
		if(power>0 && power<6)
			this.mobility = mobility;
	}

	public int getTechniques() {
		return techniques;
	}

	public void setTechniques(int techniques) {
		if(power>0 && power<6)
			this.techniques = techniques;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		if(power>0 && power<6)
			this.range = range;
	}

	public void especial(){
		System.out.println("Personagem soltando especial!! BOOM!");
	}

	public void superEspecial(){
		System.out.println("Personagem soltando super especial!! BOOOOOOOOOM!");
	}

	public void soco(){
		System.out.println("Personagem dando um soco!");
	}

	public void chute(){
		System.out.println("Personagem dando um chute!");
	}

	public void rasteira(){
		System.out.println("Personagem dando uma rasteira!");
	}

	public void pulo(){
		System.out.println("Personagem pulando!");
	}

	public void defesa(){
		System.out.println("Personagem defendendo!");
	}
}
