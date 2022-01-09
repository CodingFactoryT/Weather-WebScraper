import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class url_temperature {
    public static void main(String[] args) {
    	
    	final String url = "https://www.wetteronline.de/wetter/london";
    	try {
    		
    		final Document document = Jsoup.connect(url).get();
    		
//    		System.out.println(document.outerHtml());											//prints html of the website
    		String city = document.select("h1#nowcast-card-headline").text(); 					//# = id, .=class
    		String temperature = document.select("div#nowcast-card-temperature").text();   		
    		
    		System.out.println(city + ": " + temperature);
    		
    		
    	} catch(Exception e) {
    		System.out.println("Something went wrong!");
    	}
        					
    }
}