package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {
        for (int i = 0; i < elements.length - 1; i++) {
            int l = i;
            for (int i2 = i + 1; i2 < elements.length; i2++) {
                if (elements[i2] < elements[l])
                    l = i2;
            }
            int t = elements[i];
            elements[i] = elements[l];
            elements[l] = t;
        }
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        for (int i = 0; i < words.size() - 1; i++) {
            int l = i;
            for (int i2 = i + 1; i2 < words.size(); i2++) {
                if (words.get(i2).compareTo(words.get(l)) < 0) {
                    l = i2;
                }
            }
            words.set(i, words.set(l, words.get(i)));
        }
        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }
}
