
public class Main {

	public static void main(String[] args) {
		Ryu ryu = new Ryu();
		Ken ken = new Ken();
		Kolin kolin = new Kolin();
		ChunLi chunLi = new ChunLi();
		Necalli necalli = new Necalli();
		Akuma akuma = new Akuma();

		System.out.println(ryu.getNome());
		System.out.println("--------------------------------");
		System.out.println(ken.getPower());
		System.out.println("--------------------------------");
		System.out.println(kolin.getHealth());
		System.out.println("--------------------------------");
		System.out.println(necalli.getMobility());
		System.out.println("--------------------------------");
		System.out.println(chunLi.getTechniques());
		System.out.println("--------------------------------");
		System.out.println(akuma.getRange());
		System.out.println("--------------------------------");


		ryu.especial();
		System.out.println("--------------------------------");
		
		ken.superEspecial();
		System.out.println("--------------------------------");
		
		kolin.rasteira();
		System.out.println("--------------------------------");
		
		chunLi.defesa();
		System.out.println("--------------------------------");
		
		necalli.chute();
		System.out.println("--------------------------------");
		
		akuma.pulo();
		System.out.println("--------------------------------");
		
		kolin.soco();
		System.out.println("--------------------------------");
		
		necalli.especial();
		System.out.println("--------------------------------");
		
		chunLi.superEspecial();
		System.out.println("--------------------------------");

	}

}
