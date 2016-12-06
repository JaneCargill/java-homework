import java.util.*;

class ChickenCoop{
  private int size;
  private ArrayList<Chicken> coop;

  public ChickenCoop() {
    this.coop = new ArrayList<Chicken>();
  }

  public int chickenCount() {
    return coop.size();
  }

  public void addChicken(Chicken chicken) {
    coop.add(chicken);
  }

  public void foxGetsIn() {
    coop.clear();
  }

  public Chicken foxGetsChicken() {
    if (chickenCount() > 0) {
      return coop.remove(0);
    }
    return null;
  }

}