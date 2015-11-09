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
    //��ʼ¼��ҵ����
    public void startRecord(Context context){
        //����һ�����ӣ���δ���ļ���Сʱ����ʱ���ѳ������¼��
        AlarmManager alarmManager = (AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent();
        intent.setAction("com.cxyliuyu.www.snoredetection.alarm");
        //��������ʱ���Թ㲥����ʽ��intent���ͳ�ȥ
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context,78451236,intent,0);
        Calendar calendar = Calendar.getInstance();
        //���õ���������Ϊ���Сʱ
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),30*60*1000,pendingIntent);
    }
}
