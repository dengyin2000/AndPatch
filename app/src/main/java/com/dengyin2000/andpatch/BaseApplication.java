package com.dengyin2000.andpatch;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.util.Log;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * Created by denny on 2015/11/10.
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
        File hackDexDir = new File(getCacheDir(), "andpatch");
        Log.i(AndPatch.TAG, "hack dex dir: " + hackDexDir.getAbsolutePath());
        if (hackDexDir.exists() && hackDexDir.isDirectory()) {
            File[] dexes = hackDexDir.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String filename) {
                    return filename != null && filename.endsWith(".dex");
                }
            });
            AndPatch.hack(this, Arrays.asList(dexes), hackDexDir);
        }
    }

}
