package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller //tells spring that this class is a controller.controller is a component
// that handles incoming HTTP requests, processes them, and returns responses.
public class SayHelloController {
    @RequestMapping("say-hello-html")// maps the url to port 8080
    @ResponseBody//returns the request to the browser
    public String sayHello() {

        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My First HTML Page</title>");
        sb.append("<style>");  // Adding CSS styles
        sb.append("h1 { font-size: 80px; font-style: italic; }");
        sb.append("</style>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>Hello! What are you learning for?</h1>"); // Styled with CSS
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
    @RequestMapping("say-hello-jsp")// maps the url to port 8080
    public String sayHelloJSP() {
        return "sayHello";
    }
}

