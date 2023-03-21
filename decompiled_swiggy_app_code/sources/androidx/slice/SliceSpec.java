package androidx.slice;

import z3.b;

public final class SliceSpec implements b {

    /* renamed from: a  reason: collision with root package name */
    String f11729a;

    /* renamed from: b  reason: collision with root package name */
    int f11730b;

    public SliceSpec() {
        this.f11730b = 1;
    }

    public boolean a(SliceSpec sliceSpec) {
        if (this.f11729a.equals(sliceSpec.f11729a) && this.f11730b >= sliceSpec.f11730b) {
            return true;
        }
        return false;
    }

    public int b() {
        return this.f11730b;
    }

    public String c() {
        return this.f11729a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SliceSpec)) {
            return false;
        }
        SliceSpec sliceSpec = (SliceSpec) obj;
        if (!this.f11729a.equals(sliceSpec.f11729a) || this.f11730b != sliceSpec.f11730b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f11729a.hashCode() + this.f11730b;
    }

    public String toString() {
        return String.format("SliceSpec{%s,%d}", new Object[]{this.f11729a, Integer.valueOf(this.f11730b)});
    }

    public SliceSpec(String str, int i11) {
        this.f11729a = str;
        this.f11730b = i11;
    }
}
