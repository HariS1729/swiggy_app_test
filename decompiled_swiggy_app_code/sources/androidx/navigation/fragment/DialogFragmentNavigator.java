package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.c;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.navigation.b;
import androidx.navigation.m;
import androidx.navigation.t;
import androidx.navigation.w;

@w.b("dialog")
public final class DialogFragmentNavigator extends w<a> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10884a;

    /* renamed from: b  reason: collision with root package name */
    private final FragmentManager f10885b;

    /* renamed from: c  reason: collision with root package name */
    private int f10886c = 0;

    /* renamed from: d  reason: collision with root package name */
    private o f10887d = new o() {
        public void b(r rVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                c cVar = (c) rVar;
                if (!cVar.requireDialog().isShowing()) {
                    NavHostFragment.d0(cVar).u();
                }
            }
        }
    };

    public static class a extends m implements b {
        private String j;

        public a(w<? extends a> wVar) {
            super((w<? extends m>) wVar);
        }

        public final String B() {
            String str = this.j;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }

        public final a D(String str) {
            this.j = str;
            return this;
        }

        public void q(Context context, AttributeSet attributeSet) {
            super.q(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.DialogFragmentNavigator);
            String string = obtainAttributes.getString(R.styleable.DialogFragmentNavigator_android_name);
            if (string != null) {
                D(string);
            }
            obtainAttributes.recycle();
        }
    }

    public DialogFragmentNavigator(Context context, FragmentManager fragmentManager) {
        this.f10884a = context;
        this.f10885b = fragmentManager;
    }

    public void c(Bundle bundle) {
        if (bundle != null) {
            int i11 = 0;
            this.f10886c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
            while (i11 < this.f10886c) {
                FragmentManager fragmentManager = this.f10885b;
                c cVar = (c) fragmentManager.k0("androidx-nav-fragment:navigator:dialog:" + i11);
                if (cVar != null) {
                    cVar.getLifecycle().a(this.f10887d);
                    i11++;
                } else {
                    throw new IllegalStateException("DialogFragment " + i11 + " doesn't exist in the FragmentManager");
                }
            }
        }
    }

    public Bundle d() {
        if (this.f10886c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f10886c);
        return bundle;
    }

    public boolean e() {
        if (this.f10886c == 0) {
            return false;
        }
        if (this.f10885b.O0()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        FragmentManager fragmentManager = this.f10885b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("androidx-nav-fragment:navigator:dialog:");
        int i11 = this.f10886c - 1;
        this.f10886c = i11;
        sb2.append(i11);
        Fragment k02 = fragmentManager.k0(sb2.toString());
        if (k02 != null) {
            k02.getLifecycle().c(this.f10887d);
            ((c) k02).dismiss();
        }
        return true;
    }

    /* renamed from: f */
    public a a() {
        return new a(this);
    }

    /* renamed from: g */
    public m b(a aVar, Bundle bundle, t tVar, w.a aVar2) {
        if (this.f10885b.O0()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String B = aVar.B();
        if (B.charAt(0) == '.') {
            B = this.f10884a.getPackageName() + B;
        }
        Fragment a11 = this.f10885b.u0().a(this.f10884a.getClassLoader(), B);
        if (c.class.isAssignableFrom(a11.getClass())) {
            c cVar = (c) a11;
            cVar.setArguments(bundle);
            cVar.getLifecycle().a(this.f10887d);
            FragmentManager fragmentManager = this.f10885b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("androidx-nav-fragment:navigator:dialog:");
            int i11 = this.f10886c;
            this.f10886c = i11 + 1;
            sb2.append(i11);
            cVar.show(fragmentManager, sb2.toString());
            return aVar;
        }
        throw new IllegalArgumentException("Dialog destination " + aVar.B() + " is not an instance of DialogFragment");
    }
}
