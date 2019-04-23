package com.ibm.handsup.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.handsup.response.Response;

@RestController
@RequestMapping("/resource")
public class ResourceController {
	@ResponseBody
    @RequestMapping(value="/all", method = RequestMethod.GET)
    public Response<Object> getToken() {
        return Response.ok("This is a text from back-end.");
    }
}
