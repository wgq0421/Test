package example.com.test;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);

        StringBuilder ret = new StringBuilder();

        String version = System.getProperty("java.vm.version");
        ret.append("Current VM version:").append(version).append("\n");
        if (Integer.valueOf(version.substring(0, version.indexOf("."))) >= 2) {
            ret.append("You are currently using ART!");
        } else {
            ret.append("You are currently using Dalvik!");
        }

        Toast.makeText(this,ret.toString(),Toast.LENGTH_SHORT).show();

//        String path = Environment.getExternalStorageDirectory().getAbsolutePath();
//        File file = new File(path + File.separator + "hello", "hello.txt");
//
//        if (!file.getParentFile().exists()) {
//            file.getParentFile().mkdirs();
//        }
//        if (!file.exists()) {
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        BufferedWriter writer = null;
//
//        try {
//            writer = new BufferedWriter(new FileWriter((path + File.separator + "hello" + File.separator + "hello.txt")));
//            String message = "你好，我是小强";
//            writer.write(message);
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (writer != null) {
//                    writer.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


    }
}
