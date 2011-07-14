package com.android.systemui.statusbar.powerwidget;

import com.android.systemui.R;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.os.PowerManager;
import android.os.SystemClock;

public class ScreenshotButton extends PowerButton {
    public ScreenshotButton() { mType = BUTTON_SCREENSHOT; }

    @Override
    protected void updateState() {
        mIcon = R.drawable.stat_screenshot;
        mState = STATE_DISABLED;
    }

    @Override
    protected void toggleState() {
        Intent intent = new Intent("android.intent.action.SCREENSHOT");
        mView.getContext().sendBroadcast(intent);
    }

    @Override
    protected boolean handleLongClick() {
        Intent intent = new Intent("android.intent.action.SCREENSHOT");
        mView.getContext().sendBroadcast(intent);
	return true;
    }
}
