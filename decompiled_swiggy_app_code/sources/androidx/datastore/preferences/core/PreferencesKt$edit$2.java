package androidx.datastore.preferences.core;

import b3.a;
import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
/* compiled from: Preferences.kt */
final class PreferencesKt$edit$2 extends SuspendLambda implements p<a, c<? super a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f9895a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f9896b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<MutablePreferences, c<? super k>, Object> f9897c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PreferencesKt$edit$2(p<? super MutablePreferences, ? super c<? super k>, ? extends Object> pVar, c<? super PreferencesKt$edit$2> cVar) {
        super(2, cVar);
        this.f9897c = pVar;
    }

    /* renamed from: a */
    public final Object invoke(a aVar, c<? super a> cVar) {
        return ((PreferencesKt$edit$2) create(aVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(this.f9897c, cVar);
        preferencesKt$edit$2.f9896b = obj;
        return preferencesKt$edit$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f9895a;
        if (i11 == 0) {
            g.b(obj);
            MutablePreferences c11 = ((a) this.f9896b).c();
            p<MutablePreferences, c<? super k>, Object> pVar = this.f9897c;
            this.f9896b = c11;
            this.f9895a = 1;
            return pVar.invoke(c11, this) == d11 ? d11 : c11;
        } else if (i11 == 1) {
            MutablePreferences mutablePreferences = (MutablePreferences) this.f9896b;
            g.b(obj);
            return mutablePreferences;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
