package androidx.compose.foundation;

import android.view.KeyEvent;
import bp0.k;
import d1.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;

/* compiled from: Clickable.kt */
final class ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1 extends Lambda implements l<b, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f2939a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a<k> f2940b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1(boolean z11, a<k> aVar) {
        super(1);
        this.f2939a = z11;
        this.f2940b = aVar;
    }

    public final Boolean a(KeyEvent keyEvent) {
        boolean z11;
        p.j(keyEvent, "it");
        if (!this.f2939a || !Clickable_androidKt.c(keyEvent)) {
            z11 = false;
        } else {
            this.f2940b.invoke();
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((b) obj).f());
    }
}
