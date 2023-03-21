package androidx.compose.ui.platform;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q0;
import androidx.lifecycle.r;
import bp0.k;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.p;

/* compiled from: ViewCompositionStrategy.android.kt */
public interface ViewCompositionStrategy {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7175a = a.f7188a;

    /* compiled from: ViewCompositionStrategy.android.kt */
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {

        /* renamed from: b  reason: collision with root package name */
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool f7176b = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        /* compiled from: ViewCompositionStrategy.android.kt */
        public static final class a implements View.OnAttachStateChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f7177a;

            a(AbstractComposeView abstractComposeView) {
                this.f7177a = abstractComposeView;
            }

            public void onViewAttachedToWindow(View view) {
                p.j(view, "v");
            }

            public void onViewDetachedFromWindow(View view) {
                p.j(view, "v");
                if (!u2.a.d(this.f7177a)) {
                    this.f7177a.e();
                }
            }
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        static final class b implements u2.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f7178a;

            b(AbstractComposeView abstractComposeView) {
                this.f7178a = abstractComposeView;
            }
        }

        private DisposeOnDetachedFromWindowOrReleasedFromPool() {
        }

        public lp0.a<k> a(AbstractComposeView abstractComposeView) {
            p.j(abstractComposeView, "view");
            a aVar = new a(abstractComposeView);
            abstractComposeView.addOnAttachStateChangeListener(aVar);
            b bVar = new b(abstractComposeView);
            u2.a.a(abstractComposeView, bVar);
            return new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(abstractComposeView, aVar, bVar);
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {

        /* renamed from: b  reason: collision with root package name */
        public static final DisposeOnViewTreeLifecycleDestroyed f7182b = new DisposeOnViewTreeLifecycleDestroyed();

        /* compiled from: ViewCompositionStrategy.android.kt */
        public static final class a implements View.OnAttachStateChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f7183a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Ref$ObjectRef<lp0.a<k>> f7184b;

            a(AbstractComposeView abstractComposeView, Ref$ObjectRef<lp0.a<k>> ref$ObjectRef) {
                this.f7183a = abstractComposeView;
                this.f7184b = ref$ObjectRef;
            }

            public void onViewAttachedToWindow(View view) {
                p.j(view, "v");
                r a11 = q0.a(this.f7183a);
                AbstractComposeView abstractComposeView = this.f7183a;
                if (a11 != null) {
                    p.i(a11, "checkNotNull(ViewTreeLif…                        }");
                    Ref$ObjectRef<lp0.a<k>> ref$ObjectRef = this.f7184b;
                    AbstractComposeView abstractComposeView2 = this.f7183a;
                    Lifecycle lifecycle = a11.getLifecycle();
                    p.i(lifecycle, "lco.lifecycle");
                    ref$ObjectRef.f25666a = ViewCompositionStrategy_androidKt.c(abstractComposeView2, lifecycle);
                    this.f7183a.removeOnAttachStateChangeListener(this);
                    return;
                }
                throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
            }

            public void onViewDetachedFromWindow(View view) {
                p.j(view, "v");
            }
        }

        private DisposeOnViewTreeLifecycleDestroyed() {
        }

        public lp0.a<k> a(AbstractComposeView abstractComposeView) {
            p.j(abstractComposeView, "view");
            if (abstractComposeView.isAttachedToWindow()) {
                r a11 = q0.a(abstractComposeView);
                if (a11 != null) {
                    p.i(a11, "checkNotNull(ViewTreeLif…eOwner\"\n                }");
                    Lifecycle lifecycle = a11.getLifecycle();
                    p.i(lifecycle, "lco.lifecycle");
                    return ViewCompositionStrategy_androidKt.c(abstractComposeView, lifecycle);
                }
                throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            a aVar = new a(abstractComposeView, ref$ObjectRef);
            abstractComposeView.addOnAttachStateChangeListener(aVar);
            ref$ObjectRef.f25666a = new ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1(abstractComposeView, aVar);
            return new ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2(ref$ObjectRef);
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f7188a = new a();

        private a() {
        }

        public final ViewCompositionStrategy a() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.f7176b;
        }
    }

    lp0.a<k> a(AbstractComposeView abstractComposeView);
}
