/*
 * Pravega Controller APIs
 * List of admin REST APIs for the Pravega controller service.
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.pravega.controller.server.rest.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.pravega.controller.server.rest.generated.model.RetentionConfig;
import io.pravega.controller.server.rest.generated.model.ScalingConfig;
import io.pravega.controller.server.rest.generated.model.TagsList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * CreateStreamRequest
 */

public class CreateStreamRequest   {
  @JsonProperty("streamName")
  private String streamName = null;

  @JsonProperty("scalingPolicy")
  private ScalingConfig scalingPolicy = null;

  @JsonProperty("retentionPolicy")
  private RetentionConfig retentionPolicy = null;

  @JsonProperty("streamTags")
  private TagsList streamTags = null;

  public CreateStreamRequest streamName(String streamName) {
    this.streamName = streamName;
    return this;
  }

  /**
   * Get streamName
   * @return streamName
   **/
  @JsonProperty("streamName")
  @ApiModelProperty(value = "")
  public String getStreamName() {
    return streamName;
  }

  public void setStreamName(String streamName) {
    this.streamName = streamName;
  }

  public CreateStreamRequest scalingPolicy(ScalingConfig scalingPolicy) {
    this.scalingPolicy = scalingPolicy;
    return this;
  }

  /**
   * Get scalingPolicy
   * @return scalingPolicy
   **/
  @JsonProperty("scalingPolicy")
  @ApiModelProperty(value = "")
  public ScalingConfig getScalingPolicy() {
    return scalingPolicy;
  }

  public void setScalingPolicy(ScalingConfig scalingPolicy) {
    this.scalingPolicy = scalingPolicy;
  }

  public CreateStreamRequest retentionPolicy(RetentionConfig retentionPolicy) {
    this.retentionPolicy = retentionPolicy;
    return this;
  }

  /**
   * Get retentionPolicy
   * @return retentionPolicy
   **/
  @JsonProperty("retentionPolicy")
  @ApiModelProperty(value = "")
  public RetentionConfig getRetentionPolicy() {
    return retentionPolicy;
  }

  public void setRetentionPolicy(RetentionConfig retentionPolicy) {
    this.retentionPolicy = retentionPolicy;
  }

  public CreateStreamRequest streamTags(TagsList streamTags) {
    this.streamTags = streamTags;
    return this;
  }

  /**
   * Get streamTags
   * @return streamTags
   **/
  @JsonProperty("streamTags")
  @ApiModelProperty(value = "")
  public TagsList getStreamTags() {
    return streamTags;
  }

  public void setStreamTags(TagsList streamTags) {
    this.streamTags = streamTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateStreamRequest createStreamRequest = (CreateStreamRequest) o;
    return Objects.equals(this.streamName, createStreamRequest.streamName) &&
        Objects.equals(this.scalingPolicy, createStreamRequest.scalingPolicy) &&
        Objects.equals(this.retentionPolicy, createStreamRequest.retentionPolicy) &&
        Objects.equals(this.streamTags, createStreamRequest.streamTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamName, scalingPolicy, retentionPolicy, streamTags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateStreamRequest {\n");
    
    sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
    sb.append("    scalingPolicy: ").append(toIndentedString(scalingPolicy)).append("\n");
    sb.append("    retentionPolicy: ").append(toIndentedString(retentionPolicy)).append("\n");
    sb.append("    streamTags: ").append(toIndentedString(streamTags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

