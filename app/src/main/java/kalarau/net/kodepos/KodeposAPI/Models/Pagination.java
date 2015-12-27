
package kalarau.net.kodepos.KodeposAPI.Models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Pagination {

    private Long total;
    private Long count;
    private Long perPage;
    private Long currentPage;
    private Long totalPages;
    private Links links;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pagination() {
    }

    /**
     * 
     * @param total
     * @param count
     * @param links
     * @param currentPage
     * @param perPage
     * @param totalPages
     */
    public Pagination(Long total, Long count, Long perPage, Long currentPage, Long totalPages, Links links) {
        this.total = total;
        this.count = count;
        this.perPage = perPage;
        this.currentPage = currentPage;
        this.totalPages = totalPages;
        this.links = links;
    }

    /**
     * 
     * @return
     *     The total
     */
    public Long getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    public Pagination withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 
     * @return
     *     The count
     */
    public Long getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(Long count) {
        this.count = count;
    }

    public Pagination withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 
     * @return
     *     The perPage
     */
    public Long getPerPage() {
        return perPage;
    }

    /**
     * 
     * @param perPage
     *     The per_page
     */
    public void setPerPage(Long perPage) {
        this.perPage = perPage;
    }

    public Pagination withPerPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * 
     * @return
     *     The currentPage
     */
    public Long getCurrentPage() {
        return currentPage;
    }

    /**
     * 
     * @param currentPage
     *     The current_page
     */
    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public Pagination withCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    /**
     * 
     * @return
     *     The totalPages
     */
    public Long getTotalPages() {
        return totalPages;
    }

    /**
     * 
     * @param totalPages
     *     The total_pages
     */
    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public Pagination withTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * 
     * @return
     *     The links
     */
    public Links getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(Links links) {
        this.links = links;
    }

    public Pagination withLinks(Links links) {
        this.links = links;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Pagination withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
