package w3;

import in.swiggy.android.tejas.network.HttpRequest;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* compiled from: Table */
public class c {

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadLocal<CharsetDecoder> f17459c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<Charset> f17460d = new b();

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadLocal<CharBuffer> f17461e = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    protected int f17462a;

    /* renamed from: b  reason: collision with root package name */
    protected ByteBuffer f17463b;

    /* compiled from: Table */
    static class a extends ThreadLocal<CharsetDecoder> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public CharsetDecoder initialValue() {
            return Charset.forName(HttpRequest.CHARSET_UTF8).newDecoder();
        }
    }

    /* compiled from: Table */
    static class b extends ThreadLocal<Charset> {
        b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Charset initialValue() {
            return Charset.forName(HttpRequest.CHARSET_UTF8);
        }
    }

    /* access modifiers changed from: protected */
    public int a(int i11) {
        return i11 + this.f17463b.getInt(i11);
    }

    /* access modifiers changed from: protected */
    public int b(int i11) {
        int i12 = this.f17462a;
        int i13 = i12 - this.f17463b.getInt(i12);
        if (i11 < this.f17463b.getShort(i13)) {
            return this.f17463b.getShort(i13 + i11);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int c(int i11) {
        int i12 = i11 + this.f17462a;
        return i12 + this.f17463b.getInt(i12) + 4;
    }

    /* access modifiers changed from: protected */
    public int d(int i11) {
        int i12 = i11 + this.f17462a;
        return this.f17463b.getInt(i12 + this.f17463b.getInt(i12));
    }
}
