package listeners;

import dialogs.WaitProgressDialog;

public interface HealthAsynTaskListener {
    void onPreExecute(WaitProgressDialog dialog);
    void onPostExecute(String result);
}
