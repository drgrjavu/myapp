package com.board;

public class Practice {

  int stID;
  String stName;
  int grade;
  String address;

  public String getStName() {
    return stName;
  }
  public static void main(String[] args) {
    Practice stAhn = new Practice();
    stAhn.stName = "안연수";
    System.out.println(stAhn.getStName());
    System.out.println(stAhn.stName);
    System.out.println(stAhn);
  }

}
