package com.example.administrator.dialogtest;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Administrator on 2018/1/31.
 */

public class MyDialog {
    Dialog dialog;
    private TextView trues;
    private Context context;
    Dialogcallback dialogcallback;
    EditText editText;
    public MyDialog(Context context){
        this.context=context;
        dialog=new Dialog(context,R.style.dialog);
        dialog.setContentView(R.layout.dialog);
        trues=(TextView) dialog.findViewById(R.id.tv_dialog_yes);
        editText=(EditText)dialog.findViewById(R.id.et_dialog_input);
        trues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogcallback.dialogdo(editText.getText().toString());
                dismiss();
            }
        });
    }

    public interface Dialogcallback {
        public void dialogdo(String string);
    }
    public void setDialogCallback(Dialogcallback dialogcallback) {
        this.dialogcallback=dialogcallback;
    }
    public String getText() {

        return editText.getText().toString();
    }
    public void show() {
        dialog.show();
    }
    public void hide() {
        dialog.hide();
    }
    public void dismiss() {
        dialog.dismiss();
    }

}
