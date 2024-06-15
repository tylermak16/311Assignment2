/**
 * Sayings Class
 * Authors:
 * Tyler Mak
 * Date: 6/14/2024
 */
public class Saying {
    String arabicS;
    String englishT;
    String arabicE;
    String englishE;
    public Saying(String arabicS,String englishT,String arabicE,String englishE){
        this.arabicS = arabicS;
        this.englishT = englishT;
        this.arabicE = arabicE;
        this.englishE = englishE;
    }

    public String toString() {
        return "Arabic: " + arabicS + "\nEnglish: " + englishT +
                "\nArabic Explanation: " + arabicE + "\nEnglish Explanation: " + englishE;
    }
}
