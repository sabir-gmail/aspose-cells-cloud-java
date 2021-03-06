/*
 * Web API Swagger specification
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.ApiCallback;
import com.aspose.cloud.cells.client.ApiClient;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.client.ApiResponse;
import com.aspose.cloud.cells.client.Configuration;
import com.aspose.cloud.cells.client.Pair;
import com.aspose.cloud.cells.client.ProgressRequestBody;
import com.aspose.cloud.cells.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.aspose.cloud.cells.model.CellsDocumentPropertiesResponse;
import com.aspose.cloud.cells.model.CellsDocumentProperty;
import com.aspose.cloud.cells.model.CellsDocumentPropertyResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CellsPropertiesApi {
    private ApiClient apiClient;

    public CellsPropertiesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CellsPropertiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for cellsPropertiesDeleteDocumentProperties
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cellsPropertiesDeleteDocumentPropertiesCall(String name, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cells/{name}/documentproperties"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call cellsPropertiesDeleteDocumentPropertiesValidateBeforeCall(String name, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling cellsPropertiesDeleteDocumentProperties(Async)");
        }
        
        
        com.squareup.okhttp.Call call = cellsPropertiesDeleteDocumentPropertiesCall(name, folder, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete all custom document properties and clean built-in ones.
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @return CellsDocumentPropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CellsDocumentPropertiesResponse cellsPropertiesDeleteDocumentProperties(String name, String folder) throws ApiException {
        ApiResponse<CellsDocumentPropertiesResponse> resp = cellsPropertiesDeleteDocumentPropertiesWithHttpInfo(name, folder);
        return resp.getData();
    }

    /**
     * Delete all custom document properties and clean built-in ones.
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;CellsDocumentPropertiesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CellsDocumentPropertiesResponse> cellsPropertiesDeleteDocumentPropertiesWithHttpInfo(String name, String folder) throws ApiException {
        com.squareup.okhttp.Call call = cellsPropertiesDeleteDocumentPropertiesValidateBeforeCall(name, folder, null, null);
        Type localVarReturnType = new TypeToken<CellsDocumentPropertiesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete all custom document properties and clean built-in ones. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cellsPropertiesDeleteDocumentPropertiesAsync(String name, String folder, final ApiCallback<CellsDocumentPropertiesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cellsPropertiesDeleteDocumentPropertiesValidateBeforeCall(name, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CellsDocumentPropertiesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cellsPropertiesDeleteDocumentProperty
     * @param name The document name. (required)
     * @param propertyName The property name. (required)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cellsPropertiesDeleteDocumentPropertyCall(String name, String propertyName, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cells/{name}/documentproperties/{propertyName}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(propertyName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call cellsPropertiesDeleteDocumentPropertyValidateBeforeCall(String name, String propertyName, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling cellsPropertiesDeleteDocumentProperty(Async)");
        }
        
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new ApiException("Missing the required parameter 'propertyName' when calling cellsPropertiesDeleteDocumentProperty(Async)");
        }
        
        
        com.squareup.okhttp.Call call = cellsPropertiesDeleteDocumentPropertyCall(name, propertyName, folder, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete document property.
     * 
     * @param name The document name. (required)
     * @param propertyName The property name. (required)
     * @param folder The document folder. (optional)
     * @return CellsDocumentPropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CellsDocumentPropertiesResponse cellsPropertiesDeleteDocumentProperty(String name, String propertyName, String folder) throws ApiException {
        ApiResponse<CellsDocumentPropertiesResponse> resp = cellsPropertiesDeleteDocumentPropertyWithHttpInfo(name, propertyName, folder);
        return resp.getData();
    }

    /**
     * Delete document property.
     * 
     * @param name The document name. (required)
     * @param propertyName The property name. (required)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;CellsDocumentPropertiesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CellsDocumentPropertiesResponse> cellsPropertiesDeleteDocumentPropertyWithHttpInfo(String name, String propertyName, String folder) throws ApiException {
        com.squareup.okhttp.Call call = cellsPropertiesDeleteDocumentPropertyValidateBeforeCall(name, propertyName, folder, null, null);
        Type localVarReturnType = new TypeToken<CellsDocumentPropertiesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete document property. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param propertyName The property name. (required)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cellsPropertiesDeleteDocumentPropertyAsync(String name, String propertyName, String folder, final ApiCallback<CellsDocumentPropertiesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cellsPropertiesDeleteDocumentPropertyValidateBeforeCall(name, propertyName, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CellsDocumentPropertiesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cellsPropertiesGetDocumentProperties
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cellsPropertiesGetDocumentPropertiesCall(String name, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cells/{name}/documentproperties"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call cellsPropertiesGetDocumentPropertiesValidateBeforeCall(String name, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling cellsPropertiesGetDocumentProperties(Async)");
        }
        
        
        com.squareup.okhttp.Call call = cellsPropertiesGetDocumentPropertiesCall(name, folder, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Read document properties.
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @return CellsDocumentPropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CellsDocumentPropertiesResponse cellsPropertiesGetDocumentProperties(String name, String folder) throws ApiException {
        ApiResponse<CellsDocumentPropertiesResponse> resp = cellsPropertiesGetDocumentPropertiesWithHttpInfo(name, folder);
        return resp.getData();
    }

    /**
     * Read document properties.
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;CellsDocumentPropertiesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CellsDocumentPropertiesResponse> cellsPropertiesGetDocumentPropertiesWithHttpInfo(String name, String folder) throws ApiException {
        com.squareup.okhttp.Call call = cellsPropertiesGetDocumentPropertiesValidateBeforeCall(name, folder, null, null);
        Type localVarReturnType = new TypeToken<CellsDocumentPropertiesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document properties. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cellsPropertiesGetDocumentPropertiesAsync(String name, String folder, final ApiCallback<CellsDocumentPropertiesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cellsPropertiesGetDocumentPropertiesValidateBeforeCall(name, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CellsDocumentPropertiesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cellsPropertiesGetDocumentProperty
     * @param name The document name. (required)
     * @param propertyName The property name. (required)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cellsPropertiesGetDocumentPropertyCall(String name, String propertyName, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cells/{name}/documentproperties/{propertyName}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(propertyName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call cellsPropertiesGetDocumentPropertyValidateBeforeCall(String name, String propertyName, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling cellsPropertiesGetDocumentProperty(Async)");
        }
        
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new ApiException("Missing the required parameter 'propertyName' when calling cellsPropertiesGetDocumentProperty(Async)");
        }
        
        
        com.squareup.okhttp.Call call = cellsPropertiesGetDocumentPropertyCall(name, propertyName, folder, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Read document property by name.
     * 
     * @param name The document name. (required)
     * @param propertyName The property name. (required)
     * @param folder The document folder. (optional)
     * @return CellsDocumentPropertyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CellsDocumentPropertyResponse cellsPropertiesGetDocumentProperty(String name, String propertyName, String folder) throws ApiException {
        ApiResponse<CellsDocumentPropertyResponse> resp = cellsPropertiesGetDocumentPropertyWithHttpInfo(name, propertyName, folder);
        return resp.getData();
    }

    /**
     * Read document property by name.
     * 
     * @param name The document name. (required)
     * @param propertyName The property name. (required)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;CellsDocumentPropertyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CellsDocumentPropertyResponse> cellsPropertiesGetDocumentPropertyWithHttpInfo(String name, String propertyName, String folder) throws ApiException {
        com.squareup.okhttp.Call call = cellsPropertiesGetDocumentPropertyValidateBeforeCall(name, propertyName, folder, null, null);
        Type localVarReturnType = new TypeToken<CellsDocumentPropertyResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document property by name. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param propertyName The property name. (required)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cellsPropertiesGetDocumentPropertyAsync(String name, String propertyName, String folder, final ApiCallback<CellsDocumentPropertyResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cellsPropertiesGetDocumentPropertyValidateBeforeCall(name, propertyName, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CellsDocumentPropertyResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cellsPropertiesPutDocumentProperty
     * @param name The document name. (required)
     * @param propertyName The property name. (required)
     * @param property with new property value. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cellsPropertiesPutDocumentPropertyCall(String name, String propertyName, CellsDocumentProperty property, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = property;
        
        // create path and map variables
        String localVarPath = "/cells/{name}/documentproperties/{propertyName}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(propertyName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call cellsPropertiesPutDocumentPropertyValidateBeforeCall(String name, String propertyName, CellsDocumentProperty property, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling cellsPropertiesPutDocumentProperty(Async)");
        }
        
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new ApiException("Missing the required parameter 'propertyName' when calling cellsPropertiesPutDocumentProperty(Async)");
        }
        
        
        com.squareup.okhttp.Call call = cellsPropertiesPutDocumentPropertyCall(name, propertyName, property, folder, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Set/create document property.
     * 
     * @param name The document name. (required)
     * @param propertyName The property name. (required)
     * @param property with new property value. (optional)
     * @param folder The document folder. (optional)
     * @return CellsDocumentPropertyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CellsDocumentPropertyResponse cellsPropertiesPutDocumentProperty(String name, String propertyName, CellsDocumentProperty property, String folder) throws ApiException {
        ApiResponse<CellsDocumentPropertyResponse> resp = cellsPropertiesPutDocumentPropertyWithHttpInfo(name, propertyName, property, folder);
        return resp.getData();
    }

    /**
     * Set/create document property.
     * 
     * @param name The document name. (required)
     * @param propertyName The property name. (required)
     * @param property with new property value. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;CellsDocumentPropertyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CellsDocumentPropertyResponse> cellsPropertiesPutDocumentPropertyWithHttpInfo(String name, String propertyName, CellsDocumentProperty property, String folder) throws ApiException {
        com.squareup.okhttp.Call call = cellsPropertiesPutDocumentPropertyValidateBeforeCall(name, propertyName, property, folder, null, null);
        Type localVarReturnType = new TypeToken<CellsDocumentPropertyResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Set/create document property. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param propertyName The property name. (required)
     * @param property with new property value. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cellsPropertiesPutDocumentPropertyAsync(String name, String propertyName, CellsDocumentProperty property, String folder, final ApiCallback<CellsDocumentPropertyResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cellsPropertiesPutDocumentPropertyValidateBeforeCall(name, propertyName, property, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CellsDocumentPropertyResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
