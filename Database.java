/**
 * Sayings Class
 * Authors:
 * Tyler Mak
 * Alexis Karl Buted
 * Date: 6/14/2024
 */

import java.util.*;

/*
The `TreeSet<Saying> tree` in the `Database` class maintains `Saying` objects in a sorted order based on their Arabic phrases (`arabicS`), 
facilitating efficient ordered operations like first, last, and predecessor/successor lookups. `arabicToSayings` and `englishToSayings` are `Map<String, List<Saying>>` 
structures that associate Arabic and English words respectively with lists of `Saying` objects, allowing rapid access to sayings based on these linguistic keys.
*/
public class Database {
    TreeSet<Saying> tree;
    Map<String, List<Saying>> arabicToSayings;
    Map<String, List<Saying>> englishToSayings;

    /*
    The `public Database()` constructor initializes a `TreeSet` named `tree` to store `Saying` objects in natural order. It also initializes `HashMap` instances 
    `arabicToSayings` and `englishToSayings` to associate Arabic and English words with lists of `Saying` objects for efficient lookup by language attribute.
    */
    public Database() {
        tree = new TreeSet<>();
        arabicToSayings = new HashMap<>();
        englishToSayings = new HashMap<>();
    }

    /*
    The `Member` method in the `Database` class checks if a `Saying` object `s` is present in the `tree` (`TreeSet<Saying>`). It returns `true` if `s` exists in the `tree`, 
    indicating membership; otherwise, it returns `false`. This method efficiently leverages the `TreeSet`'s underlying data structure, which ensures fast lookup operations 
    based on the natural ordering or provided comparator of `Saying` objects.
    */
    public boolean Member(Saying s) {
        return tree.contains(s);
    }

    /*
    The `First` method in the `Database` class returns the first `Saying` object in the `tree` (`TreeSet<Saying>`). This method retrieves the smallest element in the sorted 
    set according to the natural ordering of `Saying` objects or the comparator defined during `TreeSet` initialization. It provides efficient access to the smallest element 
    due to the balanced tree structure of `TreeSet`, ensuring logarithmic time complexity for this operation.
    */
    public Saying First() {
        return tree.first();
    }

    /*
    The `Last` method in the `Database` class returns the last `Saying` object in the `tree` (`TreeSet<Saying>`). This method retrieves the largest element in the sorted set 
    according to the natural ordering of `Saying` objects or the comparator defined during `TreeSet` initialization. It efficiently accesses the largest element due to the 
    balanced tree structure of `TreeSet`, ensuring logarithmic time complexity for this operation.
    */
    public Saying Last() {
        return tree.last();
    }

    /*
    The `Predecessor` method in the `Database` class returns the before `Saying` object in the `tree` (`TreeSet<Saying>`) that is strictly bnefore the given `Saying` object `s`. 
    It utilizes the `lower` method of the `TreeSet`, which efficiently finds and returns the predecessor of `s` based on the natural ordering of `Saying` objects or the comparator 
    defined during `TreeSet` initialization. This operation is efficient due to the balanced tree structure of `TreeSet`, ensuring logarithmic time complexity.
    */
    public Saying Predecessor(Saying s) {
        return tree.lower(s);
    }

    /*
    The `Successor` method in the `Database` class returns the after `Saying` object in the `tree` (`TreeSet<Saying>`) that is strictly after the given `Saying` object `s`. 
    It utilizes the `higher` method of the `TreeSet`, which efficiently finds and returns the successor of `s` based on the natural ordering of `Saying` objects or the comparator 
    defined during `TreeSet` initialization. This operation is efficient due to the balanced tree structure of `TreeSet`, ensuring logarithmic time complexity.
    */
    public Saying Successor(Saying s) {
        return tree.higher(s);
    }

    /*
    The `Insert` method in the `Database` class attempts to add a `Saying` object `s` to the `tree` (`TreeSet<Saying>`). If the addition is successful 
    (indicating `s` was not already present in the `tree`), it calls the `indexSaying(s)` method to update additional data structures (`arabicToSayings` and `englishToSayings`) 
    for efficient querying based on Arabic and English words associated with `s`.
    */
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

