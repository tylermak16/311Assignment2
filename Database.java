/**
 * Sayings Class
 * Authors:
 * Tyler Mak
 * Alexis Karl Buted
 * Date: 6/14/2024
 */

import java.util.*;

public class Database {
    TreeSet<Saying> tree;
    Map<String, List<Saying>> arabicToSayings;
    Map<String, List<Saying>> englishToSayings;

    public Database() {
        tree = new TreeSet<>();
        arabicToSayings = new HashMap<>();
        englishToSayings = new HashMap<>();
    }

    public boolean Member(Saying s) {
        return tree.contains(s);
    }

    public Saying First() {
        return tree.first();
    }

    public Saying Last() {
        return tree.last();
    }

    public Saying Predecessor(Saying s) {
        return tree.lower(s);
    }

    public Saying Successor(Saying s) {
        return tree.higher(s);
    }

    public void Insert(Saying s) {
        if (tree.add(s)) {
            indexSaying(s);
        }
    }

    public List<Saying> MeHua(String word) {
        return arabicToSayings.getOrDefault(word, Collections.emptyList());
    }

    public List<Saying> WithWord(String word) {
        return englishToSayings.getOrDefault(word, Collections.emptyList());
    }

    private void indexSaying(Saying s) {
        for (String word : s.getArabic().split("\\s+")) {
            arabicToSayings.computeIfAbsent(word, k -> new ArrayList<>()).add(s);
        }
        for (String word : s.getEnglish().split("\\s+")) {
            englishToSayings.computeIfAbsent(word, k -> new ArrayList<>()).add(s);
        }
    }
}

