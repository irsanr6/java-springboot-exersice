package com.irsan.javaexercise.iseng;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
//        stack bersifat last in first out, jadi yang terakhir di push, maka yang akan hilang pertama kali jika di pop
        Stack<GameEntry> entryStack = new Stack<>();
        GameEntry gameEntry1 = new GameEntry("Irsan", 70);
        GameEntry gameEntry2 = new GameEntry("Aji", 85);
        GameEntry gameEntry3 = new GameEntry("Ilham", 54);
        GameEntry gameEntry4 = new GameEntry("Fikri", 60);

//        menambahkan element
        entryStack.push(gameEntry1);
        entryStack.push(gameEntry2);
        entryStack.push(gameEntry3);
        entryStack.push(gameEntry4);
//        remove element terakhir
        entryStack.pop();

//        menampilkan element
        for (GameEntry entry : entryStack) {
            System.out.println(entry);
        }
//        set element dari index ke 2 menjadi index ke 0
        entryStack.setElementAt(gameEntry3, 0);
        int checkIndex = entryStack.indexOf(gameEntry3);
        System.out.println("Check index " + urutan(checkIndex));

//        ambil element terakhir
        GameEntry last = entryStack.lastElement();
        System.out.println("Nama Pemain : " + last.getName());
        System.out.println("Score Pemain : " + last.getScore());
    }

    public static int urutan(int indexOf) {
        return indexOf + 1;
    }
}
