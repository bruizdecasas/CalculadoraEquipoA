package ed_calculadora;

/**
 * Esta clase implementará todos los métodos que están relacionados con la división de la calculadora.
 * <br>
 * En esta clase realizaremos las siguientes operaciones:
 * <br>
 * <b>División de dos números reales.</b>
 * <br>
 * <b>División de dos números enteros.</b>
 * <br>
 * <b>Inverso de un número real.</b>
 * <br>
 * <b>Raíz de un número.</b>
 * <br>
 * <br>
 * <b> Casos especiales: </b>
 * <br>
 * - En el caso de que <b>no se admitieran números negativos</b> habría que especificarlo al usuario 
 *   y ademas utilizar un if para en el caso de que lo pusiera le indicara el método que debe ser un 
 *   número mayor o igual que cero.
 *   <br>
 * - <b>No es posible dividir un número entre 0 </b> por lo que solo se admitiria en el numerador.
 * - Cuando la división no es exacta como queremos obtener decimales al hacer la división, introduciremos
 *   una conversión para pasar los parametros int a double y de esta forma obtener los decimales.
 *   <br>
 * 		Ejem:
 * 			System.out.println((double) 10 / 9);
 * <ul>
 * 
 * 
 * @authors Silvia Piñel Fañanás
 * @version 1.0
 *
 */

public class Cociente {
	private double num1r;
	private double num2r;
	private int num1e;
	private int num2e;
    
	
	public Cociente(double num1r, double num2r) {
		
		this.num1r = num1r;
		this.num2r = num2r;
		
	}
	
	public Cociente (int num1e, int num2e) {
	this.num1e = num1e;
	this.num2e = num2e;
	
	}
	
		
	public double getNum1r() {
		return num1r;
	}

	public void setNum1r(double num1r) {
		this.num1r = num1r;
	}

	public double getNum2r() {
		return num2r;
	}

	public void setNum2r(double num2r) {
		this.num2r = num2r;
	}

	public int getNum1e() {
		return num1e;
	}

	public void setNum1e(int num1e) {
		this.num1e = num1e;
	}

	public int getNum2e() {
		return num2e;
	}

	public void setNum2e(int num2e) {
		this.num2e = num2e;
	}

	/**
	 * Este método divide dos números reales.
	 * 
	 * @param num1r es un múmero real que será el dividendo. 
	 * @param num2r es un múmero real que será el divisor.
	 * @return Devuelve un número real que es el cociente de ambos parámetros.
	 * @throws ArithmeticException Si num2r es <b>cero</b>, ya que no se puede dividir entre cero (indeterminación)
	 * 
	 * @author Silvia Piñel Fañanás
	 */
		public double Division_double () 
		{
		
		double resultado;
		resultado = num1r/num2r;
		return resultado;
		}
	
	/**
	 * Este método divide dos números enteros.
	 * 
	 * Tiene dos parámetros de entrada:
	 * 
	 * @param num1e es un múmero entero que será el dividendo. 
	 * @param num2e es un múmero entero que será el divisor.
	 *
	 * @return Devuelve un número entero que es el cociente de ambos parámetros.
	 * @throws ArithmeticException Si num2e es <b>cero</b>, ya que no se puede dividir entre cero (indeterminación).
	 * 
	 * @author Silvia Piñel Fañanás
	 */
		public int Division_int () 
			{
			int resultado;
			resultado = num1e/num2e;
		    return resultado;
		    
			}

	/**
	 * Este metodo calcula en inverso de un número real.
	 * 
	 * Tiene un parámetros de entrada:
	 * 
	 * @param num1r es un número real del que vamos a calcular el inverso.
	 * 
	 * @return Devuelve el inverso del número introducido como parámetro.
	 * 
	 * @throws ArithmeticException Si num1r es <b>cero</b>, ya que no se puede dividir entre cero (indeterminación).
	 * 
	 * @author Silvia Piñel Fañanás
	 */
		public double Inverso () 
			{
				
			double resultado;
			resultado = 1/num1r;
			return resultado;
			}
		/**
		 * Este metodo calcula la raíz de un número.
		 * 
		 * Tiene un parámetro de entrada:
		 * 
		 * @param num1r es un número real del que vamos a calcular la raíz cuadrada.
		 * 
		 * @return Devuelve la raíz cuadrada del número introducido.
		 * 
		 * El resultado será NaN si el parámetro facilitado es negativo.
		 * 
		 * @author Silvia Piñel Fañanás
		 */
		public double Raiz () 
			{
			double resultado;
			resultado= Math.sqrt(num1r);
			return resultado;
			}

}

