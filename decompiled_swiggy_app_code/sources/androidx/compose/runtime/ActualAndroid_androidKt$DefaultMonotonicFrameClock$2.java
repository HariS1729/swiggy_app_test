package androidx.compose.runtime;

import android.os.Looper;
import e0.c0;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: ActualAndroid.android.kt */
final class ActualAndroid_androidKt$DefaultMonotonicFrameClock$2 extends Lambda implements a<c0> {

    /* renamed from: a  reason: collision with root package name */
    public static final ActualAndroid_androidKt$DefaultMonotonicFrameClock$2 f5866a = new ActualAndroid_androidKt$DefaultMonotonicFrameClock$2();

    ActualAndroid_androidKt$DefaultMonotonicFrameClock$2() {
        super(0);
    }

    /* renamed from: a */
    public final c0 invoke() {
        if (Looper.getMainLooper() != null) {
            return DefaultChoreographerFrameClock.f5993a;
        }
        return SdkStubsFallbackFrameClock.f6092a;
    }
}
