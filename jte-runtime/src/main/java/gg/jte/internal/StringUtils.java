package gg.jte.internal;

public class StringUtils {
    public static boolean startsWithIgnoringCaseAndWhitespaces(String url, String protocol) {
        int j = 0;
        for (int i = 0; i < url.length() && j < protocol.length(); ++i) {
            char c = url.charAt(i);

            if (j == 0 && Character.isWhitespace(c)) {
                continue;
            }

            char p =  protocol.charAt(j++);

            if (p != Character.toLowerCase(c)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAllUpperCase(String string) {
        for (int i = 0; i < string.length(); ++i) {
            if (!Character.isUpperCase(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
