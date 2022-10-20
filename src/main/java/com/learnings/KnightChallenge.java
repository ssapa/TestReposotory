package com.learnings;

import java.util.ArrayList;
import java.util.List;

public class KnightChallenge {
    int[][] board = new int[8][8];
    /*int[][] pos = new int[2][8]{
            {1,2},{1,-2},{2,1},{2,-1},{-2,1},{-2,-1},{-1,2},{-1,-2}};*/
    public static List<String> pos = new ArrayList<String>();

    // {(1,2),(1,-2),(2,1),(2,-1),(-2,1),(-2,-1),(-1,2),(-1,-2)}
    public static void main(String[] args) {
        pos.add("1,2");
        pos.add("1,-2");
        pos.add("-1,2");
        pos.add("-1,-2");
        pos.add("2,1");
        pos.add("2,-1");
        pos.add("-2,1");
        pos.add("-2,-1");
        System.out.println(pos);
    }
}
