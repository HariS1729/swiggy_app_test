package ph0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;

/* compiled from: BaseCustomIntentProvider.kt */
public abstract class a implements i {

    /* renamed from: a  reason: collision with root package name */
    private Intent f19815a;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f19816b;

    /* renamed from: c  reason: collision with root package name */
    private final PackageManager f19817c;

    public a(Context context) {
        p.j(context, LogCategory.CONTEXT);
        this.f19817c = context.getPackageManager();
    }

    public Drawable d() {
        return this.f19816b;
    }

    /* access modifiers changed from: protected */
    public final Intent e() {
        return this.f19815a;
    }

    /* access modifiers changed from: protected */
    public final PackageManager f() {
        return this.f19817c;
    }

    public final void g(ResolveInfo resolveInfo) {
        p.j(resolveInfo, "resolveInfo");
        this.f19816b = resolveInfo.loadIcon(this.f19817c);
    }

    /* access modifiers changed from: protected */
    public final void h(Intent intent) {
        this.f19815a = intent;
    }
}
