//import Assignment2;

/**
 * Main Class
 * Authors:
 * Alexis Karl Buted
 * Date: 6/14/2024
*/

public class main {
    public static void main(String[] args){
        BST db = new BST();
        Saying s1 = new Saying("الصبر مفتاح الفرج", "Patience is the key to relief", "ممارسة الصبر ضرورية لتحقيق الراحة", "Remaining patient helps overcome difficulties and find solutions");
        Saying s2 = new Saying("العجلة من الشيطان", "Haste is from the devil", "الاندفاع يؤدي إلى عواقب سلبية", "Rushing into things often leads to errors and bad outcomes");

        db.insert(s1);
        db.insert(s2);

        System.out.println("First Saying: " + db.first());
        System.out.println("Last Saying: " + db.last());
        System.out.println("Member: " + db.member("العجلة من الشيطان"));
        System.out.println("Predecessor: " + db.predecessor("العجلة من الشيطان"));
        System.out.println("Successor: " + db.successor("الصبر مفتاح الفرج"));

        System.out.println("Sayings with Arabic word 'مفتاح': " + db.meHua("مفتاح"));
        System.out.println("Sayings with English word 'key': " + db.withWord("key"));
    }
}
