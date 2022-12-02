class Main {
  public static void main(String[] args) {
    System.out.println("It is leap year?!?");

    System.out.println(isLeapYear(2000));// yes
    System.out.println(isLeapYear(2022));// no
    System.out.println(isLeapYear(1900));// no
    System.out.println(isLeapYear(2024));// yes
    System.out.println(isLeapYear(3030));// ?

  }// end main method

  public static boolean isLeapYear(int year) {
    if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
      return false;
    }

    else {

      return true;
    }
  }
}// end class
