/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static com.mycompany.mavenproject1.Mavenproject1.dia_laboral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author CarlosGutierreez
 */
public class MiClase {
    
  @Test
    public void testLunesEsDiaLaboral() {
        assertTrue(dia_laboral("Lunes"));
        assertFalse(dia_laboral("lunes"));
    }

    @Test
    public void testMartesEsDiaLaboral() {
        assertTrue(dia_laboral("Martes"));
        assertFalse(dia_laboral("martes"));
    }

    @Test
    public void testMiercolesEsDiaLaboral() {
        assertTrue(dia_laboral("Miercoles"));
        assertFalse(dia_laboral("miercoles"));
    }

    @Test
    public void testJuevesEsDiaLaboral() {
        assertTrue(dia_laboral("Jueves"));
        assertFalse(dia_laboral("jueves"));
    }

    @Test
    public void testViernesEsDiaLaboral() {
        assertTrue(dia_laboral("Viernes"));
        assertFalse(dia_laboral("viernes"));
    }

    @Test
    public void testSabadoNoEsDiaLaboral() {
        assertFalse(dia_laboral("Sabado"));
        assertFalse(dia_laboral("sabado"));
    }

    @Test
    public void testDomingoNoEsDiaLaboral() {
        assertFalse(dia_laboral("Domingo"));
        assertFalse(dia_laboral("domingo"));
    }

    @Test
    public void testDiaNoValidoNoEsDiaLaboral() {
        assertFalse(dia_laboral("Festivo"));
    }

    @Test
    public void testDiaNuloNoEsDiaLaboral() {
        // Opcional, si se quiere probar que un null no cause error y devuelva false
        assertFalse(dia_laboral(""));
    }

    
}
