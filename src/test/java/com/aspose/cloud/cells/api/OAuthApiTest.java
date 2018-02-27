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
import com.aspose.cloud.cells.client.ApiClient;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.client.Configuration;


import com.aspose.cloud.cells.model.AccessTokenResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OAuthApi
 */

public class OAuthApiTest {

    private final OAuthApi api = new OAuthApi();

    private String BOOK1 = "Book1.xlsx";
    private String MYDOC = "myDocument.xlsx";
    private String PivTestFile = "TestCase.xlsx";
    private String TEMPFOLDER = "Temp";
    private String SHEET1 = "Sheet1";
    private String SHEET2 = "Sheet2";
    private String SHEET3 = "Sheet3";
    private String SHEET4 = "Sheet4";
    private String SHEET5 = "Sheet5";
    private String SHEET6 = "Sheet6";
    private String SHEET7 = "Sheet7";
    private String SHEET8 = "Sheet8";
    private String CellName = "A1";
    private String RANGE = "A1:C10";
    private String CELLAREA = "A1:C10";
    
	
    
    /**
     * Get Access token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oAuthPostTest() throws ApiException {
        String grantType = CellsApiUtil.GetGrantType();
        String clientId = CellsApiUtil.GetClientId();
        String clientSecret = CellsApiUtil.GetClientSecret();
        ApiClient apiClient =new ApiClient();
		apiClient.setBasePath("https://api.aspose.cloud/");
		api.setApiClient( apiClient);
        AccessTokenResponse response = api.oAuthPost(grantType, clientId, clientSecret);
        System.out.println(response.getAccessToken());
        // TODO: test validations
    }
    
}
