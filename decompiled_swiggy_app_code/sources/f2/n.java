package f2;

import java.util.ArrayList;
import kotlin.jvm.internal.p;

/* compiled from: ConstraintSetParser.kt */
public final class n implements o {

    /* renamed from: a  reason: collision with root package name */
    private float f14591a;

    /* renamed from: b  reason: collision with root package name */
    private String f14592b;

    /* renamed from: c  reason: collision with root package name */
    private String f14593c;

    /* renamed from: d  reason: collision with root package name */
    private float f14594d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14595e;

    /* renamed from: f  reason: collision with root package name */
    private float f14596f;

    /* renamed from: g  reason: collision with root package name */
    private float f14597g;

    public n(float f11, float f12, float f13, String str, String str2) {
        p.j(str, "prefix");
        p.j(str2, "postfix");
        this.f14591a = f13;
        this.f14592b = str;
        this.f14593c = str2;
        this.f14594d = f11;
        this.f14596f = f11;
        this.f14597g = f12;
    }

    public final ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        float f11 = this.f14596f;
        int i11 = (int) f11;
        int i12 = (int) f11;
        int i13 = (int) this.f14597g;
        if (i12 <= i13) {
            while (true) {
                int i14 = i12 + 1;
                arrayList.add(this.f14592b + i11 + this.f14593c);
                i11 += (int) this.f14591a;
                if (i12 == i13) {
                    break;
                }
                i12 = i14;
            }
        }
        return arrayList;
    }

    public float value() {
        float f11 = this.f14594d;
        if (f11 >= this.f14597g) {
            this.f14595e = true;
        }
        if (!this.f14595e) {
            this.f14594d = f11 + this.f14591a;
        }
        return this.f14594d;
    }
}
