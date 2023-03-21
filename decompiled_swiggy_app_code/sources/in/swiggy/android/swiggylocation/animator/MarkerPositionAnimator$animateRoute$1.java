package in.swiggy.android.swiggylocation.animator;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import lp0.p;
import rj.g;
import rj.i;

/* compiled from: MarkerPositionAnimator.kt */
final class MarkerPositionAnimator$animateRoute$1 extends Lambda implements p<g, i, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MarkerPositionAnimator f18781a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f18782b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Long f18783c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a<k> f18784d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a<k> f18785e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MarkerPositionAnimator$animateRoute$1(MarkerPositionAnimator markerPositionAnimator, boolean z11, Long l11, a<k> aVar, a<k> aVar2) {
        super(2);
        this.f18781a = markerPositionAnimator;
        this.f18782b = z11;
        this.f18783c = l11;
        this.f18784d = aVar;
        this.f18785e = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(rj.g r22, rj.i r23) {
        /*
            r21 = this;
            r1 = r21
            r8 = r22
            java.lang.String r0 = "marker"
            kotlin.jvm.internal.p.j(r8, r0)
            java.lang.String r0 = "polyline"
            r2 = r23
            kotlin.jvm.internal.p.j(r2, r0)
            java.util.List r0 = r23.a()
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            r9 = 0
            r10 = 0
            if (r0 != 0) goto L_0x001c
        L_0x001a:
            r0 = r9
            goto L_0x0034
        L_0x001c:
            in.swiggy.android.swiggylocation.animator.MarkerPositionAnimator r3 = r1.f18781a
            int r3 = r3.m()
            java.util.List r0 = r0.subList(r10, r3)
            if (r0 != 0) goto L_0x0029
            goto L_0x001a
        L_0x0029:
            com.google.android.gms.maps.model.LatLng[] r3 = new com.google.android.gms.maps.model.LatLng[r10]
            java.lang.Object[] r0 = r0.toArray(r3)
            kotlin.jvm.internal.p.h(r0, r2)
            com.google.android.gms.maps.model.LatLng[] r0 = (com.google.android.gms.maps.model.LatLng[]) r0
        L_0x0034:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r0 != 0) goto L_0x003c
            goto L_0x004e
        L_0x003c:
            int r4 = r0.length
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x004e
            r5 = 0
        L_0x0042:
            int r6 = r5 + 1
            r5 = r0[r5]
            r3.add(r5)
            if (r6 <= r4) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r5 = r6
            goto L_0x0042
        L_0x004e:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r0 = r3.size()
            r12 = 1
            r4 = 1
        L_0x0059:
            if (r4 >= r0) goto L_0x007d
            int r5 = r4 + 1
            int r6 = r4 + -1
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r7 = "list2[i - 1]"
            kotlin.jvm.internal.p.i(r6, r7)
            com.google.android.gms.maps.model.LatLng r6 = (com.google.android.gms.maps.model.LatLng) r6
            java.lang.Object r4 = r3.get(r4)
            com.google.android.gms.maps.model.LatLng r4 = (com.google.android.gms.maps.model.LatLng) r4
            float r4 = ag0.d.j(r6, r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r11.add(r4)
            r4 = r5
            goto L_0x0059
        L_0x007d:
            com.google.android.gms.maps.model.LatLng[] r0 = new com.google.android.gms.maps.model.LatLng[r10]
            java.lang.Object[] r0 = r3.toArray(r0)
            kotlin.jvm.internal.p.h(r0, r2)
            com.google.android.gms.maps.model.LatLng[] r0 = (com.google.android.gms.maps.model.LatLng[]) r0
            boolean r2 = r1.f18782b
            r14 = 10
            if (r2 == 0) goto L_0x009c
            java.lang.Long r2 = r1.f18783c
            if (r2 != 0) goto L_0x0095
            r2 = 1800(0x708, double:8.893E-321)
            goto L_0x0099
        L_0x0095:
            long r2 = r2.longValue()
        L_0x0099:
            r19 = r2
            goto L_0x009e
        L_0x009c:
            r19 = r14
        L_0x009e:
            int r2 = r0.length
            if (r2 <= r12) goto L_0x0102
            java.lang.Object r2 = kotlin.collections.ArraysKt___ArraysKt.Z(r0)
            r13 = r2
            com.google.android.gms.maps.model.LatLng r13 = (com.google.android.gms.maps.model.LatLng) r13
            int r2 = r0.length     // Catch:{ all -> 0x00db }
            r3 = 100
            if (r2 < r3) goto L_0x00c1
            java.lang.Long r2 = r1.f18783c     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x00b2
            goto L_0x00c1
        L_0x00b2:
            in.swiggy.android.swiggylocation.animator.MarkerPositionAnimator r2 = r1.f18781a     // Catch:{ all -> 0x00db }
            boolean r5 = r1.f18782b     // Catch:{ all -> 0x00db }
            lp0.a<bp0.k> r6 = r1.f18784d     // Catch:{ all -> 0x00db }
            lp0.a<bp0.k> r7 = r1.f18785e     // Catch:{ all -> 0x00db }
            r3 = r22
            r4 = r13
            r2.o(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00db }
            goto L_0x0102
        L_0x00c1:
            in.swiggy.android.swiggylocation.animator.MarkerPositionAnimator r2 = r1.f18781a     // Catch:{ all -> 0x00db }
            java.lang.Long r3 = r1.f18783c     // Catch:{ all -> 0x00db }
            boolean r4 = r1.f18782b     // Catch:{ all -> 0x00db }
            lp0.a<bp0.k> r5 = r1.f18784d     // Catch:{ all -> 0x00db }
            lp0.a<bp0.k> r6 = r1.f18785e     // Catch:{ all -> 0x00db }
            r7 = r13
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r0
            r17 = r5
            r18 = r6
            r13.l(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00d9 }
            goto L_0x0102
        L_0x00d9:
            r0 = move-exception
            goto L_0x00dd
        L_0x00db:
            r0 = move-exception
            r7 = r13
        L_0x00dd:
            in.swiggy.android.swiggylocation.animator.MarkerPositionAnimator$a r2 = in.swiggy.android.swiggylocation.animator.MarkerPositionAnimator.f18773f
            java.lang.String r2 = r2.a()
            os.u.h(r2, r0)
            com.google.android.gms.maps.model.LatLng r0 = r22.a()
            java.lang.String r2 = "marker.position"
            kotlin.jvm.internal.p.i(r0, r2)
            float r0 = ag0.d.j(r0, r7)
            r8.o(r0)
            r8.n(r7)
            in.swiggy.android.swiggylocation.animator.MarkerPositionAnimator r0 = r1.f18781a
            lp0.a<bp0.k> r2 = r1.f18785e
            r3 = 10
            r0.h(r10, r3, r2)
        L_0x0102:
            boolean r0 = r1.f18782b
            r2 = 2
            if (r0 == 0) goto L_0x011b
            in.swiggy.android.swiggylocation.animator.MarkerRotationAnimator r0 = new in.swiggy.android.swiggylocation.animator.MarkerRotationAnimator
            r3 = 200(0xc8, float:2.8E-43)
            long r3 = (long) r3
            long r3 = r19 - r3
            int r4 = (int) r3
            r0.<init>(r8, r11, r4)
            java.lang.Long r3 = r1.f18783c
            if (r3 == 0) goto L_0x0117
            r10 = 1
        L_0x0117:
            in.swiggy.android.swiggylocation.animator.MarkerRotationAnimator.b(r0, r10, r9, r2, r9)
            goto L_0x012a
        L_0x011b:
            in.swiggy.android.swiggylocation.animator.MarkerRotationAnimator r0 = new in.swiggy.android.swiggylocation.animator.MarkerRotationAnimator
            r3 = 10
            r0.<init>(r8, r11, r3)
            java.lang.Long r3 = r1.f18783c
            if (r3 == 0) goto L_0x0127
            r10 = 1
        L_0x0127:
            in.swiggy.android.swiggylocation.animator.MarkerRotationAnimator.b(r0, r10, r9, r2, r9)
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylocation.animator.MarkerPositionAnimator$animateRoute$1.a(rj.g, rj.i):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, (i) obj2);
        return k.f22762a;
    }
}
