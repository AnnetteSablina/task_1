package com.annette.task10;

public class Runner {
    public static void main (String ... args){
        PrintTable.printTable(MakeTable.makeTable(Section.fromUserInput()));
    }
}
