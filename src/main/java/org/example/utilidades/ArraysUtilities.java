package org.example.utilidades;

public class ArraysUtilities {
    public static boolean buscaCaracterEnArray(char c, char[] v) {
        int a, z, m;
        a = 0;
        z = v.length - 1;
        boolean resultado = false;
        while (a <= z && !resultado) {
            m = (a + z) / 2;
            if (v[m] == c) resultado = true;
            else if (v[m] < c) a = m + 1;
            else z = m - 1;
        }
        return resultado;
    }
}
