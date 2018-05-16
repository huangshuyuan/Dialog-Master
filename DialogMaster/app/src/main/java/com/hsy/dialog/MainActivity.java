package com.hsy.dialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hsy.library.dialog.ActionSheetDialog;
import com.hsy.library.dialog.AlertDialog;
import com.hsy.library.dialog.ProgressDialog;
import com.hsy.library.dialog.WaitDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * 加载框
     *
     * @param view
     */
    public void load(View view) {
        WaitDialog mWaitDialog = new WaitDialog(this);
        mWaitDialog.show();
        mWaitDialog.setTipText("Loading");
    }

    public void alert(View view) {
        new AlertDialog(this).builder()
                .setMsg("网络未连接")
                .setPositiveButton("确定", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    }
                }).show();
    }

    public void alert2(View view) {
        new AlertDialog(this).builder()
                .setTitle("退出")
                .setMsg("是否退出登录？")
                .setPositiveButton("是", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    }
                }).setNegativeButton("否", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }).show();
    }

    public void sheet(View view) {
        new ActionSheetDialog(this)
                .builder()
                .setCancelable(false)
                .setCanceledOnTouchOutside(true)
                .addSheetItem("相机", ActionSheetDialog.SheetItemColor.Red,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                            }
                        })

                .addSheetItem("相册", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {

                            }
                        }).show();

    }

    public void sheet2(View view) {
        new ActionSheetDialog(this)
                .builder()
                .setCancelable(false)
                .setCanceledOnTouchOutside(true)
                .addSheetItem("媒体", ActionSheetDialog.SheetItemColor.Red,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                            }
                        })

                .addSheetItem("广播", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {

                            }
                        })
                .addSheetItem("手机", ActionSheetDialog.SheetItemColor.Blue, null)
                .addSheetItem("电脑", ActionSheetDialog.SheetItemColor.Blue, null)
                .addSheetItem("MP4", ActionSheetDialog.SheetItemColor.Blue, null)
                .addSheetItem("家电", ActionSheetDialog.SheetItemColor.Blue, null)
                .show();
    }

    public void progress(View view) {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.show();
        //必须show之后才可修改值
        progressDialog.setMyTitle("正在下载");
        progressDialog.setProgressValue(35);

    }


}
