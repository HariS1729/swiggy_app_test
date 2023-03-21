package androidx.compose.ui.platform;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
final class DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 extends Lambda implements l<Object, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 f7142a = new DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1();

    DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1() {
        super(1);
    }

    /* renamed from: a */
    public final Boolean invoke(Object obj) {
        p.j(obj, "it");
        return Boolean.valueOf(DisposableSaveableStateRegistry_androidKt.e(obj));
    }
}
