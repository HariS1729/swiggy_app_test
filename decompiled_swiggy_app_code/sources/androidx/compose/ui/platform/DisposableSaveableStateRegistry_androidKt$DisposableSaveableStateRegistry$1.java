package androidx.compose.ui.platform;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import n3.b;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
final class DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f7139a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f7140b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f7141c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(boolean z11, b bVar, String str) {
        super(0);
        this.f7139a = z11;
        this.f7140b = bVar;
        this.f7141c = str;
    }

    public final void invoke() {
        if (this.f7139a) {
            this.f7140b.j(this.f7141c);
        }
    }
}
