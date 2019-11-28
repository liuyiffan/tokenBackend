package com.ibm.handsup.controller;

import com.ibm.handsup.entity.dji.Product;
import com.ibm.handsup.entity.dji.Type;
import com.ibm.handsup.response.Response;
import com.ibm.handsup.service.DJIService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/dji")
public class DJIController {
    @Autowired
    private DJIService djiService;

    @ResponseBody
    @RequestMapping(value="/types", method = RequestMethod.GET)
    public Response<List<Type>> getTypes() {
        log.info("[DJI]Retrieve lists of type");
        return Response.ok(djiService.getAllTypes());
    }

    @ResponseBody
    @RequestMapping(value="/types/{typeId}/products", method = RequestMethod.GET)
    public Response<List<Product>> getProducts(
            @PathVariable final String typeId
    ) {
        log.info("[DJI]Retrieve lists of product");
        return Response.ok(djiService.getProductsByType(typeId));
    }
}
