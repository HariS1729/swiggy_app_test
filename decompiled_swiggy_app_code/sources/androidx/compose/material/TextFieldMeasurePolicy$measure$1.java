package androidx.compose.material;

import bp0.k;
import i1.e0;
import i1.w;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: TextField.kt */
final class TextFieldMeasurePolicy$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f5700a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f5701b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f5702c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f5703d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f5704e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ e0 f5705f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ e0 f5706g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ e0 f5707h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ e0 f5708i;
    final /* synthetic */ TextFieldMeasurePolicy j;
    final /* synthetic */ int k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ int f5709l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ w f5710m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldMeasurePolicy$measure$1(e0 e0Var, int i11, int i12, int i13, int i14, e0 e0Var2, e0 e0Var3, e0 e0Var4, e0 e0Var5, TextFieldMeasurePolicy textFieldMeasurePolicy, int i15, int i16, w wVar) {
        super(1);
        this.f5700a = e0Var;
        this.f5701b = i11;
        this.f5702c = i12;
        this.f5703d = i13;
        this.f5704e = i14;
        this.f5705f = e0Var2;
        this.f5706g = e0Var3;
        this.f5707h = e0Var4;
        this.f5708i = e0Var5;
        this.j = textFieldMeasurePolicy;
        this.k = i15;
        this.f5709l = i16;
        this.f5710m = wVar;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        if (this.f5700a != null) {
            int d11 = l.d(this.f5701b - this.f5702c, 0);
            e0.a aVar2 = aVar;
            TextFieldKt.s(aVar2, this.f5703d, this.f5704e, this.f5705f, this.f5700a, this.f5706g, this.f5707h, this.f5708i, this.j.f5696a, d11, this.f5709l + this.k, this.j.f5697b, this.f5710m.getDensity());
            return;
        }
        TextFieldKt.t(aVar, this.f5703d, this.f5704e, this.f5705f, this.f5706g, this.f5707h, this.f5708i, this.j.f5696a, this.f5710m.getDensity());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
