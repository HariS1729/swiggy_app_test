package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;
import yp0.f;

@d(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {116, 122}, m = "invokeSuspend")
/* compiled from: WindowRecomposer.android.kt */
final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements p<e<? super Float>, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f7236a;

    /* renamed from: b  reason: collision with root package name */
    int f7237b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f7238c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ContentResolver f7239d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Uri f7240e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ WindowRecomposer_androidKt.b f7241f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ f<k> f7242g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ Context f7243h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, WindowRecomposer_androidKt.b bVar, f<k> fVar, Context context, c<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> cVar) {
        super(2, cVar);
        this.f7239d = contentResolver;
        this.f7240e = uri;
        this.f7241f = bVar;
        this.f7242g = fVar;
        this.f7243h = context;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.f7239d, this.f7240e, this.f7241f, this.f7242g, this.f7243h, cVar);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.f7238c = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    public final Object invoke(e<? super Float> eVar, c<? super k> cVar) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056 A[Catch:{ all -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[Catch:{ all -> 0x008f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r9.f7237b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 == r3) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            java.lang.Object r1 = r9.f7236a
            yp0.h r1 = (yp0.h) r1
            java.lang.Object r4 = r9.f7238c
            kotlinx.coroutines.flow.e r4 = (kotlinx.coroutines.flow.e) r4
            bp0.g.b(r10)     // Catch:{ all -> 0x0091 }
            r10 = r4
            goto L_0x0048
        L_0x001b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0023:
            java.lang.Object r1 = r9.f7236a
            yp0.h r1 = (yp0.h) r1
            java.lang.Object r4 = r9.f7238c
            kotlinx.coroutines.flow.e r4 = (kotlinx.coroutines.flow.e) r4
            bp0.g.b(r10)     // Catch:{ all -> 0x0091 }
            r5 = r4
            r4 = r9
            goto L_0x0059
        L_0x0031:
            bp0.g.b(r10)
            java.lang.Object r10 = r9.f7238c
            kotlinx.coroutines.flow.e r10 = (kotlinx.coroutines.flow.e) r10
            android.content.ContentResolver r1 = r9.f7239d
            android.net.Uri r4 = r9.f7240e
            r5 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$b r6 = r9.f7241f
            r1.registerContentObserver(r4, r5, r6)
            yp0.f<bp0.k> r1 = r9.f7242g     // Catch:{ all -> 0x0091 }
            yp0.h r1 = r1.iterator()     // Catch:{ all -> 0x0091 }
        L_0x0048:
            r4 = r9
        L_0x0049:
            r4.f7238c = r10     // Catch:{ all -> 0x008f }
            r4.f7236a = r1     // Catch:{ all -> 0x008f }
            r4.f7237b = r3     // Catch:{ all -> 0x008f }
            java.lang.Object r5 = r1.a(r4)     // Catch:{ all -> 0x008f }
            if (r5 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r8 = r5
            r5 = r10
            r10 = r8
        L_0x0059:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x008f }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x008f }
            if (r10 == 0) goto L_0x0085
            r1.next()     // Catch:{ all -> 0x008f }
            android.content.Context r10 = r4.f7243h     // Catch:{ all -> 0x008f }
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch:{ all -> 0x008f }
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch:{ all -> 0x008f }
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.a.c(r10)     // Catch:{ all -> 0x008f }
            r4.f7238c = r5     // Catch:{ all -> 0x008f }
            r4.f7236a = r1     // Catch:{ all -> 0x008f }
            r4.f7237b = r2     // Catch:{ all -> 0x008f }
            java.lang.Object r10 = r5.emit(r10, r4)     // Catch:{ all -> 0x008f }
            if (r10 != r0) goto L_0x0083
            return r0
        L_0x0083:
            r10 = r5
            goto L_0x0049
        L_0x0085:
            android.content.ContentResolver r10 = r4.f7239d
            androidx.compose.ui.platform.WindowRecomposer_androidKt$b r0 = r4.f7241f
            r10.unregisterContentObserver(r0)
            bp0.k r10 = bp0.k.f22762a
            return r10
        L_0x008f:
            r10 = move-exception
            goto L_0x0093
        L_0x0091:
            r10 = move-exception
            r4 = r9
        L_0x0093:
            android.content.ContentResolver r0 = r4.f7239d
            androidx.compose.ui.platform.WindowRecomposer_androidKt$b r1 = r4.f7241f
            r0.unregisterContentObserver(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
