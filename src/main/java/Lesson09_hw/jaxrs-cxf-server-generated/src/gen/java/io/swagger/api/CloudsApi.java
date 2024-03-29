package Lesson09_hw.jaxrs;

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
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Заказ на ресурсы облака
 *
 * <p>No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 */
@Path("/")
public interface CloudsApi  {

    /**
     * Метод отмены заказа по ID
     *
     */
    @DELETE
    @Path("/clouds/{cloud_id}")
    @Produces({ "application/json", "adplication/json" })
    @Operation(summary = "Метод отмены заказа по ID", tags={ "Clouds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Успешный ответ заказом облака по ID"),
        @ApiResponse(responseCode = "400", description = "Bad request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "500", description = "Unexpected error.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "200", description = "Всё остальное", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))) })
    public void cancelCloudById(@PathParam("cloud_id") String cloudId);

    /**
     * Метод создания заказа на облако
     *
     */
    @POST
    @Path("/clouds")
    @Consumes({ "adplication/json" })
    @Produces({ "adplication/json", "application/json" })
    @Operation(summary = "Метод создания заказа на облако", tags={ "Clouds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Успешный ответ создания заказа на облако", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Cloud.class))),
        @ApiResponse(responseCode = "400", description = "Bad request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "500", description = "Unexpected error.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "200", description = "Всё остальное", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))) })
    public Cloud createCloud(@Valid Error body);

    /**
     * Метод получения списка ресурсов на облако
     *
     */
    @GET
    @Path("/clouds")
    @Produces({ "adplication/json", "application/json" })
    @Operation(summary = "Метод получения списка ресурсов на облако", tags={ "Clouds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Успешный ответ со списком ресурсов в облаке", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Resources.class))),
        @ApiResponse(responseCode = "400", description = "Bad request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "500", description = "Unexpected error.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "200", description = "Всё остальное", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))) })
    public Resources getAllClouds();

    /**
     * Метод получения заказа на облако по ID
     *
     */
    @GET
    @Path("/clouds/{cloud_id}")
    @Produces({ "adplication/json", "application/json" })
    @Operation(summary = "Метод получения заказа на облако по ID", tags={ "Clouds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Успешный ответ со списком ресурсов в облаке", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Clouds.class))),
        @ApiResponse(responseCode = "400", description = "Bad request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "500", description = "Unexpected error.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "200", description = "Всё остальное", content = @Content(mediaType = "adplication/json", schema = @Schema(implementation = Error.class))) })
    public Clouds getCloudById(@PathParam("cloud_id") String cloudId);
}
