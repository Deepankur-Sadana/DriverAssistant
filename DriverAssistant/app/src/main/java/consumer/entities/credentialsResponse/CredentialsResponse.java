package consumer.entities.credentialsResponse;

/**
 * Created by swarajpal on 25-07-2015.
 */
public class CredentialsResponse {
 /*   {
        "status": 200,
            "message": null,
            "data": {
        "qb_id": 4411906,
                "qb_username": "patient-swaraj-55b33d44bd195",
                "qb_password": "bVak4Bdz"
    },
        "errors": null
    }*/
    private int status;
    private String message;
    private CredentialsData data;
    private long qb_id;
    private String[] errors;

    public CredentialsData getData() {
        return data;
    }

    public void setData(CredentialsData data) {
        this.data = data;
    }

    public String[] getErrors() {
        return errors;
    }

    public void setErrors(String[] errors) {
        this.errors = errors;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getQb_id() {
        return qb_id;
    }

    public void setQb_id(long qb_id) {
        this.qb_id = qb_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
