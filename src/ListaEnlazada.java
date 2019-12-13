

public class ListaEnlazada {

	Nodo nodoInicio;
	Nodo nodoFin;

	//1) Crear lista enlazada
	public ListaEnlazada() {
		nodoInicio = null;
		nodoFin = null;
	}

	//2a)Agregar elemento al inicio
	public void agregarElementoAlInicio(int dato){
		Nodo nodoNuevo = new Nodo(dato);



		if (nodoInicio == null) {
			nodoFin = nodoInicio = nodoNuevo;		
		}else {
			nodoNuevo.setEnlace(nodoInicio);
			nodoInicio = nodoNuevo;
		}

	}
	//2b)Agregar elemento al final
	public void agregarElementoAlFinal(int dato){
		Nodo nodoNuevo = new Nodo(dato);

		if (nodoFin == null) {
			nodoFin = nodoInicio = nodoNuevo;
		}else {
			nodoFin.setEnlace(nodoNuevo);
			nodoFin = nodoNuevo;
		}

	}
	//3a)Eliminar elemento al inicio
	public void eliminarElementoAlInicio() {
		if (nodoInicio == null) {

		}else {
			nodoInicio = nodoInicio.getEnlace();
		}
	}

	//3b)Eliminar elemento al Final
	public void eliminarElementoAlFIn() {
		Nodo aux = nodoInicio;
		if (nodoFin == null) {

		}else {
			while(aux.getEnlace()!=null){
				nodoFin = aux;
			     aux=aux.getEnlace();
			}
		     nodoFin.setEnlace(null);
		}
	}

	//Recorrer Lista
	public int recorrerLista() {
		Nodo au = nodoInicio;
		int cont = 0;
		while(au!=null){
		     au=au.getEnlace();
		     cont++;
		}
		return cont;
	}

	//Mostrar Elementos
	public void mostrarElementos() {
		Nodo nodoActual = nodoInicio;

		while (nodoActual != null) {
			System.out.print("["+nodoActual.getDato()+"]");
			nodoActual = nodoActual.getEnlace();
		}
	}

}
