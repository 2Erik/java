package clearminds.cuentas.test;

import clearminds.cuentas.Cuentas;

public class TestCuenta {

	public static void main(String[] args) {
		Cuentas cuenta1 = new Cuentas("03476");
		Cuentas cuenta2 = new Cuentas("03476","C",98);
		Cuentas cuenta3 = new Cuentas("03476");
		Cuentas cuenta4 = new Cuentas("0987");
		Cuentas cuenta5 = new Cuentas("0557", "C", 10);
		Cuentas cuenta6 = new Cuentas("0666");
		
		cuenta6.setTipo("A");
		
		cuenta4.setTipo("A");
		cuenta4.setSaldo(10);
		
		cuenta1.setSaldo(675);
		cuenta3.setTipo("C");
		
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		
		System.out.println("---Valores Iniciales---");
		cuenta1.imprimer();
		cuenta2.imprimer();
		cuenta3.imprimer();
		
		System.out.println("---Valores Modificados---");
		cuenta1.imprimer();
		cuenta2.imprimer();
		cuenta3.imprimer();
		
		System.out.println("");
		System.out.println("---Cuentas 4, 5, 6");
		System.out.println("");
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
		
	}

}
