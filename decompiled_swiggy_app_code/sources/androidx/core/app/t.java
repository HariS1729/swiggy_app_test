package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder */
public final class t implements Iterable<Intent> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Intent> f9165a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final Context f9166b;

    /* compiled from: TaskStackBuilder */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private t(Context context) {
        this.f9166b = context;
    }

    public static t e(Context context) {
        return new t(context);
    }

    public t a(Intent intent) {
        this.f9165a.add(intent);
        return this;
    }

    public t b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f9166b.getPackageManager());
        }
        if (component != null) {
            d(component);
        }
        a(intent);
        return this;
    }

    public t c(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = h.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f9166b.getPackageManager());
            }
            d(component);
            a(supportParentActivityIntent);
        }
        return this;
    }

    public t d(ComponentName componentName) {
        int size = this.f9165a.size();
        try {
            Intent b11 = h.b(this.f9166b, componentName);
            while (b11 != null) {
                this.f9165a.add(size, b11);
                b11 = h.b(this.f9166b, b11.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e11);
        }
    }

    public Intent f(int i11) {
        return this.f9165a.get(i11);
    }

    public int g() {
        return this.f9165a.size();
    }

    public void h() {
        i((Bundle) null);
    }

    public void i(Bundle bundle) {
        if (!this.f9165a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f9165a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!androidx.core.content.a.l(this.f9166b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f9166b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f9165a.iterator();
    }
}
