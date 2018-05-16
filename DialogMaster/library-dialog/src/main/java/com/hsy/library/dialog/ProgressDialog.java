package com.hsy.library.dialog;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;


/**
 * dialog
 *
 * @author: syhuang
 * @date: 2018/4/28
 */

public class ProgressDialog extends android.app.ProgressDialog {
    TextView    mTitle;
    TextView    mValue;
    TextView    mTotal;
    ProgressBar mProgressBar;
    Button      mCancelBtn;

    public void setMyTitle(String title) {
        mTitle.setText(title);
    }

    public void setCancelMessage(String title) {
        mCancelBtn.setText(title);
    }

    public void setCancelBtn(Button cancelBtn) {
        mCancelBtn = cancelBtn;
    }

    public void setValue(String value) {
        mValue.setText(value);
    }


    public void setTotal(String total) {
        mTotal.setText(total);
    }


    public void setProgressValue(int progress) {
        mProgressBar.setProgress(progress);
    }


    public void setProgressMax(int max) {
        mProgressBar.setMax(max);
    }

    public Button getCancelBtn() {
        return mCancelBtn;
    }


    public ProgressDialog(Context context) {
        super(context, R.style.loadingDialogStyle);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_progress);
        mProgressBar = findViewById(R.id.progressBar1);
        mValue = findViewById(R.id.progress_value);
        mTotal = findViewById(R.id.total_value);
        mCancelBtn = findViewById(R.id.btn_cancel);
        mTitle = findViewById(R.id.title);


    }


}
