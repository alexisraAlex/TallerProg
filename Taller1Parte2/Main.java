package interfaz;

public class Main {
	
	public static void main(String[] args) {
        Volador ave = new Ave();
        Volador avion = new Avion();
        Volador murcielago = new Murcielago();

        VoladorImprimir printer = new VoladorImprimir();
        printer.imprimirMensaje(ave);
        printer.imprimirMensaje(avion);
        printer.imprimirMensaje(murcielago);

        TorreControl controlador = new TorreControl(avion);
        controlador.iniciarVuelo();

        Animal a = new Perro();
        a.hacerSonido();

        Nadador pez = new Pez();
        pez.nadar();
    }
	
}
