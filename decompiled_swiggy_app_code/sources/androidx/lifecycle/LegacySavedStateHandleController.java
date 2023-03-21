package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import n3.b;
import n3.d;

class LegacySavedStateHandleController {

    static final class a implements b.a {
        a() {
        }

        public void a(d dVar) {
            if (dVar instanceof p0) {
                o0 viewModelStore = ((p0) dVar).getViewModelStore();
                b savedStateRegistry = dVar.getSavedStateRegistry();
                for (String b11 : viewModelStore.c()) {
                    LegacySavedStateHandleController.a(viewModelStore.b(b11), savedStateRegistry, dVar.getLifecycle());
                }
                if (!viewModelStore.c().isEmpty()) {
                    savedStateRegistry.i(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    static void a(j0 j0Var, b bVar, Lifecycle lifecycle) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) j0Var.h1("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.e()) {
            savedStateHandleController.a(bVar, lifecycle);
            c(bVar, lifecycle);
        }
    }

    static SavedStateHandleController b(b bVar, Lifecycle lifecycle, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, d0.c(bVar.b(str), bundle));
        savedStateHandleController.a(bVar, lifecycle);
        c(bVar, lifecycle);
        return savedStateHandleController;
    }

    private static void c(final b bVar, final Lifecycle lifecycle) {
        Lifecycle.State b11 = lifecycle.b();
        if (b11 == Lifecycle.State.INITIALIZED || b11.isAtLeast(Lifecycle.State.STARTED)) {
            bVar.i(a.class);
        } else {
            lifecycle.a(new o() {
                public void b(r rVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_START) {
                        Lifecycle.this.c(this);
                        bVar.i(a.class);
                    }
                }
            });
        }
    }
}
