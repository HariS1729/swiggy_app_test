package coil.compose;

import androidx.compose.ui.graphics.painter.Painter;
import coil.compose.AsyncImagePainter;
import coil.request.NullRequestDataException;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import x6.d;

/* compiled from: Utils.kt */
final class UtilsKt$transformOf$1 extends Lambda implements l<AsyncImagePainter.b, AsyncImagePainter.b> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Painter f13493a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Painter f13494b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Painter f13495c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UtilsKt$transformOf$1(Painter painter, Painter painter2, Painter painter3) {
        super(1);
        this.f13493a = painter;
        this.f13494b = painter2;
        this.f13495c = painter3;
    }

    /* renamed from: a */
    public final AsyncImagePainter.b invoke(AsyncImagePainter.b bVar) {
        if (bVar instanceof AsyncImagePainter.b.c) {
            Painter painter = this.f13493a;
            AsyncImagePainter.b.c cVar = (AsyncImagePainter.b.c) bVar;
            if (painter != null) {
                return cVar.b(painter);
            }
            return cVar;
        } else if (!(bVar instanceof AsyncImagePainter.b.C0111b)) {
            return bVar;
        } else {
            AsyncImagePainter.b.C0111b bVar2 = (AsyncImagePainter.b.C0111b) bVar;
            if (bVar2.d().c() instanceof NullRequestDataException) {
                Painter painter2 = this.f13494b;
                if (painter2 != null) {
                    return AsyncImagePainter.b.C0111b.c(bVar2, painter2, (d) null, 2, (Object) null);
                }
                return bVar2;
            }
            Painter painter3 = this.f13495c;
            return painter3 != null ? AsyncImagePainter.b.C0111b.c(bVar2, painter3, (d) null, 2, (Object) null) : bVar2;
        }
    }
}
