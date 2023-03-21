package androidx.slice;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.g;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.brentvatne.react.ReactVideoViewManager;
import com.newrelic.agent.android.util.SafeJsonPrimitive;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Slice extends CustomVersionedParcelable {

    /* renamed from: e  reason: collision with root package name */
    static final String[] f11703e = new String[0];

    /* renamed from: f  reason: collision with root package name */
    static final SliceItem[] f11704f = new SliceItem[0];

    /* renamed from: a  reason: collision with root package name */
    SliceSpec f11705a;

    /* renamed from: b  reason: collision with root package name */
    SliceItem[] f11706b;

    /* renamed from: c  reason: collision with root package name */
    String[] f11707c;

    /* renamed from: d  reason: collision with root package name */
    String f11708d;

    Slice(ArrayList<SliceItem> arrayList, String[] strArr, Uri uri, SliceSpec sliceSpec) {
        this.f11705a = null;
        this.f11706b = f11704f;
        this.f11708d = null;
        this.f11707c = strArr;
        this.f11706b = (SliceItem[]) arrayList.toArray(new SliceItem[arrayList.size()]);
        this.f11708d = uri.toString();
        this.f11705a = sliceSpec;
    }

    public static void a(StringBuilder sb2, String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            sb2.append('(');
            int length = strArr.length - 1;
            for (int i11 = 0; i11 < length; i11++) {
                sb2.append(strArr[i11]);
                sb2.append(", ");
            }
            sb2.append(strArr[length]);
            sb2.append(")");
        }
    }

    static boolean g(IconCompat iconCompat) {
        if (iconCompat == null) {
            return false;
        }
        if (iconCompat.f9244a != 2 || iconCompat.m() != 0) {
            return true;
        }
        throw new IllegalArgumentException("Failed to add icon, invalid resource id: " + iconCompat.m());
    }

    public String[] b() {
        return this.f11707c;
    }

    public List<String> c() {
        return Arrays.asList(this.f11707c);
    }

    public SliceItem[] d() {
        return this.f11706b;
    }

    public SliceSpec e() {
        return this.f11705a;
    }

    public Uri f() {
        return Uri.parse(this.f11708d);
    }

    public void h() {
        for (int length = this.f11706b.length - 1; length >= 0; length--) {
            SliceItem[] sliceItemArr = this.f11706b;
            if (sliceItemArr[length].f11717d == null) {
                SliceItem[] sliceItemArr2 = (SliceItem[]) a.c(SliceItem.class, sliceItemArr, sliceItemArr[length]);
                this.f11706b = sliceItemArr2;
                if (sliceItemArr2 == null) {
                    this.f11706b = new SliceItem[0];
                }
            }
        }
    }

    public void i(boolean z11) {
    }

    public Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putStringArray("hints", this.f11707c);
        Parcelable[] parcelableArr = new Parcelable[this.f11706b.length];
        int i11 = 0;
        while (true) {
            SliceItem[] sliceItemArr = this.f11706b;
            if (i11 >= sliceItemArr.length) {
                break;
            }
            parcelableArr[i11] = sliceItemArr[i11].p();
            i11++;
        }
        bundle.putParcelableArray("items", parcelableArr);
        bundle.putParcelable(ReactVideoViewManager.PROP_SRC_URI, Uri.parse(this.f11708d));
        SliceSpec sliceSpec = this.f11705a;
        if (sliceSpec != null) {
            bundle.putString("type", sliceSpec.c());
            bundle.putInt("revision", this.f11705a.b());
        }
        return bundle;
    }

    public String k(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("Slice ");
        String[] strArr = this.f11707c;
        if (strArr.length > 0) {
            a(sb2, strArr);
            sb2.append(SafeJsonPrimitive.NULL_CHAR);
        }
        sb2.append('[');
        sb2.append(this.f11708d);
        sb2.append("] {\n");
        String str2 = str + "  ";
        int i11 = 0;
        while (true) {
            SliceItem[] sliceItemArr = this.f11706b;
            if (i11 < sliceItemArr.length) {
                sb2.append(sliceItemArr[i11].q(str2));
                i11++;
            } else {
                sb2.append(str);
                sb2.append('}');
                return sb2.toString();
            }
        }
    }

    public String toString() {
        return k("");
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f11709a;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<SliceItem> f11710b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        private ArrayList<String> f11711c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        private SliceSpec f11712d;

        /* renamed from: e  reason: collision with root package name */
        private int f11713e;

        public a(Uri uri) {
            this.f11709a = uri;
        }

        private Uri n() {
            Uri.Builder appendPath = this.f11709a.buildUpon().appendPath("_gen");
            int i11 = this.f11713e;
            this.f11713e = i11 + 1;
            return appendPath.appendPath(String.valueOf(i11)).build();
        }

        public a a(PendingIntent pendingIntent, Slice slice, String str) {
            g.g(pendingIntent);
            g.g(slice);
            this.f11710b.add(new SliceItem(pendingIntent, slice, LogCategory.ACTION, str, slice.b()));
            return this;
        }

        public a b(List<String> list) {
            return c((String[]) list.toArray(new String[list.size()]));
        }

        public a c(String... strArr) {
            this.f11711c.addAll(Arrays.asList(strArr));
            return this;
        }

        public a d(IconCompat iconCompat, String str, List<String> list) {
            g.g(iconCompat);
            return Slice.g(iconCompat) ? e(iconCompat, str, (String[]) list.toArray(new String[list.size()])) : this;
        }

        public a e(IconCompat iconCompat, String str, String... strArr) {
            g.g(iconCompat);
            if (Slice.g(iconCompat)) {
                this.f11710b.add(new SliceItem(iconCompat, "image", str, strArr));
            }
            return this;
        }

        public a f(int i11, String str, String... strArr) {
            this.f11710b.add(new SliceItem(Integer.valueOf(i11), "int", str, strArr));
            return this;
        }

        public a g(SliceItem sliceItem) {
            this.f11710b.add(sliceItem);
            return this;
        }

        public a h(long j, String str, String... strArr) {
            this.f11710b.add(new SliceItem(Long.valueOf(j), "long", str, strArr));
            return this;
        }

        public a i(Slice slice) {
            g.g(slice);
            return j(slice, (String) null);
        }

        public a j(Slice slice, String str) {
            g.g(slice);
            this.f11710b.add(new SliceItem(slice, "slice", str, slice.b()));
            return this;
        }

        public a k(CharSequence charSequence, String str, String... strArr) {
            this.f11710b.add(new SliceItem(charSequence, "text", str, strArr));
            return this;
        }

        @Deprecated
        public a l(long j, String str, String... strArr) {
            this.f11710b.add(new SliceItem(Long.valueOf(j), "long", str, strArr));
            return this;
        }

        public Slice m() {
            ArrayList<SliceItem> arrayList = this.f11710b;
            ArrayList<String> arrayList2 = this.f11711c;
            return new Slice(arrayList, (String[]) arrayList2.toArray(new String[arrayList2.size()]), this.f11709a, this.f11712d);
        }

        public a o(SliceSpec sliceSpec) {
            this.f11712d = sliceSpec;
            return this;
        }

        public a(a aVar) {
            this.f11709a = aVar.n();
        }
    }

    public Slice() {
        this.f11705a = null;
        this.f11706b = f11704f;
        this.f11707c = f11703e;
        this.f11708d = null;
    }
}
