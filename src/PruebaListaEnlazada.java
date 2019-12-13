
public class PruebaListaEnlazada {
	public static void main(String[]args) {
		ListaEnlazada le = new ListaEnlazada();

		System.out.println("------------ Agregar al Inicio -------------");

		le.agregarElementoAlInicio(99);
		le.agregarElementoAlInicio(88);
		le.agregarElementoAlInicio(3);
		le.agregarElementoAlInicio(4);

		le.mostrarElementos();


		System.out.println("\n------------ Agregar al final -------------");

		le.agregarElementoAlFinal(1);
		le.agregarElementoAlFinal(2);
		le.agregarElementoAlFinal(3);
		le.agregarElementoAlFinal(4);

		le.mostrarElementos();

		System.out.println("\n=================== Eliminar al inicio");
		le.eliminarElementoAlInicio();
		le.mostrarElementos();
		System.out.println("\n=================== Eliminar al final");
		le.eliminarElementoAlFIn();
		le.mostrarElementos();
		System.out.println("\n=================== ");
		le.recorrerLista();
		System.out.println("Numero de elementos: "+le.recorrerLista());
	}
}
