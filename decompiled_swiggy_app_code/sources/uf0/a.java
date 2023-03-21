package uf0;

import android.content.Context;
import in.juspay.hyper.constants.LogCategory;
import java.util.Set;
import kotlin.jvm.internal.p;
import tf0.b;
import tf0.c;

/* compiled from: AssetPreCacheRequestHandler.kt */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Set<c> f19902a;

    public a(Set<c> set) {
        p.j(set, "handlers");
        this.f19902a = set;
    }

    public void a(Context context, vf0.b bVar) {
        p.j(context, LogCategory.CONTEXT);
        p.j(bVar, "request");
        for (c a11 : this.f19902a) {
            a11.a(context, bVar);
        }
    }
}
