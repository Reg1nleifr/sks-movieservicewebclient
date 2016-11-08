package fhtw.technikumwien.sks;


import com.sun.media.jfxmedia.logging.Logger;
import fhtw.sks.generated.MovieRootElement;
import fhtw.sks.generated.MovieService;
import fhtw.sks.generated.MovieWebService;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.WebServiceException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;

/**
 * Created by Flo on 31/10/2016.
 */
public class MovieWebServiceClient {

    public static void main(String[] args) throws Exception {

        MovieWebService port = null;
        String option;

        try {
            MovieService service = new MovieService();
            port = service.getMovieServicePort();
        } catch (WebServiceException e) {
            System.err.println("Failed to access the WSDL at: http://localhost:8080/MovieServiceWebApp/MovieService?wsdl.");
            System.err.println("Connection refused, check if the Service is running.");
            System.exit(1);
        }

        BufferedReader brufferedReader = new BufferedReader(new InputStreamReader(System.in));

        do {

            System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
            System.out.println("ǁ                   Movie Service Console Client                    ǁ");
            System.out.println("╠═══════════════════════════════════════════════════════════════════╣");
            System.out.println("ǁ    Choose target Action                                           ǁ");
            System.out.println("ǁ        a.) Import Movies                                          ǁ");
            System.out.println("ǁ        b.) Create Studios                                         ǁ");
            System.out.println("ǁ        c.) Create Actors                                          ǁ");
            System.out.println("ǁ        q.) Quit                                                   ǁ");
            System.out.println("╚═══════════════════════════════════════════════════════════════════╝");


            option = brufferedReader.readLine().toLowerCase();

            while(!option.matches("[a-c|q]")) {
                System.err.println("Wrong input, try again");
                option = brufferedReader.readLine().toLowerCase();
            }

            if(option.matches("a")) {
                try {
                    movieImporterOption(port, brufferedReader);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
            if(option.matches("b")) {
                studioImporterOption(port, brufferedReader);
            }
            if(option.matches("c")) {
                actorImporterOption(port, brufferedReader);
            }
        } while (!option.equals("q"));
    }

    private static void movieImporterOption(MovieWebService port, BufferedReader brufferedReader) throws Exception {
        System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
        System.out.println("ǁ                          Movie Importer                           ǁ");
        System.out.println("╠═══════════════════════════════════════════════════════════════════╣");
        System.out.println("ǁ                         Specify File Path                         ǁ");
        System.out.println("╚═══════════════════════════════════════════════════════════════════╝");


        String path = brufferedReader.readLine();
        File inputFile = new File(path);


        Logger.logMsg(Logger.INFO, inputFile.getAbsolutePath());

        if(!inputFile.exists()) {
            System.err.println("xml doesn't exist!");
            return;
        }

        MovieRootElement movieRootElement = getMovieRootElement(new StreamSource(inputFile));
        port.persistMovies(movieRootElement.getMovie());

        System.out.println(String.format("%d movies added!", movieRootElement.getMovie().size()));
    }

    private static void studioImporterOption(MovieWebService port, BufferedReader brufferedReader) throws Exception{
        System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
        System.out.println("ǁ                         Studio Importer                           ǁ");
        System.out.println("╠═══════════════════════════════════════════════════════════════════╣");
        System.out.println("ǁ                         Specify File Path                         ǁ");
        System.out.println("╚═══════════════════════════════════════════════════════════════════╝");

    }

    private static void actorImporterOption(MovieWebService port, BufferedReader brufferedReader) throws Exception{
        System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
        System.out.println("ǁ                          Actor Importer                           ǁ");
        System.out.println("╠═══════════════════════════════════════════════════════════════════╣");
        System.out.println("ǁ                         Specify File Path                         ǁ");
        System.out.println("╚═══════════════════════════════════════════════════════════════════╝");
    }

    private static MovieRootElement getMovieRootElement(Source source) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(MovieRootElement.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        JAXBElement<MovieRootElement> jaxbElement = unmarshaller.unmarshal(source, MovieRootElement.class);
        return jaxbElement.getValue();
    }
}