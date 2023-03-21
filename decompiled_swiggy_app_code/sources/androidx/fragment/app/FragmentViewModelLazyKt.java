package androidx.fragment.app;

import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import bp0.f;
import kotlin.jvm.internal.p;
import lp0.a;
import sp0.c;

/* compiled from: FragmentViewModelLazy.kt */
public final class FragmentViewModelLazyKt {
    public static final <VM extends j0> f<VM> a(Fragment fragment, c<VM> cVar, a<? extends o0> aVar, a<? extends l0.b> aVar2) {
        p.j(fragment, "$this$createViewModelLazy");
        p.j(cVar, "viewModelClass");
        p.j(aVar, "storeProducer");
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1(fragment);
        }
        return new ViewModelLazy(cVar, aVar, aVar2);
    }
}
