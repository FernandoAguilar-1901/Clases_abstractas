
public abstract class Animales {
	
	
	//Atributos
	
	String nombreAnimal;
	
	//Metodo para emitir sonido
	
	public abstract void emitirSonido();
	
	//Metodo para avanzar
	
	public abstract void desplazamiento();
	
	//

}//Termina main

////////////////////////////////////////////////////

class Mapache extends Animales{

	@Override
	public void emitirSonido() {
		System.out.println("Arrr arrr arrr");
	}

	@Override
	public void desplazamiento() {
		System.out.println("El mapache avanza en 2 o 4 patas");
	}
	
	
	
}

///////////////////////////////////////////////////////

class Aguila extends Animales{

	@Override
	public void emitirSonido() {
		System.out.println("Eeee, eeee");
	}

	@Override
	public void desplazamiento() {
		System.out.println("Las aguilas vuelan alto, arriba mis aguilas del America");
	}
	
}

///////////////////////////////////////////////////////

class Pescado extends Animales{

	@Override
	public void emitirSonido() {
		System.out.println("Glu glu glu");
	}

	@Override
	public void desplazamiento() {
		System.out.println("Los peces en el rio se mueven y beben y beben");
	}
	
}


///////////////////////////////////////////////////////

class Vaca extends Animales{

	@Override
	public void emitirSonido() {
		System.out.println("Muuuuuu");
	}

	@Override
	public void desplazamiento() {
		System.out.println("La vaca camina lento y se desplaza en sus 4 patas");
	}
	
}

///////////////////////////////////////////////////////

class Gato extends Animales{

	@Override
	public void emitirSonido() {
		System.out.println("Miau miau, meow meow");
	}

	@Override
	public void desplazamiento() {
		System.out.println("Los gatos son grandes escaladores, corredores y se desplazan en casi cualquier terreno");
	}
	
}
