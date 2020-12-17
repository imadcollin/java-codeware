package codewar.Book;

import java.util.Scanner;

abstract class Book {
     private String title;

     void setTitle(String title){};
     String getTitle(){
         return  title;
     }
}
class MyBook{
     private String title ;
      void setTitle(String title){
          this.title=title;
      }
      String getTitle(){
          return title;
      }
}
 class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title: ");

        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();

    }
}