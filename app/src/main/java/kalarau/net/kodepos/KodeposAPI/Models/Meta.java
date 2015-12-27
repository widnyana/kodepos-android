
package kalarau.net.kodepos.KodeposAPI.Models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Meta {

    private Pagination pagination;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Meta() {
    }

    /**
     * 
     * @param pagination
     */
    public Meta(Pagination pagination) {
        this.pagination = pagination;
    }

    /**
     * 
     * @return
     *     The pagination
     */
    public Pagination getPagination() {
        return pagination;
    }

    /**
     * 
     * @param pagination
     *     The pagination
     */
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Meta withPagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Meta withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
