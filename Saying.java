/**
 * Sayings Class
 * Authors:
 * Tyler Mak
 * Date: 6/14/2024
 */

/*
We used the `Comparable` interface and sorted data structures like `TreeSet` in the `Saying` class and `Database` class to efficiently 
organize and retrieve Arabic proverbs. This approach ensures that proverbs can be sorted based on their Arabic phrases, facilitating quick access, 
searching, and ordered traversal operations in applications requiring structured and ordered data management.
*/
public class Saying implements Comparable<Saying> {
    String arabicS;
    String englishT;
    String arabicE;
    String englishE;

    public Saying(String arabicS, String englishT, String arabicE, String englishE) {
        this.arabicS = arabicS;
        this.englishT = englishT;
        this.arabicE = arabicE;
        this.englishE = englishE;
    }

    /*
    The `getArabic()` method in the `Saying` class returns the Arabic phrase (`arabicS`) associated with the `Saying` object. This method 
    provides external access to retrieve and utilize the Arabic text of the proverb stored within each `Saying` instance, facilitating 
    integration with other parts of the program that may need to access or manipulate this data.
    */
    public String getArabic() {
        return arabicS;
    }

    /*
    The `getEnglish()` method in the `Saying` class returns the English translation (`englishT`) associated with the `Saying` object. 
    This method provides external access to retrieve and utilize the English translation of the proverb stored within each `Saying` 
    instance, enabling integration with other components of the program that require access to the translated text.
    */
    public String getEnglish() {
        return englishT;
    }

    /*
    The `toString()` method override in the `Saying` class returns a formatted string representation of a `Saying` object, including its Arabic 
    phrase (`arabicS`), English translation (`englishT`), Arabic explanation (`arabicE`), and English explanation (`englishE`). This method provides a 
    convenient way to obtain a textual representation of a `Saying` object for debugging purposes or displaying its contents in a readable format.
    */
    @Override
    public String toString() {
        return "Arabic: " + arabicS + "\nEnglish: " + englishT +
                "\nArabic Explanation: " + arabicE + "\nEnglish Explanation: " + englishE;
    }

    /*
    The `hashCode()` method override in the `Saying` class returns the hash code of the `arabicS` string. This implementation suggests that the hash 
    code of a `Saying` object is primarily derived from its Arabic phrase (`arabicS`). This approach can be useful when storing `Saying` objects in 
    hash-based collections like `HashMap` or `HashSet`, ensuring that objects with the same Arabic phrase have the same hash code, facilitating 
    efficient lookup and retrieval operations based on this key attribute.
    */
    @Override
    public int hashCode() {
        return arabicS.hashCode();
    }

    /*
    The `equals(Object obj)` method override in the `Saying` class ensures two `Saying` objects are considered equal if they have the same Arabic 
    phrase (`arabicS`), facilitating accurate comparison and usage in collections requiring unique object identification based on this attribute. 
    This implementation adheres to Java's equality contract by handling identity, type compatibility, and attribute comparison to determine object equality effectively.
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Saying saying = (Saying) obj;
        return arabicS.equals(saying.arabicS);
    }

    /*
    The `compareTo(Saying other)` method override in the `Saying` class compares two `Saying` objects based on their Arabic phrases (`arabicS`). It uses the `compareTo` 
    method of the `String` class to determine their natural ordering, ensuring that `Saying` objects can be sorted lexicographically by their Arabic phrases in data 
    structures like `TreeSet` or when using sorting algorithms that rely on the `Comparable` interface.
    */
    @Override
    public int compareTo(Saying other) {
        return this.arabicS.compareTo(other.arabicS);
    }
}

