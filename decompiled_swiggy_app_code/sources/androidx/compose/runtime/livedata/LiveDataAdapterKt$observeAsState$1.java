package androidx.compose.runtime.livedata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.z;
import e0.h0;
import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: LiveDataAdapter.kt */
final class LiveDataAdapterKt$observeAsState$1 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveData<T> f6173a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.r f6174b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h0<R> f6175c;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveData f6176a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z f6177b;

        public a(LiveData liveData, z zVar) {
            this.f6176a = liveData;
            this.f6177b = zVar;
        }

        public void dispose() {
            this.f6176a.o(this.f6177b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LiveDataAdapterKt$observeAsState$1(LiveData<T> liveData, androidx.lifecycle.r rVar, h0<R> h0Var) {
        super(1);
        this.f6173a = liveData;
        this.f6174b = rVar;
        this.f6175c = h0Var;
    }

    /* access modifiers changed from: private */
    public static final void c(h0 h0Var, Object obj) {
        p.j(h0Var, "$state");
        h0Var.setValue(obj);
    }

    /* renamed from: b */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        a aVar = new a(this.f6175c);
        this.f6173a.j(this.f6174b, aVar);
        return new a(this.f6173a, aVar);
    }
}
