import java.util.Scanner;

public class SalarioNetoNicaragua {

    public static void main(String[] args) {

        float salarioBasico;
        float afiliacion;
        float inss;
        float ir;
        float salarioNeto;

    
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su salario básico: ");
        salarioBasico = sc.nextFloat();

        if (salarioBasico < 0) {
            System.out.println("El salario básico debe ser mayor o igual a cero.");
            return;
        }

        // Calcular el monto de la afiliación
        afiliacion = salarioBasico * 0.01f;

        // Calcular el monto del INSS
        inss = salarioBasico * 0.07f;

        // Calcular el monto del IR
        ir = calcularIR(salarioBasico);

        // Calcular el salario neto
        salarioNeto = salarioBasico - afiliacion - inss - ir;

        // Imprimir los resultados
        System.out.println("Salario básico: C$" + salarioBasico);
        System.out.println("Afiliación: C$" + afiliacion);
        System.out.println("INSS: C$" + inss);
        System.out.println("IR: C$" + ir);
        System.out.println("Salario neto: C$" + salarioNeto);
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
}
