
package consumer.entities.Appointments;

import java.util.HashMap;
import java.util.Map;

public class Data {

    private Integer appointment_id;
    private Integer patient_id;
    private String status;
    private Integer product_id;
    private String patient_name;
    private String patient_detail;
    private String patient_picture;
    private String message;
    private String patient_mobile;
    private String consultation_time;
    private String health_package;
    private int patient_qb_id;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The appointment_id
     */
    public Integer getAppointment_id() {
        return appointment_id;
    }

    /**
     * 
     * @param appointment_id
     *     The appointment_id
     */
    public void setAppointment_id(Integer appointment_id) {
        this.appointment_id = appointment_id;
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
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
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
     *     The message
     */
    public String getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 
     * @return
     *     The consultation_time
     */
    public String getConsultation_time() {
        return consultation_time;
    }

    /**
     * 
     * @param consultation_time
     *     The consultation_time
     */
    public void setConsultation_time(String consultation_time) {
        this.consultation_time = consultation_time;
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

    public String getPatient_mobile() {
        return patient_mobile;
    }

    public void setPatient_mobile(String patient_mobile) {
        this.patient_mobile = patient_mobile;
    }

    public int getPatient_qb_id() {
        return patient_qb_id;
    }

    public void setPatient_qb_id(int patient_qb_id) {
        this.patient_qb_id = patient_qb_id;
    }
}
