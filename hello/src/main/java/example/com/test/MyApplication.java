package example.com.test;

import android.app.Application;

import com.antfortune.freeline.FreelineCore;

/**
 * Created by wuguoqiang on 2016/12/7.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        FreelineCore.init(this);
        super.onCreate();//
    }
}
