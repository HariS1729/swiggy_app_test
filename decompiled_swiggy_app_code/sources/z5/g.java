package z5;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.MimeTypeMap;
import com.google.android.gms.common.ConnectionResult;
import com.newrelic.agent.android.harvest.HarvestTimer;
import com.newrelic.agent.android.instrumentation.Instrumented;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o5.a;
import w5.n;

@Instrumented
/* compiled from: Utils */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f18074a = "co.hyperverge.hypersnapsdk.f.h";

    /* renamed from: b  reason: collision with root package name */
    public static int f18075b = 95;

    /* renamed from: c  reason: collision with root package name */
    private static final ArrayList<String> f18076c = new ArrayList<>(Arrays.asList(new String[]{"android.permission.CAMERA"}));

    public static long a(String str, Context context, MediaMetadataRetriever mediaMetadataRetriever) {
        String str2;
        if (str != null) {
            try {
                mediaMetadataRetriever.setDataSource(context, Uri.fromFile(new File(str)));
                str2 = mediaMetadataRetriever.extractMetadata(9);
            } catch (Exception e11) {
                String str3 = f18074a;
                Log.e(str3, "videoTime : " + e11.getMessage());
                return 0;
            }
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return Long.parseLong(str2);
        }
        return 0;
    }

    public static long b(Date date) {
        return (new Date().getTime() - date.getTime()) / HarvestTimer.DEFAULT_HARVEST_PERIOD;
    }

    public static Bitmap c(Bitmap bitmap) {
        try {
            return Bitmap.createBitmap(bitmap, (int) (((double) bitmap.getWidth()) * 0.6666666666666667d), 0, (int) (((double) bitmap.getWidth()) * 0.3333333333333333d), (int) (((double) bitmap.getHeight()) * 0.5d));
        } catch (Exception e11) {
            String str = f18074a;
            Log.e(str, "cropQR : " + e11.getMessage());
            if (n.w().s() == null) {
                return null;
            }
            n.w().s().a(e11);
            return null;
        }
    }

    public static Point d(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static File e(ContentResolver contentResolver, Uri uri, File file) {
        Objects.toString(contentResolver);
        Objects.toString(uri);
        Objects.toString(file);
        String l11 = l(contentResolver, uri);
        File file2 = new File(file, System.currentTimeMillis() + "." + l11);
        try {
            byte[] i11 = i(contentResolver, uri);
            if (Objects.equals(l11, "pdf")) {
                new FileOutputStream(file2).write(i11);
            } else {
                Bitmap j = j(w5.g.b(MediaStore.Images.Media.getBitmap(contentResolver, uri), a.b(i11)));
                j.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(file2));
                j.recycle();
            }
            return file2;
        } catch (Exception e11) {
            String.format("Error writing bytes to file: %s,\nerror: %s", new Object[]{file2.getPath(), e11.getMessage()});
            return null;
        }
    }

    public static String f() {
        return Build.SUPPORTED_ABIS[0];
    }

    public static String g(boolean z11) {
        try {
            for (T inetAddresses : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                Iterator<T> it2 = Collections.list(inetAddresses.getInetAddresses()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        InetAddress inetAddress = (InetAddress) it2.next();
                        if (!inetAddress.isLoopbackAddress()) {
                            String hostAddress = inetAddress.getHostAddress();
                            boolean z12 = hostAddress.indexOf(58) < 0;
                            if (z11) {
                                if (z12) {
                                    return hostAddress;
                                }
                            } else if (!z12) {
                                int indexOf = hostAddress.indexOf(37);
                                return indexOf < 0 ? hostAddress.toUpperCase() : hostAddress.substring(0, indexOf).toUpperCase();
                            }
                        }
                    }
                }
            }
            return "";
        } catch (Exception e11) {
            Log.e(f18074a, e11.getMessage());
            if (n.w().s() == null) {
                return "";
            }
            n.w().s().a(e11);
            return "";
        }
    }

    public static boolean h(List<String> list, String str) {
        for (String lowerCase : list) {
            if (lowerCase.toLowerCase().contains(str)) {
                return true;
            }
        }
        return false;
    }

    private static byte[] i(ContentResolver contentResolver, Uri uri) {
        try {
            InputStream openInputStream = contentResolver.openInputStream(uri);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e11) {
            String.format("Error getting bytes from uri: %s,\nerror: %s", new Object[]{uri.toString(), e11.getMessage()});
            if (n.w().s() == null) {
                return null;
            }
            n.w().s().a(e11);
            return null;
        }
    }

    public static Bitmap j(Bitmap bitmap) {
        double d11;
        double d12;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double d13 = 1.0d;
        if (width > height) {
            if (width > 1500) {
                d11 = ((double) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED) * 1.0d;
                d12 = (double) width;
            }
            return Bitmap.createScaledBitmap(bitmap, (int) (((double) width) * d13), (int) (((double) height) * d13), true);
        }
        if (height > 1500) {
            d11 = ((double) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED) * 1.0d;
            d12 = (double) height;
        }
        return Bitmap.createScaledBitmap(bitmap, (int) (((double) width) * d13), (int) (((double) height) * d13), true);
        d13 = d11 / d12;
        return Bitmap.createScaledBitmap(bitmap, (int) (((double) width) * d13), (int) (((double) height) * d13), true);
    }

    public static Point k(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    public static String l(ContentResolver contentResolver, Uri uri) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(contentResolver.getType(uri));
    }

    public static String m(String str) {
        try {
            return str.substring(str.lastIndexOf(".") + 1);
        } catch (Exception e11) {
            Log.e(f18074a, "extractFileExtension: ", e11);
            return null;
        }
    }

    public static boolean n() {
        if (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) {
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                String str2 = Build.HARDWARE;
                if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                    String str3 = Build.MODEL;
                    if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                        String str4 = Build.PRODUCT;
                        return str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains(PaymentConstants.Category.SDK) || str4.contains("sdk_x86") || str4.contains("sdk_gphone64_arm64") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains("simulator");
                    }
                }
            }
        }
    }

    public static boolean o(Context context) {
        return d(context).y < k(context).y;
    }

    public static boolean p(Context context) {
        return !((context.getApplicationContext().getApplicationInfo().flags & 2) != 0);
    }
}
