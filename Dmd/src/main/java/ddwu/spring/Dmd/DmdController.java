package ddwu.spring.Dmd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DmdController {//기본 컨트롤러
	
    // http://localhost:8080/ 으로 접속 시
    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }
    
    // http://localhost:8080/index 로 접속 시
    @RequestMapping("/index")
    public String index() {
    	System.out.println("index controller start");
        return "index";
    }    
    
}