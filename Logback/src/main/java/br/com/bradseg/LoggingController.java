package br.com.bradseg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;



@RestController
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/")
    public String index() {
        for (int i=0;i<1000;i++) {
            logger.trace("A TRACE Message");
            logger.debug("A DEBUG Message");
            logger.info("An INFO Message");
            logger.warn("A WARN Message");
            logger.error("An ERROR Message");
        }
        logger.error("*******************************");
        try{
            int x= 5/0;
        }catch(Exception e){
            logger.error(e.getMessage(),e);
        }
        return "O usuario esta logado Logback";
    }
}