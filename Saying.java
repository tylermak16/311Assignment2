/**
 * Sayings Class
 * Authors:
 * Tyler Mak
 * Date: 6/14/2024
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

    public String getArabic() {
        return arabicS;
    }

    public String getEnglish() {
        return englishT;
    }

    @Override
    public String toString() {
        return "Arabic: " + arabicS + "\nEnglish: " + englishT +
                "\nArabic Explanation: " + arabicE + "\nEnglish Explanation: " + englishE;
    }

    @Override
    public int hashCode() {
        return arabicS.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Saying saying = (Saying) obj;
        return arabicS.equals(saying.arabicS);
    }

    @Override
    public int compareTo(Saying other) {
        return this.arabicS.compareTo(other.arabicS);
    }
}

