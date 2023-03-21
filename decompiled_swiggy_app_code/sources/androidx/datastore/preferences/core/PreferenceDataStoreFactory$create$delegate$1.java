package androidx.datastore.preferences.core;

import b3.d;
import java.io.File;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;

/* compiled from: PreferenceDataStoreFactory.kt */
final class PreferenceDataStoreFactory$create$delegate$1 extends Lambda implements a<File> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a<File> f9894a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PreferenceDataStoreFactory$create$delegate$1(a<? extends File> aVar) {
        super(0);
        this.f9894a = aVar;
    }

    /* renamed from: a */
    public final File invoke() {
        File invoke = this.f9894a.invoke();
        String f11 = i.f(invoke);
        d dVar = d.f12577a;
        if (p.e(f11, dVar.e())) {
            return invoke;
        }
        throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + dVar.e()).toString());
    }
}
