/*Interfaces no pueden tener ningún método implementado, todos sus métodos 
 * son abstractos. Tampoco permite la creación de atributos ya que no pueden
 * ser accesados al tener métodos abstractos.*/

/*Una interfaz puede heredar de otra Interfaz pero jamas de otra clase*/

/*Es un contrato donde las clases que firman se hacen responsables de 
 * implementar todos los métodos indicados por el (cumplir el contrato)*/
public abstract interface Autenticable{
	
	public abstract void setClave(String clave);
	
	public abstract boolean iniciarSesion(String clave);

}
