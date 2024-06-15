/**
 * Main Class
 * Authors:
 * Alexis Karl Buted
 * Date: 6/14/2024
*/

public class main {
    public static void main(String[] args){
        Database db = new Database();

 // Collection of 10 Arabic proverbs
        Saying[] proverbs = {
            new Saying("الصبر مفتاح الفرج", "Patience is the key to relief", "ممارسة الصبر ضرورية لتحقيق الراحة", "Remaining patient helps overcome difficulties and find solutions"),
            new Saying("العجلة من الشيطان", "Haste is from the devil", "الاندفاع يؤدي إلى عواقب سلبية", "Rushing into things often leads to errors and bad outcomes"),
            new Saying("المال يأتي بالمال", "Money begets money", "الاستثمار الجيد يزيد من الثروة", "Good investment increases wealth"),
            new Saying("العقل زينة", "Intellect is beauty", "التفكير السليم يجعل الإنسان جميلاً", "Sound thinking makes a person beautiful"),
            new Saying("القرد في عين أمه غزال", "A monkey in its mother's eyes is a gazelle", "الأم تحب أطفالها بغض النظر عن مظهرهم", "A mother loves her children regardless of their appearance"),
            new Saying("الصديق وقت الضيق", "A friend in need is a friend indeed", "الصديق الحقيقي يكون معك في الأوقات الصعبة", "A true friend stands by you in tough times"),
            new Saying("الحكمة ضالة المؤمن", "Wisdom is the lost property of the believer", "المؤمن يسعى دائما لاكتساب المعرفة والحكمة", "The believer always seeks to gain knowledge and wisdom"),
            new Saying("الغني عن الأمر", "Rich beyond need", "الشخص الذي لا يحتاج إلى أي شيء", "A person who has everything they need"),
            new Saying("الأمل آخر ما يموت", "Hope dies last", "الأمل هو آخر شيء يموت في الإنسان", "Hope is the last thing to die in a person"),
            new Saying("الجمال جمال النفس", "Beauty is the beauty of the soul", "الحقيقة الجمالية للإنسان تأتي من داخله", "True human beauty comes from within")
        };

        // Inserting proverbs into the database
        for (Saying proverb : proverbs) {
            db.insert(proverb);
        }

        // Demonstrate some operations
        System.out.println("First Saying: " + db.first());
        System.out.println("Last Saying: " + db.last());
        System.out.println("Member check for 'العجلة من الشيطان': " + db.member(proverbs[1]));
        System.out.println("Predecessor of 'العجلة من الشيطان': " + db.predecessor(proverbs[1]));
        System.out.println("Successor of 'الصبر مفتاح الفرج': " + db.successor(proverbs[0]));

        System.out.println("Sayings with Arabic word 'مفتاح': " + db.meHua("مفتاح"));
        System.out.println("Sayings with English word 'money': " + db.withWord("money"));
        
    }
}
