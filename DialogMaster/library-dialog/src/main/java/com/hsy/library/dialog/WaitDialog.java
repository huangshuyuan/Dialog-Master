package com.hsy.library.dialog;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;




/**
 * dialog
 *
 * @author: syhuang
 * @date: 2018/4/28
 */

public class WaitDialog extends ProgressDialog {
    TextView tipTextView;

    public WaitDialog(Context context) {
        super(context, R.style.loadingDialogStyle);
    }

    public TextView getTipTextView() {
        return tipTextView;
    }

    public void setTipText(String tips) {
        if (!tips.equals("")) {
            tipTextView.setVisibility(View.VISIBLE);
            tipTextView.setText(tips);// 设置加载信息}
        } else {
            tipTextView.setVisibility(View.GONE);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_loading);
        tipTextView = (TextView) findViewById(R.id.dialog_loading_tv);// 提示文字
        //        tipTextView.setText(R.string.wait_dialog_title);// 设置加载信息

    }


}
