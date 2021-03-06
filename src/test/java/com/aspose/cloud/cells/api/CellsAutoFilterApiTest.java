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


import com.aspose.cloud.cells.model.AutoFilterResponse;
import com.aspose.cloud.cells.model.CellsColor;
import com.aspose.cloud.cells.model.Color;
import com.aspose.cloud.cells.model.ColorFilterRequest;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CellsAutoFilterApi
 */

public class CellsAutoFilterApiTest {

    private final CellsAutoFilterApi api = new CellsAutoFilterApi();

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
     * Removes a date filter.             
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsAutoFilterDeleteWorksheetDateFilterTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer fieldIndex = 1;
        String dateTimeGroupingType = "Day";
        Integer year = 2010;
        Integer month = 10;
        Integer day = 1;
        Integer hour = 1;
        Integer minute = 1;
        Integer second = 1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsAutoFilterDeleteWorksheetDateFilter(name, sheetName, fieldIndex, dateTimeGroupingType, year, month, day, hour, minute, second, folder);

        // TODO: test validations
    }
    
    /**
     * Delete a filter for a filter column.             
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsAutoFilterDeleteWorksheetFilterTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer fieldIndex = 1;
        String criteria = "test";
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsAutoFilterDeleteWorksheetFilter(name, sheetName, fieldIndex, criteria, folder);

        // TODO: test validations
    }
    
    /**
     * Get Auto filter Description
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsAutoFilterGetWorksheetAutoFilterTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        AutoFilterResponse response = api.cellsAutoFilterGetWorksheetAutoFilter(name, sheetName, folder);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsAutoFilterPostWorksheetAutoFilterRefreshTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsAutoFilterPostWorksheetAutoFilterRefresh(name, sheetName, folder);

        // TODO: test validations
    }
    
    /**
     * Match all blank cell in the list.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsAutoFilterPostWorksheetMatchBlanksTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer fieldIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsAutoFilterPostWorksheetMatchBlanks(name, sheetName, fieldIndex, folder);

        // TODO: test validations
    }
    
    /**
     * Match all not blank cell in the list.             
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsAutoFilterPostWorksheetMatchNonBlanksTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer fieldIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsAutoFilterPostWorksheetMatchNonBlanks(name, sheetName, fieldIndex, folder);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsAutoFilterPutWorksheetColorFilterTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String range = RANGE;
        Integer fieldIndex = 0;
        ColorFilterRequest colorFilter = new ColorFilterRequest();
        Color color = new Color();
        color.setR(255);
        color.setG ( 245);
        CellsColor cellsColor = new CellsColor();
        cellsColor.setColor(color);
        colorFilter.setForegroundColor(cellsColor);
        colorFilter.setPattern("Solid");
        Boolean matchBlanks = true;
        Boolean refresh = true;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsAutoFilterPutWorksheetColorFilter(name, sheetName, range, fieldIndex, colorFilter, matchBlanks, refresh, folder);

        // TODO: test validations
    }
    
    /**
     * Filters a list with a custom criteria.             
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsAutoFilterPutWorksheetCustomFilterTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String range = RANGE;
        Integer fieldIndex = 0;
        String operatorType1 = "LessOrEqual";
        String criteria1 = "test";
        Boolean isAnd = false;
        String operatorType2 = "LessOrEqual";
        String criteria2 = "test";
        Boolean matchBlanks = true;
        Boolean refresh = false;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsAutoFilterPutWorksheetCustomFilter(name, sheetName, range, fieldIndex, operatorType1, criteria1, isAnd, operatorType2, criteria2, matchBlanks, refresh, folder);

        // TODO: test validations
    }
    
    /**
     * add date filter in worksheet 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsAutoFilterPutWorksheetDateFilterTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String range = RANGE;
        Integer fieldIndex = 0;
        String dateTimeGroupingType = "Day";
        Integer year = 2010;
        Integer month = 10;
        Integer day = 1;
        Integer hour = 1;
        Integer minute = 1;
        Integer second = 1;
        Boolean matchBlanks = true;
        Boolean refresh = null;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsAutoFilterPutWorksheetDateFilter(name, sheetName, range, fieldIndex, dateTimeGroupingType, year, month, day, hour, minute, second, matchBlanks, refresh, folder);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsAutoFilterPutWorksheetDynamicFilterTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String range = RANGE;
        Integer fieldIndex = 0;
        String dynamicFilterType = "May";
        Boolean matchBlanks = true;
        Boolean refresh = true;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsAutoFilterPutWorksheetDynamicFilter(name, sheetName, range, fieldIndex, dynamicFilterType, matchBlanks, refresh, folder);

        // TODO: test validations
    }
    
    /**
     * Adds a filter for a filter column.             
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsAutoFilterPutWorksheetFilterTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String range = RANGE;
        Integer fieldIndex = 0;
        String criteria =  "test";
        Boolean matchBlanks = true;
        Boolean refresh = true;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsAutoFilterPutWorksheetFilter(name, sheetName, range, fieldIndex, criteria, matchBlanks, refresh, folder);

        // TODO: test validations
    }
    
    /**
     * Filter the top 10 item in the list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsAutoFilterPutWorksheetFilterTop10Test() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String range = RANGE;
        Integer fieldIndex = 0;
        Boolean isTop = true;
        Boolean isPercent = true;
        Integer itemCount = 1;
        Boolean matchBlanks = null;
        Boolean refresh = null;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsAutoFilterPutWorksheetFilterTop10(name, sheetName, range, fieldIndex, isTop, isPercent, itemCount, matchBlanks, refresh, folder);

        // TODO: test validations
    }
    
    /**
     * Adds an icon filter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsAutoFilterPutWorksheetIconFilterTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String range = RANGE;
        Integer fieldIndex = 0;
        String iconSetType = "None";
        Integer iconId = 0;
        Boolean matchBlanks = null;
        Boolean refresh = null;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsAutoFilterPutWorksheetIconFilter(name, sheetName, range, fieldIndex, iconSetType, iconId, matchBlanks, refresh, folder);

        // TODO: test validations
    }
    
}
