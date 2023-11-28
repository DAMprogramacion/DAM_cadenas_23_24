package teoria.string;

/**
 * Clase para probar algunos métodos de la clase String
 * @author manuel
 * @version 1.0.0
 */
public class Metodos {
    /**
     * método charAt
     * pasamos una cadena y un char, devuelve el nº ocurrencias
     * ejemplo "cocodrilo", 'o' devuelve 3
     * @param cadena donde buscamos caracteres
     * @param caracter a buscar
     * @return número de ocurrencias
     */

    public static int obtenerNumeroOcurrencias(String cadena, char caracter) {
        int contadorOcurrencias = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter)
                contadorOcurrencias++;
        }
        return contadorOcurrencias;
    }

    //método endsWith
    //buscamso si una cadena acaba en una secuencia de caracteres
    //Ejemplo "cocodrilo", "lo" devuelve true

    //equalsIgnoreCase
    //nos dice si el contenido de dos string son iguales
    //independientemente mayúsculas y minúsculas
    //ejemplo: "cocodrilo" "Cocodrilo" son iguales

    //indexOf
    //devuelve la primera ocurrencia
    //método "cocodrilo", 'o' devuelve posición 1

    //con cadenas "cocodrilo", "co" devuelve 0
    public static int primerPosicionSubcadena (String cadena, String subcadena){
        if (cadena == null || subcadena == null)
            return -2;
        return cadena.indexOf(subcadena);
    }

    //isEmpty
    //pasamos "cocodrilo" devuelve false

    //lastIndexOf
    // "cocodrilo", 'o' devuelve la última posición
    //probar con String
    public static int ultimaPosicionCaracter(String cadena, char caracter) {
        return cadena.lastIndexOf(caracter);
    }
    //length
    //pasamos "cocodrilo"  devuelve 9

    //parámentro String, int, devuelve un String
    // "co", 3 devuelve "cococo"

    //replace uno con char y otro con CharSequence
    public static String reemplazarCaracteres( String cadena, char aCambiar, char cambio){
        if (cadena == null)
            return null;
        return cadena.replace(aCambiar, cambio);
    }

    //replaceAll
    public static String reemplazarSubcadenas(String cadena, String oldCadena, String newCadena){
        if (cadena == null)
            return null;
        if (oldCadena == null || newCadena == null)
            return cadena;
        return cadena.replaceAll(oldCadena, newCadena);
    }
    //replaceFirst

    //startsWidth (parecido al endsWith)

    //substring hay dos
    public static String obtenerSubcadena(String cadena, int index) {
        if (cadena == null)
            return null;
        if (index >= cadena.length())
            return "";
        return cadena.substring(index);
    }

    //toUpperCase y toLowerCase

    //trim

    //valueOf con float

}
