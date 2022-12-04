class Main {
  public static void main(String[] args) {
    System.out.println("FizzBuzz Generator!");

    for (int i = 0; i<101; i++){
      System.out.println(i + ": " + fizzBuzz(i));
    }
    
  }

  public static String fizzBuzz(int num) { 
  String result = " ";
    
    if (!(num % 3 == 0 || num % 5 == 0)){  
    return "num";
    }

    else if (num % 5 == 0) { 
      return "buzz"; 
    } 
    else if (num % 3 == 0) { 
      return "fizz"; 
    } 
    else if (num % 15 == 0) { 
      return "fizzbuzz"; 
    } 
    
    return ""; 
  }    
}
  
