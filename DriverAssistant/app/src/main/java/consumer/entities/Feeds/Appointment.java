
package consumer.entities.Feeds;

import java.util.HashMap;
import java.util.Map;

public class Appointment {

    private Integer appointment_id;
    private Integer patient_id;
    private String status;
    private String message;
    private String consultation_time;
    private String health_package;
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

}
