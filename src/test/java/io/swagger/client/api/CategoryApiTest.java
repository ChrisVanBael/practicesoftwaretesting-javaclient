/*
 * Toolshop API
 * Toolshop REST API technical description
 *
 * OpenAPI spec version: 0.1.0
 * Contact: info@testsmith.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.practicesoftwaretesting.client.api;

import com.practicesoftwaretesting.client.model.CategoryRequest;
import com.practicesoftwaretesting.client.model.CategoryResponse;
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
 * API tests for CategoryApi
 */
@Ignore
public class CategoryApiTest {

    private final CategoryApi api = new CategoryApi();

    /**
     * Delete specific category
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteCategoryTest() throws Exception {
        Integer categoryId = null;
        api.deleteCategory(categoryId);

        // TODO: test validations
    }
    /**
     * Retrieve all categories
     *
     * Retrieve all categories
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCategoriesTest() throws Exception {
        List<CategoryResponse> response = api.getCategories();

        // TODO: test validations
    }
    /**
     * Retrieve all categories (including subcategories)
     *
     * Retrieve all categories (including subcategories)
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCategoriesTreeTest() throws Exception {
        String byCategorySlug = null;
        List<CategoryResponse> response = api.getCategoriesTree(byCategorySlug);

        // TODO: test validations
    }
    /**
     * Retrieve specific category
     *
     * Retrieve specific category
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCategoryTest() throws Exception {
        Integer categoryId = null;
        CategoryResponse response = api.getCategory(categoryId);

        // TODO: test validations
    }
    /**
     * Store new category
     *
     * Store new category
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void storeCategoryTest() throws Exception {
        CategoryRequest body = null;
        CategoryResponse response = api.storeCategory(body);

        // TODO: test validations
    }
    /**
     * Update specific category
     *
     * Update specific category
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateCategoryTest() throws Exception {
        CategoryRequest body = null;
        Integer categoryId = null;
        InlineResponse200 response = api.updateCategory(body, categoryId);

        // TODO: test validations
    }
}
