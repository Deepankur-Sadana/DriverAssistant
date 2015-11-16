
package consumer.entities.HealthIssues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Data {

    private Integer id;
    private String text;
    private String audio;
    private List<String> pictures = new ArrayList<String>();
    private Integer doctor_id;
    private Integer patient_id;
    private Integer product_id;
    private Object consultation_id;
    private String created_at;
    private String updated_at;
    private Object deleted_at;
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
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The audio
     */
    public String getAudio() {
        return audio;
    }

    /**
     * 
     * @param audio
     *     The audio
     */
    public void setAudio(String audio) {
        this.audio = audio;
    }

    /**
     * 
     * @return
     *     The pictures
     */
    public List<String> getPictures() {
        return pictures;
    }

    /**
     * 
     * @param pictures
     *     The pictures
     */
    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    /**
     * 
     * @return
     *     The doctor_id
     */
    public Integer getDoctor_id() {
        return doctor_id;
    }

    /**
     * 
     * @param doctor_id
     *     The doctor_id
     */
    public void setDoctor_id(Integer doctor_id) {
        this.doctor_id = doctor_id;
    }

    /**
     * 
     * @return
     *     The patient_id
     */
    public Integer getPatient_id() {
        return patient_id;
    }

    /**
     * 
     * @param patient_id
     *     The patient_id
     */
    public void setPatient_id(Integer patient_id) {
        this.patient_id = patient_id;
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
     *     The consultation_id
     */
    public Object getConsultation_id() {
        return consultation_id;
    }

    /**
     * 
     * @param consultation_id
     *     The consultation_id
     */
    public void setConsultation_id(Object consultation_id) {
        this.consultation_id = consultation_id;
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

    /**
     * 
     * @return
     *     The deleted_at
     */
    public Object getDeleted_at() {
        return deleted_at;
    }

    /**
     * 
     * @param deleted_at
     *     The deleted_at
     */
    public void setDeleted_at(Object deleted_at) {
        this.deleted_at = deleted_at;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
