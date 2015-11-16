package fragments;

import android.app.Fragment;
import android.app.TimePickerDialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

import utils.ConnectionUtils;
/**
 * Created by deepankur on 11-11-2015.
 */
public class BaseFragment extends Fragment {
    boolean isInternetPresent = false;
    public void showShortToastMessage(String message){
        try{
            Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void showShortToastMessage(Integer message){
        try{
            Toast.makeText(getActivity(), String.valueOf(message), Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    protected View.OnClickListener timePickerListener = new View.OnClickListener() {
        @Override
        public void onClick(final View view) {
            final Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);
            TimePickerDialog.OnTimeSetListener timePickerListener =
                    new TimePickerDialog.OnTimeSetListener() {
                        public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                            String ch="AM";
                            int hour = selectedHour;
                            if(hour>=12) {
                                hour = hour-12;
                                ch="PM";
                            }
                            ((TextView)view).setText(new StringBuilder().append(pad(hour))
                                    .append(":").append(pad(selectedMinute)).append(" " + ch));

                        }
                    };
            TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), timePickerListener, hour, minute, false);
            timePickerDialog.show();
        }
    };
    private String pad(int c) {
        if (c >= 10)
            return String.valueOf(c);
        else
            return "0" + String.valueOf(c);
    }
    public static void setViewAndChildrenEnabled(View view, boolean enabled) {
        view.setEnabled(enabled);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View child = viewGroup.getChildAt(i);
                setViewAndChildrenEnabled(child, enabled);
            }
        }
    }
    public boolean isInternetAvailable() {
        try {
            isInternetPresent = ConnectionUtils.isNetworkAvailable(getActivity());
            if (!isInternetPresent) {
                Toast.makeText(getActivity(), "No Internet Connection", Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isInternetPresent;
    }
}
