package com.cmc.evaluacion;

public class CalculadoraAmortizacion {

    public static double calcularCuota(Prestamo prestamo) {
        double interesMensual = (prestamo.getInteres() / 12) / 100;
        double cuota = (prestamo.getMonto() * interesMensual) / 
                       (1 - Math.pow((1 + interesMensual), -prestamo.getPlazo()));
        return cuota;
    }

    public void generarTabla(Prestamo prestamo) {
        // 1. Calcular la cuota constante
        double valorCuota = calcularCuota(prestamo);
        Cuota[] cuotas = prestamo.getCuotas();

        // 2. Inicializar cuotas en el arreglo
        for (int i = 0; i < cuotas.length; i++) {
            Cuota c = new Cuota(i + 1);
            c.setCuota(valorCuota);
            cuotas[i] = c;
        }

        // 3. Establecer valor inicial en la primera cuota
        cuotas[0].setInicio(prestamo.getMonto());

        // 5. Invocar calcularValoresCuota sobre todas las cuotas
        for (int i = 0; i < cuotas.length; i++) {
            Cuota actual = cuotas[i];
            Cuota siguiente = (i < cuotas.length - 1) ? cuotas[i + 1] : null;
            
            calcularValoresCuota(prestamo.getInteres(), actual, siguiente);
        }
        
        // 6. Ajustar última cuota (el saldo debe quedar en 0)
        Cuota ultima = cuotas[cuotas.length - 1];
        if (ultima.getSaldo() != 0) {
            ultima.setCuota(ultima.getCuota() + ultima.getSaldo());
            ultima.setAbonoCapital(ultima.getAbonoCapital() + ultima.getSaldo());
            ultima.setSaldo(0);
        }
    }

    // 4. Implementar calcularValoresCuota
    private void calcularValoresCuota(double interesAnual, Cuota actual, Cuota siguiente) {
        double interesMensual = (interesAnual / 12) / 100;
        
        // Cálculos
        actual.setInteres(actual.getInicio() * interesMensual);
        actual.setAbonoCapital(actual.getCuota() - actual.getInteres());
        actual.setSaldo(actual.getInicio() - actual.getAbonoCapital());

        // Establecer inicio de la siguiente cuota
        if (siguiente != null) {
            siguiente.setInicio(actual.getSaldo());
        }
    }

    public void mostrarTabla(Prestamo prestamo) {
        System.out.println("Número | Cuota | Inicio | Interés | Abono | Saldo");
        for (Cuota c : prestamo.getCuotas()) {
            c.mostrarPrestamo();
        }
    }
}