import java.util.TreeSet;

public class Database {
    private TreeSet<Saying> tree;
    private HashMap<String, ArrayList<Saying>> arabicWordMap;
    private HashMap<String, ArrayList<Saying>> englishWordMap;

    public Database() {
        tree = new TreeSet<>(Comparator.comparing(s -> s.arabicS));
        arabicWordMap = new HashMap<>();
        englishWordMap = new HashMap<>();
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
        return ;
    }
    public Saying Successor(Saying s){
        return;
    }
    public void Insert(Saying s){
        tree.add(s);
        for (String word : s.arabicS.split("\\s+")) {
            arabicWordMap.computeIfAbsent(word, k -> new ArrayList<>()).add(s);
        }
        for (String word : s.englishT.split("\\s+")) {
            englishWordMap.computeIfAbsent(word, k -> new ArrayList<>()).add(s);
        }
    }

    public ArrayList<Saying> MeHua(String s){
        return arabicWordMap.getOrDefault(word, new ArrayList<>());
    }

    public ArrayList<Saying> WithWord(String s){
        return englishWordMap.getOrDefault(word, new ArrayList<>());
    }
}
