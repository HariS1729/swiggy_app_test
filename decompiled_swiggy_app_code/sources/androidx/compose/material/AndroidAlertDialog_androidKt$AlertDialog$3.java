package androidx.compose.material;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;
import u0.j1;

/* compiled from: AndroidAlertDialog.android.kt */
final class AndroidAlertDialog_androidKt$AlertDialog$3 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4864a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f4865b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4866c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4867d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ j1 f4868e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ long f4869f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ long f4870g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f4871h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidAlertDialog_androidKt$AlertDialog$3(p<? super g, ? super Integer, k> pVar, d dVar, p<? super g, ? super Integer, k> pVar2, p<? super g, ? super Integer, k> pVar3, j1 j1Var, long j, long j11, int i11) {
        super(2);
        this.f4864a = pVar;
        this.f4865b = dVar;
        this.f4866c = pVar2;
        this.f4867d = pVar3;
        this.f4868e = j1Var;
        this.f4869f = j;
        this.f4870g = j11;
        this.f4871h = i11;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            p<g, Integer, k> pVar = this.f4864a;
            d dVar = this.f4865b;
            p<g, Integer, k> pVar2 = this.f4866c;
            p<g, Integer, k> pVar3 = this.f4867d;
            j1 j1Var = this.f4868e;
            long j = this.f4869f;
            long j11 = this.f4870g;
            int i12 = this.f4871h;
            AlertDialogKt.b(pVar, dVar, pVar2, pVar3, j1Var, j, j11, gVar, ((i12 >> 3) & 14) | ((i12 >> 3) & 112) | ((i12 >> 3) & 896) | ((i12 >> 3) & 7168) | (57344 & (i12 >> 3)) | (458752 & (i12 >> 3)) | ((i12 >> 3) & 3670016), 0);
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
