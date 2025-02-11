package com.example.trivia;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;

public class CustomDialog extends Dialog implements View.OnClickListener {
    private Button btnYes,btnNo;
    private Context context;
    public CustomDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.custom_dialog);
        this.context=context;

        btnYes=findViewById(R.id.btnyes);
        btnNo=findViewById(R.id.btnno);
        btnNo.setOnClickListener(this);
        btnYes.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==btnYes){
            ((MainActivity)context).finish();
        }
        if (v==btnNo){
            dismiss();
        }
    }
}
