package ed_calculadora;

/**
 * Esta clase implementará todos los métodos que están relacionados con la multiplicación de la calculadora.
 * <br>
 * Esta clase tendrá los siguientes métodos:
 * <br>
 * <b>Producto dos números reales.</b>.
 * <br>
 * <b>Producto dos números enteros.</b>
 * <br>
 * <b>Producto de tres números reales.</b>
 * <br>
 * <b>Potencia.</b>
 * <br>
 * <br>
 * <b> Casos especiales: </b>
 * <br>
 * - En el caso de que <b>no se admitierán números negativos</b> habría que especificarlo al usuario 
 *   y además utilizar un if para en el caso de que lo pusiera le indicara el método que debe ser 
 *   un número mayor o igual que cero.
 * <br>
 * - En el producto <b>no pasaría nada sí </b>alguno de los parámetros fuera <b>cero</b>.
 * <br>
 * - En la potencia:
 * 		1) La base es cero, el resultado es cero.
 * 		2) Si el exponente es cero el resultado es uno.
 *      3) Si <b>ambos son cero</b> sería una <b>indeterminación</b>.
 * <br>
 * - La entrada de <b>números muy grandes en la potencia </b> puede ser un problema a la hora de devolver el resultado, 
 *   para solucionarlo, utilizaremos un while que cuando el resultado tenga más de 7 cifras, la calculadora 
 *   muestre el número empleando la <b>notación científica</b> con la forma aEb, donde a sería el número y b el exponente 
 *   de la base 10.
 * <br>
 * <ul>
 * 
 * 
 * @authors Benjamin Ruiz de Casas
 * @version 2.0
 *
 */

public class Producto {

	/**
	 * Se crea el método para calcular el producto de dos números reales.
	 * 
	 * @param num1 número real que es uno de los factores.
	 * @param num11 número real que es otro de los factores.
	 * @return Devuelve el resultado del producto.
	 */

	public double Producto (double num1, double num11) {
		return Resultado;
	}

	/**
	 * Se crea el método para calcular el producto de dos números enteros.
	 * 
	 * @param num2 número entero que es uno de los factores.
	 * @param num21 número entero que es otro de los factores.
	 * @return Devuelve el resultado del producto de ambos factores.
	 */
	public int Producto (int num2, int num21) {
		return Resultado;
	}

	/**
	 * Se crea el método para calcular el producto de tres números reales.
	 * 
	 * @param num3 número real que es el factor uno.
	 * @param num31 número real que es el factor dos.
	 * @param num32 número real que es el factor tres.
	 * @return Devuelve el resultado del producto de los tres factores.
	 */
	public double Producto(double num3, double num31, double num32) {
		return Resultado;
	}

	/**
	 * Se crea el método para calcular la potencia de un número.
	 * 
	 * @param base número entero o real que representa la base de la potencia.
	 * @param exponente número entero o real que representa el exponente de la potencia.
	 * 
	 * @throws - La base y el exponente no pueden ser cero simultáneamente.
	 * 
	 * @return Devuelve el resultado de la potencia.
	 */
	public int Potencia (int base, int exponente) {
		return Resultado;
	}
}
