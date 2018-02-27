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


import com.aspose.cloud.cells.model.AutoShapesResponse;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CellsAutoshapesApi {
    private ApiClient apiClient;

    public CellsAutoshapesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CellsAutoshapesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for cellsAutoshapesGetWorksheetAutoshape
     * @param name Document name. (required)
     * @param sheetName Worksheet name. (required)
     * @param autoshapeNumber The autoshape number. (required)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cellsAutoshapesGetWorksheetAutoshapeCall(String name, String sheetName, Integer autoshapeNumber, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cells/{name}/worksheets/{sheetName}/autoshapes/{autoshapeNumber}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
            .replaceAll("\\{" + "autoshapeNumber" + "\\}", apiClient.escapeString(autoshapeNumber.toString()));

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
    private com.squareup.okhttp.Call cellsAutoshapesGetWorksheetAutoshapeValidateBeforeCall(String name, String sheetName, Integer autoshapeNumber, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling cellsAutoshapesGetWorksheetAutoshape(Async)");
        }
        
        // verify the required parameter 'sheetName' is set
        if (sheetName == null) {
            throw new ApiException("Missing the required parameter 'sheetName' when calling cellsAutoshapesGetWorksheetAutoshape(Async)");
        }
        
        // verify the required parameter 'autoshapeNumber' is set
        if (autoshapeNumber == null) {
            throw new ApiException("Missing the required parameter 'autoshapeNumber' when calling cellsAutoshapesGetWorksheetAutoshape(Async)");
        }
        
        
        com.squareup.okhttp.Call call = cellsAutoshapesGetWorksheetAutoshapeCall(name, sheetName, autoshapeNumber, folder, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get autoshape info.
     * 
     * @param name Document name. (required)
     * @param sheetName Worksheet name. (required)
     * @param autoshapeNumber The autoshape number. (required)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File cellsAutoshapesGetWorksheetAutoshape(String name, String sheetName, Integer autoshapeNumber, String folder) throws ApiException {
        ApiResponse<File> resp = cellsAutoshapesGetWorksheetAutoshapeWithHttpInfo(name, sheetName, autoshapeNumber, folder);
        return resp.getData();
    }

    /**
     * Get autoshape info.
     * 
     * @param name Document name. (required)
     * @param sheetName Worksheet name. (required)
     * @param autoshapeNumber The autoshape number. (required)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> cellsAutoshapesGetWorksheetAutoshapeWithHttpInfo(String name, String sheetName, Integer autoshapeNumber, String folder) throws ApiException {
        com.squareup.okhttp.Call call = cellsAutoshapesGetWorksheetAutoshapeValidateBeforeCall(name, sheetName, autoshapeNumber, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get autoshape info. (asynchronously)
     * 
     * @param name Document name. (required)
     * @param sheetName Worksheet name. (required)
     * @param autoshapeNumber The autoshape number. (required)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cellsAutoshapesGetWorksheetAutoshapeAsync(String name, String sheetName, Integer autoshapeNumber, String folder, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cellsAutoshapesGetWorksheetAutoshapeValidateBeforeCall(name, sheetName, autoshapeNumber, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cellsAutoshapesGetWorksheetAutoshapes
     * @param name Document name. (required)
     * @param sheetName The worksheet name. (required)
     * @param folder Document&#39;s folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cellsAutoshapesGetWorksheetAutoshapesCall(String name, String sheetName, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cells/{name}/worksheets/{sheetName}/autoshapes"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

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
    private com.squareup.okhttp.Call cellsAutoshapesGetWorksheetAutoshapesValidateBeforeCall(String name, String sheetName, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling cellsAutoshapesGetWorksheetAutoshapes(Async)");
        }
        
        // verify the required parameter 'sheetName' is set
        if (sheetName == null) {
            throw new ApiException("Missing the required parameter 'sheetName' when calling cellsAutoshapesGetWorksheetAutoshapes(Async)");
        }
        
        
        com.squareup.okhttp.Call call = cellsAutoshapesGetWorksheetAutoshapesCall(name, sheetName, folder, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get worksheet autoshapes info.
     * 
     * @param name Document name. (required)
     * @param sheetName The worksheet name. (required)
     * @param folder Document&#39;s folder. (optional)
     * @return AutoShapesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AutoShapesResponse cellsAutoshapesGetWorksheetAutoshapes(String name, String sheetName, String folder) throws ApiException {
        ApiResponse<AutoShapesResponse> resp = cellsAutoshapesGetWorksheetAutoshapesWithHttpInfo(name, sheetName, folder);
        return resp.getData();
    }

    /**
     * Get worksheet autoshapes info.
     * 
     * @param name Document name. (required)
     * @param sheetName The worksheet name. (required)
     * @param folder Document&#39;s folder. (optional)
     * @return ApiResponse&lt;AutoShapesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AutoShapesResponse> cellsAutoshapesGetWorksheetAutoshapesWithHttpInfo(String name, String sheetName, String folder) throws ApiException {
        com.squareup.okhttp.Call call = cellsAutoshapesGetWorksheetAutoshapesValidateBeforeCall(name, sheetName, folder, null, null);
        Type localVarReturnType = new TypeToken<AutoShapesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get worksheet autoshapes info. (asynchronously)
     * 
     * @param name Document name. (required)
     * @param sheetName The worksheet name. (required)
     * @param folder Document&#39;s folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cellsAutoshapesGetWorksheetAutoshapesAsync(String name, String sheetName, String folder, final ApiCallback<AutoShapesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cellsAutoshapesGetWorksheetAutoshapesValidateBeforeCall(name, sheetName, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AutoShapesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
