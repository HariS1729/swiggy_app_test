package coil.decode;

import android.graphics.BitmapFactory;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import o6.c;

/* compiled from: BitmapFactoryDecoder.kt */
final class BitmapFactoryDecoder$decode$2$1 extends Lambda implements a<c> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BitmapFactoryDecoder f13509a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BitmapFactoryDecoder$decode$2$1(BitmapFactoryDecoder bitmapFactoryDecoder) {
        super(0);
        this.f13509a = bitmapFactoryDecoder;
    }

    /* renamed from: a */
    public final c invoke() {
        return this.f13509a.e(new BitmapFactory.Options());
    }
}
