package androidx.fragment.app;

import androidx.lifecycle.l0;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: FragmentViewModelLazy.kt */
final class FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1 extends Lambda implements a<l0.b> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Fragment f10390a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1(Fragment fragment) {
        super(0);
        this.f10390a = fragment;
    }

    /* renamed from: a */
    public final l0.b invoke() {
        return this.f10390a.getDefaultViewModelProviderFactory();
    }
}
