package z01_eng.exercise2_test;


import org.junit.Test;

import z01_eng.exercise2.Bulb;

import static org.junit.Assert.*;

public class BulbTest {

  @Test
  public void testSwitchOn() {
    Bulb b = new Bulb();
    b.switchOn();
    assertTrue(b.getState());
  }

  @Test
  public void testBrighten() {
    Bulb b = new Bulb();
    b.switchOn();
    b.brighten();
    // add an assertion about the brightness here
  }

  @Test
  public void testDim() {
    Bulb b = new Bulb();
    b.switchOn();
    b.dim();
    // add an assertion about the dimness here
  }

  @Test
  public void testReplaceBulb() {
    Bulb b = new Bulb();
    b.switchOn();
    b.replaceBulb();
    assertFalse(b.getState());
    assertFalse(b.getIsBurnt());
  }

}
