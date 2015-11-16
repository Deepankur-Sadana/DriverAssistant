package customViews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

import advisor.healthcare.hcaredoctorapp.R;
import advisor.healthcare.hcaredoctorapp.activities.MainActivity;
import advisor.healthcare.hcaredoctorapp.activities.hCareApplication;
import fragments.AccountBillingFragment;
import fragments.DoctorProfileTabFragment;
import fragments.MyPackagesFragment;
import fragments.PatientProfileFragment;
import fragments.PrescriptionListFragment;
import fragments.VirtualClinicSettingFragment;
import models.DoctorInformationModel;
import robotoViews.RobotoLightTextView;
import utils.Utils;
import utils.hCareSharedPref;

/**
 * Created by Neelanjana on 19-07-2015.
 */
public class NavigationDrawerView extends LinearLayout implements AdapterView.OnItemClickListener {

    public RoundedNetworkImageView mDoctorImage;
    private RobotoLightTextView mDoctorName;
    private RobotoLightTextView mDoctorSpeciality;
    private RobotoLightTextView mDoctorLocation;
    private CustomExpandedListView mMenuItems;
    private Context context;

    public NavigationDrawerView(Context context) {
        super(context);
        init(context);
    }

    public NavigationDrawerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public NavigationDrawerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(final Context context) {
        this.context = context;
        LayoutInflater.from(context).inflate(R.layout.layout_navigation_drawer_view, this, true);
        mDoctorImage = (RoundedNetworkImageView) findViewById(R.id.niv_doctor_profile);
        mDoctorLocation = (RobotoLightTextView) findViewById(R.id.txt_doctor_location);
        mDoctorName = (RobotoLightTextView) findViewById(R.id.txt_doctor_name);
        mDoctorSpeciality = (RobotoLightTextView) findViewById(R.id.txt_doctor_speciality);
        mMenuItems = (CustomExpandedListView) findViewById(R.id.list_menu_items);
        mMenuItems.setExpanded(true);

        NavigationDrawerAdapter adapter = new NavigationDrawerAdapter(context);
        mMenuItems.setAdapter(adapter);

        mMenuItems.setOnItemClickListener(this);

        if (hCareSharedPref.getAuthToken() != null) {
            DoctorInformationModel model = Utils.getUserProfile();
            if (model != null) {
                mDoctorImage.setImageUrl(model.getPicture(), hCareApplication.getInstance().getImageLoader());
                mDoctorName.setText(model.getName());

                String specialization = "";
                if (model.getSpecialisationsModel() != null) {
                    for (int i = 0; i < model.getSpecialisationsModel().size(); i++) {
                        specialization = specialization + model.getSpecialisationsModel().get(i).getName();
                        if (i != model.getSpecialisationsModel().size() - 1) {
                            specialization = specialization + ",";
                        }
                    }
                }
                mDoctorSpeciality.setText(specialization);
            }

        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {

            case 0: //home
                break;
            case 1: //my patients
                PatientProfileFragment patientProfileFragment = PatientProfileFragment.newInstance().newInstance();
                ((MainActivity) context).pushFragment(patientProfileFragment, patientProfileFragment.getClass().getSimpleName());
                break;
            case 2:
                /*PracticeManagementActivity fragment = PracticeManagementActivity.newInstance();
                ((MainActivity) context).pushFragment(fragment, fragment.getClass().getSimpleName());*/
                break;
            case 3://rating an reviews

                break;
            case 4: //my packages
                MyPackagesFragment configurepackagesFragment = MyPackagesFragment.newInstance();
                ((MainActivity) context).pushFragment(configurepackagesFragment, configurepackagesFragment.getClass().getSimpleName());
                break;
            case 5:
                DoctorProfileTabFragment profileFragment = DoctorProfileTabFragment.newInstance();
                ((MainActivity) context).pushFragment(profileFragment, profileFragment.getClass().getSimpleName());
                break;
            case 6: // account & billing
                AccountBillingFragment accountBillingFragment = AccountBillingFragment.newInstance();
                ((MainActivity) context).pushFragment(accountBillingFragment, accountBillingFragment.getClass().getSimpleName());
                break;
            case 7: // healthtips

                PrescriptionListFragment p = PrescriptionListFragment.newInstance();
                ((MainActivity) context).pushFragment(p, p.getClass().getSimpleName());
                break;
            case 8: //settings
                VirtualClinicSettingFragment virtualFragment = VirtualClinicSettingFragment.newInstance();
                ((MainActivity) context).pushFragment(virtualFragment, virtualFragment.getClass().getSimpleName());

                break;
            case 9: // share app
                break;
            case 10: //rate app
                break;
            case 11: //logout
                //Utils.logOutUser();
                break;

        }
        //((MainActivity) context).closeDrawer();
    }



    private class NavigationDrawerAdapter extends BaseAdapter {

        private String[] menuItems;
        private TypedArray menuItemsIcons;
        private Context context;
        private LayoutInflater inflater = null;

        public NavigationDrawerAdapter(Context context) {

            this.context = context;
            menuItems = context.getResources().getStringArray(R.array.menu_items);
            menuItemsIcons = context.getResources().obtainTypedArray(R.array.menu_items_icons);
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return menuItems.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View vi = convertView;
            if (convertView == null)
                vi = inflater.inflate(R.layout.row_navigation_drawer, null);

            ImageView img = (ImageView) vi.findViewById(R.id.img_menu);
            RobotoLightTextView text = (RobotoLightTextView) vi.findViewById(R.id.txt_menu);
            Drawable drawable = menuItemsIcons.getDrawable(position);
            img.setImageDrawable(drawable);
            text.setText(menuItems[position]);
            View divider = vi.findViewById(R.id.divider);

            if (position == 6) {
                divider.setVisibility(View.VISIBLE);
            } else {
                divider.setVisibility(View.GONE);
            }

            return vi;
        }
    }
}
