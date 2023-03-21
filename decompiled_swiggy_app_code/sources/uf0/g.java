package uf0;

import android.annotation.SuppressLint;
import android.content.Context;
import coil.request.CachePolicy;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;
import m6.f;
import os.u;
import ps.b;
import tf0.a;
import vf0.c;
import x6.g;

/* compiled from: MagicCartEndCardImageHandler.kt */
public final class g extends a<c.b, String> {

    /* renamed from: a  reason: collision with root package name */
    private final b f19908a;

    public g(b bVar) {
        p.j(bVar, "contextService");
        this.f19908a = bVar;
    }

    /* access modifiers changed from: protected */
    public boolean c(c cVar) {
        p.j(cVar, "asset");
        return cVar instanceof c.b;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"CheckResult"})
    /* renamed from: e */
    public void b(Context context, String str) {
        p.j(context, LogCategory.CONTEXT);
        p.j(str, "asset");
        try {
            f.a(context).a(new g.a(context).d(str).g(CachePolicy.DISABLED).a());
        } catch (Exception e11) {
            u.h("AssetPreCacheWorker", e11);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String d(c.b bVar) {
        p.j(bVar, "asset");
        return qs.a.l(bVar.a(), (int) (((float) this.f19908a.q().b()) - (((float) 96) * this.f19908a.getDensity())), 0, false, true);
    }
}
