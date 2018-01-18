package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by PSX on 1/17/2018.
 */

public class SquawkFirebaseMessagingService extends FirebaseMessagingService {
    static final String TAG = "PSX";
    
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "SquawkFirebaseMessagingService.onMessageReceived-> " + remoteMessage.toString());
    }
}
