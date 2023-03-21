package uf0;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bumptech.glide.load.engine.BucketKey;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;
import l8.e;
import l8.i;
import os.u;
import tf0.a;
import vf0.c;

/* compiled from: CloudinaryImageHandler.kt */
public final class b extends a<c.a, String> {
    /* access modifiers changed from: protected */
    public boolean c(c cVar) {
        p.j(cVar, "asset");
        return cVar instanceof c.a;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"CheckResult"})
    /* renamed from: e */
    public void b(Context context, String str) {
        p.j(context, LogCategory.CONTEXT);
        p.j(str, "asset");
        try {
            ((i) e.t(context.getApplicationContext()).v(str).k0(new BucketKey(BucketKey.BucketKeyValue.PASSIVE))).Q0().get();
        } catch (Exception e11) {
            u.h("AssetPreCacheWorker", e11);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String d(c.a aVar) {
        p.j(aVar, "asset");
        return qs.a.l(aVar.a(), 0, 0, false, true);
    }
}
