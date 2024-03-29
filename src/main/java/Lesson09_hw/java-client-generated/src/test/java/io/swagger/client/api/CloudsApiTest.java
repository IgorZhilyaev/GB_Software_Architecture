/*
 * Заказ на ресурсы облака
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package Lesson09_hw.java;

import io.swagger.client.model.Cloud;
import io.swagger.client.model.Clouds;
import io.swagger.client.model.Error;
import io.swagger.client.model.Resources;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CloudsApi
 */
@Ignore
public class CloudsApiTest {

    private final CloudsApi api = new CloudsApi();

    /**
     * Метод отмены заказа по ID
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cancelCloudByIdTest() throws Exception {
        String cloudId = null;
        api.cancelCloudById(cloudId);

        // TODO: test validations
    }
    /**
     * Метод создания заказа на облако
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createCloudTest() throws Exception {
        Error body = null;
        Cloud response = api.createCloud(body);

        // TODO: test validations
    }
    /**
     * Метод получения списка ресурсов на облако
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllCloudsTest() throws Exception {
        Resources response = api.getAllClouds();

        // TODO: test validations
    }
    /**
     * Метод получения заказа на облако по ID
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCloudByIdTest() throws Exception {
        String cloudId = null;
        Clouds response = api.getCloudById(cloudId);

        // TODO: test validations
    }
}
