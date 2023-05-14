package ddwu.spring.Dmd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/indedx")
public class DmdController {//기본 컨트롤러
	
	@GetMapping
    public String indedx() {
        return "indedx";
    }    
    
}