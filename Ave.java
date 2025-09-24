package AnimalesPrograma;

public class Ave extends Animal {

	private String razaAve;

	public Ave(String nombre, int edad, String razaAve) {
		super(nombre, edad);
		this.razaAve = razaAve;
	}

	public String getRazaAve() {
		return razaAve;
	}

	public void setRazaAve(String razaAve) {
		this.razaAve = razaAve;
	}

	@Override
	public void emitirSonido() {
		System.out.println("El ave hace: Pio, Pio");
	}

}
