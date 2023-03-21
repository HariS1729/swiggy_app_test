package coil.size;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.f;
import wp0.n;
import wp0.o;
import y6.c;
import y6.g;
import y6.h;

/* compiled from: ViewSizeResolver.kt */
public interface ViewSizeResolver<T extends View> extends h {

    /* compiled from: ViewSizeResolver.kt */
    public static final class DefaultImpls {

        /* compiled from: ViewSizeResolver.kt */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            private boolean f13677a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewSizeResolver<T> f13678b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver f13679c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ n<g> f13680d;

            a(ViewSizeResolver<T> viewSizeResolver, ViewTreeObserver viewTreeObserver, n<? super g> nVar) {
                this.f13678b = viewSizeResolver;
                this.f13679c = viewTreeObserver;
                this.f13680d = nVar;
            }

            public boolean onPreDraw() {
                g a11 = DefaultImpls.e(this.f13678b);
                if (a11 != null) {
                    DefaultImpls.g(this.f13678b, this.f13679c, this);
                    if (!this.f13677a) {
                        this.f13677a = true;
                        n<g> nVar = this.f13680d;
                        Result.a aVar = Result.f25582b;
                        nVar.resumeWith(Result.b(a11));
                    }
                }
                return true;
            }
        }

        private static <T extends View> c c(ViewSizeResolver<T> viewSizeResolver, int i11, int i12, int i13) {
            if (i11 == -2) {
                return c.b.f18025a;
            }
            int i14 = i11 - i13;
            if (i14 > 0) {
                return y6.a.a(i14);
            }
            int i15 = i12 - i13;
            if (i15 > 0) {
                return y6.a.a(i15);
            }
            return null;
        }

        private static <T extends View> c d(ViewSizeResolver<T> viewSizeResolver) {
            ViewGroup.LayoutParams layoutParams = viewSizeResolver.c().getLayoutParams();
            return c(viewSizeResolver, layoutParams == null ? -1 : layoutParams.height, viewSizeResolver.c().getHeight(), viewSizeResolver.d() ? viewSizeResolver.c().getPaddingTop() + viewSizeResolver.c().getPaddingBottom() : 0);
        }

        /* access modifiers changed from: private */
        public static <T extends View> g e(ViewSizeResolver<T> viewSizeResolver) {
            c d11;
            c f11 = f(viewSizeResolver);
            if (f11 == null || (d11 = d(viewSizeResolver)) == null) {
                return null;
            }
            return new g(f11, d11);
        }

        private static <T extends View> c f(ViewSizeResolver<T> viewSizeResolver) {
            ViewGroup.LayoutParams layoutParams = viewSizeResolver.c().getLayoutParams();
            return c(viewSizeResolver, layoutParams == null ? -1 : layoutParams.width, viewSizeResolver.c().getWidth(), viewSizeResolver.d() ? viewSizeResolver.c().getPaddingLeft() + viewSizeResolver.c().getPaddingRight() : 0);
        }

        /* access modifiers changed from: private */
        public static <T extends View> void g(ViewSizeResolver<T> viewSizeResolver, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            } else {
                viewSizeResolver.c().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        }

        public static <T extends View> Object h(ViewSizeResolver<T> viewSizeResolver, fp0.c<? super g> cVar) {
            g e11 = e(viewSizeResolver);
            if (e11 != null) {
                return e11;
            }
            o oVar = new o(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            oVar.w();
            ViewTreeObserver viewTreeObserver = viewSizeResolver.c().getViewTreeObserver();
            a aVar = new a(viewSizeResolver, viewTreeObserver, oVar);
            viewTreeObserver.addOnPreDrawListener(aVar);
            oVar.N(new ViewSizeResolver$size$3$1(viewSizeResolver, viewTreeObserver, aVar));
            Object t = oVar.t();
            if (t == b.d()) {
                f.c(cVar);
            }
            return t;
        }
    }

    T c();

    boolean d();
}
