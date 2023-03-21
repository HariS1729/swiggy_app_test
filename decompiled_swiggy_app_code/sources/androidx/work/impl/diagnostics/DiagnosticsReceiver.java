package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.c;
import androidx.work.impl.workers.DiagnosticsWorker;
import d4.i;
import d4.n;

public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12414a = i.f("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            i.c().a(f12414a, "Requesting diagnostics", new Throwable[0]);
            try {
                n.k(context).f(c.d(DiagnosticsWorker.class));
            } catch (IllegalStateException e11) {
                i.c().b(f12414a, "WorkManager is not initialized", e11);
            }
        }
    }
}
