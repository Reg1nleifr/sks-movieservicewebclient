package fhtw.technikumwien.sks.security;


import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * Created by Flo on 16/12/2016.
 */
public class RequestFilter implements ClientRequestFilter {

    private String username;
    private String password;

    public RequestFilter(String username, String password) {
        this.username = username;
        this.password = password;
    }
//
//    public void filter(ClientRequest request) throws IOException {
//        String token = username + ":" + password;
//        String basicAuthentication =
//                "Basic " +
//                        DatatypeConverter.printBase64Binary(token.getBytes("UTF-8"));
//        request.getHeaders().add("Authorization", basicAuthentication);
//    }


    public void filter(ClientRequestContext requestContext)
            throws IOException {
        if (requestContext.getHeaders(
        ).get("Client-Name") == null) {
            requestContext.abortWith(
                    Response.status(Response.Status.BAD_REQUEST)
                            .entity("Client-Name header must be defined.")
                            .build());
        }
    }

    //TODO: Headers setzen im Client mitübergeben -> Authorization => Basic myuser:topsecret und auf base64Binary convertieren!
}
