import java.util.TreeSet;

public class Database {
    TreeSet<Saying> tree;

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
        return;
    }

    public ArrayList<Saying> MeHua(String s){
        return;
    }

    public ArrayList<Saying> WithWord(String s){
        return;
    }

}
