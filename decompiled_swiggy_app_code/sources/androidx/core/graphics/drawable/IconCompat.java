package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.res.h;
import androidx.core.util.g;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.xiaomi.mipush.sdk.Constants;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.tejas.api.models.ResponseFetchingError;
import io.sentry.instrumentation.file.h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import org.apache.pdfbox.pdmodel.interactive.action.PDActionURI;
import pc0.x;

public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f9244a;

    /* renamed from: b  reason: collision with root package name */
    Object f9245b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f9246c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f9247d;

    /* renamed from: e  reason: collision with root package name */
    public int f9248e;

    /* renamed from: f  reason: collision with root package name */
    public int f9249f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f9250g;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f9251h;

    /* renamed from: i  reason: collision with root package name */
    public String f9252i;
    public String j;

    static class a {
        static IconCompat a(Object obj) {
            g.g(obj);
            int d11 = d(obj);
            if (d11 == 2) {
                return IconCompat.k((Resources) null, c(obj), b(obj));
            }
            if (d11 == 4) {
                return IconCompat.h(e(obj));
            }
            if (d11 == 6) {
                return IconCompat.e(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f9245b = obj;
            return iconCompat;
        }

        static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            } catch (NoSuchMethodException e13) {
                Log.e("IconCompat", "Unable to get icon resource", e13);
                return 0;
            }
        }

        static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            } catch (NoSuchMethodException e13) {
                Log.e("IconCompat", "Unable to get icon package", e13);
                return null;
            }
        }

        static int d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            } catch (NoSuchMethodException e13) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e13);
                return -1;
            }
        }

        static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            } catch (NoSuchMethodException e13) {
                Log.e("IconCompat", "Unable to get icon uri", e13);
                return null;
            }
        }

        static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        static Icon g(IconCompat iconCompat, Context context) {
            Icon icon;
            switch (iconCompat.f9244a) {
                case -1:
                    return (Icon) iconCompat.f9245b;
                case 1:
                    icon = Icon.createWithBitmap((Bitmap) iconCompat.f9245b);
                    break;
                case 2:
                    icon = Icon.createWithResource(iconCompat.n(), iconCompat.f9248e);
                    break;
                case 3:
                    icon = Icon.createWithData((byte[]) iconCompat.f9245b, iconCompat.f9248e, iconCompat.f9249f);
                    break;
                case 4:
                    icon = Icon.createWithContentUri((String) iconCompat.f9245b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        icon = Icon.createWithBitmap(IconCompat.d((Bitmap) iconCompat.f9245b, false));
                        break;
                    } else {
                        icon = b.b((Bitmap) iconCompat.f9245b);
                        break;
                    }
                case 6:
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30) {
                        icon = d.a(iconCompat.q());
                        break;
                    } else if (context != null) {
                        InputStream r11 = iconCompat.r(context);
                        if (r11 != null) {
                            if (i11 < 26) {
                                icon = Icon.createWithBitmap(IconCompat.d(BitmapFactory.decodeStream(r11), false));
                                break;
                            } else {
                                icon = b.b(BitmapFactory.decodeStream(r11));
                                break;
                            }
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.q());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.q());
                    }
                default:
                    throw new IllegalArgumentException("Unknown type");
            }
            ColorStateList colorStateList = iconCompat.f9250g;
            if (colorStateList != null) {
                icon.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f9251h;
            if (mode != IconCompat.k) {
                icon.setTintMode(mode);
            }
            return icon;
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f9244a = -1;
        this.f9246c = null;
        this.f9247d = null;
        this.f9248e = 0;
        this.f9249f = 0;
        this.f9250g = null;
        this.f9251h = k;
        this.f9252i = null;
    }

    public static IconCompat b(Bundle bundle) {
        int i11 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i11);
        iconCompat.f9248e = bundle.getInt("int1");
        iconCompat.f9249f = bundle.getInt("int2");
        iconCompat.j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f9250g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f9251h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i11) {
            case -1:
            case 1:
            case 5:
                iconCompat.f9245b = bundle.getParcelable("obj");
                break;
            case 2:
            case 4:
            case 6:
                iconCompat.f9245b = bundle.getString("obj");
                break;
            case 3:
                iconCompat.f9245b = bundle.getByteArray("obj");
                break;
            default:
                Log.w("IconCompat", "Unknown type " + i11);
                return null;
        }
        return iconCompat;
    }

    public static IconCompat c(Icon icon) {
        return a.a(icon);
    }

    static Bitmap d(Bitmap bitmap, boolean z11) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f11 = (float) min;
        float f12 = 0.5f * f11;
        float f13 = 0.9166667f * f12;
        if (z11) {
            float f14 = 0.010416667f * f11;
            paint.setColor(0);
            paint.setShadowLayer(f14, 0.0f, f11 * 0.020833334f, 1023410176);
            canvas.drawCircle(f12, f12, f13, paint);
            paint.setShadowLayer(f14, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f12, f12, f13, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f12, f12, f13, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat e(Uri uri) {
        androidx.core.util.c.c(uri);
        return f(uri.toString());
    }

    public static IconCompat f(String str) {
        androidx.core.util.c.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f9245b = str;
        return iconCompat;
    }

    public static IconCompat g(Bitmap bitmap) {
        androidx.core.util.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f9245b = bitmap;
        return iconCompat;
    }

    public static IconCompat h(Uri uri) {
        androidx.core.util.c.c(uri);
        return i(uri.toString());
    }

    public static IconCompat i(String str) {
        androidx.core.util.c.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f9245b = str;
        return iconCompat;
    }

    public static IconCompat j(Context context, int i11) {
        androidx.core.util.c.c(context);
        return k(context.getResources(), context.getPackageName(), i11);
    }

    public static IconCompat k(Resources resources, String str, int i11) {
        androidx.core.util.c.c(str);
        if (i11 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f9248e = i11;
            if (resources != null) {
                try {
                    iconCompat.f9245b = resources.getResourceName(i11);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f9245b = str;
            }
            iconCompat.j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    static Resources o(Context context, String str) {
        if (LogSubCategory.LifeCycle.ANDROID.equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[]{str}), e11);
            return null;
        }
    }

    private Drawable t(Context context) {
        switch (this.f9244a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f9245b);
            case 2:
                String n = n();
                if (TextUtils.isEmpty(n)) {
                    n = context.getPackageName();
                }
                try {
                    return h.e(o(context, n), this.f9248e, context.getTheme());
                } catch (RuntimeException e11) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", new Object[]{Integer.valueOf(this.f9248e), this.f9245b}), e11);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f9245b, this.f9248e, this.f9249f));
            case 4:
                InputStream r11 = r(context);
                if (r11 != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(r11));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), d((Bitmap) this.f9245b, false));
            case 6:
                InputStream r12 = r(context);
                if (r12 != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        return b.a((Drawable) null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(r12)));
                    }
                    return new BitmapDrawable(context.getResources(), d(BitmapFactory.decodeStream(r12), false));
                }
                break;
        }
        return null;
    }

    private static String z(int i11) {
        switch (i11) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return PDActionURI.SUB_TYPE;
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return ResponseFetchingError.UNKNOWN;
        }
    }

    public void a(Context context) {
        Object obj;
        if (this.f9244a == 2 && (obj = this.f9245b) != null) {
            String str = (String) obj;
            if (str.contains(Constants.COLON_SEPARATOR)) {
                String str2 = str.split(Constants.COLON_SEPARATOR, -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(Constants.COLON_SEPARATOR, -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                    return;
                }
                String n = n();
                int identifier = o(context, n).getIdentifier(str4, str3, str5);
                if (this.f9248e != identifier) {
                    Log.i("IconCompat", "Id has changed for " + n + " " + str);
                    this.f9248e = identifier;
                }
            }
        }
    }

    public Bitmap l() {
        int i11 = this.f9244a;
        if (i11 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f9245b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i11 == 1) {
            return (Bitmap) this.f9245b;
        } else {
            if (i11 == 5) {
                return d((Bitmap) this.f9245b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int m() {
        int i11 = this.f9244a;
        if (i11 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.b(this.f9245b);
        }
        if (i11 == 2) {
            return this.f9248e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String n() {
        int i11 = this.f9244a;
        if (i11 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.c(this.f9245b);
        }
        if (i11 == 2) {
            String str = this.j;
            if (str == null || TextUtils.isEmpty(str)) {
                return ((String) this.f9245b).split(Constants.COLON_SEPARATOR, -1)[0];
            }
            return this.j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int p() {
        int i11 = this.f9244a;
        return (i11 != -1 || Build.VERSION.SDK_INT < 23) ? i11 : a.d(this.f9245b);
    }

    public Uri q() {
        int i11 = this.f9244a;
        if (i11 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.e(this.f9245b);
        }
        if (i11 == 4 || i11 == 6) {
            return Uri.parse((String) this.f9245b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream r(Context context) {
        Uri q = q();
        String scheme = q.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(q);
            } catch (Exception e11) {
                Log.w("IconCompat", "Unable to load image from URI: " + q, e11);
                return null;
            }
        } else {
            try {
                File file = new File((String) this.f9245b);
                return h.b.a(new FileInputStream(file), file);
            } catch (FileNotFoundException e12) {
                Log.w("IconCompat", "Unable to load image from path: " + q, e12);
                return null;
            }
        }
    }

    public Drawable s(Context context) {
        a(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return a.f(y(context), context);
        }
        Drawable t = t(context);
        if (!(t == null || (this.f9250g == null && this.f9251h == k))) {
            t.mutate();
            a.o(t, this.f9250g);
            a.p(t, this.f9251h);
        }
        return t;
    }

    public String toString() {
        if (this.f9244a == -1) {
            return String.valueOf(this.f9245b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(z(this.f9244a));
        switch (this.f9244a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f9245b).getWidth());
                sb2.append(x.f81957i);
                sb2.append(((Bitmap) this.f9245b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", new Object[]{Integer.valueOf(m())}));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f9248e);
                if (this.f9249f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f9249f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f9245b);
                break;
        }
        if (this.f9250g != null) {
            sb2.append(" tint=");
            sb2.append(this.f9250g);
        }
        if (this.f9251h != k) {
            sb2.append(" mode=");
            sb2.append(this.f9251h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void u() {
        this.f9251h = PorterDuff.Mode.valueOf(this.f9252i);
        switch (this.f9244a) {
            case -1:
                Parcelable parcelable = this.f9247d;
                if (parcelable != null) {
                    this.f9245b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = this.f9247d;
                if (parcelable2 != null) {
                    this.f9245b = parcelable2;
                    return;
                }
                byte[] bArr = this.f9246c;
                this.f9245b = bArr;
                this.f9244a = 3;
                this.f9248e = 0;
                this.f9249f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f9246c, Charset.forName("UTF-16"));
                this.f9245b = str;
                if (this.f9244a == 2 && this.j == null) {
                    this.j = str.split(Constants.COLON_SEPARATOR, -1)[0];
                    return;
                }
                return;
            case 3:
                this.f9245b = this.f9246c;
                return;
            default:
                return;
        }
    }

    public void v(boolean z11) {
        this.f9252i = this.f9251h.name();
        switch (this.f9244a) {
            case -1:
                if (!z11) {
                    this.f9247d = (Parcelable) this.f9245b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 1:
            case 5:
                if (z11) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f9245b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f9246c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f9247d = (Parcelable) this.f9245b;
                return;
            case 2:
                this.f9246c = ((String) this.f9245b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f9246c = (byte[]) this.f9245b;
                return;
            case 4:
            case 6:
                this.f9246c = this.f9245b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
    }

    public Bundle w() {
        Bundle bundle = new Bundle();
        switch (this.f9244a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f9245b);
                break;
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f9245b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f9245b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f9245b);
                break;
            default:
                throw new IllegalArgumentException("Invalid icon");
        }
        bundle.putInt("type", this.f9244a);
        bundle.putInt("int1", this.f9248e);
        bundle.putInt("int2", this.f9249f);
        bundle.putString("string1", this.j);
        ColorStateList colorStateList = this.f9250g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f9251h;
        if (mode != k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    public Icon x() {
        return y((Context) null);
    }

    public Icon y(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    IconCompat(int i11) {
        this.f9246c = null;
        this.f9247d = null;
        this.f9248e = 0;
        this.f9249f = 0;
        this.f9250g = null;
        this.f9251h = k;
        this.f9252i = null;
        this.f9244a = i11;
    }
}
