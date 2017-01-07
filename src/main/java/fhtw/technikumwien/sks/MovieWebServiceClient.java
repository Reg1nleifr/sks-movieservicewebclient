package fhtw.technikumwien.sks;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.media.jfxmedia.logging.Logger;
import fhtw.sks.generated.*;
import fhtw.technikumwien.sks.helpers.GuiHelper;
import fhtw.technikumwien.sks.helpers.MovieRootElement;
import fhtw.technikumwien.sks.security.MovieServiceAuthenticator;

import javax.xml.bind.*;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.WebServiceException;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.lang.Exception;

/**
 * Created by Flo on 31/10/2016.
 */
public class MovieWebServiceClient {

    private static String username = "myuser";
    private static String password = "topsecret";

    public static void main(String[] args) throws Exception {
        System.setProperty( "com.sun.xml.bind.v2.bytecode.ClassTailor.noOptimize", "true");

        MovieWebService port = null;

        Client client = Client.create();
        WebResource webResource = client
                .resource("http://localhost:8080/MovieServiceWebApp/resources/");

        MovieServiceAuthenticator.setAsDefault(username,password);
        webResource.addFilter((new HTTPBasicAuthFilter(username, password)));

        try {
            MovieService service = new MovieService();
            port = service.getMovieServicePort();
        } catch (WebServiceException e) {
            System.err.println("Failed to access the WSDL at: http://localhost:8080/MovieServiceWebApp/MovieService?wsdl.");
            System.err.println("Connection refused, check if the Service is running.");
            System.exit(1);
        }

        mainClientLoop(port, webResource);
    }

    private static void mainClientLoop(MovieWebService port, WebResource webResource) throws Exception{
        String option;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        do {
            GuiHelper.getHomeScreen();
            option = bufferedReader.readLine().toLowerCase();
            while(!option.matches("[a-c|q]")) {
                System.err.println("Wrong input, try again");
                option = bufferedReader.readLine().toLowerCase();
            }
            if(option.matches("a")) {
                movieImporterOption(port, bufferedReader);
            }
            if(option.matches("b")) {
                studioImporterOption(webResource, bufferedReader);
            }
            if(option.matches("c")) {
                actorImporterOption(webResource, bufferedReader);
            }
        } while (!option.equals("q"));
    }

    private static void movieImporterOption(MovieWebService port, BufferedReader brufferedReader) throws Exception {
        GuiHelper.getMovieImporter();

        String path = brufferedReader.readLine();
        File inputFile = new File(path);

        Logger.logMsg(Logger.INFO, inputFile.getAbsolutePath());

        if(!inputFile.exists()) {
            System.err.println("xml doesn't exist!");
            return;
        }

        MovieRootElement movieRootElement = unmarshallMovieRootElement(new StreamSource(inputFile));
        port.persistMovies(movieRootElement.getMovies());

        System.out.println(String.format("%d movies added!", movieRootElement.getMovies().size()));
    }

    private static void studioImporterOption(WebResource webResource, BufferedReader bufferedReader) throws Exception{
        GuiHelper.getStudioImporter();

        String path = bufferedReader.readLine();
        File inputFile = new File(path);
        Logger.logMsg(Logger.INFO, inputFile.getAbsolutePath());

        if(!inputFile.exists()) {
            System.err.println("xml doesn't exist!");
            return;
        }

        ClientResponse response = webResource
                .path("studios")
                .path("create")
                .type("application/json")
                .accept("text/plain")
                .post(ClientResponse.class, inputFile);

        System.out.println(response.getStatus());
    }

//
//    ClientResponse response = webResource
//            .path("movies")
//            .path("1")
//            .accept("application/json")
//            .get(ClientResponse.class);
//
//        if (response.getStatus() != 200) {
//        throw new RuntimeException("Failed : HTTP error code : "
//                + response.getStatus());
//    }
//
//    Studio studio = response.getEntity(Studio.class);
//        System.out.println(studio);


    private static void actorImporterOption(WebResource webResource, BufferedReader brufferedReader) throws Exception{
        GuiHelper.getActorImporter();

        String path = brufferedReader.readLine();
        File inputFile = new File(path);
        Logger.logMsg(Logger.INFO, inputFile.getAbsolutePath());

        if(!inputFile.exists()) {
            System.err.println("xml doesn't exist!");
            return;
        }

        ClientResponse response = webResource
                .path("actors")
                .path("create")
                .type("application/json")
                .accept("text/plain")
                .post(ClientResponse.class, inputFile);
        System.out.println(response.getStatus());
    }

    private static MovieRootElement unmarshallMovieRootElement(Source source) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(MovieRootElement.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        JAXBElement<MovieRootElement> jaxbElement = unmarshaller.unmarshal(source, MovieRootElement.class);
        return jaxbElement.getValue();
    }

//    private static ActorRootElement unmarshallActorRootElement(Source source) throws JAXBException {
//        JAXBContext jaxbContext = JAXBContext.newInstance(ActorRootElement.class);
//        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//        JAXBElement<ActorRootElement> jaxbElement = unmarshaller.unmarshal(source, ActorRootElement.class);
//        return jaxbElement.getValue();
//    }

//    private static StudioRootElement unmarshallStudioRootElement(Source source) throws JAXBException {
//        JAXBContext jaxbContext = JAXBContext.newInstance(StudioRootElement.class);
//        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//        JAXBElement<StudioRootElement> jaxbElement = unmarshaller.unmarshal(source, StudioRootElement.class);
//        return jaxbElement.getValue();
//    }

}