package androidx.compose.material;

import a2.e;
import bp0.k;
import c0.a;
import c0.b;
import c0.v;
import defpackage.a2;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;
import lp0.q;
import p0.d;
import p1.c0;
import p1.y;
import u0.j1;
import u1.i;
import u1.s;

/* compiled from: Snackbar.kt */
final class SnackbarKt$Snackbar$actionComposable$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f5406a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f5407b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ v f5408c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f5409d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarKt$Snackbar$actionComposable$1(long j, int i11, v vVar, String str) {
        super(2);
        this.f5406a = j;
        this.f5407b = i11;
        this.f5408c = vVar;
        this.f5409d = str;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            a g11 = a.f5770a.g(0, this.f5406a, 0, gVar, ((this.f5407b >> 15) & 112) | 3072, 5);
            final v vVar = this.f5408c;
            AnonymousClass1 r12 = new lp0.a<k>() {
                public final void invoke() {
                    vVar.a();
                }
            };
            final String str = this.f5409d;
            ButtonKt.c(r12, (d) null, false, (u.k) null, (b) null, (j1) null, (s.b) null, g11, (a2.p) null, l0.b.b(gVar, -819890024, true, new q<a2.t, g, Integer, k>() {
                public final void a(a2.t tVar, g gVar, int i11) {
                    kotlin.jvm.internal.p.j(tVar, "$this$TextButton");
                    if (((i11 & 81) ^ 16) != 0 || !gVar.b()) {
                        TextKt.c(str, (d) null, 0, 0, (s) null, (u1.v) null, (i) null, 0, (e) null, (a2.d) null, 0, 0, false, 0, (l<? super y, k>) null, (c0) null, gVar, 0, 0, 65534);
                        return;
                    }
                    gVar.h();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((a2.t) obj, (g) obj2, ((Number) obj3).intValue());
                    return k.f22762a;
                }
            }), gVar, 805306368, 382);
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
