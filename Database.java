import java.util.*;

public class Database {
    TreeSet<Saying> tree;
    Map<String, List<Saying>> hawaiianToSayings;
    Map<String, List<Saying>> englishToSayings;

    public Database() {
        tree = new TreeSet<>();
        hawaiianToSayings = new HashMap<>();
        englishToSayings = new HashMap<>();
    }

    public boolean Member(Saying s){
        return tree.contains(s);
    }

    public Saying First(){
        return tree.first();
    }

    public Saying Last(){
        return tree.last();
    }

    public Saying Predecessor(Saying s){
        return tree.lower(s);
    }

    public Saying Successor(Saying s){
        return tree.higher(s);
    }

    public void Insert(Saying s){
        tree.add(s);

        // Index words for MeHua and WithWord operations
        for (String word : s.getHawaiian().split(" ")) {
            hawaiianToSayings.computeIfAbsent(word, k -> new ArrayList<>()).add(s);
        }

        for (String word : s.getEnglish().split(" ")) {
            englishToSayings.computeIfAbsent(word, k -> new ArrayList<>()).add(s);
        }
    }

    public List<Saying> MeHua(String s){
        return hawaiianToSayings.getOrDefault(s, new ArrayList<>());
    }

    public List<Saying> WithWord(String s){
        return englishToSayings.getOrDefault(s, new ArrayList<>());
    }
}
