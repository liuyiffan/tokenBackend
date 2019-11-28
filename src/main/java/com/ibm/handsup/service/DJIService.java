package com.ibm.handsup.service;

import com.ibm.handsup.entity.dji.Product;
import com.ibm.handsup.entity.dji.Type;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DJIService {

    private static List<Type> types = new ArrayList<>();

    static {
        types.add(new Type("1", "御 MAVIC 系列", "list", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        types.add(new Type("11", "灵眸 OSMO 系列", "list", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        types.add(new Type("111", "如影 RONIN 系列", "list", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        types.add(new Type("1111", "晓 SPARK 系列", "list", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        types.add(new Type("11111", "机甲大师 ROBOMASTER S1", "list", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        types.add(new Type("111111", "精灵 PHANTOM 系列", "list", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        types.add(new Type("1111111", "悟 INSPIRE 系列", "list", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
    }

    private static Map<String, List<Product>> products = new HashMap<>();

    static {
        List<Product> MAVIC = new ArrayList<>();
        MAVIC.add(new Product("1-1", "御 MAVIC MINI 航拍小飞机", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        MAVIC.add(new Product("1-2", "御 MAVIC 2", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        MAVIC.add(new Product("1-3", "御 MAVIC AIR", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        MAVIC.add(new Product("1-4", "御 MAVIC PRO", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));

        products.put("1", MAVIC);

        List<Product> OSMO = new ArrayList<>();
        OSMO.add(new Product("11-1", "灵眸手机云台 3", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        OSMO.add(new Product("11-2", "OSMO ACTION 灵眸运动相机", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        OSMO.add(new Product("11-3", "灵眸 OSMO 口袋云台相机", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        OSMO.add(new Product("11-4", "灵眸 OSMO 手机云台 2", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        OSMO.add(new Product("11-5", "灵眸 OSMO 手机云台", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        OSMO.add(new Product("11-6", "灵眸 OSMO PRO & RAW", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));

        products.put("11", OSMO);

        List<Product> RONIN = new ArrayList<>();
        RONIN.add(new Product("111-1", "如影 RONIN-SC", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        RONIN.add(new Product("111-2", "如影 RONIN S", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        RONIN.add(new Product("111-3", "如影 RONIN 2", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));

        products.put("111", RONIN);

        List<Product> SPARK = new ArrayList<>();
        SPARK.add(new Product("111-1", "如影 RONIN-SC", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        SPARK.add(new Product("111-2", "如影 RONIN S", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        SPARK.add(new Product("111-3", "如影 RONIN 2", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));

        products.put("1111", SPARK);

        List<Product> ROBOMASTER = new ArrayList<>();
        ROBOMASTER.add(new Product("111-1", "如影 RONIN-SC", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        ROBOMASTER.add(new Product("111-2", "如影 RONIN S", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        ROBOMASTER.add(new Product("111-3", "如影 RONIN 2", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));

        products.put("11111", ROBOMASTER);

        List<Product> PHANTOM = new ArrayList<>();
        PHANTOM.add(new Product("111-1", "如影 RONIN-SC", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        PHANTOM.add(new Product("111-2", "如影 RONIN S", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        PHANTOM.add(new Product("111-3", "如影 RONIN 2", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));

        products.put("111111", PHANTOM);

        List<Product> INSPIRE = new ArrayList<>();
        INSPIRE.add(new Product("111-1", "如影 RONIN-SC", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        INSPIRE.add(new Product("111-2", "如影 RONIN S", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));
        INSPIRE.add(new Product("111-3", "如影 RONIN 2", "common", "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=6ab55d42de1b0ef478e5900cbcad3abf/f636afc379310a557d6ecb98bb4543a982261017.jpg"));

        products.put("1111111", INSPIRE);
    }

    public List<Type> getAllTypes() {
        return types;
    }

    public List<Product> getProductsByType(String id) {
        return products.get(id);
    }
}
