package com.example.croissant_rouge.Actions.Module;

public class Module {

    private int mModuleId;
    private String mModuleName;
    private int mIconRessource;
    private int mBackgroundColor;

    public Module(int mModuleId, String mModuleName, int mIconRessource, int mBackgroundColor) {
        this.mModuleId = mModuleId;
        this.mModuleName = mModuleName;
        this.mIconRessource = mIconRessource;
        this.mBackgroundColor = mBackgroundColor;
    }

    public int getmModuleId() {
        return mModuleId;
    }

    public String getmModuleName() {
        return mModuleName;
    }

    public int getmIconRessource() {
        return mIconRessource;
    }

    public int getmBackgroundColor() {
        return mBackgroundColor;
    }
}
