
package consumer.entities.AssignedPlans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pagination {

    private Integer total;
    private Integer count;
    private Integer per_page;
    private Integer current_page;
    private Integer total_pages;
    private List<Object> links = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 
     * @return
     *     The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The per_page
     */
    public Integer getPer_page() {
        return per_page;
    }

    /**
     * 
     * @param per_page
     *     The per_page
     */
    public void setPer_page(Integer per_page) {
        this.per_page = per_page;
    }

    /**
     * 
     * @return
     *     The current_page
     */
    public Integer getCurrent_page() {
        return current_page;
    }

    /**
     * 
     * @param current_page
     *     The current_page
     */
    public void setCurrent_page(Integer current_page) {
        this.current_page = current_page;
    }

    /**
     * 
     * @return
     *     The total_pages
     */
    public Integer getTotal_pages() {
        return total_pages;
    }

    /**
     * 
     * @param total_pages
     *     The total_pages
     */
    public void setTotal_pages(Integer total_pages) {
        this.total_pages = total_pages;
    }

    /**
     * 
     * @return
     *     The links
     */
    public List<Object> getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(List<Object> links) {
        this.links = links;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
