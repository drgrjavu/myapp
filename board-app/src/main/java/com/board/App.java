/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.board;



public class App {
  public static void main(String[] args) {
    System.out.println("게시판 애플리케이션");
    System.out.println();
    System.out.println("환영합니다");
    System.out.println();

    java.util.Scanner keyboardInput = new java.util.Scanner(System.in);

    while(true) {
      System.out.println("메뉴:");
      System.out.println("  1: 게시글 목록");
      System.out.println("  2: 게시글 상세보기");
      System.out.println();
      System.out.print("메뉴를 선택하세요[1..2](0: 종료)");

      int menuNo = keyboardInput.nextInt();
      keyboardInput.nextLine(); // <-- 숫자뒤에 남아있는 엔터코드를 제거하는 코드

      if (menuNo == 0) {
        break;
      } else if (menuNo == 1) {
        System.out.println("[게시글 목록]");

      } else if (menuNo == 2) {
        System.out.println("[게시글 상세보기]");

      } else {
        System.out.println("메뉴 번호가 옳지 않습니다");

      }

    }
    System.out.println("안녕히 가세요");
    keyboardInput.close();
  }
}
