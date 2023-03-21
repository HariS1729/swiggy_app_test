package androidx.compose.ui.platform;

import androidx.compose.ui.R;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import bp0.k;
import e0.g;
import e0.h;
import lp0.p;

/* compiled from: Wrapper.android.kt */
final class WrappedComposition implements h, o {

    /* renamed from: a  reason: collision with root package name */
    private final AndroidComposeView f7244a;

    /* renamed from: b  reason: collision with root package name */
    private final h f7245b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f7246c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Lifecycle f7247d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public p<? super g, ? super Integer, k> f7248e = ComposableSingletons$Wrapper_androidKt.f7097a.a();

    public WrappedComposition(AndroidComposeView androidComposeView, h hVar) {
        kotlin.jvm.internal.p.j(androidComposeView, "owner");
        kotlin.jvm.internal.p.j(hVar, "original");
        this.f7244a = androidComposeView;
        this.f7245b = hVar;
    }

    public void b(r rVar, Lifecycle.Event event) {
        kotlin.jvm.internal.p.j(rVar, "source");
        kotlin.jvm.internal.p.j(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else if (event == Lifecycle.Event.ON_CREATE && !this.f7246c) {
            c(this.f7248e);
        }
    }

    public void c(p<? super g, ? super Integer, k> pVar) {
        kotlin.jvm.internal.p.j(pVar, "content");
        this.f7244a.setOnViewTreeOwnersAvailable(new WrappedComposition$setContent$1(this, pVar));
    }

    public void dispose() {
        if (!this.f7246c) {
            this.f7246c = true;
            this.f7244a.getView().setTag(R.id.wrapped_composition_tag, (Object) null);
            Lifecycle lifecycle = this.f7247d;
            if (lifecycle != null) {
                lifecycle.c(this);
            }
        }
        this.f7245b.dispose();
    }

    public boolean isDisposed() {
        return this.f7245b.isDisposed();
    }

    public boolean s() {
        return this.f7245b.s();
    }

    public final h x() {
        return this.f7245b;
    }

    public final AndroidComposeView y() {
        return this.f7244a;
    }
}
