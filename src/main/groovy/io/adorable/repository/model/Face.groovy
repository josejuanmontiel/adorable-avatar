package io.adorable.repository.model

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import javax.annotation.Generated
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder(["eyes","nose","mouth"])
public class Face {

    @JsonProperty("eyes")
    private List<String> eyes = new ArrayList<String>();
    @JsonProperty("nose")
    private List<String> nose = new ArrayList<String>();
    @JsonProperty("mouth")
    private List<String> mouth = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("eyes")
    public List<String> getEyes() {
        return eyes;
    }

    @JsonProperty("eyes")
    public void setEyes(List<String> eyes) {
        this.eyes = eyes;
    }

    @JsonProperty("nose")
    public List<String> getNose() {
        return nose;
    }

    @JsonProperty("nose")
    public void setNose(List<String> nose) {
        this.nose = nose;
    }

    @JsonProperty("mouth")
    public List<String> getMouth() {
        return mouth;
    }

    @JsonProperty("mouth")
    public void setMouth(List<String> mouth) {
        this.mouth = mouth;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
