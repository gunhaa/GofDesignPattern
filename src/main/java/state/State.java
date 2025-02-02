package state;

// 금고의 상태를 나타낸다
public interface State {

     void doClock(Context context, int hour);
     void doUse(Context context);
     void doAlarm(Context context);
     void doPhone(Context context);
}
