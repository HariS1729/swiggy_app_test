package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.p;

/* compiled from: WindowRecomposer.android.kt */
public interface x1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7391a = a.f7392a;

    /* compiled from: WindowRecomposer.android.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f7392a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final x1 f7393b = C0024a.f7394b;

        /* renamed from: androidx.compose.ui.platform.x1$a$a  reason: collision with other inner class name */
        /* compiled from: WindowRecomposer.android.kt */
        static final class C0024a implements x1 {

            /* renamed from: b  reason: collision with root package name */
            public static final C0024a f7394b = new C0024a();

            C0024a() {
            }

            public final Recomposer a(View view) {
                p.j(view, "rootView");
                return WindowRecomposer_androidKt.c(view, (CoroutineContext) null, (Lifecycle) null, 3, (Object) null);
            }
        }

        private a() {
        }

        public final x1 a() {
            return f7393b;
        }
    }

    Recomposer a(View view);
}
