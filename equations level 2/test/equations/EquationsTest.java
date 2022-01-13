package equations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EquationsTest {

  @Test
  public void test0() {

    EquationCorrector equationCorrector = new EquationCorrector();
    assertEquals("9=9", equationCorrector.correctEquation("0=9"));
    assertEquals("6=6", equationCorrector.correctEquation("0=6"));
  }

  @Test
  public void test1() {

    EquationCorrector equationCorrector = new EquationCorrector();
    assertEquals("", equationCorrector.correctEquation("1=3"));
  }

  @Test
  public void test2() {

    EquationCorrector equationCorrector = new EquationCorrector();
    assertEquals("3=3", equationCorrector.correctEquation("2=3"));
  }

  @Test
  public void test3() {

    EquationCorrector equationCorrector = new EquationCorrector();
    assertEquals("5=5", equationCorrector.correctEquation("3=5"));
    assertEquals("2=2", equationCorrector.correctEquation("3=2"));
  }

  @Test
  public void test4() {

    EquationCorrector equationCorrector = new EquationCorrector();
    assertEquals("", equationCorrector.correctEquation("4=3"));
  }

  @Test
  public void test5() {

    EquationCorrector equationCorrector = new EquationCorrector();
    assertEquals("3=3", equationCorrector.correctEquation("5=3"));
  }

  @Test
  public void test6() {

    EquationCorrector equationCorrector = new EquationCorrector();
    assertEquals("0=0", equationCorrector.correctEquation("6=0"));
    assertEquals("9=9", equationCorrector.correctEquation("6=9"));
  }

  @Test
  public void test7() {

    EquationCorrector equationCorrector = new EquationCorrector();
    assertEquals("", equationCorrector.correctEquation("7=3"));
  }

  @Test
  public void test8() {

    EquationCorrector equationCorrector = new EquationCorrector();
    assertEquals("", equationCorrector.correctEquation("8=3"));
  }

  @Test
  public void test9() {

    EquationCorrector equationCorrector = new EquationCorrector();
    assertEquals("0=0", equationCorrector.correctEquation("9=0"));
    assertEquals("6=6", equationCorrector.correctEquation("9=6"));
  }

  @Test
  public void testEquation() {

    EquationCorrector equationCorrector = new EquationCorrector();
    assertEquals("2+6=8", equationCorrector.correctEquation("2+9=8"));
    assertEquals("8=8", equationCorrector.correctEquation("8=8"));
  }

  @Test
  public void testEquation2() {

    EquationCorrector equationCorrector = new EquationCorrector();
    assertEquals("1+5=6", equationCorrector.correctEquation("1+5=0"));
  }

  @Test
  public void testEquation3() {

    EquationCorrector equationCorrector = new EquationCorrector();
    assertEquals("6+3=9", equationCorrector.correctEquation("0+3=9"));
  }

  @Test
  public void testEquation4() {

    EquationCorrector equationCorrector = new EquationCorrector();
    assertEquals("6-3=3", equationCorrector.correctEquation("9-3=3"));
  }

  @Test
  public void testEquation5() {

    EquationCorrector equationCorrector = new EquationCorrector();
    assertEquals("6-3=3", equationCorrector.correctEquation("0-3=3"));
  }

  @Test
  public void testEquation6() {

    EquationCorrector equationCorrector = new EquationCorrector();
    assertEquals("3=6-3", equationCorrector.correctEquation("3=0-3"));
  }

  @Test
  public void testEquation7() {

    EquationCorrector equationCorrector = new EquationCorrector();
    assertEquals("9=6+3", equationCorrector.correctEquation("9=6+2"));
    assertEquals("9=6+3", equationCorrector.correctEquation("9=6+5"));
  }

}
