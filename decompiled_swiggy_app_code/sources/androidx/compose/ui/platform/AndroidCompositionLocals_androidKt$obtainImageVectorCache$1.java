package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AndroidCompositionLocals.android.kt */
final class AndroidCompositionLocals_androidKt$obtainImageVectorCache$1 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f7066a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AndroidCompositionLocals_androidKt.a f7067b;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f7068a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AndroidCompositionLocals_androidKt.a f7069b;

        public a(Context context, AndroidCompositionLocals_androidKt.a aVar) {
            this.f7068a = context;
            this.f7069b = aVar;
        }

        public void dispose() {
            this.f7068a.getApplicationContext().unregisterComponentCallbacks(this.f7069b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(Context context, AndroidCompositionLocals_androidKt.a aVar) {
        super(1);
        this.f7066a = context;
        this.f7067b = aVar;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        this.f7066a.getApplicationContext().registerComponentCallbacks(this.f7067b);
        return new a(this.f7066a, this.f7067b);
    }
}
