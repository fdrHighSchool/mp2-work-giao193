class Main {
  public static void main(String[] args) {
    System.out.println(div(3));
    System.out.println(div(20));
    System.out.println(div(50));
    System.out.println(div(21));
  }

  public static boolean div(int a) {
    int result = 0;
    while (a % 10 > 10) {
      result += a % 10;
      a = a % 10;
    }
    result += a;
    if (result % 3 == 0) {
      return true;
    } else {
      return false;
    }
  }
}
