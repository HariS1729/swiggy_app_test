package p3;

import android.content.Context;
import android.net.Uri;
import androidx.slice.Slice;
import androidx.slice.SliceSpec;
import androidx.slice.c;
import java.util.ArrayList;
import java.util.List;
import o3.a;
import o3.b;
import o3.g;
import q3.d;

/* compiled from: TemplateSliceBuilder */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private final Slice.a f16230a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f16231b;

    /* renamed from: c  reason: collision with root package name */
    private final d f16232c;

    /* renamed from: d  reason: collision with root package name */
    private List<SliceSpec> f16233d;

    public e(Context context, Uri uri) {
        this.f16230a = new Slice.a(uri);
        this.f16231b = context;
        this.f16233d = d(uri);
        d e11 = e();
        this.f16232c = e11;
        if (e11 != null) {
            f(e11);
            return;
        }
        throw new IllegalArgumentException("No valid specs found");
    }

    private List<SliceSpec> d(Uri uri) {
        if (c.e() != null) {
            return new ArrayList(c.e());
        }
        return new ArrayList(b.a(this.f16231b).c(uri));
    }

    /* access modifiers changed from: protected */
    public boolean a(SliceSpec sliceSpec) {
        int size = this.f16233d.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f16233d.get(i11).a(sliceSpec)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Slice.a b() {
        return this.f16230a;
    }

    /* access modifiers changed from: protected */
    public a c() {
        if (c.d() != null) {
            return c.d();
        }
        return new g();
    }

    /* access modifiers changed from: protected */
    public abstract d e();

    /* access modifiers changed from: package-private */
    public abstract void f(d dVar);
}
