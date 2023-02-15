package Lesson09_hw.jaxrs;

import io.swagger.api.*;
import io.swagger.model.Cloud;
import io.swagger.model.Clouds;
import io.swagger.model.Error;
import io.swagger.model.Resources;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Заказ на ресурсы облака
 *
 * <p>No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 */
public class CloudsApiServiceImpl implements CloudsApi {
    /**
     * Метод отмены заказа по ID
     *
     */
    public void cancelCloudById(String cloudId) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Метод создания заказа на облако
     *
     */
    public Cloud createCloud(Error body) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Метод получения списка ресурсов на облако
     *
     */
    public Resources getAllClouds() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Метод получения заказа на облако по ID
     *
     */
    public Clouds getCloudById(String cloudId) {
        // TODO: Implement...
        
        return null;
    }
    
}

