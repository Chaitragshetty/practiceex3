//Write a program to create a ChessBoard pattern with the help of multidimensional array, where
//WWrepresents white color and BB represents Black color.
package com.stackroute.PE3;

public class ChessBoard {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
          //check for the even places nd print it
                if(i%2==0) {
                    System.out.print("ww" + "|" + "bb" + "|");
                }
                else {
                    System.out.print("bb" + "|" + "ww" + "|");
                }
            }
        }
    }
}

