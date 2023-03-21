package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.profileinstaller.g;

public class ProfileInstallReceiver extends BroadcastReceiver {

    class a implements g.c {
        a() {
        }

        public void a(int i11, Object obj) {
            g.f11074b.a(i11, obj);
            ProfileInstallReceiver.this.setResultCode(i11);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                g.k(context, e.f11069a, new a(), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                String string = intent.getExtras().getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    g.l(context, e.f11069a, new a());
                } else if ("DELETE_SKIP_FILE".equals(string)) {
                    g.c(context, e.f11069a, new a());
                }
            }
        }
    }
}
