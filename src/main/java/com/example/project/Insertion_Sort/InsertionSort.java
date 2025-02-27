package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int c = 0;
        for (int i = 0; i < elements.length; i++){
            int t = elements[i];
            int k = i;
            while (k > 0 && t < elements[k - 1]) {
                c++;
                elements[k] = elements[k - 1];
                k--;
            }
            elements[k] = t;
        }
        System.out.println("cnt: " + c);
        return elements;
    }

   
    public static int[] selectionSort(int[] elements) {
        int c = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            int l = i;
            for (int i2 = i + 1; i2 < elements.length; i2++) {
                c++;
                if (elements[i2] < elements[l])
                    l = i2;
            }
            int t = elements[i];
            elements[i] = elements[l];
            elements[l] = t;
        }
        System.out.println(c);
        return elements;
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int c = 0;
        for (int i = 0; i < words.size(); i++){
            String t = words.get(i);
            int k = i;
            while (k > 0 && t.compareTo(words.get(k - 1)) < 0) {
                c++;
                words.set(k, words.get(k - 1));
                k--;
            }
            words.set(k, t);
        }
        System.out.println("cnt: " + c);
        return words;
    }

    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        int c = 0;
        for (int i = 0; i < words.size() - 1; i++) {
            int l = i;
            for (int i2 = i + 1; i2 < words.size(); i2++) {
                c++;
                if (words.get(i2).compareTo(words.get(l)) < 0) {
                    l = i2;
                }
            }
            words.set(i, words.set(l, words.get(i)));
        }
        System.out.println("cnt: " + c);
        return words;
    }

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
    public static void main(String[] args) {
        //
    }
}