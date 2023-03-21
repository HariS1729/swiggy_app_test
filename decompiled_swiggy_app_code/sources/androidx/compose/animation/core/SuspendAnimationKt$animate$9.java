package androidx.compose.animation.core;

import bp0.k;
import defpackage.v1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: SuspendAnimation.kt */
final class SuspendAnimationKt$animate$9 extends Lambda implements l<Long, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<v1.f<T, V>> f2726a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ v1.c<T, V> f2727b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ v1.i<T, V> f2728c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l<v1.f<T, V>, k> f2729d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendAnimationKt$animate$9(Ref$ObjectRef<v1.f<T, V>> ref$ObjectRef, v1.c<T, V> cVar, v1.i<T, V> iVar, l<? super v1.f<T, V>, k> lVar) {
        super(1);
        this.f2726a = ref$ObjectRef;
        this.f2727b = cVar;
        this.f2728c = iVar;
        this.f2729d = lVar;
    }

    public final void a(long j) {
        T t = this.f2726a.f25666a;
        p.g(t);
        SuspendAnimationKt.j((v1.f) t, j, this.f2727b, this.f2728c, this.f2729d);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a(((Number) obj).longValue());
        return k.f22762a;
    }
}
