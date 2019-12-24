package com.example.jingdb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value={"/hi","/hello"},method = RequestMethod.GET)
    public String say(){

        return "Hi,Say -branch jdb --merge master";

    }
}
