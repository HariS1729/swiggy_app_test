package androidx.slice;

import android.app.PendingIntent;
import android.os.Parcelable;
import android.text.Spanned;
import androidx.core.util.d;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;

public class SliceItemHolder implements z3.b {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f11719h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static a f11720i;

    /* renamed from: a  reason: collision with root package name */
    public z3.b f11721a = null;

    /* renamed from: b  reason: collision with root package name */
    Parcelable f11722b = null;

    /* renamed from: c  reason: collision with root package name */
    Object f11723c;

    /* renamed from: d  reason: collision with root package name */
    String f11724d = null;

    /* renamed from: e  reason: collision with root package name */
    int f11725e = 0;

    /* renamed from: f  reason: collision with root package name */
    long f11726f = 0;

    /* renamed from: g  reason: collision with root package name */
    private b f11727g;

    public interface a {
        void a(SliceItemHolder sliceItemHolder, String str);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList<SliceItemHolder> f11728a = new ArrayList<>();

        public SliceItemHolder a() {
            if (this.f11728a.size() <= 0) {
                return new SliceItemHolder(this);
            }
            ArrayList<SliceItemHolder> arrayList = this.f11728a;
            return arrayList.remove(arrayList.size() - 1);
        }

        public void b(SliceItemHolder sliceItemHolder) {
            sliceItemHolder.f11722b = null;
            sliceItemHolder.f11723c = null;
            sliceItemHolder.f11721a = null;
            sliceItemHolder.f11725e = 0;
            sliceItemHolder.f11726f = 0;
            sliceItemHolder.f11724d = null;
            this.f11728a.add(sliceItemHolder);
        }
    }

    SliceItemHolder(b bVar) {
        this.f11727g = bVar;
    }

    public Object a(String str) {
        a aVar = f11720i;
        if (aVar != null) {
            aVar.a(this, str);
        }
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1422950858:
                if (str.equals(LogCategory.ACTION)) {
                    c11 = 0;
                    break;
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    c11 = 1;
                    break;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    c11 = 2;
                    break;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    c11 = 3;
                    break;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    c11 = 4;
                    break;
                }
                break;
            case 100358090:
                if (str.equals("input")) {
                    c11 = 5;
                    break;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c11 = 6;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                Object obj = this.f11722b;
                if (obj == null && this.f11721a == null) {
                    return null;
                }
                if (obj == null) {
                    obj = this.f11723c;
                }
                return new d(obj, (Slice) this.f11721a);
            case 1:
                return Integer.valueOf(this.f11725e);
            case 2:
                return Long.valueOf(this.f11726f);
            case 3:
                String str2 = this.f11724d;
                return (str2 == null || str2.length() == 0) ? "" : androidx.core.text.b.a(this.f11724d, 0);
            case 4:
            case 6:
                return this.f11721a;
            case 5:
                return this.f11722b;
            default:
                throw new IllegalArgumentException("Unrecognized format " + str);
        }
    }

    public void b() {
        b bVar = this.f11727g;
        if (bVar != null) {
            bVar.b(this);
        }
    }

    public SliceItemHolder(String str, Object obj, boolean z11) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1422950858:
                if (str.equals(LogCategory.ACTION)) {
                    c11 = 0;
                    break;
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    c11 = 1;
                    break;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    c11 = 2;
                    break;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    c11 = 3;
                    break;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    c11 = 4;
                    break;
                }
                break;
            case 100358090:
                if (str.equals("input")) {
                    c11 = 5;
                    break;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c11 = 6;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                d dVar = (d) obj;
                F f11 = dVar.f9416a;
                if (f11 instanceof PendingIntent) {
                    this.f11722b = (Parcelable) f11;
                } else if (!z11) {
                    throw new IllegalArgumentException("Cannot write callback to parcel");
                }
                this.f11721a = (z3.b) dVar.f9417b;
                break;
            case 1:
                this.f11725e = ((Integer) obj).intValue();
                break;
            case 2:
                this.f11726f = ((Long) obj).longValue();
                break;
            case 3:
                this.f11724d = obj instanceof Spanned ? androidx.core.text.b.b((Spanned) obj, 0) : (String) obj;
                break;
            case 4:
            case 6:
                this.f11721a = (z3.b) obj;
                break;
            case 5:
                this.f11722b = (Parcelable) obj;
                break;
        }
        a aVar = f11720i;
        if (aVar != null) {
            aVar.a(this, str);
        }
    }
}
