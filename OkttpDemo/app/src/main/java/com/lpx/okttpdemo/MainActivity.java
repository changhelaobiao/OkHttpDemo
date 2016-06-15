package com.lpx.okttpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.lpx.okttpdemo.model.NewsBean;
import com.lpx.okttpdemo.utils.OkHttpUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textResult = (TextView) this.findViewById(R.id.textResult);
//        loadDataOfGet();
        loadDataOfPost();
    }

    private void loadDataOfGet() {
        OkHttpUtils.get("https://www.baidu.com/", new OkHttpUtils.ResultCallback<String>() {
            @Override
            public void onSuccess(String response) {
                Log.d("---onSuccess--->", "----response--->" + response.toString());
            }

            @Override
            public void onFailure(Exception e) {

            }
        });
    }

    private void loadDataOfPost() {
        List<OkHttpUtils.Param> list = new ArrayList<>();
        list.add(new OkHttpUtils.Param("column", "1"));
        list.add(new OkHttpUtils.Param("PageSize", "1"));// 数据量过大，只加载一条数据
        list.add(new OkHttpUtils.Param("pageIndex", "1"));
        OkHttpUtils.post("http://litchiapi.jstv.com/api/GetFeeds", new OkHttpUtils.ResultCallback<NewsBean>() {
            @Override
            public void onSuccess(NewsBean response) {
                if (response != null) {
                    String status = response.getStatus();
                    if (TextUtils.isEmpty(status)) {
                        // 服务器code异常
                        Toast.makeText(MainActivity.this, "服务器正在升级中...", Toast.LENGTH_SHORT).show();
                    } else if (status.equals("ok")) {
                        // UI线程
                        Toast.makeText(MainActivity.this, "加载成功", Toast.LENGTH_SHORT).show();
                        textResult.setText("加载结果:" + response.toString());
                    } else {
                        // 失败
                        Toast.makeText(MainActivity.this, status, Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Exception e) {
                Toast.makeText(MainActivity.this, "网络连接失败，请检查网络连接", Toast.LENGTH_SHORT).show();
                e.printStackTrace();
            }
        }, list);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
