package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.t;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: NavDeepLinkBuilder */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10935a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f10936b;

    /* renamed from: c  reason: collision with root package name */
    private o f10937c;

    /* renamed from: d  reason: collision with root package name */
    private int f10938d;

    /* renamed from: e  reason: collision with root package name */
    private Bundle f10939e;

    public k(Context context) {
        this.f10935a = context;
        if (context instanceof Activity) {
            this.f10936b = new Intent(context, context.getClass());
        } else {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            this.f10936b = launchIntentForPackage == null ? new Intent() : launchIntentForPackage;
        }
        this.f10936b.addFlags(268468224);
    }

    private void b() {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(this.f10937c);
        m mVar = null;
        while (!arrayDeque.isEmpty() && mVar == null) {
            m mVar2 = (m) arrayDeque.poll();
            if (mVar2.l() == this.f10938d) {
                mVar = mVar2;
            } else if (mVar2 instanceof o) {
                Iterator<m> it2 = ((o) mVar2).iterator();
                while (it2.hasNext()) {
                    arrayDeque.add(it2.next());
                }
            }
        }
        if (mVar != null) {
            this.f10936b.putExtra("android-support-nav:controller:deepLinkIds", mVar.f());
            return;
        }
        String k = m.k(this.f10935a, this.f10938d);
        throw new IllegalArgumentException("Navigation destination " + k + " cannot be found in the navigation graph " + this.f10937c);
    }

    public t a() {
        if (this.f10936b.getIntArrayExtra("android-support-nav:controller:deepLinkIds") != null) {
            t b11 = t.e(this.f10935a).b(new Intent(this.f10936b));
            for (int i11 = 0; i11 < b11.g(); i11++) {
                b11.f(i11).putExtra("android-support-nav:controller:deepLinkIntent", this.f10936b);
            }
            return b11;
        } else if (this.f10937c == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        } else {
            throw new IllegalStateException("You must call setDestination() before constructing the deep link");
        }
    }

    public k c(Bundle bundle) {
        this.f10939e = bundle;
        this.f10936b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    public k d(int i11) {
        this.f10938d = i11;
        if (this.f10937c != null) {
            b();
        }
        return this;
    }

    k(NavController navController) {
        this(navController.f());
        this.f10937c = navController.j();
    }
}
