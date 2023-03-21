package androidx.datastore.preferences;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;

/* compiled from: PreferenceDataStoreDelegate.kt */
final class PreferenceDataStoreSingletonDelegate$getValue$1$1 extends Lambda implements a<File> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f9882a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PreferenceDataStoreSingletonDelegate f9883b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PreferenceDataStoreSingletonDelegate$getValue$1$1(Context context, PreferenceDataStoreSingletonDelegate preferenceDataStoreSingletonDelegate) {
        super(0);
        this.f9882a = context;
        this.f9883b = preferenceDataStoreSingletonDelegate;
    }

    /* renamed from: a */
    public final File invoke() {
        Context context = this.f9882a;
        p.i(context, "applicationContext");
        return a3.a.a(context, this.f9883b.f9877a);
    }
}
