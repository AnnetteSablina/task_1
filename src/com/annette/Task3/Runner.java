package com.annette.Task3;

public class Runner {
    public static void main(String ... args){
      int squareSide = SquareLogic.enterSquareSide();
      int square = SquareLogic.countSquare(squareSide);
      System.out.println ("Inscribed square is "+ SquareLogic.countInscribedSquare(square));
    }
}
