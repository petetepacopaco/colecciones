package teoria;

public class arrays2 {
	public static void main(String[] args) {
		//definimos un array bidimensional de int
		final int tamano_filas = 3;
		final int tamano_columnas = 3;
		int [][] coleccionbidimensionalentero = 
			new int[tamano_filas][tamano_columnas];
		coleccionbidimensionalentero[0][0] = 0;
		coleccionbidimensionalentero[0][1] = 1;
		coleccionbidimensionalentero[0][2] = 2;
		//segunda fila o fila 1
		coleccionbidimensionalentero[1][0] = 3;
		coleccionbidimensionalentero[1][1] = 4;
		coleccionbidimensionalentero[1][2] = 5;
		//tercera fila
		coleccionbidimensionalentero[2][0] = 6;
		coleccionbidimensionalentero[2][1] = 7;
		coleccionbidimensionalentero[2][2] = 8;
		for (int i = 0; i< coleccionbidimensionalentero.length;i++){
			for (int j = 0; j< coleccionbidimensionalentero.length;j++){
				System.out.println(coleccionbidimensionalentero[i][j]);
			
		}
		
	}
		
		for (int[] is  :  coleccionbidimensionalentero){
			for (int i : is){
				System.out.println(i);
			}
		}
		System.out.println("______________________________");
		System.out.println("______________________________");
		
		//creamos la coleccion tridimensional y la inicializamos
		int [][][] colecciontridimensionalentero = {
				{ {1,2}, {3,4} },
				{ {5,6}, {7,8} },
				{ {9,10}, {11,12} }
		};		
		//recorer 
		for (int[][] is : colecciontridimensionalentero) {
			for (int[] is2 : is) {
				for (int i : is2) {
					//para que nos muestre solo los pares
					if(i % 2 == 0)
					System.out.println(i);
					
				}
				
			}
				
				
			}
			
		}
	}
	
