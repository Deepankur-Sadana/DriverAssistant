package fragments;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import com.example.deepankur.newproject.R;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import customViews.RoundedNetworkImageView;

/**
 * Created by deepankur on 07-11-2015.
 */
public class CustumCardFragment extends BaseFragment implements View.OnClickListener {
    private ProgressBar progress;
    ImageButton mEditProfileImageBtn;
    Bitmap selectedImage;
    RoundedNetworkImageView image;

    public CustumCardFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.custom_card, container, false);
        mEditProfileImageBtn = (ImageButton) view.findViewById(R.id.btn_edit_profile_image);
        mEditProfileImageBtn.setOnClickListener(this);


        return view;
    }

    private void showImageUploadDialog() {
        final CharSequence[] items = {"Take Picture", "Choose from Gallary",
                "Cancel"};

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Update Picture!");
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                if (items[item].equals("Take Picture")) {
                    // Open Camera
                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(intent, 1000);
                } else if (items[item].equals("Choose from Gallary")) {
                    Intent intent = new Intent();
                    intent.setType("image/*");
                    intent.setAction(Intent.ACTION_GET_CONTENT);
                    startActivityForResult(Intent.createChooser(intent, "Select Picture"), 2000);
                } else if (items[item].equals("Cancel")) {
                    dialog.dismiss();
                }
            }
        });
        builder.show();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == 1000) {
                Bitmap bmp = (Bitmap) data.getExtras().get("data");
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bmp.compress(Bitmap.CompressFormat.PNG, 40, stream);
                byte[] byteArray = stream.toByteArray();
                // Convert ByteArray to Bitmap::
                Bitmap bitmap = BitmapFactory.decodeByteArray(byteArray, 0,
                        byteArray.length);
                selectedImage = bitmap;
            } else if (requestCode == 2000) {
                Uri uri = data.getData();
                try {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(getActivity().getContentResolver(), uri);
                    selectedImage = bitmap;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void onClick(View v) {
        showImageUploadDialog();
    }
}
