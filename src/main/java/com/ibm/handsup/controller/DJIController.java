package com.ibm.handsup.controller;

import com.ibm.handsup.entity.dji.Product;
import com.ibm.handsup.entity.dji.Type;
import com.ibm.handsup.response.Response;
import com.ibm.handsup.service.DJIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dji")
public class DJIController {
    @Autowired
    private DJIService djiService;

    @ResponseBody
    @RequestMapping(value="/types", method = RequestMethod.GET)
    public Response<List<Type>> getTypes() {
        return Response.ok(djiService.getAllTypes());
    }

    @ResponseBody
    @RequestMapping(value="/types/{typeId}/products", method = RequestMethod.GET)
    public Response<List<Product>> getProducts(
            @PathVariable final String typeId
    ) {
        return Response.ok(djiService.getProductsByType(typeId));
    }
}
