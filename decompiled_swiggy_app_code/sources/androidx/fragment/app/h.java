package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.b;
import androidx.core.content.a;
import androidx.core.util.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback */
public abstract class h<E> extends e {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f10480a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f10481b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f10482c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10483d;

    /* renamed from: e  reason: collision with root package name */
    final FragmentManager f10484e;

    h(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    public View c(int i11) {
        return null;
    }

    public boolean d() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public Activity e() {
        return this.f10480a;
    }

    /* access modifiers changed from: package-private */
    public Context f() {
        return this.f10481b;
    }

    /* access modifiers changed from: package-private */
    public Handler g() {
        return this.f10482c;
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E i();

    public LayoutInflater j() {
        return LayoutInflater.from(this.f10481b);
    }

    @Deprecated
    public void k(Fragment fragment, String[] strArr, int i11) {
    }

    public boolean l(Fragment fragment) {
        return true;
    }

    public boolean m(String str) {
        return false;
    }

    public void n(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i11, Bundle bundle) {
        if (i11 == -1) {
            a.m(this.f10481b, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    public void o(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) throws IntentSender.SendIntentException {
        if (i11 == -1) {
            b.A(this.f10480a, intentSender, i11, intent, i12, i13, i14, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }

    public void p() {
    }

    h(Activity activity, Context context, Handler handler, int i11) {
        this.f10484e = new l();
        this.f10480a = activity;
        this.f10481b = (Context) g.h(context, "context == null");
        this.f10482c = (Handler) g.h(handler, "handler == null");
        this.f10483d = i11;
    }
}
