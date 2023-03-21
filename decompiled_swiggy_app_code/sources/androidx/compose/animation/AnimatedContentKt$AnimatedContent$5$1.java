package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;
import lp0.r;
import p.b;
import p.e;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentKt$AnimatedContent$5$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Transition<S> f2402a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ S f2403b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f2404c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l<AnimatedContentScope<S>, e> f2405d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AnimatedContentScope<S> f2406e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ r<b, S, g, Integer, k> f2407f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ SnapshotStateList<S> f2408g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedContentKt$AnimatedContent$5$1(Transition<S> transition, S s11, int i11, l<? super AnimatedContentScope<S>, e> lVar, AnimatedContentScope<S> animatedContentScope, r<? super b, ? super S, ? super g, ? super Integer, k> rVar, SnapshotStateList<S> snapshotStateList) {
        super(2);
        this.f2402a = transition;
        this.f2403b = s11;
        this.f2404c = i11;
        this.f2405d = lVar;
        this.f2406e = animatedContentScope;
        this.f2407f = rVar;
        this.f2408g = snapshotStateList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: androidx.compose.animation.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(e0.g r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            r1 = r18 & 11
            r1 = r1 ^ 2
            if (r1 != 0) goto L_0x0016
            boolean r1 = r17.b()
            if (r1 != 0) goto L_0x0011
            goto L_0x0016
        L_0x0011:
            r17.h()
            goto L_0x00f7
        L_0x0016:
            lp0.l<androidx.compose.animation.AnimatedContentScope<S>, p.e> r1 = r0.f2405d
            androidx.compose.animation.AnimatedContentScope<S> r2 = r0.f2406e
            r3 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r7.E(r3)
            java.lang.Object r4 = r17.F()
            e0.g$a r5 = e0.g.f14172a
            java.lang.Object r6 = r5.a()
            if (r4 != r6) goto L_0x0036
            java.lang.Object r1 = r1.invoke(r2)
            r4 = r1
            p.e r4 = (p.e) r4
            r7.y(r4)
        L_0x0036:
            r17.P()
            p.e r4 = (p.e) r4
            androidx.compose.animation.core.Transition<S> r1 = r0.f2402a
            androidx.compose.animation.core.Transition$b r1 = r1.k()
            java.lang.Object r1 = r1.b()
            S r2 = r0.f2403b
            boolean r1 = kotlin.jvm.internal.p.e(r1, r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            lp0.l<androidx.compose.animation.AnimatedContentScope<S>, p.e> r2 = r0.f2405d
            androidx.compose.animation.AnimatedContentScope<S> r6 = r0.f2406e
            r8 = -3686930(0xffffffffffc7bdee, float:NaN)
            r7.E(r8)
            boolean r1 = r7.k(r1)
            java.lang.Object r8 = r17.F()
            if (r1 != 0) goto L_0x0069
            java.lang.Object r1 = r5.a()
            if (r8 != r1) goto L_0x0076
        L_0x0069:
            java.lang.Object r1 = r2.invoke(r6)
            p.e r1 = (p.e) r1
            androidx.compose.animation.c r8 = r1.a()
            r7.y(r8)
        L_0x0076:
            r17.P()
            r6 = r8
            androidx.compose.animation.c r6 = (androidx.compose.animation.c) r6
            S r1 = r0.f2403b
            androidx.compose.animation.core.Transition<S> r2 = r0.f2402a
            r7.E(r3)
            java.lang.Object r3 = r17.F()
            java.lang.Object r5 = r5.a()
            if (r3 != r5) goto L_0x009d
            androidx.compose.animation.AnimatedContentScope$a r3 = new androidx.compose.animation.AnimatedContentScope$a
            java.lang.Object r2 = r2.m()
            boolean r1 = kotlin.jvm.internal.p.e(r1, r2)
            r3.<init>(r1)
            r7.y(r3)
        L_0x009d:
            r17.P()
            androidx.compose.animation.AnimatedContentScope$a r3 = (androidx.compose.animation.AnimatedContentScope.a) r3
            androidx.compose.animation.a r5 = r4.c()
            p0.d$a r1 = p0.d.f16037h0
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$1 r2 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$1
            r2.<init>(r4)
            p0.d r1 = androidx.compose.ui.layout.LayoutModifierKt.a(r1, r2)
            S r2 = r0.f2403b
            androidx.compose.animation.core.Transition<S> r4 = r0.f2402a
            java.lang.Object r4 = r4.m()
            boolean r2 = kotlin.jvm.internal.p.e(r2, r4)
            r3.c(r2)
            p0.d r3 = r1.N(r3)
            androidx.compose.animation.core.Transition<S> r1 = r0.f2402a
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$3 r2 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$3
            S r4 = r0.f2403b
            r2.<init>(r4)
            r4 = -819913132(0xffffffffcf211e54, float:-2.70311936E9)
            r8 = 1
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$4 r15 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$4
            androidx.compose.animation.AnimatedContentScope<S> r10 = r0.f2406e
            S r11 = r0.f2403b
            lp0.r<p.b, S, e0.g, java.lang.Integer, bp0.k> r12 = r0.f2407f
            int r13 = r0.f2404c
            androidx.compose.runtime.snapshots.SnapshotStateList<S> r14 = r0.f2408g
            r9 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            l0.a r8 = l0.b.b(r7, r4, r8, r15)
            r4 = 196608(0x30000, float:2.75506E-40)
            int r9 = r0.f2404c
            r9 = r9 & 14
            r9 = r9 | r4
            r10 = 0
            r4 = r5
            r5 = r6
            r6 = r8
            r7 = r17
            r8 = r9
            r9 = r10
            androidx.compose.animation.AnimatedVisibilityKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1.a(e0.g, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
