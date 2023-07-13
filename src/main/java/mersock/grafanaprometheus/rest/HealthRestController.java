package mersock.grafanaprometheus.rest;

import mersock.grafanaprometheus.GrafanaPrometheusApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthRestController {

    final static Logger logger = LoggerFactory.getLogger(GrafanaPrometheusApplication.class);

    @GetMapping("/")
    public ResponseEntity<String> home() {
        logger.info("homepage!!!!!");
        return ResponseEntity.ok().body("homepage");
    }

    @GetMapping("/notfound")
    public ResponseEntity<String> notFound() {
        logger.warn("not found");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not Found");
    }

    @GetMapping("/error")
    public ResponseEntity<String> error() {
        logger.error("not found");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error");
    }
}
