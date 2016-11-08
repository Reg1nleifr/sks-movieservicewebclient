
package fhtw.sks.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fhtw.sks.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PersistMoviesFromSoap_QNAME = new QName("http://soap.services.technikumwien.at/", "persistMoviesFromSoap");
    private final static QName _Exception_QNAME = new QName("http://soap.services.technikumwien.at/", "Exception");
    private final static QName _Studio_QNAME = new QName("http://soap.services.technikumwien.at/", "studio");
    private final static QName _GetAllMoviesResponse_QNAME = new QName("http://soap.services.technikumwien.at/", "getAllMoviesResponse");
    private final static QName _Movie_QNAME = new QName("http://soap.services.technikumwien.at/", "movie");
    private final static QName _PersistMoviesFromSoapResponse_QNAME = new QName("http://soap.services.technikumwien.at/", "persistMoviesFromSoapResponse");
    private final static QName _GetMoviesContainsResponse_QNAME = new QName("http://soap.services.technikumwien.at/", "getMoviesContainsResponse");
    private final static QName _GetAllMovies_QNAME = new QName("http://soap.services.technikumwien.at/", "getAllMovies");
    private final static QName _GetMoviesContains_QNAME = new QName("http://soap.services.technikumwien.at/", "getMoviesContains");
    private final static QName _PersistMoviesResponse_QNAME = new QName("http://soap.services.technikumwien.at/", "persistMoviesResponse");
    private final static QName _Actor_QNAME = new QName("http://soap.services.technikumwien.at/", "actor");
    private final static QName _Movies_QNAME = new QName("http://soap.services.technikumwien.at/", "movies");
    private final static QName _PersistMovies_QNAME = new QName("http://soap.services.technikumwien.at/", "persistMovies");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fhtw.sks.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link Studio }
     * 
     */
    public Studio createStudio() {
        return new Studio();
    }

    /**
     * Create an instance of {@link PersistMoviesFromSoapResponse }
     * 
     */
    public PersistMoviesFromSoapResponse createPersistMoviesFromSoapResponse() {
        return new PersistMoviesFromSoapResponse();
    }

    /**
     * Create an instance of {@link GetAllMoviesResponse }
     * 
     */
    public GetAllMoviesResponse createGetAllMoviesResponse() {
        return new GetAllMoviesResponse();
    }

    /**
     * Create an instance of {@link GetMoviesContainsResponse }
     * 
     */
    public GetMoviesContainsResponse createGetMoviesContainsResponse() {
        return new GetMoviesContainsResponse();
    }

    /**
     * Create an instance of {@link PersistMoviesFromSoap }
     * 
     */
    public PersistMoviesFromSoap createPersistMoviesFromSoap() {
        return new PersistMoviesFromSoap();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Actor }
     * 
     */
    public Actor createActor() {
        return new Actor();
    }

    /**
     * Create an instance of {@link MovieRootElement }
     * 
     */
    public MovieRootElement createMovieRootElement() {
        return new MovieRootElement();
    }

    /**
     * Create an instance of {@link PersistMoviesResponse }
     * 
     */
    public PersistMoviesResponse createPersistMoviesResponse() {
        return new PersistMoviesResponse();
    }

    /**
     * Create an instance of {@link PersistMovies }
     * 
     */
    public PersistMovies createPersistMovies() {
        return new PersistMovies();
    }

    /**
     * Create an instance of {@link GetAllMovies }
     * 
     */
    public GetAllMovies createGetAllMovies() {
        return new GetAllMovies();
    }

    /**
     * Create an instance of {@link GetMoviesContains }
     * 
     */
    public GetMoviesContains createGetMoviesContains() {
        return new GetMoviesContains();
    }

    /**
     * Create an instance of {@link Movie.Actors }
     * 
     */
    public Movie.Actors createMovieActors() {
        return new Movie.Actors();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersistMoviesFromSoap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.technikumwien.at/", name = "persistMoviesFromSoap")
    public JAXBElement<PersistMoviesFromSoap> createPersistMoviesFromSoap(PersistMoviesFromSoap value) {
        return new JAXBElement<PersistMoviesFromSoap>(_PersistMoviesFromSoap_QNAME, PersistMoviesFromSoap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.technikumwien.at/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Studio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.technikumwien.at/", name = "studio")
    public JAXBElement<Studio> createStudio(Studio value) {
        return new JAXBElement<Studio>(_Studio_QNAME, Studio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.technikumwien.at/", name = "getAllMoviesResponse")
    public JAXBElement<GetAllMoviesResponse> createGetAllMoviesResponse(GetAllMoviesResponse value) {
        return new JAXBElement<GetAllMoviesResponse>(_GetAllMoviesResponse_QNAME, GetAllMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Movie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.technikumwien.at/", name = "movie")
    public JAXBElement<Movie> createMovie(Movie value) {
        return new JAXBElement<Movie>(_Movie_QNAME, Movie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersistMoviesFromSoapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.technikumwien.at/", name = "persistMoviesFromSoapResponse")
    public JAXBElement<PersistMoviesFromSoapResponse> createPersistMoviesFromSoapResponse(PersistMoviesFromSoapResponse value) {
        return new JAXBElement<PersistMoviesFromSoapResponse>(_PersistMoviesFromSoapResponse_QNAME, PersistMoviesFromSoapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoviesContainsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.technikumwien.at/", name = "getMoviesContainsResponse")
    public JAXBElement<GetMoviesContainsResponse> createGetMoviesContainsResponse(GetMoviesContainsResponse value) {
        return new JAXBElement<GetMoviesContainsResponse>(_GetMoviesContainsResponse_QNAME, GetMoviesContainsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.technikumwien.at/", name = "getAllMovies")
    public JAXBElement<GetAllMovies> createGetAllMovies(GetAllMovies value) {
        return new JAXBElement<GetAllMovies>(_GetAllMovies_QNAME, GetAllMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoviesContains }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.technikumwien.at/", name = "getMoviesContains")
    public JAXBElement<GetMoviesContains> createGetMoviesContains(GetMoviesContains value) {
        return new JAXBElement<GetMoviesContains>(_GetMoviesContains_QNAME, GetMoviesContains.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersistMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.technikumwien.at/", name = "persistMoviesResponse")
    public JAXBElement<PersistMoviesResponse> createPersistMoviesResponse(PersistMoviesResponse value) {
        return new JAXBElement<PersistMoviesResponse>(_PersistMoviesResponse_QNAME, PersistMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Actor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.technikumwien.at/", name = "actor")
    public JAXBElement<Actor> createActor(Actor value) {
        return new JAXBElement<Actor>(_Actor_QNAME, Actor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovieRootElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.technikumwien.at/", name = "movies")
    public JAXBElement<MovieRootElement> createMovies(MovieRootElement value) {
        return new JAXBElement<MovieRootElement>(_Movies_QNAME, MovieRootElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersistMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.technikumwien.at/", name = "persistMovies")
    public JAXBElement<PersistMovies> createPersistMovies(PersistMovies value) {
        return new JAXBElement<PersistMovies>(_PersistMovies_QNAME, PersistMovies.class, null, value);
    }

}
