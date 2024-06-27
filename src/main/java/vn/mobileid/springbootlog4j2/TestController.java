package vn.mobileid.springbootlog4j2;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private static final Logger LOG = LogManager.getLogger(TestController.class);

    @GetMapping(value = "/api/greeting/{name}")
    public ResponseEntity<?> getGreetingMessage(@PathVariable(value = "name") String name) {
        LOG.info("Get Greeting Message Input: " + name);
        String greetingMessage = "Hello and Welcome " + name;
        LOG.debug("Greeting Message Output: " + greetingMessage.toUpperCase());
        LOG.error("Greeting Message Output: " + greetingMessage.toUpperCase());
        LOG.warn("Greeting Message Output: " + greetingMessage.toUpperCase());
        return ResponseEntity.ok().body(greetingMessage);
    }
}
