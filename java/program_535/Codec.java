package program_535;

public class Codec {

    // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) {
        String url = longUrl;
        StringBuilder stringBuilder = new StringBuilder(url);

        for (int i = 0; i < url.length(); i++) {
            stringBuilder.setCharAt(i, (char) (url.charAt(i) - 1));
        }

        return "http://" + stringBuilder.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String url = shortUrl;
        StringBuilder stringBuilder = new StringBuilder(url);

        for (int i = 0; i < url.length(); i++) {
            stringBuilder.setCharAt(i, (char) (url.charAt(i) + 1));
        }

        return "https://" + stringBuilder.toString();
    }

    public static void main(String[] args) {
        encode("https://leetcode.com/problems/design-tinyurl");
    }

}
