package operaciones;

public class Operacion {
private int vUno, vDos, Resultado;
	
	public Operacion (int valorUno, int valorDos) {
		this.vUno = valorUno;
		this.vDos = valorDos;
	}
	public void OperacionSuma() {
		Resultado = vUno + vDos;	
	}
	public void imprimirSuma() {
		OperacionSuma();
		System.out.println("el resultado de la suma es " + Resultado);
	}
	public void OperacionResta() {
		Resultado = vUno - vDos;	
	}
	public void imprimirResta() {
		OperacionResta();
		System.out.println("el resultado de la resta es " + Resultado);
	}
	public void OperacionMult() {
		Resultado = (vUno * vDos);	
	}
	public void imprimirMult() {
		OperacionMult();
		System.out.println("el resultado de la multiplicacion es " + Resultado);
	}
	public void OperacionDiv() {
		Resultado = (vUno/vDos);	
	}
	public void imprimirDiv() {
		OperacionDiv();
		System.out.println("el resultado de la division es " + Resultado);
	}
}	