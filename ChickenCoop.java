class ChickenCoop{
  private int size;
  private Chicken[] coop;

  public ChickenCoop() {
    this.coop = new Chicken[10];
  }


  public int chickenCount() {
    int count = 0;
    for (Chicken chicken : coop) {
      if (chicken != null) {
        count ++;
      }
    }
    return count;
  }

  public void addChicken(Chicken chicken) {
    if (coopFull()) {
      return;
    }
    int chickenCount = chickenCount();
    coop[chickenCount] = chicken;
  }

  public boolean coopFull() {
    return chickenCount() == coop.length;
  }

  public void chickenMeat() {
    for (int i = 0; i < coop.length; i++) {
      coop[i] = null;
    }
  }

}