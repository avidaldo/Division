package org.example.utilidades;

public class StringUtilities {
    static String obtenerAcronimo(String cadena) {
        StringBuilder resultado = new StringBuilder();
        char caracter;
        int n = cadena.length();
        for (int i = 0; i < n; i++) {
            caracter = cadena.charAt(i);
            if (caracter != ' ')
                if (i == 0) resultado.append(caracter).append('.');
                else if (cadena.charAt(i - 1) == ' ') resultado.append(caracter).append('.');
        }
        return resultado.toString();
    }
}
