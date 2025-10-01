package AnimalesPrograma;

public class Main {

	public static void main(String[] args) {
		
		
		Animal ani = new Animal("Tipo de animal", 4);
			System.out.println(ani.getNombre()+" "+"con edad de:"+ani.getEdad());
		Ave ave = new Ave ("Chipi", 2, "Perico");
			System.out.println("Este pájaro se llama:"+" "+ave.getNombre()+" "+"con edad de"+" "+ave.getEdad()+" "+"Y su raza es"+" "+ave.getRazaAve());
		Gato gato = new Gato ("Michi", 5, "Callejero");
			System.out.println("Este gato se llama:"+" "+gato.getNombre()+" "+"con edad de"+" "+gato.getEdad()+" "+"Y su raza es"+" "+gato.getRazagato());
		Perro perro = new Perro("Firulais", 6, "Callejero");
			System.out.println("Este perro se llama:"+" "+perro.getNombre()+" "+"con edad de"+" "+perro.getEdad()+" "+"Y su raza es"+" "+perro.getRazaperro());
	}

}
