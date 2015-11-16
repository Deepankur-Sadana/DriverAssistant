
package consumer.entities.AddAccountInformation;

import java.util.HashMap;
import java.util.Map;

public class Data {

    private Integer account_id;
    private String account_name;
    private String account_number;
    private String account_ifsc_code;
    private String account_type;
    private String account_branch_name;
    private String created_at;
    private String updated_at;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The account_id
     */
    public Integer getAccount_id() {
        return account_id;
    }

    /**
     * 
     * @param account_id
     *     The account_id
     */
    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }

    /**
     * 
     * @return
     *     The account_name
     */
    public String getAccount_name() {
        return account_name;
    }

    /**
     * 
     * @param account_name
     *     The account_name
     */
    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    /**
     * 
     * @return
     *     The account_number
     */
    public String getAccount_number() {
        return account_number;
    }

    /**
     * 
     * @param account_number
     *     The account_number
     */
    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    /**
     * 
     * @return
     *     The account_ifsc_code
     */
    public String getAccount_ifsc_code() {
        return account_ifsc_code;
    }

    /**
     * 
     * @param account_ifsc_code
     *     The account_ifsc_code
     */
    public void setAccount_ifsc_code(String account_ifsc_code) {
        this.account_ifsc_code = account_ifsc_code;
    }

    /**
     * 
     * @return
     *     The account_type
     */
    public String getAccount_type() {
        return account_type;
    }

    /**
     * 
     * @param account_type
     *     The account_type
     */
    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    /**
     * 
     * @return
     *     The account_branch_name
     */
    public String getAccount_branch_name() {
        return account_branch_name;
    }

    /**
     * 
     * @param account_branch_name
     *     The account_branch_name
     */
    public void setAccount_branch_name(String account_branch_name) {
        this.account_branch_name = account_branch_name;
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
