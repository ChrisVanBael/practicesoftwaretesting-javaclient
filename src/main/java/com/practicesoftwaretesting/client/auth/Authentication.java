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

package com.practicesoftwaretesting.client.auth;

import com.practicesoftwaretesting.client.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
