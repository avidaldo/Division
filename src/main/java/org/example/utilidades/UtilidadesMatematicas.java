package org.example.utilidades;

/**
 * Clase final que contiene funciones (métodos estáticos) no vinculadas a ningún objeto.
 * No tiene sentido, por tanto, que se pueda heredar de ella (por eso la declaramos final), ni
 * crear objetos de ella (por eso le añadimos un constructor privado)
 */
public final class UtilidadesMatematicas {

    /**
     * Constructor privado para que la clase no sea instanciable
     */
    private UtilidadesMatematicas(){}

    /**
     * Función trivial que calcula una división
     *
     * @param dividendo: Dividendo de la operación
     * @param divisor: Divisor de la operación
     * @return Float con el resultado
     * @throws Exception Lanza una excepción si el divisor es cero.
     */
    public static float calcularDivision(float dividendo, float divisor) throws Exception {
        if (divisor == 0) throw (new Exception("Error. El divisor no puede ser 0."));
        // TODO: no tiene sentido; la división ya lanza una excepción más concreta
        return dividendo / divisor;
    }

    public static float factorial(byte n) throws Exception {
        if (n < 0) throw new Exception("Error. El número tiene que ser >=0");
        float resultado = 1;
        for (int i = 2; i <= n; i++) resultado *= i;
        return resultado;
    }

}
