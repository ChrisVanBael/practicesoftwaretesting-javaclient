/*
 * Toolshop API
 * Toolshop REST API technical description
 *
 * OpenAPI spec version: 0.4.0
 * Contact: info@testsmith.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.practicesoftwaretesting.client.api;

import com.practicesoftwaretesting.client.model.BrandRequest;
import com.practicesoftwaretesting.client.model.BrandResponse;
import com.practicesoftwaretesting.client.model.InlineResponse200;
import com.practicesoftwaretesting.client.model.InlineResponse404;
import com.practicesoftwaretesting.client.model.InlineResponse4041;
import com.practicesoftwaretesting.client.model.InlineResponse405;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for BrandApi
 */
@Ignore
public class BrandApiTest {

    private final BrandApi api = new BrandApi();

    /**
     * Delete specific brand
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteBrandTest() throws Exception {
        Integer brandId = null;
        api.deleteBrand(brandId);

        // TODO: test validations
    }
    /**
     * Retrieve specific brand
     *
     * Retrieve specific brand
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBrandTest() throws Exception {
        Integer brandId = null;
        BrandResponse response = api.getBrand(brandId);

        // TODO: test validations
    }
    /**
     * Retrieve all brands
     *
     * Retrieve all brands
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBrandsTest() throws Exception {
        List<BrandResponse> response = api.getBrands();

        // TODO: test validations
    }
    /**
     * Retrieve specific brands matching the search query
     *
     * Search is performed on the &#x60;name&#x60; column
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchBrandTest() throws Exception {
        String q = null;
        List<BrandResponse> response = api.searchBrand(q);

        // TODO: test validations
    }
    /**
     * Store new brand
     *
     * Store new brand
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void storeBrandTest() throws Exception {
        BrandRequest body = null;
        BrandResponse response = api.storeBrand(body);

        // TODO: test validations
    }
    /**
     * Update specific brand
     *
     * Update specific brand
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateBrandTest() throws Exception {
        BrandRequest body = null;
        Integer brandId = null;
        InlineResponse200 response = api.updateBrand(body, brandId);

        // TODO: test validations
    }
}
