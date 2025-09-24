package AnimalesPrograma;

public class Gato extends Animal {

	private String razagato;

	public Gato(String nombre, int edad, String razagato) {
		super(nombre, edad);
		this.razagato = razagato;
	}

	public String getRazagato() {
		return razagato;
	}

	public void setRazagato(String razagato) {
		this.razagato = razagato;
	}

	@Override
	public void emitirSonido() {
		System.out.println("El gato hace: Miau, Miau");
	}

}
