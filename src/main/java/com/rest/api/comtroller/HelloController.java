package com.rest.api.comtroller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello/string")
    @ResponseBody
    public String helloworldString(){
        return "helloworld";
    }

    @GetMapping("/hello/json")
    @ResponseBody
    public Hello helloworldJson(){
        Hello hello = new Hello();
        hello.message = "hello world";
        return  hello;
    }

    @GetMapping("/hello/page")
    public String helloworld(){
        return "helloworld";
    }

    @Setter
    @Getter
    private static class Hello {
        private String message;
    }
}
