package ph0;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import hb0.d;
import kotlin.jvm.internal.p;

/* compiled from: CustomIntentItemViewModel.kt */
public final class g implements d {

    /* renamed from: a  reason: collision with root package name */
    private final String f19826a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19827b;

    /* renamed from: c  reason: collision with root package name */
    private final Drawable f19828c;

    /* renamed from: d  reason: collision with root package name */
    private final Intent f19829d;

    public g(i iVar) {
        p.j(iVar, "provider");
        this.f19826a = iVar.b();
        this.f19827b = iVar.c();
        this.f19828c = iVar.d();
        this.f19829d = iVar.a();
    }

    public final Drawable a() {
        return this.f19828c;
    }

    public final Intent b() {
        return this.f19829d;
    }

    public final String c() {
        return this.f19827b;
    }

    public final String d() {
        return this.f19826a;
    }

    public void init() {
    }
}
