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
		//���button����
		button=(Button) findViewById(R.id.sButton);
		//Ϊbutton����ע�����¼�
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				/*
				 * �ڶ���ҳ�����һ��ҳ��ش�����
				 * �ش�������ʵ������һ��Intent����
				 * */
				Intent data = new Intent();
				//Intent�Ķ��������Map����һ���ã�key--value�����洢����
				data.putExtra("data", context);
				//���ý����
				setResult(2, data);
				/*//������ǰҳ��
				finish();*/
			}
		});
	}
	
}
