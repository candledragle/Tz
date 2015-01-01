package com.app.tz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity {
	private Button button;
	private String context;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		//获得button对象
		button=(Button) findViewById(R.id.sButton);
		//为button对象注册点击事件
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				/*
				 * 第二个页面给第一个页面回传数据
				 * 回传的数据实际上是一个Intent对象
				 * */
				Intent data = new Intent();
				//Intent的对象可以像Map集合一样用（key--value）来存储数据
				data.putExtra("data", context);
				//设置结果码
				setResult(2, data);
				/*//结束当前页面
				finish();*/
			}
		});
	}
	
}
