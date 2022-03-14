//Las clases deber�n formar parte del paquete cuentas.
package cuentas;

public class Main {

    public static void main(String[] args) {

        operativa_cuenta(1000);
    }

    //Introducir el m�todo operativa_cuenta, que englobe las sentencias de la clase Main que operan con el objeto cuenta1.
    //A�adir un nuevo par�metro al m�todo operativa_cuenta, de nombre cantidad y de tipo float.
	private static void operativa_cuenta(float cantidad) {
		//Cambiar el nombre de la variable "miCuenta" por "cuenta1".
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio L�pez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}

