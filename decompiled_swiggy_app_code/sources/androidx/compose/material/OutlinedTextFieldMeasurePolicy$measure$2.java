package androidx.compose.material;

import bp0.k;
import i1.e0;
import i1.w;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: OutlinedTextField.kt */
final class OutlinedTextFieldMeasurePolicy$measure$2 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f5192a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f5193b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e0 f5194c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ e0 f5195d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ e0 f5196e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ e0 f5197f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ e0 f5198g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ e0 f5199h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ OutlinedTextFieldMeasurePolicy f5200i;
    final /* synthetic */ w j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OutlinedTextFieldMeasurePolicy$measure$2(int i11, int i12, e0 e0Var, e0 e0Var2, e0 e0Var3, e0 e0Var4, e0 e0Var5, e0 e0Var6, OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, w wVar) {
        super(1);
        this.f5192a = i11;
        this.f5193b = i12;
        this.f5194c = e0Var;
        this.f5195d = e0Var2;
        this.f5196e = e0Var3;
        this.f5197f = e0Var4;
        this.f5198g = e0Var5;
        this.f5199h = e0Var6;
        this.f5200i = outlinedTextFieldMeasurePolicy;
        this.j = wVar;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        OutlinedTextFieldKt.q(aVar, this.f5192a, this.f5193b, this.f5194c, this.f5195d, this.f5196e, this.f5197f, this.f5198g, this.f5199h, this.f5200i.f(), this.f5200i.h(), this.j.getDensity());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
