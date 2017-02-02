package eu.dreamix.rest;

import eu.dreamix.dao.SalesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * REST Controller which retrieves data used in the chart.
 * @author Boyko Dimitrov on 11/28/16.
 */
@RestController
@RequestMapping("/sales")
public class SalesDataResource {

    @Autowired
    private SalesDAO salesDAO;

    @RequestMapping(value = "/data", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getData(@RequestParam(required = true) Integer carManufacturerId) {
        return ResponseEntity.ok(salesDAO.getData(carManufacturerId));
    }
}
