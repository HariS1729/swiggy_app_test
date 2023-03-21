package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.r;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Ref$ObjectRef;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {391}, m = "invokeSuspend")
/* compiled from: WindowRecomposer.android.kt */
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f7225a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f7226b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<s0> f7227c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Recomposer f7228d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ r f7229e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 f7230f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ View f7231g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(Ref$ObjectRef<s0> ref$ObjectRef, Recomposer recomposer, r rVar, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, c<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1> cVar) {
        super(2, cVar);
        this.f7227c = ref$ObjectRef;
        this.f7228d = recomposer;
        this.f7229e = rVar;
        this.f7230f = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.f7231g = view;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.f7227c, this.f7228d, this.f7229e, this.f7230f, this.f7231g, cVar);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.f7226b = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r11.f7225a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.lang.Object r0 = r11.f7226b
            wp0.k1 r0 = (wp0.k1) r0
            bp0.g.b(r12)     // Catch:{ all -> 0x0014 }
            goto L_0x006c
        L_0x0014:
            r12 = move-exception
            goto L_0x0086
        L_0x0017:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001f:
            bp0.g.b(r12)
            java.lang.Object r12 = r11.f7226b
            r4 = r12
            wp0.j0 r4 = (wp0.j0) r4
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.platform.s0> r12 = r11.f7227c     // Catch:{ all -> 0x0084 }
            T r12 = r12.f25666a     // Catch:{ all -> 0x0084 }
            androidx.compose.ui.platform.s0 r12 = (androidx.compose.ui.platform.s0) r12     // Catch:{ all -> 0x0084 }
            if (r12 == 0) goto L_0x005d
            android.view.View r1 = r11.f7231g     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = "context.applicationContext"
            kotlin.jvm.internal.p.i(r1, r5)     // Catch:{ all -> 0x0084 }
            kotlinx.coroutines.flow.r r1 = androidx.compose.ui.platform.WindowRecomposer_androidKt.e(r1)     // Catch:{ all -> 0x0084 }
            java.lang.Object r5 = r1.getValue()     // Catch:{ all -> 0x0084 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x0084 }
            float r5 = r5.floatValue()     // Catch:{ all -> 0x0084 }
            r12.c(r5)     // Catch:{ all -> 0x0084 }
            r5 = 0
            r6 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1     // Catch:{ all -> 0x0084 }
            r7.<init>(r1, r12, r3)     // Catch:{ all -> 0x0084 }
            r8 = 3
            r9 = 0
            wp0.k1 r12 = wp0.j.d(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0084 }
            goto L_0x005e
        L_0x005d:
            r12 = r3
        L_0x005e:
            androidx.compose.runtime.Recomposer r1 = r11.f7228d     // Catch:{ all -> 0x007f }
            r11.f7226b = r12     // Catch:{ all -> 0x007f }
            r11.f7225a = r2     // Catch:{ all -> 0x007f }
            java.lang.Object r1 = r1.k0(r11)     // Catch:{ all -> 0x007f }
            if (r1 != r0) goto L_0x006b
            return r0
        L_0x006b:
            r0 = r12
        L_0x006c:
            if (r0 == 0) goto L_0x0071
            wp0.k1.a.a(r0, r3, r2, r3)
        L_0x0071:
            androidx.lifecycle.r r12 = r11.f7229e
            androidx.lifecycle.Lifecycle r12 = r12.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r11.f7230f
            r12.c(r0)
            bp0.k r12 = bp0.k.f22762a
            return r12
        L_0x007f:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
            goto L_0x0086
        L_0x0084:
            r12 = move-exception
            r0 = r3
        L_0x0086:
            if (r0 == 0) goto L_0x008b
            wp0.k1.a.a(r0, r3, r2, r3)
        L_0x008b:
            androidx.lifecycle.r r0 = r11.f7229e
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r1 = r11.f7230f
            r0.c(r1)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
