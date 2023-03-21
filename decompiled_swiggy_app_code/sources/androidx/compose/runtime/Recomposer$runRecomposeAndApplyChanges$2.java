package androidx.compose.runtime;

import bp0.k;
import e0.c0;
import e0.g0;
import fp0.c;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.q;
import wp0.j0;

@d(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {436, 454}, m = "invokeSuspend")
/* compiled from: Recomposer.kt */
final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements q<j0, c0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f6076a;

    /* renamed from: b  reason: collision with root package name */
    Object f6077b;

    /* renamed from: c  reason: collision with root package name */
    Object f6078c;

    /* renamed from: d  reason: collision with root package name */
    Object f6079d;

    /* renamed from: e  reason: collision with root package name */
    Object f6080e;

    /* renamed from: f  reason: collision with root package name */
    int f6081f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f6082g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ Recomposer f6083h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, c<? super Recomposer$runRecomposeAndApplyChanges$2> cVar) {
        super(3, cVar);
        this.f6083h = recomposer;
    }

    /* access modifiers changed from: private */
    public static final void i(List<g0> list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.f6044e) {
            List w11 = recomposer.f6049l;
            int size = w11.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.add((g0) w11.get(i11));
            }
            recomposer.f6049l.clear();
            k kVar = k.f22762a;
        }
    }

    /* renamed from: h */
    public final Object invoke(j0 j0Var, c0 c0Var, c<? super k> cVar) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.f6083h, cVar);
        recomposer$runRecomposeAndApplyChanges$2.f6082g = c0Var;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(k.f22762a);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r1.f6081f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0065
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r2 = r1.f6080e
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r5 = r1.f6079d
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r1.f6078c
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.f6077b
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r1.f6076a
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r1.f6082g
            e0.c0 r9 = (e0.c0) r9
            bp0.g.b(r19)
            r10 = r1
            r14 = r6
            r6 = 2
            r16 = r9
            r9 = r2
            r2 = r16
            r17 = r8
            r8 = r5
            r5 = r17
            goto L_0x00fd
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0042:
            java.lang.Object r2 = r1.f6080e
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r5 = r1.f6079d
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r1.f6078c
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.f6077b
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r1.f6076a
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r1.f6082g
            e0.c0 r9 = (e0.c0) r9
            bp0.g.b(r19)
            r11 = r1
            r10 = r2
            r15 = r5
            r14 = r6
            r13 = r7
            r12 = r8
            r2 = r9
            goto L_0x00ab
        L_0x0065:
            bp0.g.b(r19)
            java.lang.Object r2 = r1.f6082g
            e0.c0 r2 = (e0.c0) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r10 = r1
        L_0x0086:
            androidx.compose.runtime.Recomposer r11 = r10.f6083h
            boolean r11 = r11.a0()
            if (r11 == 0) goto L_0x0105
            androidx.compose.runtime.Recomposer r11 = r10.f6083h
            r10.f6082g = r2
            r10.f6076a = r5
            r10.f6077b = r6
            r10.f6078c = r7
            r10.f6079d = r8
            r10.f6080e = r9
            r10.f6081f = r4
            java.lang.Object r11 = r11.S(r10)
            if (r11 != r0) goto L_0x00a5
            return r0
        L_0x00a5:
            r12 = r5
            r13 = r6
            r14 = r7
            r15 = r8
            r11 = r10
            r10 = r9
        L_0x00ab:
            androidx.compose.runtime.Recomposer r5 = r11.f6083h
            java.lang.Object r5 = r5.f6044e
            androidx.compose.runtime.Recomposer r6 = r11.f6083h
            monitor-enter(r5)
            boolean r7 = r6.Y()     // Catch:{ all -> 0x0102 }
            r8 = 0
            if (r7 != 0) goto L_0x00c5
            r6.i0()     // Catch:{ all -> 0x0102 }
            boolean r6 = r6.Y()     // Catch:{ all -> 0x0102 }
            if (r6 != 0) goto L_0x00c5
            r8 = 1
        L_0x00c5:
            monitor-exit(r5)
            if (r8 == 0) goto L_0x00cf
            r9 = r10
            r10 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            goto L_0x0086
        L_0x00cf:
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$2 r9 = new androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$2
            androidx.compose.runtime.Recomposer r6 = r11.f6083h
            r5 = r9
            r7 = r12
            r8 = r13
            r4 = r9
            r9 = r15
            r19 = r10
            r10 = r14
            r3 = r11
            r11 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3.f6082g = r2
            r3.f6076a = r12
            r3.f6077b = r13
            r3.f6078c = r14
            r3.f6079d = r15
            r9 = r19
            r3.f6080e = r9
            r6 = 2
            r3.f6081f = r6
            java.lang.Object r4 = r2.w0(r4, r3)
            if (r4 != r0) goto L_0x00f9
            return r0
        L_0x00f9:
            r10 = r3
            r5 = r12
            r7 = r13
            r8 = r15
        L_0x00fd:
            r6 = r7
            r7 = r14
            r3 = 2
            r4 = 1
            goto L_0x0086
        L_0x0102:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0105:
            bp0.k r0 = bp0.k.f22762a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
