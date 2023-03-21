package androidx.compose.runtime.saveable;

import e0.d1;
import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import m0.b;
import m0.c;

/* compiled from: RememberSaveable.kt */
final class RememberSaveableKt$rememberSaveable$1 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f6181a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f6182b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d1<c<T, Object>> f6183c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ d1<T> f6184d;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a f6185a;

        public a(b.a aVar) {
            this.f6185a = aVar;
        }

        public void dispose() {
            this.f6185a.unregister();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RememberSaveableKt$rememberSaveable$1(b bVar, String str, d1<? extends c<T, Object>> d1Var, d1<? extends T> d1Var2) {
        super(1);
        this.f6181a = bVar;
        this.f6182b = str;
        this.f6183c = d1Var;
        this.f6184d = d1Var2;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        RememberSaveableKt$rememberSaveable$1$valueProvider$1 rememberSaveableKt$rememberSaveable$1$valueProvider$1 = new RememberSaveableKt$rememberSaveable$1$valueProvider$1(this.f6183c, this.f6184d, this.f6181a);
        RememberSaveableKt.c(this.f6181a, rememberSaveableKt$rememberSaveable$1$valueProvider$1.invoke());
        return new a(this.f6181a.d(this.f6182b, rememberSaveableKt$rememberSaveable$1$valueProvider$1));
    }
}
