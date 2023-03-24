/* Entidad: Cuenta 
 * Atributos: Saldo, Agencia, Número, Titular
 */

public class Cuenta{
	private double saldo;
	private int agencia, numero; // dos datos del mismo tipo pueden declararse en la misma línea
	//Declaración e inicialización para evitar exception por point al objeto no inicializado.
	private Cliente titular = new Cliente();;
	
	/*Al hacerlo static le indico que esta variable no es de la instacia new Cuenta sino de la Clase Cuenta, 
	por ende para a ser una variable de clase y deja de ser atributo de instancia.
	Clase --> Cuenta.contadorCuentas 
	Instancia --> cuenta01.saldo
	*/
	private static int contadorCuentas = 0;
	
	/*Si se encapsula el método debe ser estatico y no se puede indicar this.atributo
	 * ya que no es atributo, sino Clase.variable*/
	public static int getContadorCuentas() {
		return Cuenta.contadorCuentas;
	}
	
	/*Método constructor que existe por defecto aunque no se escriba, 
	se encarga de inicializar los atributos primitivos con 0, null, false;
	
	public Cuenta() {
		System.out.println("Aquí se crea una nueva cuenta");
	}
	
	En el momento en que escribo el constructor, se sobreescribe el constructor por defecto
	Si realmente quiero que exista constructor vacio voy a tener que codearlo manualmente.
	Depende mucho de como se maneja la empresa hay veces que no se quiere el constructor por defecto.
	*/
	public Cuenta(int agencia) {
		if(agencia <= 0) {
			System.out.println("Número de agencia menor o igual a 0, se asignará valor 1");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		contadorCuentas++;
		System.out.println("Número de cuenta: " + contadorCuentas);
	}
	
	/*Métodos getters y setters permiten acceder a atributos privados, por convención se escriben 
	 * en camelCase getAtributo y setAtributo
	 * No siempre todas las variables privadas necesitan ser accedidas o por get o por set o por ambas
	 * por ejemplo no se necesita setear el saldo cuando hay métodos de deposito y extraccion*/
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	/*La diferencia entre el atributo público y hacerlo privado pero con un set
	 * es que el método set me permite colocar condiciones antes de asignar el valor
	 * enviado atravez del parámetro*/
	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		} else {
			System.out.println("No estaán permitos valores negativos");
		}
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	/*Los atributos no inicializados tienen valor por defecto:
	 * numericos --> 0
	 * cadenas --> null (!= de vacio)
	 * booleanos --> false
	 * */

	/* Métodos void son funciones que no devuelven nada,
	 * en cambio si tienen retorno debe indicarse el tipo y colocar 
	 * return al final del scope de la función
	 * 
	 * Cuando los parámetros tienen el mismo nombre que los atributos
	 * se indica con palabra this al que corresponde al atributo 
	 * del objeto del parámetro, tambien se consideran buena práctica*/ 
	public void depositar(double valor){
		// this.saldo = this.saldo + valor;
		this.saldo += valor;
	}
	
	public boolean retirar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
		return false;	
	}
	
	
	/*Métodos sólo utilizan objetos por referencia, no ocurre lo
	 * mismmo cuando se trata de datos primitivos que se utilizan por valor*/
	public boolean transferir(double valor, Cuenta cuenta) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			//cuenta.saldo += valor;
			cuenta.depositar(valor);
			return true;
		} 
		return false;		
	}
	

}