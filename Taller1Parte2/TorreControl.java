package interfaz;

public class TorreControl {

	private Volador volador;


	public TorreControl(Volador avion) {
		
	}

	public void ControladorDeVuelo(Volador volador) {
        this.volador = volador;
    }

    public void iniciarVuelo() {
        volador.volar();
    }
	
}
