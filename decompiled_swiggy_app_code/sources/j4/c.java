package j4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import d4.i;

/* compiled from: BroadcastReceiverConstraintTracker */
public abstract class c<T> extends d<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final String f15271h = i.f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g  reason: collision with root package name */
    private final BroadcastReceiver f15272g = new a();

    /* compiled from: BroadcastReceiverConstraintTracker */
    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, n4.a aVar) {
        super(context, aVar);
    }

    public void e() {
        i.c().a(f15271h, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f15276b.registerReceiver(this.f15272g, g());
    }

    public void f() {
        i.c().a(f15271h, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f15276b.unregisterReceiver(this.f15272g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
