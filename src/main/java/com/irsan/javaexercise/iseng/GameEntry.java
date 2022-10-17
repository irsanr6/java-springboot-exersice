package com.irsan.javaexercise.iseng;

import java.util.Arrays;

public class GameEntry {
    private String name;
    private int score;

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "GameEntry{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

class ScoreBoard {
    private int numEntries;
    private GameEntry[] board;

    public ScoreBoard(int capacity) {
        board = new GameEntry[capacity];
    }

    public Object showScoreBoard() {
        return Arrays.deepToString(board);
    }

    public void add(GameEntry e) {
        int newScore = e.getScore();
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if (numEntries < board.length) {
                numEntries++;
                int j = numEntries - 1;
                while (j > 0 && board[j - 1].getScore() < newScore) {
                    board[j] = board[j - 1];
                    j--;
                }
                board[j] = e;
            }
        }
    }

    public void remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= numEntries) {
            throw new IndexOutOfBoundsException("Invalid index " + i);
        } else {
            GameEntry temp = board[i];
            for (int j = i; j < numEntries; j++) {
                board[j] = board[j+1];
            }
            board[numEntries-1] = null;
            numEntries--;
        }
    }

}

class DemoGameEntry {
    public static void main(String[] args) {
        GameEntry gameEntry1 = new GameEntry("Irsan", 70);
        GameEntry gameEntry2 = new GameEntry("Aji", 85);
        GameEntry gameEntry3 = new GameEntry("Ilham", 54);
        GameEntry gameEntry4 = new GameEntry("Fikri", 60);

        ScoreBoard scoreBoard = new ScoreBoard(5);
        scoreBoard.add(gameEntry1);
        scoreBoard.add(gameEntry2);
        scoreBoard.add(gameEntry3);
        scoreBoard.add(gameEntry4);

        System.out.println(scoreBoard.showScoreBoard());

        scoreBoard.remove(1);

        System.out.println(scoreBoard.showScoreBoard());
        ;
    }
}
