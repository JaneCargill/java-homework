import org.junit.*;
import static org.junit.Assert.assertEquals;

public class ChickenCoopTest {
  ChickenCoop coop;
  LayingHen hen;
  ChickenMeat chickenMeat;

  @Before
  public void before() {
  coop = new ChickenCoop();
  hen = new LayingHen();
  chickenMeat = new ChickenMeat();
  }

  @Test
  public void coopStartsEmpty() {
    assertEquals(0, coop.chickenCount());
  }

  @Test
  public void coopAcceptsChicken() {
    coop.addChicken(chickenMeat);
    coop.addChicken(hen);
    assertEquals(2, coop.chickenCount());
  }

  @Test
  public void coopEmptyAfterFox() {
    coop.addChicken(chickenMeat);
    coop.addChicken(hen);
    coop.foxGetsIn();
    assertEquals(0, coop.chickenCount());
  }

  @Test
  public void foxGetsChicken() {
    coop.addChicken(hen);
    Chicken chicken = coop.foxGetsChicken();
    LayingHen food = (LayingHen)chicken;
    assertEquals("clucking", food.cluck());
  }

  @Test
  public void chickenCanCluck() {
    coop.addChicken(chickenMeat);
    Chicken chicken = coop.foxGetsChicken();
    assertEquals("cluck", chicken.cluck());
  }
}