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

    public static void main(String[] args) {
        Database db = new Database();

        Saying s1 = new Saying("الحب لكل واحد", "Love one another", "شرح باللغة العربية", "Explanation in English");
        Saying s2 = new Saying("اعتني جيدًا", "Take good care", "شرح باللغة العربية", "Explanation in English");
        Saying s3 = new Saying("الأرض رئيس؛ الرجل خادمها", "The land is a chief; man is its servant", "شرح باللغة العربية", "Explanation in English");

        db.Insert(s1);
        db.Insert(s2);
        db.Insert(s3);

        System.out.println("First: " + db.First().getArabic());
        System.out.println("Last: " + db.Last().getArabic());
        System.out.println("Predecessor of s2: " + db.Predecessor(s2).getArabic());
        System.out.println("Successor of s2: " + db.Successor(s2).getArabic());

        System.out.println("Sayings with 'الحب': " + db.MeHua("الحب"));
        System.out.println("Sayings with 'Love': " + db.WithWord("Love"));
    }
}

