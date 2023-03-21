package androidx.compose.runtime.saveable;

import e0.d1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import m0.b;
import m0.c;
import m0.d;

/* compiled from: RememberSaveable.kt */
final class RememberSaveableKt$rememberSaveable$1$valueProvider$1 extends Lambda implements lp0.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d1<c<T, Object>> f6186a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d1<T> f6187b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f6188c;

    /* compiled from: RememberSaveable.kt */
    static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f6189a;

        a(b bVar) {
            this.f6189a = bVar;
        }

        public final boolean a(Object obj) {
            p.j(obj, "it");
            return this.f6189a.a(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RememberSaveableKt$rememberSaveable$1$valueProvider$1(d1<? extends c<T, Object>> d1Var, d1<? extends T> d1Var2, b bVar) {
        super(0);
        this.f6186a = d1Var;
        this.f6187b = d1Var2;
        this.f6188c = bVar;
    }

    public final Object invoke() {
        return this.f6186a.getValue().b(new a(this.f6188c), this.f6187b.getValue());
    }
}
