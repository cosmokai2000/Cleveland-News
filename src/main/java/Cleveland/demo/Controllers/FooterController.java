package Cleveland.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


    @Controller
    public class FooterController {
        @GetMapping("/termsofservice")
        public String termsofservice(){ return "/footerPages/termsofservice"; }

        @GetMapping("/aboutus")
        public String aboutus(){ return "/footerPages/aboutus"; }

        @GetMapping("/contactadmin")
        public String contactadmin(){ return "/footerPages/contactadmin"; }

        @GetMapping("/privacypolicy")
        public String privacypolicy(){ return "/footerPages/privacypolicy"; }

    }

