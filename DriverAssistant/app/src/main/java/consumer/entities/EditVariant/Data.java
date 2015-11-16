
package consumer.entities.EditVariant;

import java.util.HashMap;
import java.util.Map;

public class Data {

    private Integer id;
    private Integer product_id;
    private String product_name;
    private Boolean phone_support;
    private Boolean chat_support;
    private Boolean video_support;
    private Integer consultations;
    private String duration;
    private Integer actual_price;
    private Integer offer_price;
    private Integer package_id;
    private String created_at;
    private String updated_at;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The product_id
     */
    public Integer getProduct_id() {
        return product_id;
    }

    /**
     * 
     * @param product_id
     *     The product_id
     */
    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    /**
     * 
     * @return
     *     The product_name
     */
    public String getProduct_name() {
        return product_name;
    }

    /**
     * 
     * @param product_name
     *     The product_name
     */
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    /**
     * 
     * @return
     *     The phone_support
     */
    public Boolean getPhone_support() {
        return phone_support;
    }

    /**
     * 
     * @param phone_support
     *     The phone_support
     */
    public void setPhone_support(Boolean phone_support) {
        this.phone_support = phone_support;
    }

    /**
     * 
     * @return
     *     The chat_support
     */
    public Boolean getChat_support() {
        return chat_support;
    }

    /**
     * 
     * @param chat_support
     *     The chat_support
     */
    public void setChat_support(Boolean chat_support) {
        this.chat_support = chat_support;
    }

    /**
     * 
     * @return
     *     The video_support
     */
    public Boolean getVideo_support() {
        return video_support;
    }

    /**
     * 
     * @param video_support
     *     The video_support
     */
    public void setVideo_support(Boolean video_support) {
        this.video_support = video_support;
    }

    /**
     * 
     * @return
     *     The consultations
     */
    public Integer getConsultations() {
        return consultations;
    }

    /**
     * 
     * @param consultations
     *     The consultations
     */
    public void setConsultations(Integer consultations) {
        this.consultations = consultations;
    }

    /**
     * 
     * @return
     *     The duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The actual_price
     */
    public Integer getActual_price() {
        return actual_price;
    }

    /**
     * 
     * @param actual_price
     *     The actual_price
     */
    public void setActual_price(Integer actual_price) {
        this.actual_price = actual_price;
    }

    /**
     * 
     * @return
     *     The offer_price
     */
    public Integer getOffer_price() {
        return offer_price;
    }

    /**
     * 
     * @param offer_price
     *     The offer_price
     */
    public void setOffer_price(Integer offer_price) {
        this.offer_price = offer_price;
    }

    /**
     * 
     * @return
     *     The package_id
     */
    public Integer getPackage_id() {
        return package_id;
    }

    /**
     * 
     * @param package_id
     *     The package_id
     */
    public void setPackage_id(Integer package_id) {
        this.package_id = package_id;
    }

    /**
     * 
     * @return
     *     The created_at
     */
    public String getCreated_at() {
        return created_at;
    }

    /**
     * 
     * @param created_at
     *     The created_at
     */
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    /**
     * 
     * @return
     *     The updated_at
     */
    public String getUpdated_at() {
        return updated_at;
    }

    /**
     * 
     * @param updated_at
     *     The updated_at
     */
    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
