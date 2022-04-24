package kube.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoAppController {

//    @Value("${spring.application.name}")
    String appName = "demoApp";

//    @GetMapping("/initializer")
//    public void initializerr(){
//        log.info("initializing..... ------->>>>>>>>");
//        log.info("initializing..... ------->>>>>>>>>>>>>>>>>>>");
//
//    }

    @GetMapping("/app")
    public Map<String,String> getAppName(){
        Map<String,String> stringStringMap = new HashMap<>();
        stringStringMap.put("appName",appName);
        stringStringMap.put("timeinMillis", String.valueOf(System.currentTimeMillis()));
        return stringStringMap;
    }
}
