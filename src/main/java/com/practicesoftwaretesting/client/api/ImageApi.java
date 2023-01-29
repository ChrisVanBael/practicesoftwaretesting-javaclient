/*
 * Toolshop API
 * Toolshop REST API technical description
 *
 * OpenAPI spec version: 0.2.0
 * Contact: info@testsmith.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.practicesoftwaretesting.client.api;

import com.practicesoftwaretesting.client.ApiCallback;
import com.practicesoftwaretesting.client.ApiClient;
import com.practicesoftwaretesting.client.ApiException;
import com.practicesoftwaretesting.client.ApiResponse;
import com.practicesoftwaretesting.client.Configuration;
import com.practicesoftwaretesting.client.Pair;
import com.practicesoftwaretesting.client.ProgressRequestBody;
import com.practicesoftwaretesting.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.practicesoftwaretesting.client.model.ImageResponse;
import com.practicesoftwaretesting.client.model.InlineResponse404;
import com.practicesoftwaretesting.client.model.InlineResponse405;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageApi {
    private ApiClient apiClient;

    public ImageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getImages
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getImagesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/images";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getImagesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getImagesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve all images
     * Retrieve all images
     * @return List&lt;ImageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ImageResponse> getImages() throws ApiException {
        ApiResponse<List<ImageResponse>> resp = getImagesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Retrieve all images
     * Retrieve all images
     * @return ApiResponse&lt;List&lt;ImageResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ImageResponse>> getImagesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getImagesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<ImageResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve all images (asynchronously)
     * Retrieve all images
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getImagesAsync(final ApiCallback<List<ImageResponse>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getImagesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ImageResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
