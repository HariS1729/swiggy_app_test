package wh0;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.d;
import in.swiggy.android.swiggylynx.model.DeliveryRatingClickEventNavArgs;
import in.swiggy.android.swiggylynx.ui.LynxData;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LynxActivityArgs.kt */
public final class j implements d {
    public static final a Companion = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final LynxData f19955a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f19956b;

    /* renamed from: c  reason: collision with root package name */
    private final DeliveryRatingClickEventNavArgs f19957c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19958d;

    /* renamed from: e  reason: collision with root package name */
    private final String f19959e;

    /* renamed from: f  reason: collision with root package name */
    private final String f19960f;

    /* renamed from: g  reason: collision with root package name */
    private final String f19961g;

    /* compiled from: LynxActivityArgs.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final j a(Bundle bundle) {
            DeliveryRatingClickEventNavArgs deliveryRatingClickEventNavArgs;
            p.j(bundle, "bundle");
            bundle.setClassLoader(j.class.getClassLoader());
            if (!bundle.containsKey("lynxData")) {
                throw new IllegalArgumentException("Required argument \"lynxData\" is missing and does not have an android:defaultValue");
            } else if (Parcelable.class.isAssignableFrom(LynxData.class) || Serializable.class.isAssignableFrom(LynxData.class)) {
                LynxData lynxData = (LynxData) bundle.get("lynxData");
                if (lynxData != null) {
                    boolean z11 = bundle.containsKey("isFullScreen") ? bundle.getBoolean("isFullScreen") : false;
                    if (!bundle.containsKey("delivery_rating_click_event_args")) {
                        deliveryRatingClickEventNavArgs = null;
                    } else if (Parcelable.class.isAssignableFrom(DeliveryRatingClickEventNavArgs.class) || Serializable.class.isAssignableFrom(DeliveryRatingClickEventNavArgs.class)) {
                        deliveryRatingClickEventNavArgs = (DeliveryRatingClickEventNavArgs) bundle.get("delivery_rating_click_event_args");
                    } else {
                        throw new UnsupportedOperationException(p.s(DeliveryRatingClickEventNavArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
                    }
                    return new j(lynxData, z11, deliveryRatingClickEventNavArgs, bundle.containsKey("orderJson") ? bundle.getString("orderJson") : null, bundle.containsKey("launchScreen") ? bundle.getString("launchScreen") : null, bundle.containsKey("source") ? bundle.getString("source") : null, bundle.containsKey("title") ? bundle.getString("title") : null);
                }
                throw new IllegalArgumentException("Argument \"lynxData\" is marked as non-null but was passed a null value.");
            } else {
                throw new UnsupportedOperationException(p.s(LynxData.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
        }
    }

    public j(LynxData lynxData, boolean z11, DeliveryRatingClickEventNavArgs deliveryRatingClickEventNavArgs, String str, String str2, String str3, String str4) {
        p.j(lynxData, "lynxData");
        this.f19955a = lynxData;
        this.f19956b = z11;
        this.f19957c = deliveryRatingClickEventNavArgs;
        this.f19958d = str;
        this.f19959e = str2;
        this.f19960f = str3;
        this.f19961g = str4;
    }

    public static final j fromBundle(Bundle bundle) {
        return Companion.a(bundle);
    }

    public final DeliveryRatingClickEventNavArgs a() {
        return this.f19957c;
    }

    public final String b() {
        return this.f19959e;
    }

    public final LynxData c() {
        return this.f19955a;
    }

    public final String d() {
        return this.f19958d;
    }

    public final String e() {
        return this.f19960f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p.e(this.f19955a, jVar.f19955a) && this.f19956b == jVar.f19956b && p.e(this.f19957c, jVar.f19957c) && p.e(this.f19958d, jVar.f19958d) && p.e(this.f19959e, jVar.f19959e) && p.e(this.f19960f, jVar.f19960f) && p.e(this.f19961g, jVar.f19961g);
    }

    public final String f() {
        return this.f19961g;
    }

    public final boolean g() {
        return this.f19956b;
    }

    public final Bundle h() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(LynxData.class)) {
            bundle.putParcelable("lynxData", this.f19955a);
        } else if (Serializable.class.isAssignableFrom(LynxData.class)) {
            bundle.putSerializable("lynxData", (Serializable) this.f19955a);
        } else {
            throw new UnsupportedOperationException(p.s(LynxData.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putBoolean("isFullScreen", this.f19956b);
        if (Parcelable.class.isAssignableFrom(DeliveryRatingClickEventNavArgs.class)) {
            bundle.putParcelable("delivery_rating_click_event_args", this.f19957c);
        } else if (Serializable.class.isAssignableFrom(DeliveryRatingClickEventNavArgs.class)) {
            bundle.putSerializable("delivery_rating_click_event_args", (Serializable) this.f19957c);
        }
        bundle.putString("orderJson", this.f19958d);
        bundle.putString("launchScreen", this.f19959e);
        bundle.putString("source", this.f19960f);
        bundle.putString("title", this.f19961g);
        return bundle;
    }

    public int hashCode() {
        int hashCode = this.f19955a.hashCode() * 31;
        boolean z11 = this.f19956b;
        if (z11) {
            z11 = true;
        }
        int i11 = (hashCode + (z11 ? 1 : 0)) * 31;
        DeliveryRatingClickEventNavArgs deliveryRatingClickEventNavArgs = this.f19957c;
        int i12 = 0;
        int hashCode2 = (i11 + (deliveryRatingClickEventNavArgs == null ? 0 : deliveryRatingClickEventNavArgs.hashCode())) * 31;
        String str = this.f19958d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19959e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19960f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19961g;
        if (str4 != null) {
            i12 = str4.hashCode();
        }
        return hashCode5 + i12;
    }

    public String toString() {
        return "LynxActivityArgs(lynxData=" + this.f19955a + ", isFullScreen=" + this.f19956b + ", deliveryRatingClickEventArgs=" + this.f19957c + ", orderJson=" + this.f19958d + ", launchScreen=" + this.f19959e + ", source=" + this.f19960f + ", title=" + this.f19961g + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ j(in.swiggy.android.swiggylynx.ui.LynxData r8, boolean r9, in.swiggy.android.swiggylynx.model.DeliveryRatingClickEventNavArgs r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, kotlin.jvm.internal.i r16) {
        /*
            r7 = this;
            r0 = r15 & 2
            if (r0 == 0) goto L_0x0006
            r0 = 0
            goto L_0x0007
        L_0x0006:
            r0 = r9
        L_0x0007:
            r1 = r15 & 4
            r2 = 0
            if (r1 == 0) goto L_0x000e
            r1 = r2
            goto L_0x000f
        L_0x000e:
            r1 = r10
        L_0x000f:
            r3 = r15 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r2
            goto L_0x0016
        L_0x0015:
            r3 = r11
        L_0x0016:
            r4 = r15 & 16
            if (r4 == 0) goto L_0x001c
            r4 = r2
            goto L_0x001d
        L_0x001c:
            r4 = r12
        L_0x001d:
            r5 = r15 & 32
            if (r5 == 0) goto L_0x0023
            r5 = r2
            goto L_0x0024
        L_0x0023:
            r5 = r13
        L_0x0024:
            r6 = r15 & 64
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r2 = r14
        L_0x002a:
            r9 = r7
            r10 = r8
            r11 = r0
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wh0.j.<init>(in.swiggy.android.swiggylynx.ui.LynxData, boolean, in.swiggy.android.swiggylynx.model.DeliveryRatingClickEventNavArgs, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
