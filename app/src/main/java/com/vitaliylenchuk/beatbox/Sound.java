package com.vitaliylenchuk.beatbox;

public class Sound {
    public String getName() {
        return mName;
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    private String mAssetPath;
    private String mName;

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }

    private Integer mSoundId;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length-1];
        mName = filename.replace(".wav", "");
    }
}
