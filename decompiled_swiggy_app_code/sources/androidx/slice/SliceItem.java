package androidx.slice;

import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.DateUtils;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.d;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.newrelic.agent.android.util.SafeJsonPrimitive;
import in.juspay.hyper.constants.LogCategory;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import org.apache.pdfbox.pdmodel.interactive.action.PDAction;

public final class SliceItem extends CustomVersionedParcelable {

    /* renamed from: a  reason: collision with root package name */
    protected String[] f11714a;

    /* renamed from: b  reason: collision with root package name */
    String f11715b;

    /* renamed from: c  reason: collision with root package name */
    String f11716c;

    /* renamed from: d  reason: collision with root package name */
    Object f11717d;

    /* renamed from: e  reason: collision with root package name */
    SliceItemHolder f11718e;

    public SliceItem(Object obj, String str, String str2, String[] strArr) {
        String[] strArr2 = Slice.f11703e;
        this.f11714a = strArr;
        this.f11715b = str;
        this.f11716c = str2;
        this.f11717d = obj;
    }

    private static String m(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? Integer.toString(i11) : "LOCALE" : "INHERIT" : "RTL" : "LTR";
    }

    public static String r(String str) {
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
                return PDAction.TYPE;
            case 1:
                return "Int";
            case 2:
                return "Long";
            case 3:
                return "Text";
            case 4:
                return "Image";
            case 5:
                return "RemoteInput";
            case 6:
                return "Slice";
            default:
                return "Unrecognized format: " + str;
        }
    }

    private void s(Bundle bundle, Object obj, String str) {
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
                bundle.putParcelable("obj", (PendingIntent) dVar.f9416a);
                bundle.putBundle("obj_2", ((Slice) dVar.f9417b).j());
                return;
            case 1:
                bundle.putInt("obj", ((Integer) this.f11717d).intValue());
                return;
            case 2:
                bundle.putLong("obj", ((Long) this.f11717d).longValue());
                return;
            case 3:
                bundle.putCharSequence("obj", (CharSequence) obj);
                return;
            case 4:
                bundle.putBundle("obj", ((IconCompat) obj).w());
                return;
            case 5:
                bundle.putParcelable("obj", (Parcelable) obj);
                return;
            case 6:
                bundle.putParcelable("obj", ((Slice) obj).j());
                return;
            default:
                return;
        }
    }

    public void a(String str) {
        this.f11714a = (String[]) a.a(String.class, this.f11714a, str);
    }

    public PendingIntent b() {
        F f11 = ((d) this.f11717d).f9416a;
        if (f11 instanceof PendingIntent) {
            return (PendingIntent) f11;
        }
        return null;
    }

    public String c() {
        return this.f11715b;
    }

    public List<String> d() {
        return Arrays.asList(this.f11714a);
    }

    public IconCompat e() {
        return (IconCompat) this.f11717d;
    }

    public int f() {
        return ((Integer) this.f11717d).intValue();
    }

    public long g() {
        return ((Long) this.f11717d).longValue();
    }

    public RemoteInput h() {
        return (RemoteInput) this.f11717d;
    }

    public Slice i() {
        if (LogCategory.ACTION.equals(c())) {
            return (Slice) ((d) this.f11717d).f9417b;
        }
        return (Slice) this.f11717d;
    }

    public String j() {
        return this.f11716c;
    }

    public CharSequence k() {
        return (CharSequence) this.f11717d;
    }

    public boolean l(String str) {
        return a.b(this.f11714a, str);
    }

    public void n() {
        SliceItemHolder sliceItemHolder = this.f11718e;
        if (sliceItemHolder != null) {
            this.f11717d = sliceItemHolder.a(this.f11715b);
            this.f11718e.b();
        } else {
            this.f11717d = null;
        }
        this.f11718e = null;
    }

    public void o(boolean z11) {
        this.f11718e = new SliceItemHolder(this.f11715b, this.f11717d, z11);
    }

    public Bundle p() {
        Bundle bundle = new Bundle();
        bundle.putStringArray("hints", this.f11714a);
        bundle.putString("format", this.f11715b);
        bundle.putString("subtype", this.f11716c);
        s(bundle, this.f11717d, this.f11715b);
        return bundle;
    }

    public String q(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(c());
        if (j() != null) {
            sb2.append('<');
            sb2.append(j());
            sb2.append('>');
        }
        sb2.append(SafeJsonPrimitive.NULL_CHAR);
        String[] strArr = this.f11714a;
        if (strArr.length > 0) {
            Slice.a(sb2, strArr);
            sb2.append(SafeJsonPrimitive.NULL_CHAR);
        }
        String str2 = str + "  ";
        String c11 = c();
        c11.hashCode();
        char c12 = 65535;
        switch (c11.hashCode()) {
            case -1422950858:
                if (c11.equals(LogCategory.ACTION)) {
                    c12 = 0;
                    break;
                }
                break;
            case 104431:
                if (c11.equals("int")) {
                    c12 = 1;
                    break;
                }
                break;
            case 3327612:
                if (c11.equals("long")) {
                    c12 = 2;
                    break;
                }
                break;
            case 3556653:
                if (c11.equals("text")) {
                    c12 = 3;
                    break;
                }
                break;
            case 100313435:
                if (c11.equals("image")) {
                    c12 = 4;
                    break;
                }
                break;
            case 109526418:
                if (c11.equals("slice")) {
                    c12 = 5;
                    break;
                }
                break;
        }
        switch (c12) {
            case 0:
                F f11 = ((d) this.f11717d).f9416a;
                sb2.append('[');
                sb2.append(f11);
                sb2.append("] ");
                sb2.append("{\n");
                sb2.append(i().k(str2));
                sb2.append(10);
                sb2.append(str);
                sb2.append('}');
                break;
            case 1:
                if (!"color".equals(j())) {
                    if (!"layout_direction".equals(j())) {
                        sb2.append(f());
                        break;
                    } else {
                        sb2.append(m(f()));
                        break;
                    }
                } else {
                    int f12 = f();
                    sb2.append(String.format("a=0x%02x r=0x%02x g=0x%02x b=0x%02x", new Object[]{Integer.valueOf(Color.alpha(f12)), Integer.valueOf(Color.red(f12)), Integer.valueOf(Color.green(f12)), Integer.valueOf(Color.blue(f12))}));
                    break;
                }
            case 2:
                if ("millis".equals(j())) {
                    if (g() != -1) {
                        sb2.append(DateUtils.getRelativeTimeSpanString(g(), Calendar.getInstance().getTimeInMillis(), 1000, 262144));
                        break;
                    } else {
                        sb2.append("INFINITY");
                        break;
                    }
                } else {
                    sb2.append(g());
                    sb2.append('L');
                    break;
                }
            case 3:
                sb2.append('\"');
                sb2.append(k());
                sb2.append('\"');
                break;
            case 4:
                sb2.append(e());
                break;
            case 5:
                sb2.append("{\n");
                sb2.append(i().k(str2));
                sb2.append(10);
                sb2.append(str);
                sb2.append('}');
                break;
            default:
                sb2.append(r(c()));
                break;
        }
        sb2.append("\n");
        return sb2.toString();
    }

    public String toString() {
        return q("");
    }

    public SliceItem() {
        this.f11714a = Slice.f11703e;
        this.f11715b = "text";
        this.f11716c = null;
    }

    public SliceItem(PendingIntent pendingIntent, Slice slice, String str, String str2, String[] strArr) {
        this(new d(pendingIntent, slice), str, str2, strArr);
    }
}
