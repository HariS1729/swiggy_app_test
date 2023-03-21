package di0;

import android.content.Intent;
import kotlin.jvm.internal.p;

/* compiled from: ActivityResultData.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f18256a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18257b;

    /* renamed from: c  reason: collision with root package name */
    private final Intent f18258c;

    public a(int i11, int i12, Intent intent) {
        this.f18256a = i11;
        this.f18257b = i12;
        this.f18258c = intent;
    }

    public final int a() {
        return this.f18256a;
    }

    public final int b() {
        return this.f18257b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18256a == aVar.f18256a && this.f18257b == aVar.f18257b && p.e(this.f18258c, aVar.f18258c);
    }

    public int hashCode() {
        int i11 = ((this.f18256a * 31) + this.f18257b) * 31;
        Intent intent = this.f18258c;
        return i11 + (intent == null ? 0 : intent.hashCode());
    }

    public String toString() {
        return "ActivityResultData(requestCode=" + this.f18256a + ", resultCode=" + this.f18257b + ", data=" + this.f18258c + ')';
    }
}
