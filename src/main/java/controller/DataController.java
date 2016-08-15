package controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.DataServiceImpl;
import utils.Ajax;
import utils.RestException;

import java.io.File;
import java.util.Map;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * Controller with two methods for saving data and for sending random data to client.
 * It has exception handler only as a template. Should be improved for future execution.
 */

@Controller
public class DataController extends ControllerExceptionHandler {

    private static final Logger log = Logger.getLogger(DataController.class);

    @Autowired
    @Qualifier("dataService")
    private DataServiceImpl dataService;

    // This method will be used to show name of user in navbar and twice in page settings
    @RequestMapping(value = {"/main", "/menu", "/pubmenu", "/pubnews", "/settings",
            "/userform"}, method = RequestMethod.GET)
    public
    @ResponseBody
    Map<String, Object> getUserName(@RequestParam("login") String login) throws RestException {
        try {
            if (login == null || login.equals("")) {
                return Ajax.errorResponse("Please log in!");
            }
            String result = dataService.getUserName(login);
            return Ajax.successResponse(result);
        } catch (Exception e) {
            throw new RestException(e);
        }
    }

    @RequestMapping(value = "/settings", method = RequestMethod.GET)
    public
    @ResponseBody
    Map<String, Object> getUserEmail(@RequestParam("login") String login) throws RestException {
        try {
            if (login == null || login.equals("")) {
                return Ajax.errorResponse("Please log in!");
            }
            String result = dataService.getUserEmail(login);
            return Ajax.successResponse(result);
        } catch (Exception e) {
            throw new RestException(e);
        }
    }

    @RequestMapping(value = {"/main", "/menu", "/pubmenu", "/pubnews", "/settings",
            "/userform"}, method = RequestMethod.GET)
    public
    @ResponseBody
    Map<String, Object> getUserPhoto(@RequestParam("login") String login) throws RestException {
        try {
            if (login == null || login.equals("")) {
                return Ajax.errorResponse("Please log in!");
            }
            File result = dataService.getUserPhoto(login);
            return Ajax.successResponse(result);
        } catch (Exception e) {
            throw new RestException(e);
        }
    }

    /*@RequestMapping(value = "/settings", method = RequestMethod.POST)
    public
    @ResponseBody
    Map<String, Object> addUser(@RequestParam("role") String role,
                                @RequestParam("role_id") int role_id,
                                @RequestParam("name") String name,
                                @RequestParam("father_name") String father_name,
                                @RequestParam("organisation") String organisation,
                                @RequestParam("phone") String phone,)
*/
    /*@RequestMapping(value = "/persist", method = RequestMethod.POST)
    public
    @ResponseBody
    Map<String, Object> persist(@RequestParam("data") String data) throws RestException {
        try {
            if (data == null || data.equals("")) {
                return Ajax.emptyResponse();
            }
            dataService.persist(data);
            return Ajax.emptyResponse();
        } catch (Exception e) {
            throw new RestException(e);
        }
    }

    @RequestMapping(value = "/getRandomData", method = RequestMethod.GET)
    public
    @ResponseBody
    Map<String, Object> getRandomData() throws RestException {
        try {
            Set<String> result = dataService.getRandomData();
            return Ajax.successResponse(result);
        } catch (Exception e) {
            throw new RestException(e);
        }
    }*/
}
