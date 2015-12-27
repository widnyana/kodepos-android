
package kalarau.net.kodepos.KodeposAPI.Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class SearchResult {

    private List<Result> result = new ArrayList<Result>();
    private Meta meta;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SearchResult() {
    }

    /**
     * 
     * @param result
     * @param meta
     */
    public SearchResult(List<Result> result, Meta meta) {
        this.result = result;
        this.meta = meta;
    }

    /**
     * 
     * @return
     *     The result
     */
    public List<Result> getResult() {
        return result;
    }

    /**
     * 
     * @param result
     *     The result
     */
    public void setResult(List<Result> result) {
        this.result = result;
    }

    public SearchResult withResult(List<Result> result) {
        this.result = result;
        return this;
    }

    /**
     * 
     * @return
     *     The meta
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * 
     * @param meta
     *     The meta
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public SearchResult withMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public SearchResult withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
