package utils;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * Own realization of exception. May be used later.
 */
public class RestException extends Exception {

    public RestException() {

    }

    public RestException(String message) {
        super (message);
    }

    public RestException(String message, Throwable cause) {
        super (message, cause);
    }

    public RestException(Throwable cause) {
        super(cause);
    }

    public RestException(String message, Throwable cause,
                         boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
