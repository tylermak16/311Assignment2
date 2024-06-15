/**
 * Main Class
 * Authors:
 * Alexis Karl Buted
 * Date: 6/14/2024
*/

/*
The `main` method initializes a `Database`, inserts a collection of 10 Arabic proverbs represented as `Saying` objects, and demonstrates operations such
as retrieving the first and last proverbs, checking membership, finding predecessors and successors based on Arabic phrases, and querying sayings associated
with specific Arabic and English words efficiently using the `Database` class's methods.

*/
public class main {
    public static void main(String[] args){
        Database db = new Database();

        /*
        This array `proverbs` contains 10 instances of the `Saying` class, each representing an Arabic proverb with its corresponding English translation
        and explanations. These `Saying` objects are structured to facilitate their insertion into a `Database` structure, allowing for efficient sorting
        and querying operations based on their linguistic attributes.
        */
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

        /*
        The loop `for (Saying proverb : proverbs) { db.insert(proverb); }` iterates over an array of `Saying` objects `proverbs`, inserting each one into the `Database`
        object `db`. This ensures that all proverbs are added to the `TreeSet` within `db`, maintaining sorted order, and updates additional maps (`arabicToSayings` and `englishToSayings`)
        to facilitate efficient querying by Arabic and English words associated with each `Saying`.
        */
        for (Saying proverb : proverbs) {
            db.insert(proverb);
        }

        /*
        These statements collectively demonstrate the Database class's capabilities in managing and querying Saying objects efficiently, showcasing ordered retrieval,
        membership checks, predecessor and successor lookups, and keyword-based querying in both Arabic and English contexts.
        */
        System.out.println("First Saying: " + db.first());
        System.out.println("Last Saying: " + db.last());
        System.out.println("Member check for 'العجلة من الشيطان': " + db.member(proverbs[1]));
        System.out.println("Predecessor of 'العجلة من الشيطان': " + db.predecessor(proverbs[1]));
        System.out.println("Successor of 'الصبر مفتاح الفرج': " + db.successor(proverbs[0]));

        System.out.println("Sayings with Arabic word 'مفتاح': " + db.meHua("مفتاح"));
        System.out.println("Sayings with English word 'money': " + db.withWord("money"));

    }
}
