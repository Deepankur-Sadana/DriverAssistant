package components;

import android.util.Log;




import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.List;

import utils.hCareSharedPref;

public class ServerCommunication {

    private static ServerCommunication serverCommunication;
    private static String token;


    public static ServerCommunication server() {
        token = hCareSharedPref.getAuthToken();
        if (serverCommunication == null) {
            serverCommunication = new ServerCommunication();
        }
        return serverCommunication;
    }

    public String getHealthPostData(String url, List<NameValuePair> param, int setTimeOut) {
        try {
            HttpPost httpPost = new HttpPost();
            HttpParams httpParameters = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(httpParameters, setTimeOut);
            HttpConnectionParams.setSoTimeout(httpParameters, setTimeOut);
            HttpConnectionParams.setTcpNoDelay(httpParameters, true);
            DefaultHttpClient client = new DefaultHttpClient(httpParameters);
            httpPost.setHeader("X-HCARE-TYPE", "patient");
            if (token != null && !token.isEmpty()) {
                httpPost.setHeader("Authorization", "Bearer " + token);
            }
            httpPost.setURI(new URI(url));
            httpPost.setEntity(new UrlEncodedFormEntity(param));
            HttpResponse response = client.execute(httpPost);
            HttpEntity entity = response.getEntity();
            String responseText = EntityUtils.toString(entity);
            return responseText;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getHealthGetData(String url, List<NameValuePair> param, int setTimeOut) {
        try {
            HttpGet httpGet = new HttpGet();
            HttpParams httpParameters = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(httpParameters, setTimeOut);
            HttpConnectionParams.setSoTimeout(httpParameters, setTimeOut);
            HttpConnectionParams.setTcpNoDelay(httpParameters, true);
            HttpClient httpclient = new DefaultHttpClient();
            httpGet.setURI(new URI(url));
            if (param != null) {
                for (NameValuePair pair : param) {
                    httpGet = new HttpGet(url + "?" + URLEncodedUtils.format(param, "UTF-8"));
                }
            }
            httpGet.setHeader("X-HCARE-TYPE", "doctor");
            if (token != null && !token.isEmpty()) {
                httpGet.setHeader("Authorization", "Bearer " + token);
            }
            HttpResponse httpResponse = httpclient.execute(httpGet);
            InputStream inputStream = httpResponse.getEntity().getContent();
            if (inputStream != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder result = new StringBuilder();
                String line = "";
                while ((line = bufferedReader.readLine()) != null)
                    result.append(line);
                inputStream.close();
                return result.toString();
            } else
                return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getHealthPutData(String url, List<NameValuePair> param, int setTimeOut) {
        try {
            HttpPut httpPut = new HttpPut();
            HttpParams httpParameters = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(httpParameters, setTimeOut);
            HttpConnectionParams.setSoTimeout(httpParameters, setTimeOut);
            HttpConnectionParams.setTcpNoDelay(httpParameters, true);
            DefaultHttpClient client = new DefaultHttpClient(httpParameters);
            httpPut.setURI(new URI(url));
            httpPut.setHeader("X-HCARE-TYPE", "patient");
            if (token != null && !token.isEmpty()) {
                httpPut.setHeader("Authorization", "Bearer " + token);
            }
            httpPut.setEntity(new UrlEncodedFormEntity(param));
            HttpResponse response = client.execute(httpPut);
            HttpEntity entity = response.getEntity();
            String responseText = EntityUtils.toString(entity);
            Log.d("Advisor", responseText);
            return responseText;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getActionUrl(String actionIID) {
        String urlString = "http://staging.api.advisor.healthcare/api";
        if (actionIID != null)
            return urlString + actionIID;
        else
            return urlString;
    }
}
