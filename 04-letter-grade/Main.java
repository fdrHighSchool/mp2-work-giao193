class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println(LetterGrade(96));
  }
  public static String LetterGrade(int a){
  String grade = "";
  if (a >= 90){
    if (a >= 97)
    {
      grade += "A+";
    }
    else if(a<= 94){
      grade += "A-";
    }
    else{
      grade += "A";
    }
  }
  else if(a >= 80){
    if (a >= 87)
    {
      grade += "B+";
    }
    else if(a<= 84){
      grade += "B-";
    }
    else{
      grade += "B";
    }
  }
  else if(a >= 70){
    if (a >= 77)
    {
      grade += "C+";
    }
    else if(a<= 74){
      grade += "C-";
    }
    else{
      grade += "C";
    }
  }
  else if(a >= 60){
     if (a >= 67)
    {
      grade += "D+";
    }
    else if(a<= 64){
      grade += "D-";
    }
    else{
      grade += "D";
    }
  }
  else{
    grade += "F";
  }
  return grade;
  }
}
