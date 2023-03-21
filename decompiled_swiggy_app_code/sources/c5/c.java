package c5;

import android.content.Context;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import b3.a;
import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.TrackOrderType;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.s;
import lp0.l;
import op0.d;
import sp0.j;
import wp0.j0;
import z2.b;

/* compiled from: PrefsRepo.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ j<Object>[] f12826a = {s.h(new PropertyReference1Impl(c.class, "defaultDs", "getDefaultDs(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};

    /* renamed from: b  reason: collision with root package name */
    private static final d f12827b = PreferenceDataStoreDelegateKt.b(TrackOrderType.DEFAULT, (b) null, (l) null, (j0) null, 14, (Object) null);

    /* access modifiers changed from: private */
    public static final y2.c<a> b(Context context) {
        return (y2.c) f12827b.a(context, f12826a[0]);
    }
}
