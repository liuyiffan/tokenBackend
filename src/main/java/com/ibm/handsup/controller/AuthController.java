package com.ibm.handsup.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ibm.handsup.constants.CONSTANTS;
import com.ibm.handsup.entity.Token;
import com.ibm.handsup.response.Response;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/token")
public class AuthController {
	@ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public Response<Object> getToken(
    		@RequestParam(value = "username", required = true) String username,
    		@RequestParam(value = "password", required = true) String password
    		) {
		System.out.println(username + "#" + password);
        return Response.ok(Token.getToken(String.valueOf(new Date().getTime()), CONSTANTS.TOKEN_EXPIRED_TIME));
    }
}
