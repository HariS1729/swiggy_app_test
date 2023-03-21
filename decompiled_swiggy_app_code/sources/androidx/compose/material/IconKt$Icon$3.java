package androidx.compose.material;

import androidx.compose.ui.graphics.painter.Painter;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: Icon.kt */
final class IconKt$Icon$3 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Painter f5077a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f5078b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d f5079c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f5080d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f5081e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f5082f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    IconKt$Icon$3(Painter painter, String str, d dVar, long j, int i11, int i12) {
        super(2);
        this.f5077a = painter;
        this.f5078b = str;
        this.f5079c = dVar;
        this.f5080d = j;
        this.f5081e = i11;
        this.f5082f = i12;
    }

    public final void a(g gVar, int i11) {
        IconKt.a(this.f5077a, this.f5078b, this.f5079c, this.f5080d, gVar, this.f5081e | 1, this.f5082f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
