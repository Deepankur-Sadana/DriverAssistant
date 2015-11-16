
package consumer.entities.GetPrescriptionList;

import java.util.HashMap;
import java.util.Map;

public class PresList {

    private Integer id;
    private String note;
    private String created_at;
    private String updated_at;
    private Doctor doctor;
    private Patient patient;
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
     *     The note
     */
    public String getNote() {
        return note;
    }

    /**
     * 
     * @param note
     *     The note
     */
    public void setNote(String note) {
        this.note = note;
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
     *     The doctor
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * 
     * @param doctor
     *     The doctor
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     * 
     * @return
     *     The patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * 
     * @param patient
     *     The patient
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
