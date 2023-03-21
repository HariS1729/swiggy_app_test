package coil.decode;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "coil.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {210, 32}, m = "decode")
/* compiled from: BitmapFactoryDecoder.kt */
final class BitmapFactoryDecoder$decode$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f13504a;

    /* renamed from: b  reason: collision with root package name */
    Object f13505b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f13506c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BitmapFactoryDecoder f13507d;

    /* renamed from: e  reason: collision with root package name */
    int f13508e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BitmapFactoryDecoder$decode$1(BitmapFactoryDecoder bitmapFactoryDecoder, c<? super BitmapFactoryDecoder$decode$1> cVar) {
        super(cVar);
        this.f13507d = bitmapFactoryDecoder;
    }

    public final Object invokeSuspend(Object obj) {
        this.f13506c = obj;
        this.f13508e |= Integer.MIN_VALUE;
        return this.f13507d.a(this);
    }
}
