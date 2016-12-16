package fhtw.technikumwien.sks.security;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 * Created by Flo on 15/12/2016.
 */
public class MovieServiceAuthenticator {

    private MovieServiceAuthenticator() {}

    public static void setAsDefault(final String username, final String password) {
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password.toCharArray());
            }
        });
    }
}
