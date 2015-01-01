package com.app.tz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class FirstActivity extends Activity {
	ImageButton imageButton;
	Button button;
	EditText editText;
	String dataText="heh";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);
		//���imageButton����
		imageButton=(ImageButton)findViewById(R.id.imageButton);
		//���Button����
		button=(Button)findViewById(R.id.button);
		//���EditText����
		editText=(EditText) findViewById(R.id.editText);
		
		//ΪimageButtonע�����¼�
		imageButton.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				/*
				 * ע����һ�������������Ķ���this
				 * �ڶ���������Ŀ���ļ�
				 * */
				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				//������ͼ
				startActivity(intent);
			}
		});
		//ΪButtonע�����¼�
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				
				 /* ��һ������ΪIntent����
				 * �ڶ�������Ϊһ�������ʶ��requestCode��
				 */
				startActivityForResult(intent, 1);
			}
		});
	}
	//����SecondActivity���ص�����
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
			/*
			 * requestCodeΪ�����ʶ
			 * resultCodeΪSecondActivity���صı�ʶ
			 * dataΪSecondActivity���ص�����
			 * */
			if((requestCode==1)&&(resultCode==2)){
				dataText=data.getStringExtra("data");
				editText.setText(dataText);
			}
	
	}
}
