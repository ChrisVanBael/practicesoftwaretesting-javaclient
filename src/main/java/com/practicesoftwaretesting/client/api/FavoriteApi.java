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


import com.practicesoftwaretesting.client.model.FavoriteRequest;
import com.practicesoftwaretesting.client.model.FavoriteResponse;
import com.practicesoftwaretesting.client.model.InlineResponse200;
import com.practicesoftwaretesting.client.model.InlineResponse401;
import com.practicesoftwaretesting.client.model.InlineResponse404;
import com.practicesoftwaretesting.client.model.InlineResponse4041;
import com.practicesoftwaretesting.client.model.InlineResponse405;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FavoriteApi {
    private ApiClient apiClient;

    public FavoriteApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FavoriteApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteFavorite
     * @param favoriteId The favoriteId parameter in path (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFavoriteCall(Integer favoriteId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/favorites/{favoriteId}"
            .replaceAll("\\{" + "favoriteId" + "\\}", apiClient.escapeString(favoriteId.toString()));

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

        String[] localVarAuthNames = new String[] { "apiAuth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFavoriteValidateBeforeCall(Integer favoriteId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'favoriteId' is set
        if (favoriteId == null) {
            throw new ApiException("Missing the required parameter 'favoriteId' when calling deleteFavorite(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteFavoriteCall(favoriteId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete specific favorite
     * User role is required to delete a specific favorite
     * @param favoriteId The favoriteId parameter in path (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteFavorite(Integer favoriteId) throws ApiException {
        deleteFavoriteWithHttpInfo(favoriteId);
    }

    /**
     * Delete specific favorite
     * User role is required to delete a specific favorite
     * @param favoriteId The favoriteId parameter in path (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteFavoriteWithHttpInfo(Integer favoriteId) throws ApiException {
        com.squareup.okhttp.Call call = deleteFavoriteValidateBeforeCall(favoriteId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete specific favorite (asynchronously)
     * User role is required to delete a specific favorite
     * @param favoriteId The favoriteId parameter in path (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFavoriteAsync(Integer favoriteId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteFavoriteValidateBeforeCall(favoriteId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getFavorite
     * @param favoriteId The favoriteId parameter in path (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFavoriteCall(Integer favoriteId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/favorites/{favoriteId}"
            .replaceAll("\\{" + "favoriteId" + "\\}", apiClient.escapeString(favoriteId.toString()));

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

        String[] localVarAuthNames = new String[] { "apiAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFavoriteValidateBeforeCall(Integer favoriteId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'favoriteId' is set
        if (favoriteId == null) {
            throw new ApiException("Missing the required parameter 'favoriteId' when calling getFavorite(Async)");
        }
        
        com.squareup.okhttp.Call call = getFavoriteCall(favoriteId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve specific favorite
     * User role is required to retrieve specific favorite
     * @param favoriteId The favoriteId parameter in path (required)
     * @return FavoriteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FavoriteResponse getFavorite(Integer favoriteId) throws ApiException {
        ApiResponse<FavoriteResponse> resp = getFavoriteWithHttpInfo(favoriteId);
        return resp.getData();
    }

    /**
     * Retrieve specific favorite
     * User role is required to retrieve specific favorite
     * @param favoriteId The favoriteId parameter in path (required)
     * @return ApiResponse&lt;FavoriteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FavoriteResponse> getFavoriteWithHttpInfo(Integer favoriteId) throws ApiException {
        com.squareup.okhttp.Call call = getFavoriteValidateBeforeCall(favoriteId, null, null);
        Type localVarReturnType = new TypeToken<FavoriteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve specific favorite (asynchronously)
     * User role is required to retrieve specific favorite
     * @param favoriteId The favoriteId parameter in path (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFavoriteAsync(Integer favoriteId, final ApiCallback<FavoriteResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFavoriteValidateBeforeCall(favoriteId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FavoriteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFavorites
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFavoritesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/favorites";

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

        String[] localVarAuthNames = new String[] { "apiAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFavoritesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getFavoritesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve all favorites
     * User role is required to retrieve users favorites
     * @return List&lt;FavoriteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<FavoriteResponse> getFavorites() throws ApiException {
        ApiResponse<List<FavoriteResponse>> resp = getFavoritesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Retrieve all favorites
     * User role is required to retrieve users favorites
     * @return ApiResponse&lt;List&lt;FavoriteResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<FavoriteResponse>> getFavoritesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getFavoritesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<FavoriteResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve all favorites (asynchronously)
     * User role is required to retrieve users favorites
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFavoritesAsync(final ApiCallback<List<FavoriteResponse>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFavoritesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<FavoriteResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for storeFavorite
     * @param body Favorite request object (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call storeFavoriteCall(FavoriteRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/favorites";

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
            "application/json"
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

        String[] localVarAuthNames = new String[] { "apiAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call storeFavoriteValidateBeforeCall(FavoriteRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling storeFavorite(Async)");
        }
        
        com.squareup.okhttp.Call call = storeFavoriteCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Store new favorite
     * User role is required to store new favorite
     * @param body Favorite request object (required)
     * @return FavoriteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FavoriteResponse storeFavorite(FavoriteRequest body) throws ApiException {
        ApiResponse<FavoriteResponse> resp = storeFavoriteWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Store new favorite
     * User role is required to store new favorite
     * @param body Favorite request object (required)
     * @return ApiResponse&lt;FavoriteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FavoriteResponse> storeFavoriteWithHttpInfo(FavoriteRequest body) throws ApiException {
        com.squareup.okhttp.Call call = storeFavoriteValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<FavoriteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Store new favorite (asynchronously)
     * User role is required to store new favorite
     * @param body Favorite request object (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call storeFavoriteAsync(FavoriteRequest body, final ApiCallback<FavoriteResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = storeFavoriteValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FavoriteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateFavorite
     * @param body Favorite request object (required)
     * @param favoriteId The favoriteId parameter in path (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateFavoriteCall(FavoriteRequest body, Integer favoriteId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/favorites/{favoriteId}"
            .replaceAll("\\{" + "favoriteId" + "\\}", apiClient.escapeString(favoriteId.toString()));

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
            "application/json"
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

        String[] localVarAuthNames = new String[] { "apiAuth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateFavoriteValidateBeforeCall(FavoriteRequest body, Integer favoriteId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateFavorite(Async)");
        }
        // verify the required parameter 'favoriteId' is set
        if (favoriteId == null) {
            throw new ApiException("Missing the required parameter 'favoriteId' when calling updateFavorite(Async)");
        }
        
        com.squareup.okhttp.Call call = updateFavoriteCall(body, favoriteId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update specific favorite
     * User role is required to update specific favorite
     * @param body Favorite request object (required)
     * @param favoriteId The favoriteId parameter in path (required)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse200 updateFavorite(FavoriteRequest body, Integer favoriteId) throws ApiException {
        ApiResponse<InlineResponse200> resp = updateFavoriteWithHttpInfo(body, favoriteId);
        return resp.getData();
    }

    /**
     * Update specific favorite
     * User role is required to update specific favorite
     * @param body Favorite request object (required)
     * @param favoriteId The favoriteId parameter in path (required)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse200> updateFavoriteWithHttpInfo(FavoriteRequest body, Integer favoriteId) throws ApiException {
        com.squareup.okhttp.Call call = updateFavoriteValidateBeforeCall(body, favoriteId, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update specific favorite (asynchronously)
     * User role is required to update specific favorite
     * @param body Favorite request object (required)
     * @param favoriteId The favoriteId parameter in path (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateFavoriteAsync(FavoriteRequest body, Integer favoriteId, final ApiCallback<InlineResponse200> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateFavoriteValidateBeforeCall(body, favoriteId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
