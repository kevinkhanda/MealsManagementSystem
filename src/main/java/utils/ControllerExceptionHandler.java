package utils;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * This class will handle special type of exception.
 */

@Controller
class ControllerExceptionHandler {

    private static final Logger log = Logger.getLogger(
            ControllerExceptionHandler.class);

    @ExceptionHandler(RestException.class)
    public @ResponseBody
    String handleException(RestException e) {
        log.error("Error: " + e.getMessage(), e);
        return "Error: " + e.getMessage();
    }
}
