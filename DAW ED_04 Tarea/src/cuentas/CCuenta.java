//Las clases deberán formar parte del paquete cuentas.
package cuentas;

/** Clase CCuenta perteneciente al paquete cuentas
 * @author Laura Amoeiro San Miguel
 *  */

public class CCuenta {


    private String nombre; /**Almacena el nombre del titular de la cuenta*/
    private String cuenta; /**Almacena el número de cuenta*/
    private double saldo;	/**Almacena el saldo de la cuenta*/
    private double tipoInterés; /**Almacena el tipo de interés aplicable*/
    
    //Encapsular los atributos de la clase CCuenta.
    
    /**Devuelve el nombre del titular de la cuenta
     * @return nombre titular
     */
    public String getNombre() {
		return nombre;
	}
    
    /**Establece el nombre del titular de la cuenta*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	 /**Devuelve el número de la cuenta
     * @return número cuenta
     */
	public String getCuenta() {
		return cuenta;
	}

	/**Establece el número de la cuenta*/
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**Devuelve el saldo de la cuenta
     * @return saldo
     */
	public double getSaldo() {
		return saldo;
	}

	/**Establece el saldo de la cuenta*/
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**Devuelve el tipo de interés que se aplica a la cuenta
     * @return tipo de interés
     */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**Establece el tipo de interés que se aplica a la cuenta*/
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**Crea un nuevo objeto CCuenta vacío*/
    public CCuenta()
    {
    }

    /**Crea un nuevo objeto CCuenta pasándole los parámetros*/
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**Muestra el estado de la cuenta devolviendo su saldo actual
     * @return saldo
     */
    public double estado()
    {
        return saldo;
    }
    
    /**Añade al saldo de la cuenta lo que indiquemos en el parámetro cantidad
     * @exception Exception, si parámetro cantidad es negativo
     * @throws Exception, "No se puede ingresar una cantidad negativa"
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**Resta al saldo de la cuenta lo que indiquemos en el parámetro cantidad
     * @exception Exception, si parámetro cantidad es menor o igual a 0
     * @throws Exception, "No se puede retirar una cantidad negativa"
     * @exception Exception, si el saldo de cuenta es menor que la cantidad a retirar
     * @throws Exception, "No hay suficiente saldo"
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
