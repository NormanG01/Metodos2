public class SalarioNeto {

    public static float calcularSalarioNeto(float salarioBasico) {

        if (salarioBasico < 0) {
            return 0;
        }

        // Calcular el monto de la afiliación
        float afiliacion = salarioBasico * 0.01f;

        // Calcular el monto del INSS
        float inss = salarioBasico * 0.07f;

        // Calcular el monto del IR
        float ir = calcularIR(salarioBasico);

        // Calcular el salario neto
        return salarioBasico - afiliacion - inss - ir;
    }

    private static float calcularIR(float salarioBasico) {
        if (salarioBasico < 100000) {
            return 0;
        } else if (salarioBasico <= 200000) {
            return salarioBasico * 0.15f;
        } else if (salarioBasico <= 350000) {
            return salarioBasico * 0.20f;
        } else if (salarioBasico <= 500000) {
            return salarioBasico * 0.25f;
        } else {
            return salarioBasico * 0.30f;
        }
    }

    public static float calcularSalarioNeto(float salarioBasico, float porcentajeIR) {

        if (salarioBasico < 0) {
            return 0;
        }

        if (porcentajeIR < 0 || porcentajeIR > 1) {
            return 0;
        }

       
        float ir = salarioBasico * porcentajeIR;

        
        return calcularSalarioNeto(salarioBasico) - ir;
    }
}
