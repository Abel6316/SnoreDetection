package com.cxyliuyu.www.snoredetection.business;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import java.util.Calendar;

/**
 * Created by ly on 2015/11/9.
 */
public class StartRecordBusiness {
    //开始录制业务类
    public void startRecord(Context context){
        //设置一个闹钟，在未来的几个小时，定时唤醒程序进行录音
        AlarmManager alarmManager = (AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent();
        intent.setAction("com.cxyliuyu.www.snoredetection.alarm");
        //闹钟响了时，以广播的形式将intent发送出去
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context,78451236,intent,0);
        Calendar calendar = Calendar.getInstance();
        //设置的闹钟周期为半个小时
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),30*60*1000,pendingIntent);
    }
}
