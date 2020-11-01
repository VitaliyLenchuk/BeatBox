package com.vitaliylenchuk.beatbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class BeatBoxActivity extends com.vitaliylenchuk.beatbox.SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
