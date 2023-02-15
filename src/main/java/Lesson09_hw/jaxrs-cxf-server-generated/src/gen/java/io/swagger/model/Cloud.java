package Lesson09_hw.jaxrs;

import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class Cloud   {
  
  @Schema(example = "f102b615", description = "")
  private String cloudId = null;
  
  @Schema(example = "f102b615", required = true, description = "")
  private String idServer = null;
  public enum OSEnum {
    WINDOWS("Windows"),
    LINUX("Linux");

    private String value;

    OSEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static OSEnum fromValue(String text) {
      for (OSEnum b : OSEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(required = true, description = "Операционная система сервера")
 /**
   * Операционная система сервера  
  **/
  private OSEnum OS = null;
  
  @Schema(example = "128", required = true, description = "")
  private String RAM = null;
 /**
   * Get cloudId
   * @return cloudId
  **/
  @JsonProperty("cloud_id")
  public String getCloudId() {
    return cloudId;
  }

  public void setCloudId(String cloudId) {
    this.cloudId = cloudId;
  }

  public Cloud cloudId(String cloudId) {
    this.cloudId = cloudId;
    return this;
  }

 /**
   * Get idServer
   * @return idServer
  **/
  @JsonProperty("id_server")
  @NotNull
  public String getIdServer() {
    return idServer;
  }

  public void setIdServer(String idServer) {
    this.idServer = idServer;
  }

  public Cloud idServer(String idServer) {
    this.idServer = idServer;
    return this;
  }

 /**
   * Операционная система сервера
   * @return OS
  **/
  @JsonProperty("OS")
  @NotNull
  public String getOS() {
    if (OS == null) {
      return null;
    }
    return OS.getValue();
  }

  public void setOS(OSEnum OS) {
    this.OS = OS;
  }

  public Cloud OS(OSEnum OS) {
    this.OS = OS;
    return this;
  }

 /**
   * Get RAM
   * @return RAM
  **/
  @JsonProperty("RAM")
  @NotNull
  public String getRAM() {
    return RAM;
  }

  public void setRAM(String RAM) {
    this.RAM = RAM;
  }

  public Cloud RAM(String RAM) {
    this.RAM = RAM;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cloud {\n");
    
    sb.append("    cloudId: ").append(toIndentedString(cloudId)).append("\n");
    sb.append("    idServer: ").append(toIndentedString(idServer)).append("\n");
    sb.append("    OS: ").append(toIndentedString(OS)).append("\n");
    sb.append("    RAM: ").append(toIndentedString(RAM)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
