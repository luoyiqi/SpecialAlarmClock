package com.eshore.yourapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.gdtel.eshore.androidframework.common.base.BaseActivity;
import com.gdtel.eshore.androidframework.common.util.AppConstant;
import com.gdtel.eshore.androidframework.common.util.log.DebugLog;
import com.gdtel.eshore.anroidframework.R;

public class ReportNavigationActivity extends BaseActivity {
	private String name ;
	private TextView contend ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		Intent intent = getIntent();
		name = intent.getStringExtra(AppConstant.APP_ITEM_TITLE);
		DebugLog.d(TAG, name);
		setContentView(R.layout.activity_reportnavigation);
		super.onCreate(savedInstanceState);
		initView();
	}

	@Override
	protected void onDestroy() {

		super.onDestroy();
	}

	@Override
	public void initView() {
		contend = (TextView) findViewById(R.id.contend);
		if (!TextUtils.isEmpty(name)&&title!=null) {
			contend.setText(name);
			title.setText(name);
		}
		super.initView();
	}

	@Override
	protected void onResume() {

		super.onResume();
	}

	@Override
	public void onClick(View v) {

		super.onClick(v);
	}

}
