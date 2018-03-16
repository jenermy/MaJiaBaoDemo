package com.example.majiabao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/**
 * 马甲包的包名实际上并没有发生变化，所以我们可以推测，applicationId实际上是修改了class文件中的包名，
 * 所以我们getPackageName（）就发生了变化，系统也是通过getPackcgeName()来获取包名的，这样达到了区别app的目的
 * 只能release版本才能区别安装，而且需要签名后才能安装，所以build.gradle的这句很重要 majiabaoOne.initWith(buildTypes.release)
 * 使用了第三方库的朋友请注意，因为修改了包名，所有第三方（登录，分享，支付等等）都没办法正常使用，记得重新申请。
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
