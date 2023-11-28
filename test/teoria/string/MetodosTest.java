package teoria.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetodosTest {

    @Test
    void obtenerNumeroOcurrencias() {
        assertEquals(3,
                Metodos.obtenerNumeroOcurrencias("cocodrilo", 'o'));
        assertEquals(0,
                Metodos.obtenerNumeroOcurrencias("cocodrilo", ' '));
        assertEquals(0,
                Metodos.obtenerNumeroOcurrencias("", 'a'));
        assertEquals(0,
                Metodos.obtenerNumeroOcurrencias("cocodriolo", 'a'));
        assertEquals(1,
                Metodos.obtenerNumeroOcurrencias("cocodriolo", 'd'));
        assertEquals(0,
                Metodos.obtenerNumeroOcurrencias("cocodriolo", 'D'));
    }

    @Test
    void ultimaPosicionCaracter() {
        assertEquals(-1, Metodos.ultimaPosicionCaracter("cocodrilo", 'f'));
        assertEquals(8, Metodos.ultimaPosicionCaracter("cocodrilo", 'o'));
        assertEquals(4, Metodos.ultimaPosicionCaracter("cocodrilo", 'd'));
    }

    @Test
    void primerPosicionSubcadena() {
        assertEquals(-1, Metodos.primerPosicionSubcadena("cocodrilo", "dd"));
        assertEquals(0, Metodos.primerPosicionSubcadena("cocodrilo", "co"));
        assertEquals(4, Metodos.primerPosicionSubcadena("cocodrilo", "dri"));
        assertEquals(-2, Metodos.primerPosicionSubcadena("cocodrilo", null));
        assertEquals(-2, Metodos.primerPosicionSubcadena(null, "ol"));

    }

    @Test
    void obtenerSubcadena() {
        assertNotNull(Metodos.obtenerSubcadena("hola", 0));
        assertEquals("hola", Metodos.obtenerSubcadena("hola", 0));
        assertEquals("ola", Metodos.obtenerSubcadena("hola", 1));
        assertEquals("", Metodos.obtenerSubcadena("hola", 10));
        assertEquals(null, Metodos.obtenerSubcadena(null, 10));

    }

    @Test
    void reemplazarCaracteres() {
        assertEquals("cOcOdrilO", Metodos.reemplazarCaracteres(
                "cocodrilo", 'o', 'O'));
        assertEquals("cocodrilo",  Metodos.reemplazarCaracteres(
                "cocodrilo",'z', 'w'));
        //assertEquals(null,  Metodos.reemplazarCaracteres(
       //         null,'z', 'w'));
        assertNull(Metodos.reemplazarCaracteres( null,'z', 'w'));
        assertEquals("cocoDrilo", Metodos.reemplazarCaracteres(
                "cocodrilo", 'd', 'D'));
        assertEquals("", Metodos.reemplazarCaracteres("", 'd', 'D'));
    }

    @Test
    void reemplazarSubcadenas() {
        assertNull(Metodos.reemplazarSubcadenas(null, "1", "2"));
        assertEquals("XXXXdrilo", Metodos.reemplazarSubcadenas("cocodrilo",
                "co", "XX"));
        assertEquals("cocodrilo", Metodos.reemplazarSubcadenas("cocodrilo",
                "zz", "XX"));
        assertEquals("", Metodos.reemplazarSubcadenas("", "d", "D"));
        assertEquals("cocodrilo", Metodos.reemplazarSubcadenas(
                "cocodrilo", null, "Z"));
        assertEquals("cocodrilo", Metodos.reemplazarSubcadenas(
                "cocodrilo", "c", null));
        assertEquals("cocodrilo", Metodos.reemplazarSubcadenas(
                "cocodrilo", null, null));
        assertNull(Metodos.reemplazarSubcadenas(null, null, null));


    }
}