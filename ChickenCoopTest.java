import org.junit.*;
import static org.junit.Assert.assertEquals;

public class ChickenCoopTest {
  ChickenCoop coop;
  Chicken chicken;

  @Before
  public void before() {
  coop = new ChickenCoop();
  chicken = new Chicken();
  }

  @Test
  public void coopStartsEmpty() {
    assertEquals(0, coop.chickenCount());
  }

  @Test
  public void coopAcceptsChicken() {
    coop.addChicken(chicken);
    assertEquals(1, coop.chickenCount());
  }

  @Test
  public void coopCannotAcceptChicken() {
    for (int i=0; i < 20; i++) {coop.addChicken(chicken);}
    assertEquals(10, coop.chickenCount());
  }

  @Test
  public void coopIsFull() {
    for (int i = 0; i < 10; i++) {
      coop.addChicken(chicken);
    }
    assertEquals(true, coop.coopFull());
  }

  @Test
  public void spacesInCoop() {
    coop.addChicken(chicken);
    assertEquals(1, coop.chickenCount());
    coop.chickenMeat();
    assertEquals(0, coop.chickenCount());
  }
}