
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

import java.io.IOException;
import static java.rmi.server.LogStream.log;

public class Gradle {
    public static void main(String[] args) throws IOException {
        Document doc =  Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/9828ef4989632378cb01f05c18a0ca3a47781f777d705291ec60422ef13d871c/").get();
        //Enlace a la pagina web donde recogeremos los textos
        log(doc.title());
        Elements newsHeadlines1 = doc.select(".CurrentConditions--location--kyTeL");    //Localizamos en el htnl Vigo,Provincia de Pontevedra.
        Elements newsHeadlines2 =  doc.select(".CurrentConditions--tempValue--3a50n");    //Localizamos 11 grados
        Elements newsHeadlines3 = doc.select(".CurrentConditions--phraseValue--2Z18W");    //Localizamos el texto Niebla.
        for (Element headline : newsHeadlines1) {    //Hacemos un for para que solo nos devuelva el texto .Vigo,Privincia de Pontevedra.
            System.out.println(headline.html());     //mostramos solo el texto dejando el html a parte
        }
        for (Element headline : newsHeadlines2) {     //Hacemos un for para que solo nos devuelva 11 grados.
            System.out.println(headline.html());
        }
        for (Element headline : newsHeadlines3) {     //Hacemos un for para que solo nos devuelva el texto.Niebla
            System.out.println(headline.html());
        }
    }
}


