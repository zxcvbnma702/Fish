package com.example.fish.ui.person;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.base.ui.activity.BaseActivity;
import com.example.base.ui.util.GlideEngine;
import com.example.fish.R;
import com.example.fish.databinding.ModifyPersonalInformationBinding;
import com.example.fish.logic.Repository;
import com.luck.picture.lib.basic.PictureSelector;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnResultCallbackListener;

import java.util.ArrayList;

public class SettingActivity extends BaseActivity<ModifyPersonalInformationBinding> {

    @Override
    public void initBindingView(@NonNull ModifyPersonalInformationBinding $this$initBindingView) {
        ImageView headPortraitSettings = $this$initBindingView.headPortraitSettings;
        headPortraitSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PictureSelector.create(SettingActivity.this)
                        .openGallery(SelectMimeType.ofImage())
                        .setImageEngine(GlideEngine.createGlideEngine())
                        .forResult(new OnResultCallbackListener<LocalMedia>() {
                            @Override
                            public void onResult(ArrayList<LocalMedia> result) {
                                if(result != null){
                                    GlideEngine.createGlideEngine().loadImage(SettingActivity.this,
                                            result.get(0).getAvailablePath(),headPortraitSettings);
                                }
//                                Repository.INSTANCE.uploadAvatar()
                            }

                            @Override
                            public void onCancel() {

                            }
                        });
            }
        });
    }



    static void startActivity(Context context){
        Intent intent = new Intent(context, SettingActivity.class);
        context.startActivity(intent);
    }
}