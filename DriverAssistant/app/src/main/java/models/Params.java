package models;



import org.apache.http.NameValuePair;

import java.util.List;

public class Params {
    private String url;
    private List<NameValuePair> params;
    public Params(String url, List<NameValuePair> params) {
        this.url = url;
        this.params = params;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public List<NameValuePair> getParams() {
        return params;
    }
    public void setParams(List<NameValuePair> params) {
        this.params = params;
    }
}
