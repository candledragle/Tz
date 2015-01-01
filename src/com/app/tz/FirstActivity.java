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
		//获得imageButton对象
		imageButton=(ImageButton)findViewById(R.id.imageButton);
		//获得Button对象
		button=(Button)findViewById(R.id.button);
		//获得EditText对象
		editText=(EditText) findViewById(R.id.editText);
		
		//为imageButton注册点击事件
		imageButton.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				/*
				 * 注：第一个参数：上下文对象this
				 * 第二个参数：目标文件
				 * */
				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				//启动意图
				startActivity(intent);
			}
		});
		//为Button注册点击事件
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				
				 /* 第一个参数为Intent对象
				 * 第二个参数为一个请求标识（requestCode）
				 */
				startActivityForResult(intent, 1);
			}
		});
	}
	//接受SecondActivity传回的数据
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
			/*
			 * requestCode为请求标识
			 * resultCode为SecondActivity返回的标识
			 * data为SecondActivity返回的数据
			 * */
			if((requestCode==1)&&(resultCode==2)){
				dataText=data.getStringExtra("data");
				editText.setText(dataText);
			}
	
	}
}
