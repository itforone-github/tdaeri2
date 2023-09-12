package kr.co.itforone.tdaeri2;

import android.app.Activity;

import java.util.ArrayList;

public class ActivityManager {

    private static kr.co.itforone.tdaeri2.ActivityManager activityMananger = null;
    private ArrayList<Activity> activityList = null;

    private ActivityManager() {
        activityList = new ArrayList<Activity>();
    }

    public static kr.co.itforone.tdaeri2.ActivityManager getInstance() {

        if( kr.co.itforone.tdaeri2.ActivityManager.activityMananger == null ) {
            activityMananger = new kr.co.itforone.tdaeri2.ActivityManager();
        }
        return activityMananger;
    }

    public ArrayList<Activity> getActivityList() {
        return activityList;
    }
    public Activity getActivityLast() {
            return activityList.get(activityList.size()-1);
    }

    public void addActivity(Activity activity) {
        activityList.add(activity);
    }

    public boolean removeActivity(Activity activity) {
        return activityList.remove(activity);
    }

/*    public void clearManager(){

        activityList.clear();

    }*/

    public void finishAllActivity() {
        for (Activity activity : activityList) {

            activity.finish();

        }
    }

}