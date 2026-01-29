package clearminds.cuentas;

public class Cuentas {
	private String id;
	private String tipo = "A";
	private double saldo;
	
	// CONSTYRUCTORES
	public Cuentas(String id) {
		this.id = id;
	}
	public Cuentas(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	
	// METODOS
	public void imprimer() {
		System.out.println("***********************");
		System.out.println("CUENTA");
		System.out.println("***********************");
		System.out.println("Numero de cuentas: "+id);
		System.out.println("Tipo: " +tipo);
		System.out.println("Saldo: "+saldo);
	}
	public void imprimirConMiEstilo() {
		System.out.println("***CUENTA***");
		System.out.println("# Cuentas: "+id);
		System.out.println("Tipo de cuentas: "+tipo);
		System.out.println("Saldo: "+saldo);
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getId() {
		return id;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
