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

public class Resources   {
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
  
  @Schema(example = "128", required = true, description = "")
  private String HDD = null;
  
  @Schema(example = "128", required = true, description = "")
  private String CPU = null;
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

  public Resources OS(OSEnum OS) {
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

  public Resources RAM(String RAM) {
    this.RAM = RAM;
    return this;
  }

 /**
   * Get HDD
   * @return HDD
  **/
  @JsonProperty("HDD")
  @NotNull
  public String getHDD() {
    return HDD;
  }

  public void setHDD(String HDD) {
    this.HDD = HDD;
  }

  public Resources HDD(String HDD) {
    this.HDD = HDD;
    return this;
  }

 /**
   * Get CPU
   * @return CPU
  **/
  @JsonProperty("CPU")
  @NotNull
  public String getCPU() {
    return CPU;
  }

  public void setCPU(String CPU) {
    this.CPU = CPU;
  }

  public Resources CPU(String CPU) {
    this.CPU = CPU;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resources {\n");
    
    sb.append("    OS: ").append(toIndentedString(OS)).append("\n");
    sb.append("    RAM: ").append(toIndentedString(RAM)).append("\n");
    sb.append("    HDD: ").append(toIndentedString(HDD)).append("\n");
    sb.append("    CPU: ").append(toIndentedString(CPU)).append("\n");
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
