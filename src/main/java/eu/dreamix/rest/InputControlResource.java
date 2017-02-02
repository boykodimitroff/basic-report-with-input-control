package eu.dreamix.rest;

import eu.dreamix.dao.InputControlDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller which retrieves input controls data.
 * Created by bdimitrov on 1/22/17.
 */
@RestController
@RequestMapping("/input-control")
public class InputControlResource {

    @Autowired
    private InputControlDAO inputControlDAO;

    @RequestMapping(value = "/data", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getData() {
        return ResponseEntity.ok(inputControlDAO.getData());
    }
}
