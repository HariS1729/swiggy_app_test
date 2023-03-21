package coil.size;

import android.view.ViewTreeObserver;
import bp0.k;
import coil.size.ViewSizeResolver;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: ViewSizeResolver.kt */
final class ViewSizeResolver$size$3$1 extends Lambda implements l<Throwable, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ViewSizeResolver<T> f13681a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ViewTreeObserver f13682b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ViewSizeResolver.DefaultImpls.a f13683c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewSizeResolver$size$3$1(ViewSizeResolver<T> viewSizeResolver, ViewTreeObserver viewTreeObserver, ViewSizeResolver.DefaultImpls.a aVar) {
        super(1);
        this.f13681a = viewSizeResolver;
        this.f13682b = viewTreeObserver;
        this.f13683c = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return k.f22762a;
    }

    public final void invoke(Throwable th2) {
        ViewSizeResolver.DefaultImpls.g(this.f13681a, this.f13682b, this.f13683c);
    }
}
