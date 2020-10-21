public class Main {

  public static void main(String[] args) {
    Counter counter = new Counter();
    counter.count();
    System.out.println("Hemos contado hasta " + counter.getResult());
  }
}