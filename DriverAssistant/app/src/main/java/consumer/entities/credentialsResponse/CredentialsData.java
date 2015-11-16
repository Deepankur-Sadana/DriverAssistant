package consumer.entities.credentialsResponse;

/**
 * Created by swarajpal on 25-07-2015.
 */
public class CredentialsData {
    private Long qb_id;
    private String qb_username;
    private String qb_password;

    public Long getQb_id() {
        return qb_id;
    }

    public void setQb_id(Long qb_id) {
        this.qb_id = qb_id;
    }

    public String getQb_password() {
        return qb_password;
    }

    public void setQb_password(String qb_password) {
        this.qb_password = qb_password;
    }

    public String getQb_username() {
        return qb_username;
    }

    public void setQb_username(String qb_username) {
        this.qb_username = qb_username;
    }
}
