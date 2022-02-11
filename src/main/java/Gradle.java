import static java.rmi.server.LogStream.log;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

import java.io.IOException;
import static java.rmi.server.LogStream.log;

public class Gradle {
    public static void main(String[] args) throws IOException {
        Document doc =  Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/9828ef4989632378cb01f05c18a0ca3a47781f777d705291ec60422ef13d871c/").get();
        log(((org.jsoup.nodes.Document) doc).title());
        Elements newsHeadlines1 = ((org.jsoup.nodes.Document) doc).select(".CurrentConditions--location--kytel");
        Elements newsHeadlines2 = ((org.jsoup.nodes.Document) doc).select(".CurrentConditions--tempValue--3a50n");
        Elements newsHeadlines3 = ((org.jsoup.nodes.Document) doc).select(".CurrentConditions--location--kytel");
        for (Element headline : newsHeadlines1) {
            System.out.println(headline.html());
        }
        for (Element headline : newsHeadlines2) {
            System.out.println(headline.html());
        }
        for (Element headline : newsHeadlines3) {
            System.out.println(headline.html());
        }
    }
}


