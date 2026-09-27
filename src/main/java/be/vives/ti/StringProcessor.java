package be.vives.ti;

public class StringProcessor {

    public String appendIfMissing(String str, String suffix) {
        if (str == null) {
            return null;
        }
        if (suffix == null || suffix.isEmpty() || str.endsWith(suffix)) {
            return str;
        }
        return str + suffix;
    }
}