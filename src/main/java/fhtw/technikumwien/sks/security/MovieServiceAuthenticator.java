package fhtw.technikumwien.sks.security;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 * Created by Flo on 15/12/2016.
 */

public class MovieServiceAuthenticator extends Authenticator{
    private MovieServiceAuthenticator() {}

    public static void setAsDefault(String username, String password) {
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password.toCharArray());
            }
        });
    }
}


