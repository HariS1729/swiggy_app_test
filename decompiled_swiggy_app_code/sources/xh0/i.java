package xh0;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.d;
import in.swiggy.android.swiggylynx.model.DeliveryRatingClickEventNavArgs;
import in.swiggy.android.swiggylynx.ui.LynxData;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* compiled from: LynxFragmentArgs.kt */
public final class i implements d {
    public static final a Companion = new a((kotlin.jvm.internal.i) null);

    /* renamed from: a  reason: collision with root package name */
    private final LynxData f19997a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f19998b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19999c;

    /* renamed from: d  reason: collision with root package name */
    private final DeliveryRatingClickEventNavArgs f20000d;

    /* compiled from: LynxFragmentArgs.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: in.swiggy.android.swiggylynx.model.DeliveryRatingClickEventNavArgs} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final xh0.i a(android.os.Bundle r8) {
            /*
                r7 = this;
                java.lang.String r0 = "bundle"
                kotlin.jvm.internal.p.j(r8, r0)
                java.lang.Class<xh0.i> r0 = xh0.i.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                r8.setClassLoader(r0)
                java.lang.String r0 = "lynxData"
                boolean r1 = r8.containsKey(r0)
                if (r1 == 0) goto L_0x00a4
                java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
                java.lang.Class<in.swiggy.android.swiggylynx.ui.LynxData> r2 = in.swiggy.android.swiggylynx.ui.LynxData.class
                boolean r1 = r1.isAssignableFrom(r2)
                java.lang.String r2 = " must implement Parcelable or Serializable or must be an Enum."
                if (r1 != 0) goto L_0x003d
                java.lang.Class<java.io.Serializable> r1 = java.io.Serializable.class
                java.lang.Class<in.swiggy.android.swiggylynx.ui.LynxData> r3 = in.swiggy.android.swiggylynx.ui.LynxData.class
                boolean r1 = r1.isAssignableFrom(r3)
                if (r1 == 0) goto L_0x002d
                goto L_0x003d
            L_0x002d:
                java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
                java.lang.Class<in.swiggy.android.swiggylynx.ui.LynxData> r0 = in.swiggy.android.swiggylynx.ui.LynxData.class
                java.lang.String r0 = r0.getName()
                java.lang.String r0 = kotlin.jvm.internal.p.s(r0, r2)
                r8.<init>(r0)
                throw r8
            L_0x003d:
                java.lang.Object r0 = r8.get(r0)
                in.swiggy.android.swiggylynx.ui.LynxData r0 = (in.swiggy.android.swiggylynx.ui.LynxData) r0
                if (r0 == 0) goto L_0x009c
                java.lang.String r1 = "isFullScreen"
                boolean r3 = r8.containsKey(r1)
                if (r3 == 0) goto L_0x0052
                boolean r1 = r8.getBoolean(r1)
                goto L_0x0053
            L_0x0052:
                r1 = 0
            L_0x0053:
                java.lang.String r3 = "nextStepData"
                boolean r4 = r8.containsKey(r3)
                r5 = 0
                if (r4 == 0) goto L_0x0061
                java.lang.String r3 = r8.getString(r3)
                goto L_0x0062
            L_0x0061:
                r3 = r5
            L_0x0062:
                java.lang.String r4 = "delivery_rating_click_event_args"
                boolean r6 = r8.containsKey(r4)
                if (r6 == 0) goto L_0x0096
                java.lang.Class<android.os.Parcelable> r5 = android.os.Parcelable.class
                java.lang.Class<in.swiggy.android.swiggylynx.model.DeliveryRatingClickEventNavArgs> r6 = in.swiggy.android.swiggylynx.model.DeliveryRatingClickEventNavArgs.class
                boolean r5 = r5.isAssignableFrom(r6)
                if (r5 != 0) goto L_0x008f
                java.lang.Class<java.io.Serializable> r5 = java.io.Serializable.class
                java.lang.Class<in.swiggy.android.swiggylynx.model.DeliveryRatingClickEventNavArgs> r6 = in.swiggy.android.swiggylynx.model.DeliveryRatingClickEventNavArgs.class
                boolean r5 = r5.isAssignableFrom(r6)
                if (r5 == 0) goto L_0x007f
                goto L_0x008f
            L_0x007f:
                java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
                java.lang.Class<in.swiggy.android.swiggylynx.model.DeliveryRatingClickEventNavArgs> r0 = in.swiggy.android.swiggylynx.model.DeliveryRatingClickEventNavArgs.class
                java.lang.String r0 = r0.getName()
                java.lang.String r0 = kotlin.jvm.internal.p.s(r0, r2)
                r8.<init>(r0)
                throw r8
            L_0x008f:
                java.lang.Object r8 = r8.get(r4)
                r5 = r8
                in.swiggy.android.swiggylynx.model.DeliveryRatingClickEventNavArgs r5 = (in.swiggy.android.swiggylynx.model.DeliveryRatingClickEventNavArgs) r5
            L_0x0096:
                xh0.i r8 = new xh0.i
                r8.<init>(r0, r1, r3, r5)
                return r8
            L_0x009c:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Argument \"lynxData\" is marked as non-null but was passed a null value."
                r8.<init>(r0)
                throw r8
            L_0x00a4:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Required argument \"lynxData\" is missing and does not have an android:defaultValue"
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: xh0.i.a.a(android.os.Bundle):xh0.i");
        }
    }

    public i(LynxData lynxData, boolean z11, String str, DeliveryRatingClickEventNavArgs deliveryRatingClickEventNavArgs) {
        p.j(lynxData, "lynxData");
        this.f19997a = lynxData;
        this.f19998b = z11;
        this.f19999c = str;
        this.f20000d = deliveryRatingClickEventNavArgs;
    }

    public static final i fromBundle(Bundle bundle) {
        return Companion.a(bundle);
    }

    public final LynxData a() {
        return this.f19997a;
    }

    public final String b() {
        return this.f19999c;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(LynxData.class)) {
            bundle.putParcelable("lynxData", this.f19997a);
        } else if (Serializable.class.isAssignableFrom(LynxData.class)) {
            bundle.putSerializable("lynxData", (Serializable) this.f19997a);
        } else {
            throw new UnsupportedOperationException(p.s(LynxData.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putBoolean("isFullScreen", this.f19998b);
        bundle.putString("nextStepData", this.f19999c);
        if (Parcelable.class.isAssignableFrom(DeliveryRatingClickEventNavArgs.class)) {
            bundle.putParcelable("delivery_rating_click_event_args", this.f20000d);
        } else if (Serializable.class.isAssignableFrom(DeliveryRatingClickEventNavArgs.class)) {
            bundle.putSerializable("delivery_rating_click_event_args", (Serializable) this.f20000d);
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p.e(this.f19997a, iVar.f19997a) && this.f19998b == iVar.f19998b && p.e(this.f19999c, iVar.f19999c) && p.e(this.f20000d, iVar.f20000d);
    }

    public int hashCode() {
        int hashCode = this.f19997a.hashCode() * 31;
        boolean z11 = this.f19998b;
        if (z11) {
            z11 = true;
        }
        int i11 = (hashCode + (z11 ? 1 : 0)) * 31;
        String str = this.f19999c;
        int i12 = 0;
        int hashCode2 = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        DeliveryRatingClickEventNavArgs deliveryRatingClickEventNavArgs = this.f20000d;
        if (deliveryRatingClickEventNavArgs != null) {
            i12 = deliveryRatingClickEventNavArgs.hashCode();
        }
        return hashCode2 + i12;
    }

    public String toString() {
        return "LynxFragmentArgs(lynxData=" + this.f19997a + ", isFullScreen=" + this.f19998b + ", nextStepData=" + this.f19999c + ", deliveryRatingClickEventArgs=" + this.f20000d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(LynxData lynxData, boolean z11, String str, DeliveryRatingClickEventNavArgs deliveryRatingClickEventNavArgs, int i11, kotlin.jvm.internal.i iVar) {
        this(lynxData, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : deliveryRatingClickEventNavArgs);
    }
}
