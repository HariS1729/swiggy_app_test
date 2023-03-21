package coil.compose;

import bp0.k;
import coil.compose.AsyncImagePainter;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: Utils.kt */
final class UtilsKt$onStateOf$1 extends Lambda implements l<AsyncImagePainter.b, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<AsyncImagePainter.b.c, k> f13490a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<AsyncImagePainter.b.d, k> f13491b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l<AsyncImagePainter.b.C0111b, k> f13492c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UtilsKt$onStateOf$1(l<? super AsyncImagePainter.b.c, k> lVar, l<? super AsyncImagePainter.b.d, k> lVar2, l<? super AsyncImagePainter.b.C0111b, k> lVar3) {
        super(1);
        this.f13490a = lVar;
        this.f13491b = lVar2;
        this.f13492c = lVar3;
    }

    public final void a(AsyncImagePainter.b bVar) {
        if (bVar instanceof AsyncImagePainter.b.c) {
            l<AsyncImagePainter.b.c, k> lVar = this.f13490a;
            if (lVar != null) {
                lVar.invoke(bVar);
            }
        } else if (bVar instanceof AsyncImagePainter.b.d) {
            l<AsyncImagePainter.b.d, k> lVar2 = this.f13491b;
            if (lVar2 != null) {
                lVar2.invoke(bVar);
            }
        } else if (bVar instanceof AsyncImagePainter.b.C0111b) {
            l<AsyncImagePainter.b.C0111b, k> lVar3 = this.f13492c;
            if (lVar3 != null) {
                lVar3.invoke(bVar);
            }
        } else {
            boolean z11 = bVar instanceof AsyncImagePainter.b.a;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((AsyncImagePainter.b) obj);
        return k.f22762a;
    }
}
