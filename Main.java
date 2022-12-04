class Main {
  public static void main(String[] args) {
    System.out.println();
  }

  public static int countQuarters(int a) {
    int quarter = 0;
    quarter = (a % 100) % 25;
    return quarter;

  }
}
