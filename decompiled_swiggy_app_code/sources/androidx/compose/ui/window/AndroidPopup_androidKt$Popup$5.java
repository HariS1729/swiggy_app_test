package androidx.compose.ui.window;

import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", f = "AndroidPopup.android.kt", l = {299}, m = "invokeSuspend")
/* compiled from: AndroidPopup.android.kt */
final class AndroidPopup_androidKt$Popup$5 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f7808a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f7809b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PopupLayout f7810c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$5(PopupLayout popupLayout, c<? super AndroidPopup_androidKt$Popup$5> cVar) {
        super(2, cVar);
        this.f7810c = popupLayout;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        AndroidPopup_androidKt$Popup$5 androidPopup_androidKt$Popup$5 = new AndroidPopup_androidKt$Popup$5(this.f7810c, cVar);
        androidPopup_androidKt$Popup$5.f7809b = obj;
        return androidPopup_androidKt$Popup$5;
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((AndroidPopup_androidKt$Popup$5) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r4.f7808a
            r2 = 1
            if (r1 == 0) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            java.lang.Object r1 = r4.f7809b
            wp0.j0 r1 = (wp0.j0) r1
            bp0.g.b(r5)
            r5 = r4
            goto L_0x0038
        L_0x0014:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001c:
            bp0.g.b(r5)
            java.lang.Object r5 = r4.f7809b
            wp0.j0 r5 = (wp0.j0) r5
            r1 = r5
            r5 = r4
        L_0x0025:
            boolean r3 = wp0.k0.g(r1)
            if (r3 == 0) goto L_0x003e
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 r3 = androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.AnonymousClass1.f7811a
            r5.f7809b = r1
            r5.f7808a = r2
            java.lang.Object r3 = androidx.compose.ui.platform.InfiniteAnimationPolicyKt.a(r3, r5)
            if (r3 != r0) goto L_0x0038
            return r0
        L_0x0038:
            androidx.compose.ui.window.PopupLayout r3 = r5.f7810c
            r3.o()
            goto L_0x0025
        L_0x003e:
            bp0.k r5 = bp0.k.f22762a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
