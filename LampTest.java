package z01_eng.exercise2_test;

import org.junit.Test;

import z01_eng.exercise2.Lamp;

import static org.junit.Assert.*;

public class LampTest {
    
    @Test
    public void testLamp() {
        
        Lamp lamp = new Lamp();
        assertFalse(lamp.isLit());
        assertEquals(0, lamp.getBrightnessLevel());
        assertFalse(lamp.isOn());
        
        // Turn the lamp on
        lamp.switchOn();
        assertTrue(lamp.isLit());
        assertEquals(1, lamp.getIntensity());
        assertTrue(lamp.isOn());
        
        // Brighten the lamp
        for (int i = 1; i <= 9; i++) {
            lamp.brighten();
            assertEquals(i+1, lamp.getIntensity());
        }
        assertTrue(lamp.isOn());
        
        // Try to brighten the lamp beyond the maximum level
        lamp.brighten();
        assertFalse(lamp.isOn());
        
        // Replace the burnt out bulb
        assertFalse(lamp.replaceBulb());
        lamp.switchOff();
        assertTrue(lamp.replaceBulb());
        
        // Turn the lamp back on with the new bulb
        lamp.switchOn();
        assertTrue(lamp.isLit());
        assertEquals(1, lamp.getIntensity());
        assertTrue(lamp.isOn());
        
        // Dim the lamp
        for (int i = 1; i <= 9; i++) {
            lamp.dim();
            assertEquals(10-i, lamp.getIntensity());
        }
        assertFalse(lamp.isOn());
        
        // Try to dim the lamp beyond the minimum level
        lamp.dim();
        assertFalse(lamp.isOn());
        
    }
}

