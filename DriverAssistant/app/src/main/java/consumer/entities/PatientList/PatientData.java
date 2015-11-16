
package consumer.entities.PatientList;

import java.util.HashMap;
import java.util.Map;

public class PatientData {

    private Integer patient_id;
    private Integer product_id;
    private String patient_name;
    private String patient_detail;
    private String patient_picture;
    private String last_consultation;
    private String next_consultation;
    private String health_package;
    private int patient_qb_id;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The patient_name
     */
    public String getPatient_name() {
        return patient_name;
    }

    /**
     * 
     * @param patient_name
     *     The patient_name
     */
    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    /**
     * 
     * @return
     *     The patient_detail
     */
    public String getPatient_detail() {
        return patient_detail;
    }

    /**
     * 
     * @param patient_detail
     *     The patient_detail
     */
    public void setPatient_detail(String patient_detail) {
        this.patient_detail = patient_detail;
    }

    /**
     * 
     * @return
     *     The patient_picture
     */
    public String getPatient_picture() {
        return patient_picture;
    }

    /**
     * 
     * @param patient_picture
     *     The patient_picture
     */
    public void setPatient_picture(String patient_picture) {
        this.patient_picture = patient_picture;
    }

    /**
     * 
     * @return
     *     The last_consultation
     */
    public String getLast_consultation() {
        return last_consultation;
    }

    /**
     * 
     * @param last_consultation
     *     The last_consultation
     */
    public void setLast_consultation(String last_consultation) {
        this.last_consultation = last_consultation;
    }

    /**
     * 
     * @return
     *     The next_consultation
     */
    public String getNext_consultation() {
        return next_consultation;
    }

    /**
     * 
     * @param next_consultation
     *     The next_consultation
     */
    public void setNext_consultation(String next_consultation) {
        this.next_consultation = next_consultation;
    }

    /**
     * 
     * @return
     *     The health_package
     */
    public String getHealth_package() {
        return health_package;
    }

    /**
     * 
     * @param health_package
     *     The health_package
     */
    public void setHealth_package(String health_package) {
        this.health_package = health_package;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public int getPatient_qb_id() {
        return patient_qb_id;
    }

    public void setPatient_qb_id(int patient_qb_id) {
        this.patient_qb_id = patient_qb_id;
    }



}
