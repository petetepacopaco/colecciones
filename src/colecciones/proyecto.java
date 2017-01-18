package colecciones;

public class proyecto {
	public static void main(String[] args) {
	//creo la coleccion
	int[] coleccionenteros = new int[3];
	//añadimos elementos a la coleccion
	coleccionenteros[0] = 1;
	coleccionenteros[1] = 2;
	coleccionenteros[2] = 3;
	for (int i = 0;i < coleccionenteros.length;i++){
		System.out.println(coleccionenteros[i]);
	}
	//otra forma de recorrer la coleccion
	for (int i : coleccionenteros){
		System.out.println(i);
	}
	//coleccion de cadenas
	String[] coleccioncadenas = new String[4];
	coleccioncadenas[0] = "hola";
	coleccioncadenas[1] = "";
	coleccioncadenas[2] = "mundo";
	coleccioncadenas[3] = "\n";
	//recorremos la coleccion
	for (String string : coleccioncadenas) {
		System.out.print(string);
		
	}
	//crear coleccion de double inicializada
	double[] colecciondouble = {1.2, 1.5, -23.65, 0.005, 7};
	//recorremos el array de doubble
	for (double d : colecciondouble) {
		System.out.printf("%9.3f", d);
		
	}
	
	
	
}
}