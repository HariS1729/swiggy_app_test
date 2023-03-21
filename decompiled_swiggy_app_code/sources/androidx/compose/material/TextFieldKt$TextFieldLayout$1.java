package androidx.compose.material;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;
import p0.d;

/* compiled from: TextField.kt */
final class TextFieldKt$TextFieldLayout$1 extends Lambda implements q<p<? super g, ? super Integer, ? extends k>, g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5665a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ q<d, g, Integer, k> f5666b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5667c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5668d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f5669e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ long f5670f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ long f5671g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ float f5672h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f5673i;
    final /* synthetic */ int j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldKt$TextFieldLayout$1(p<? super g, ? super Integer, k> pVar, q<? super d, ? super g, ? super Integer, k> qVar, p<? super g, ? super Integer, k> pVar2, p<? super g, ? super Integer, k> pVar3, boolean z11, long j11, long j12, float f11, int i11, int i12) {
        super(3);
        this.f5665a = pVar;
        this.f5666b = qVar;
        this.f5667c = pVar2;
        this.f5668d = pVar3;
        this.f5669e = z11;
        this.f5670f = j11;
        this.f5671g = j12;
        this.f5672h = f11;
        this.f5673i = i11;
        this.j = i12;
    }

    public final void a(p<? super g, ? super Integer, k> pVar, g gVar, int i11) {
        int i12;
        p<? super g, ? super Integer, k> pVar2 = pVar;
        kotlin.jvm.internal.p.j(pVar2, "coreTextField");
        g gVar2 = gVar;
        if ((i11 & 14) == 0) {
            i12 = i11 | (gVar2.k(pVar2) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (((i12 & 91) ^ 18) != 0 || !gVar.b()) {
            p<g, Integer, k> pVar3 = this.f5665a;
            q<d, g, Integer, k> qVar = this.f5666b;
            p<g, Integer, k> pVar4 = this.f5667c;
            p<g, Integer, k> pVar5 = this.f5668d;
            boolean z11 = this.f5669e;
            long j11 = this.f5670f;
            long j12 = this.f5671g;
            float f11 = this.f5672h;
            int i13 = this.f5673i;
            TextFieldKt.a(pVar, pVar3, qVar, pVar4, pVar5, z11, j11, j12, f11, gVar, (i13 & 234881024) | (i12 & 14) | ((i13 >> 6) & 112) | (i13 & 896) | ((i13 >> 3) & 7168) | ((i13 >> 3) & 57344) | ((this.j >> 9) & 458752) | (3670016 & i13) | (29360128 & i13));
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((p) obj, (g) obj2, ((Number) obj3).intValue());
        return k.f22762a;
    }
}
