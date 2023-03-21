package s0;

import androidx.compose.ui.focus.FocusModifier;
import f0.e;
import kotlin.jvm.internal.i;

/* compiled from: FocusRequester.kt */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16587b = new a((i) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16588c = e.f14468d;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final o f16589d = new o();

    /* renamed from: a  reason: collision with root package name */
    private final e<q> f16590a = new e<>(new q[16], 0);

    /* compiled from: FocusRequester.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final o a() {
            return o.f16589d;
        }
    }

    public final e<q> b() {
        return this.f16590a;
    }

    public final void c() {
        if (this.f16590a.p()) {
            e<q> eVar = this.f16590a;
            int m11 = eVar.m();
            if (m11 > 0) {
                int i11 = 0;
                Object[] l11 = eVar.l();
                do {
                    FocusModifier d11 = ((q) l11[i11]).d();
                    if (d11 != null) {
                        s.h(d11);
                    }
                    i11++;
                } while (i11 < m11);
                return;
            }
            return;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }
}
