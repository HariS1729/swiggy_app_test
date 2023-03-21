package androidx.datastore.preferences.core;

import b3.a;
import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {85}, m = "invokeSuspend")
/* compiled from: PreferenceDataStoreFactory.kt */
final class PreferenceDataStore$updateData$2 extends SuspendLambda implements p<a, c<? super a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f9890a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f9891b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<a, c<? super a>, Object> f9892c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PreferenceDataStore$updateData$2(p<? super a, ? super c<? super a>, ? extends Object> pVar, c<? super PreferenceDataStore$updateData$2> cVar) {
        super(2, cVar);
        this.f9892c = pVar;
    }

    /* renamed from: a */
    public final Object invoke(a aVar, c<? super a> cVar) {
        return ((PreferenceDataStore$updateData$2) create(aVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        PreferenceDataStore$updateData$2 preferenceDataStore$updateData$2 = new PreferenceDataStore$updateData$2(this.f9892c, cVar);
        preferenceDataStore$updateData$2.f9891b = obj;
        return preferenceDataStore$updateData$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f9890a;
        if (i11 == 0) {
            g.b(obj);
            p<a, c<? super a>, Object> pVar = this.f9892c;
            this.f9890a = 1;
            obj = pVar.invoke((a) this.f9891b, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a aVar = (a) obj;
        ((MutablePreferences) aVar).f();
        return aVar;
    }
}
