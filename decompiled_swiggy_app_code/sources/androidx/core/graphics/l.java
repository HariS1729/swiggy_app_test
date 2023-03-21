package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.core.provider.g;
import io.sentry.instrumentation.file.h;
import io.sentry.instrumentation.file.l;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.pdfbox.pdmodel.common.PDPageLabelRange;

/* compiled from: TypefaceCompatUtil */
public class l {

    /* compiled from: TypefaceCompatUtil */
    static class a {
        static ParcelFileDescriptor a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static ByteBuffer b(Context context, Resources resources, int i11) {
        File e11 = e(context);
        if (e11 == null) {
            return null;
        }
        try {
            if (!c(e11, resources, i11)) {
                return null;
            }
            ByteBuffer g11 = g(e11);
            e11.delete();
            return g11;
        } finally {
            e11.delete();
        }
    }

    public static boolean c(File file, Resources resources, int i11) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i11);
            try {
                boolean d11 = d(file, inputStream);
                a(inputStream);
                return d11;
            } catch (Throwable th2) {
                th = th2;
                a(inputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            a(inputStream);
            throw th;
        }
    }

    public static boolean d(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = l.b.b(new FileOutputStream(file, false), file, false);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    return true;
                }
            }
        } catch (IOException e11) {
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e11.getMessage());
            return false;
        } finally {
            a(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    public static File e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i11 = 0;
        while (i11 < 100) {
            File file = new File(cacheDir, str + i11);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i11++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static ByteBuffer f(Context context, CancellationSignal cancellationSignal, Uri uri) {
        FileInputStream b11;
        try {
            ParcelFileDescriptor a11 = a.a(context.getContentResolver(), uri, PDPageLabelRange.STYLE_ROMAN_LOWER, cancellationSignal);
            if (a11 == null) {
                if (a11 != null) {
                    a11.close();
                }
                return null;
            }
            try {
                FileDescriptor fileDescriptor = a11.getFileDescriptor();
                b11 = h.b.b(new FileInputStream(fileDescriptor), fileDescriptor);
                FileChannel channel = b11.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                b11.close();
                a11.close();
                return map;
            } catch (Throwable th2) {
                a11.close();
                throw th2;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    private static ByteBuffer g(File file) {
        FileInputStream a11;
        try {
            a11 = h.b.a(new FileInputStream(file), file);
            FileChannel channel = a11.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            a11.close();
            return map;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public static Map<Uri, ByteBuffer> h(Context context, g.b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (g.b bVar : bVarArr) {
            if (bVar.b() == 0) {
                Uri d11 = bVar.d();
                if (!hashMap.containsKey(d11)) {
                    hashMap.put(d11, f(context, cancellationSignal, d11));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
