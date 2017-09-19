import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Lab3Jiaruiz2 {




/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */
public static String urlToString(final String url) {
    Scanner urlScanner;
    try {
        urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
    } catch (IOException e) {
        return "";
    }
    String contents = urlScanner.useDelimiter("\\A").next();
    urlScanner.close();
    return contents;

}

   public static void main(String[] args) {
       String firstText = urlToString("http://erdani.com/tdpl/hamlet.txt");
       Scanner s = new Scanner(firstText);
       int count = 0;
       while (s.hasNext()) {
          count = count + 1;
          s.next();
   }
       System.out.println("Words count:" + count);
      s = new Scanner(firstText);
      count = 0;
      String repeatedWord = "prince";
      while (s.hasNext()) {
          if (s.next().toLowerCase().contains(repeatedWord)) {
              count = count + 1;
          }
      }
      System.out.println("Word appears:" + count + "times.");
   }


   }
