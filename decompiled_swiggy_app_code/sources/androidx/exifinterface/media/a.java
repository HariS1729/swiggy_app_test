package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.b;
import com.newrelic.agent.android.crash.CrashSender;
import com.xiaomi.mipush.sdk.Constants;
import io.sentry.instrumentation.file.h;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.apache.fontbox.afm.AFMParser;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;
import org.apache.fontbox.ttf.WGL4Names;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;

/* compiled from: ExifInterface */
public class a {
    public static final int[] A = {8};
    static final byte[] B = {-1, -40, -1};
    private static final byte[] C = {102, 116, 121, 112};
    private static final byte[] D = {109, 105, 102, 49};
    private static final byte[] E = {104, 101, 105, 99};
    private static final byte[] F = {79, 76, 89, 77, 80, 0};
    private static final byte[] G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] H = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] I = {101, 88, 73, 102};
    private static final byte[] J = {73, 72, 68, 82};
    private static final byte[] K = {73, 69, 78, 68};
    private static final byte[] L = {82, 73, 70, 70};
    private static final byte[] M = {87, 69, 66, 80};
    private static final byte[] N = {69, 88, 73, 70};
    private static final byte[] O = {-99, 1, 42};
    private static final byte[] P = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] Q = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] R = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] S = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] T = "ANMF".getBytes(Charset.defaultCharset());
    private static SimpleDateFormat U;
    private static SimpleDateFormat V;
    static final String[] W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] Y = {65, 83, 67, 73, 73, 0, 0, 0};
    private static final e[] Z;

    /* renamed from: a0  reason: collision with root package name */
    private static final e[] f10205a0;

    /* renamed from: b0  reason: collision with root package name */
    private static final e[] f10206b0;

    /* renamed from: c0  reason: collision with root package name */
    private static final e[] f10207c0;

    /* renamed from: d0  reason: collision with root package name */
    private static final e[] f10208d0;

    /* renamed from: e0  reason: collision with root package name */
    private static final e f10209e0 = new e("StripOffsets", 273, 3);

    /* renamed from: f0  reason: collision with root package name */
    private static final e[] f10210f0;

    /* renamed from: g0  reason: collision with root package name */
    private static final e[] f10211g0;

    /* renamed from: h0  reason: collision with root package name */
    private static final e[] f10212h0;

    /* renamed from: i0  reason: collision with root package name */
    private static final e[] f10213i0;

    /* renamed from: j0  reason: collision with root package name */
    static final e[][] f10214j0;

    /* renamed from: k0  reason: collision with root package name */
    private static final e[] f10215k0 = {new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: l0  reason: collision with root package name */
    private static final HashMap<Integer, e>[] f10216l0;

    /* renamed from: m0  reason: collision with root package name */
    private static final HashMap<String, e>[] f10217m0;

    /* renamed from: n0  reason: collision with root package name */
    private static final HashSet<String> f10218n0 = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: o0  reason: collision with root package name */
    private static final HashMap<Integer, Integer> f10219o0 = new HashMap<>();

    /* renamed from: p0  reason: collision with root package name */
    static final Charset f10220p0;

    /* renamed from: q0  reason: collision with root package name */
    static final byte[] f10221q0;

    /* renamed from: r0  reason: collision with root package name */
    private static final byte[] f10222r0;

    /* renamed from: s0  reason: collision with root package name */
    private static final Pattern f10223s0 = Pattern.compile(".*[1-9].*");

    /* renamed from: t0  reason: collision with root package name */
    private static final Pattern f10224t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: u0  reason: collision with root package name */
    private static final Pattern f10225u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    private static final boolean v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: v0  reason: collision with root package name */
    private static final Pattern f10226v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: w  reason: collision with root package name */
    private static final List<Integer> f10227w = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: x  reason: collision with root package name */
    private static final List<Integer> f10228x = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f10229y = {8, 8, 8};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f10230z = {4};

    /* renamed from: a  reason: collision with root package name */
    private String f10231a;

    /* renamed from: b  reason: collision with root package name */
    private FileDescriptor f10232b;

    /* renamed from: c  reason: collision with root package name */
    private AssetManager.AssetInputStream f10233c;

    /* renamed from: d  reason: collision with root package name */
    private int f10234d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10235e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, d>[] f10236f;

    /* renamed from: g  reason: collision with root package name */
    private Set<Integer> f10237g;

    /* renamed from: h  reason: collision with root package name */
    private ByteOrder f10238h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10239i;
    private boolean j;
    private boolean k;

    /* renamed from: l  reason: collision with root package name */
    private int f10240l;

    /* renamed from: m  reason: collision with root package name */
    private int f10241m;
    private byte[] n;

    /* renamed from: o  reason: collision with root package name */
    private int f10242o;

    /* renamed from: p  reason: collision with root package name */
    private int f10243p;
    private int q;

    /* renamed from: r  reason: collision with root package name */
    private int f10244r;

    /* renamed from: s  reason: collision with root package name */
    private int f10245s;
    private boolean t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f10246u;

    /* renamed from: androidx.exifinterface.media.a$a  reason: collision with other inner class name */
    /* compiled from: ExifInterface */
    class C0059a extends MediaDataSource {

        /* renamed from: a  reason: collision with root package name */
        long f10247a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f10248b;

        C0059a(g gVar) {
            this.f10248b = gVar;
        }

        public void close() throws IOException {
        }

        public long getSize() throws IOException {
            return -1;
        }

        public int readAt(long j, byte[] bArr, int i11, int i12) throws IOException {
            if (i12 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j11 = this.f10247a;
                if (j11 != j) {
                    if (j11 >= 0 && j >= j11 + ((long) this.f10248b.available())) {
                        return -1;
                    }
                    this.f10248b.j(j);
                    this.f10247a = j;
                }
                if (i12 > this.f10248b.available()) {
                    i12 = this.f10248b.available();
                }
                int read = this.f10248b.read(bArr, i11, i12);
                if (read >= 0) {
                    this.f10247a += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f10247a = -1;
            return -1;
        }
    }

    /* compiled from: ExifInterface */
    private static class b extends InputStream implements DataInput {

        /* renamed from: e  reason: collision with root package name */
        private static final ByteOrder f10250e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f  reason: collision with root package name */
        private static final ByteOrder f10251f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a  reason: collision with root package name */
        final DataInputStream f10252a;

        /* renamed from: b  reason: collision with root package name */
        private ByteOrder f10253b;

        /* renamed from: c  reason: collision with root package name */
        int f10254c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f10255d;

        b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.f10254c;
        }

        public int available() throws IOException {
            return this.f10252a.available();
        }

        public long b() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        public void f(ByteOrder byteOrder) {
            this.f10253b = byteOrder;
        }

        public void g(int i11) throws IOException {
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i11 - i12;
                int skip = (int) this.f10252a.skip((long) i13);
                if (skip <= 0) {
                    if (this.f10255d == null) {
                        this.f10255d = new byte[8192];
                    }
                    skip = this.f10252a.read(this.f10255d, 0, Math.min(8192, i13));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i11 + " bytes.");
                    }
                }
                i12 += skip;
            }
            this.f10254c += i12;
        }

        public void mark(int i11) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public int read() throws IOException {
            this.f10254c++;
            return this.f10252a.read();
        }

        public boolean readBoolean() throws IOException {
            this.f10254c++;
            return this.f10252a.readBoolean();
        }

        public byte readByte() throws IOException {
            this.f10254c++;
            int read = this.f10252a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        public char readChar() throws IOException {
            this.f10254c += 2;
            return this.f10252a.readChar();
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i11, int i12) throws IOException {
            this.f10254c += i12;
            this.f10252a.readFully(bArr, i11, i12);
        }

        public int readInt() throws IOException {
            this.f10254c += 4;
            int read = this.f10252a.read();
            int read2 = this.f10252a.read();
            int read3 = this.f10252a.read();
            int read4 = this.f10252a.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f10253b;
                if (byteOrder == f10250e) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f10251f) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f10253b);
            }
            throw new EOFException();
        }

        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() throws IOException {
            this.f10254c += 8;
            int read = this.f10252a.read();
            int read2 = this.f10252a.read();
            int read3 = this.f10252a.read();
            int read4 = this.f10252a.read();
            int read5 = this.f10252a.read();
            int read6 = this.f10252a.read();
            int read7 = this.f10252a.read();
            int read8 = this.f10252a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f10253b;
                if (byteOrder == f10250e) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                int i11 = read2;
                if (byteOrder == f10251f) {
                    return (((long) read) << 56) + (((long) i11) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                throw new IOException("Invalid byte order: " + this.f10253b);
            }
            throw new EOFException();
        }

        public short readShort() throws IOException {
            this.f10254c += 2;
            int read = this.f10252a.read();
            int read2 = this.f10252a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f10253b;
                if (byteOrder == f10250e) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f10251f) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f10253b);
            }
            throw new EOFException();
        }

        public String readUTF() throws IOException {
            this.f10254c += 2;
            return this.f10252a.readUTF();
        }

        public int readUnsignedByte() throws IOException {
            this.f10254c++;
            return this.f10252a.readUnsignedByte();
        }

        public int readUnsignedShort() throws IOException {
            this.f10254c += 2;
            int read = this.f10252a.read();
            int read2 = this.f10252a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f10253b;
                if (byteOrder == f10250e) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f10251f) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f10253b);
            }
            throw new EOFException();
        }

        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public int skipBytes(int i11) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f10253b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f10252a = dataInputStream;
            dataInputStream.mark(0);
            this.f10254c = 0;
            this.f10253b = byteOrder;
        }

        public int read(byte[] bArr, int i11, int i12) throws IOException {
            int read = this.f10252a.read(bArr, i11, i12);
            this.f10254c += read;
            return read;
        }

        public void readFully(byte[] bArr) throws IOException {
            this.f10254c += bArr.length;
            this.f10252a.readFully(bArr);
        }
    }

    /* compiled from: ExifInterface */
    private static class c extends FilterOutputStream {

        /* renamed from: a  reason: collision with root package name */
        final OutputStream f10256a;

        /* renamed from: b  reason: collision with root package name */
        private ByteOrder f10257b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f10256a = outputStream;
            this.f10257b = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.f10257b = byteOrder;
        }

        public void b(int i11) throws IOException {
            this.f10256a.write(i11);
        }

        public void f(int i11) throws IOException {
            ByteOrder byteOrder = this.f10257b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f10256a.write((i11 >>> 0) & 255);
                this.f10256a.write((i11 >>> 8) & 255);
                this.f10256a.write((i11 >>> 16) & 255);
                this.f10256a.write((i11 >>> 24) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f10256a.write((i11 >>> 24) & 255);
                this.f10256a.write((i11 >>> 16) & 255);
                this.f10256a.write((i11 >>> 8) & 255);
                this.f10256a.write((i11 >>> 0) & 255);
            }
        }

        public void g(short s11) throws IOException {
            ByteOrder byteOrder = this.f10257b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f10256a.write((s11 >>> 0) & 255);
                this.f10256a.write((s11 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f10256a.write((s11 >>> 8) & 255);
                this.f10256a.write((s11 >>> 0) & 255);
            }
        }

        public void j(long j) throws IOException {
            f((int) j);
        }

        public void t(int i11) throws IOException {
            g((short) i11);
        }

        public void write(byte[] bArr) throws IOException {
            this.f10256a.write(bArr);
        }

        public void write(byte[] bArr, int i11, int i12) throws IOException {
            this.f10256a.write(bArr, i11, i12);
        }
    }

    /* compiled from: ExifInterface */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f10258a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10259b;

        /* renamed from: c  reason: collision with root package name */
        public final long f10260c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f10261d;

        d(int i11, int i12, byte[] bArr) {
            this(i11, i12, -1, bArr);
        }

        public static d a(String str) {
            if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
                byte[] bytes = str.getBytes(a.f10220p0);
                return new d(1, bytes.length, bytes);
            }
            return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.X[12] * dArr.length)]);
            wrap.order(byteOrder);
            for (double putDouble : dArr) {
                wrap.putDouble(putDouble);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.X[9] * iArr.length)]);
            wrap.order(byteOrder);
            for (int putInt : iArr) {
                wrap.putInt(putInt);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.X[10] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f10266a);
                wrap.putInt((int) fVar.f10267b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + 0).getBytes(a.f10220p0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j, ByteOrder byteOrder) {
            return g(new long[]{j}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.X[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.X[5] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f10266a);
                wrap.putInt((int) fVar.f10267b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d j(int i11, ByteOrder byteOrder) {
            return k(new int[]{i11}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.X[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i11 : iArr) {
                wrap.putShort((short) i11);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double l(ByteOrder byteOrder) {
            Object o11 = o(byteOrder);
            if (o11 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (o11 instanceof String) {
                return Double.parseDouble((String) o11);
            } else {
                if (o11 instanceof long[]) {
                    long[] jArr = (long[]) o11;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o11 instanceof int[]) {
                    int[] iArr = (int[]) o11;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o11 instanceof double[]) {
                    double[] dArr = (double[]) o11;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o11 instanceof f[]) {
                    f[] fVarArr = (f[]) o11;
                    if (fVarArr.length == 1) {
                        return fVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int m(ByteOrder byteOrder) {
            Object o11 = o(byteOrder);
            if (o11 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (o11 instanceof String) {
                return Integer.parseInt((String) o11);
            } else {
                if (o11 instanceof long[]) {
                    long[] jArr = (long[]) o11;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o11 instanceof int[]) {
                    int[] iArr = (int[]) o11;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String n(ByteOrder byteOrder) {
            Object o11 = o(byteOrder);
            if (o11 == null) {
                return null;
            }
            if (o11 instanceof String) {
                return (String) o11;
            }
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            if (o11 instanceof long[]) {
                long[] jArr = (long[]) o11;
                while (i11 < jArr.length) {
                    sb2.append(jArr[i11]);
                    i11++;
                    if (i11 != jArr.length) {
                        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
                return sb2.toString();
            } else if (o11 instanceof int[]) {
                int[] iArr = (int[]) o11;
                while (i11 < iArr.length) {
                    sb2.append(iArr[i11]);
                    i11++;
                    if (i11 != iArr.length) {
                        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
                return sb2.toString();
            } else if (o11 instanceof double[]) {
                double[] dArr = (double[]) o11;
                while (i11 < dArr.length) {
                    sb2.append(dArr[i11]);
                    i11++;
                    if (i11 != dArr.length) {
                        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
                return sb2.toString();
            } else if (!(o11 instanceof f[])) {
                return null;
            } else {
                f[] fVarArr = (f[]) o11;
                while (i11 < fVarArr.length) {
                    sb2.append(fVarArr[i11].f10266a);
                    sb2.append('/');
                    sb2.append(fVarArr[i11].f10267b);
                    i11++;
                    if (i11 != fVarArr.length) {
                        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
                return sb2.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x019f A[SYNTHETIC, Splitter:B:164:0x019f] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object o(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                androidx.exifinterface.media.a$b r3 = new androidx.exifinterface.media.a$b     // Catch:{ IOException -> 0x0189, all -> 0x0187 }
                byte[] r4 = r10.f10261d     // Catch:{ IOException -> 0x0189, all -> 0x0187 }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x0189, all -> 0x0187 }
                r3.f(r11)     // Catch:{ IOException -> 0x0185 }
                int r11 = r10.f10258a     // Catch:{ IOException -> 0x0185 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x0148;
                    case 2: goto L_0x00fd;
                    case 3: goto L_0x00e3;
                    case 4: goto L_0x00c9;
                    case 5: goto L_0x00a6;
                    case 6: goto L_0x0148;
                    case 7: goto L_0x00fd;
                    case 8: goto L_0x008c;
                    case 9: goto L_0x0072;
                    case 10: goto L_0x004d;
                    case 11: goto L_0x0032;
                    case 12: goto L_0x0018;
                    default: goto L_0x0016;
                }     // Catch:{ IOException -> 0x0185 }
            L_0x0016:
                goto L_0x017c
            L_0x0018:
                int r11 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x001c:
                int r4 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x0029
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x001c
            L_0x0029:
                r3.close()     // Catch:{ IOException -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0031:
                return r11
            L_0x0032:
                int r11 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x0036:
                int r4 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x0044
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0185 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x0036
            L_0x0044:
                r3.close()     // Catch:{ IOException -> 0x0048 }
                goto L_0x004c
            L_0x0048:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004c:
                return r11
            L_0x004d:
                int r11 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                androidx.exifinterface.media.a$f[] r11 = new androidx.exifinterface.media.a.f[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x0051:
                int r4 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x0069
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0185 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0185 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0185 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0185 }
                androidx.exifinterface.media.a$f r4 = new androidx.exifinterface.media.a$f     // Catch:{ IOException -> 0x0185 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x0051
            L_0x0069:
                r3.close()     // Catch:{ IOException -> 0x006d }
                goto L_0x0071
            L_0x006d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0071:
                return r11
            L_0x0072:
                int r11 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x0076:
                int r4 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x0083
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x0076
            L_0x0083:
                r3.close()     // Catch:{ IOException -> 0x0087 }
                goto L_0x008b
            L_0x0087:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008b:
                return r11
            L_0x008c:
                int r11 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x0090:
                int r4 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x009d
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x0090
            L_0x009d:
                r3.close()     // Catch:{ IOException -> 0x00a1 }
                goto L_0x00a5
            L_0x00a1:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a5:
                return r11
            L_0x00a6:
                int r11 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                androidx.exifinterface.media.a$f[] r11 = new androidx.exifinterface.media.a.f[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x00aa:
                int r4 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x00c0
                long r6 = r3.b()     // Catch:{ IOException -> 0x0185 }
                long r8 = r3.b()     // Catch:{ IOException -> 0x0185 }
                androidx.exifinterface.media.a$f r4 = new androidx.exifinterface.media.a$f     // Catch:{ IOException -> 0x0185 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x00aa
            L_0x00c0:
                r3.close()     // Catch:{ IOException -> 0x00c4 }
                goto L_0x00c8
            L_0x00c4:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c8:
                return r11
            L_0x00c9:
                int r11 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x00cd:
                int r4 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x00da
                long r6 = r3.b()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x00cd
            L_0x00da:
                r3.close()     // Catch:{ IOException -> 0x00de }
                goto L_0x00e2
            L_0x00de:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e2:
                return r11
            L_0x00e3:
                int r11 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x00e7:
                int r4 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x00f4
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x00e7
            L_0x00f4:
                r3.close()     // Catch:{ IOException -> 0x00f8 }
                goto L_0x00fc
            L_0x00f8:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fc:
                return r11
            L_0x00fd:
                int r11 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                byte[] r6 = androidx.exifinterface.media.a.Y     // Catch:{ IOException -> 0x0185 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0185 }
                if (r11 < r6) goto L_0x011a
                r11 = 0
            L_0x0105:
                byte[] r6 = androidx.exifinterface.media.a.Y     // Catch:{ IOException -> 0x0185 }
                int r7 = r6.length     // Catch:{ IOException -> 0x0185 }
                if (r11 >= r7) goto L_0x0117
                byte[] r7 = r10.f10261d     // Catch:{ IOException -> 0x0185 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0185 }
                byte r8 = r6[r11]     // Catch:{ IOException -> 0x0185 }
                if (r7 == r8) goto L_0x0114
                r4 = 0
                goto L_0x0117
            L_0x0114:
                int r11 = r11 + 1
                goto L_0x0105
            L_0x0117:
                if (r4 == 0) goto L_0x011a
                int r5 = r6.length     // Catch:{ IOException -> 0x0185 }
            L_0x011a:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0185 }
                r11.<init>()     // Catch:{ IOException -> 0x0185 }
            L_0x011f:
                int r4 = r10.f10259b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x013b
                byte[] r4 = r10.f10261d     // Catch:{ IOException -> 0x0185 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0185 }
                if (r4 != 0) goto L_0x012a
                goto L_0x013b
            L_0x012a:
                r6 = 32
                if (r4 < r6) goto L_0x0133
                char r4 = (char) r4     // Catch:{ IOException -> 0x0185 }
                r11.append(r4)     // Catch:{ IOException -> 0x0185 }
                goto L_0x0138
            L_0x0133:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0185 }
            L_0x0138:
                int r5 = r5 + 1
                goto L_0x011f
            L_0x013b:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0185 }
                r3.close()     // Catch:{ IOException -> 0x0143 }
                goto L_0x0147
            L_0x0143:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0147:
                return r11
            L_0x0148:
                byte[] r11 = r10.f10261d     // Catch:{ IOException -> 0x0185 }
                int r6 = r11.length     // Catch:{ IOException -> 0x0185 }
                if (r6 != r4) goto L_0x016c
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0185 }
                if (r6 < 0) goto L_0x016c
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0185 }
                if (r6 > r4) goto L_0x016c
                java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x0185 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0185 }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0185 }
                int r11 = r11 + 48
                char r11 = (char) r11     // Catch:{ IOException -> 0x0185 }
                r4[r5] = r11     // Catch:{ IOException -> 0x0185 }
                r6.<init>(r4)     // Catch:{ IOException -> 0x0185 }
                r3.close()     // Catch:{ IOException -> 0x0167 }
                goto L_0x016b
            L_0x0167:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x016b:
                return r6
            L_0x016c:
                java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0185 }
                java.nio.charset.Charset r5 = androidx.exifinterface.media.a.f10220p0     // Catch:{ IOException -> 0x0185 }
                r4.<init>(r11, r5)     // Catch:{ IOException -> 0x0185 }
                r3.close()     // Catch:{ IOException -> 0x0177 }
                goto L_0x017b
            L_0x0177:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x017b:
                return r4
            L_0x017c:
                r3.close()     // Catch:{ IOException -> 0x0180 }
                goto L_0x0184
            L_0x0180:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0184:
                return r2
            L_0x0185:
                r11 = move-exception
                goto L_0x018b
            L_0x0187:
                r11 = move-exception
                goto L_0x019d
            L_0x0189:
                r11 = move-exception
                r3 = r2
            L_0x018b:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x019b }
                if (r3 == 0) goto L_0x019a
                r3.close()     // Catch:{ IOException -> 0x0196 }
                goto L_0x019a
            L_0x0196:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x019a:
                return r2
            L_0x019b:
                r11 = move-exception
                r2 = r3
            L_0x019d:
                if (r2 == 0) goto L_0x01a7
                r2.close()     // Catch:{ IOException -> 0x01a3 }
                goto L_0x01a7
            L_0x01a3:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01a7:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return a.X[this.f10258a] * this.f10259b;
        }

        public String toString() {
            return "(" + a.W[this.f10258a] + ", data length:" + this.f10261d.length + ")";
        }

        d(int i11, int i12, long j, byte[] bArr) {
            this.f10258a = i11;
            this.f10259b = i12;
            this.f10260c = j;
            this.f10261d = bArr;
        }
    }

    /* compiled from: ExifInterface */
    private static class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f10266a;

        /* renamed from: b  reason: collision with root package name */
        public final long f10267b;

        f(double d11) {
            this((long) (d11 * 10000.0d), 10000);
        }

        public double a() {
            return ((double) this.f10266a) / ((double) this.f10267b);
        }

        public String toString() {
            return this.f10266a + "/" + this.f10267b;
        }

        f(long j, long j11) {
            if (j11 == 0) {
                this.f10266a = 0;
                this.f10267b = 1;
                return;
            }
            this.f10266a = j;
            this.f10267b = j11;
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", WGL4Names.NUMBER_OF_MAC_GLYPHS, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD, 1)};
        Z = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f10205a0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f10206b0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f10207c0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", WGL4Names.NUMBER_OF_MAC_GLYPHS, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Xmp", OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD, 1), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f10208d0 = eVarArr5;
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f10210f0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", WGL4Names.NUMBER_OF_MAC_GLYPHS, 4)};
        f10211g0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f10212h0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f10213i0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f10214j0 = eVarArr10;
        f10216l0 = new HashMap[eVarArr10.length];
        f10217m0 = new HashMap[eVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        f10220p0 = forName;
        f10221q0 = "Exif\u0000\u0000".getBytes(forName);
        f10222r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        U = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i11 = 0;
        while (true) {
            e[][] eVarArr11 = f10214j0;
            if (i11 < eVarArr11.length) {
                f10216l0[i11] = new HashMap<>();
                f10217m0[i11] = new HashMap<>();
                for (e eVar : eVarArr11[i11]) {
                    f10216l0[i11].put(Integer.valueOf(eVar.f10262a), eVar);
                    f10217m0[i11].put(eVar.f10263b, eVar);
                }
                i11++;
            } else {
                HashMap<Integer, Integer> hashMap = f10219o0;
                e[] eVarArr12 = f10215k0;
                hashMap.put(Integer.valueOf(eVarArr12[0].f10262a), 5);
                hashMap.put(Integer.valueOf(eVarArr12[1].f10262a), 1);
                hashMap.put(Integer.valueOf(eVarArr12[2].f10262a), 2);
                hashMap.put(Integer.valueOf(eVarArr12[3].f10262a), 3);
                hashMap.put(Integer.valueOf(eVarArr12[4].f10262a), 7);
                hashMap.put(Integer.valueOf(eVarArr12[5].f10262a), 8);
                return;
            }
        }
    }

    public a(File file) throws IOException {
        e[][] eVarArr = f10214j0;
        this.f10236f = new HashMap[eVarArr.length];
        this.f10237g = new HashSet(eVarArr.length);
        this.f10238h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(file, "file cannot be null");
        B(file.getAbsolutePath());
    }

    private void A(b bVar, HashMap hashMap) throws IOException {
        b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        d dVar = (d) hashMap2.get("StripOffsets");
        d dVar2 = (d) hashMap2.get("StripByteCounts");
        if (dVar != null && dVar2 != null) {
            long[] d11 = b.d(dVar.o(this.f10238h));
            long[] d12 = b.d(dVar2.o(this.f10238h));
            if (d11 == null || d11.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            } else if (d12 == null || d12.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            } else if (d11.length != d12.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            } else {
                long j11 = 0;
                for (long j12 : d12) {
                    j11 += j12;
                }
                int i11 = (int) j11;
                byte[] bArr = new byte[i11];
                int i12 = 1;
                this.k = true;
                this.j = true;
                this.f10239i = true;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (i13 < d11.length) {
                    int i16 = (int) d11[i13];
                    int i17 = (int) d12[i13];
                    if (i13 < d11.length - i12 && ((long) (i16 + i17)) != d11[i13 + 1]) {
                        this.k = false;
                    }
                    int i18 = i16 - i14;
                    if (i18 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j13 = (long) i18;
                    if (bVar2.skip(j13) != j13) {
                        Log.d("ExifInterface", "Failed to skip " + i18 + " bytes.");
                        return;
                    }
                    int i19 = i14 + i18;
                    byte[] bArr2 = new byte[i17];
                    if (bVar2.read(bArr2) != i17) {
                        Log.d("ExifInterface", "Failed to read " + i17 + " bytes.");
                        return;
                    }
                    i14 = i19 + i17;
                    System.arraycopy(bArr2, 0, bArr, i15, i17);
                    i15 += i17;
                    i13++;
                    i12 = 1;
                }
                this.n = bArr;
                if (this.k) {
                    this.f10240l = (int) d11[0];
                    this.f10241m = i11;
                }
            }
        }
    }

    private void B(String str) throws IOException {
        FileInputStream fileInputStream;
        Throwable th2;
        Objects.requireNonNull(str, "filename cannot be null");
        this.f10233c = null;
        this.f10231a = str;
        try {
            fileInputStream = h.b.c(new FileInputStream(str), str);
            try {
                if (K(fileInputStream.getFD())) {
                    this.f10232b = fileInputStream.getFD();
                } else {
                    this.f10232b = null;
                }
                P(fileInputStream);
                b.c(fileInputStream);
            } catch (Throwable th3) {
                th2 = th3;
                b.c(fileInputStream);
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            fileInputStream = null;
            b.c(fileInputStream);
            throw th2;
        }
    }

    private static boolean C(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f10221q0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i11 = 0;
        while (true) {
            byte[] bArr3 = f10221q0;
            if (i11 >= bArr3.length) {
                return true;
            }
            if (bArr2[i11] != bArr3[i11]) {
                return false;
            }
            i11++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0092 A[Catch:{ all -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean E(byte[] r15) throws java.io.IOException {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.a$b r2 = new androidx.exifinterface.media.a$b     // Catch:{ Exception -> 0x008d }
            r2.<init>((byte[]) r15)     // Catch:{ Exception -> 0x008d }
            int r1 = r2.readInt()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r1     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r2.read(r5)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            byte[] r6 = C     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r5 != 0) goto L_0x001e
            r2.close()
            return r0
        L_0x001e:
            r5 = 16
            r7 = 8
            r9 = 1
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0034
            long r3 = r2.readLong()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 >= 0) goto L_0x0035
            r2.close()
            return r0
        L_0x0034:
            r5 = r7
        L_0x0035:
            int r11 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r11 = (long) r11     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            int r13 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x003d
            int r15 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r15
        L_0x003d:
            long r3 = r3 - r5
            int r15 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r15 >= 0) goto L_0x0046
            r2.close()
            return r0
        L_0x0046:
            byte[] r15 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r5 = 0
            r7 = 0
            r8 = 0
        L_0x004c:
            r11 = 4
            long r11 = r3 / r11
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0081
            int r11 = r2.read(r15)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == r1) goto L_0x005e
            r2.close()
            return r0
        L_0x005e:
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0063
            goto L_0x007f
        L_0x0063:
            byte[] r11 = D     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r12 = 1
            if (r11 == 0) goto L_0x006e
            r7 = 1
            goto L_0x0077
        L_0x006e:
            byte[] r11 = E     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == 0) goto L_0x0077
            r8 = 1
        L_0x0077:
            if (r7 == 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            r2.close()
            return r12
        L_0x007f:
            long r5 = r5 + r9
            goto L_0x004c
        L_0x0081:
            r2.close()
            goto L_0x009e
        L_0x0085:
            r15 = move-exception
            r1 = r2
            goto L_0x009f
        L_0x0088:
            r15 = move-exception
            r1 = r2
            goto L_0x008e
        L_0x008b:
            r15 = move-exception
            goto L_0x009f
        L_0x008d:
            r15 = move-exception
        L_0x008e:
            boolean r2 = v     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = "ExifInterface"
            java.lang.String r3 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r3, r15)     // Catch:{ all -> 0x008b }
        L_0x0099:
            if (r1 == 0) goto L_0x009e
            r1.close()
        L_0x009e:
            return r0
        L_0x009f:
            if (r1 == 0) goto L_0x00a4
            r1.close()
        L_0x00a4:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.E(byte[]):boolean");
    }

    private static boolean F(byte[] bArr) throws IOException {
        int i11 = 0;
        while (true) {
            byte[] bArr2 = B;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean G(byte[] r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.a$b r2 = new androidx.exifinterface.media.a$b     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            java.nio.ByteOrder r4 = r3.S(r2)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r3.f10238h = r4     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r2.f(r4)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L_0x001c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r2.close()
            return r0
        L_0x0021:
            r4 = move-exception
            r1 = r2
            goto L_0x0027
        L_0x0024:
            r1 = r2
            goto L_0x002e
        L_0x0026:
            r4 = move-exception
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            throw r4
        L_0x002d:
        L_0x002e:
            if (r1 == 0) goto L_0x0033
            r1.close()
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.G(byte[]):boolean");
    }

    private boolean H(byte[] bArr) throws IOException {
        int i11 = 0;
        while (true) {
            byte[] bArr2 = H;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    private boolean I(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i11 = 0; i11 < bytes.length; i11++) {
            if (bArr[i11] != bytes[i11]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean J(byte[] r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.a$b r2 = new androidx.exifinterface.media.a$b     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            java.nio.ByteOrder r4 = r3.S(r2)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r3.f10238h = r4     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r2.f(r4)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r1 = 85
            if (r4 != r1) goto L_0x0019
            r0 = 1
        L_0x0019:
            r2.close()
            return r0
        L_0x001d:
            r4 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x0020:
            r1 = r2
            goto L_0x002a
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()
        L_0x0028:
            throw r4
        L_0x0029:
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.J(byte[]):boolean");
    }

    private static boolean K(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean L(HashMap hashMap) throws IOException {
        d dVar;
        int m11;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f10238h);
            int[] iArr2 = f10229y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f10234d == 3 && (dVar = (d) hashMap.get("PhotometricInterpretation")) != null && (((m11 = dVar.m(this.f10238h)) == 1 && Arrays.equals(iArr, A)) || (m11 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private static boolean M(int i11) {
        return i11 == 4 || i11 == 13 || i11 == 14 || i11 == 3 || i11 == 0;
    }

    private boolean N(HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f10238h) <= 512 && dVar2.m(this.f10238h) <= 512;
    }

    private boolean O(byte[] bArr) throws IOException {
        int i11 = 0;
        while (true) {
            byte[] bArr2 = L;
            if (i11 >= bArr2.length) {
                int i12 = 0;
                while (true) {
                    byte[] bArr3 = M;
                    if (i12 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[L.length + i12 + 4] != bArr3[i12]) {
                        return false;
                    }
                    i12++;
                }
            } else if (bArr[i11] != bArr2[i11]) {
                return false;
            } else {
                i11++;
            }
        }
    }

    private void P(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        int i11 = 0;
        while (i11 < f10214j0.length) {
            try {
                this.f10236f[i11] = new HashMap<>();
                i11++;
            } catch (IOException | UnsupportedOperationException e11) {
                boolean z11 = v;
                if (z11) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e11);
                }
                a();
                if (!z11) {
                    return;
                }
            } catch (Throwable th2) {
                a();
                if (v) {
                    R();
                }
                throw th2;
            }
        }
        if (!this.f10235e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, CrashSender.CRASH_COLLECTOR_TIMEOUT);
            this.f10234d = n(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (g0(this.f10234d)) {
            g gVar = new g(inputStream);
            if (this.f10235e) {
                u(gVar);
            } else {
                int i12 = this.f10234d;
                if (i12 == 12) {
                    k(gVar);
                } else if (i12 == 7) {
                    o(gVar);
                } else if (i12 == 10) {
                    t(gVar);
                } else {
                    r(gVar);
                }
            }
            gVar.j((long) this.f10243p);
            f0(gVar);
        } else {
            b bVar = new b(inputStream);
            int i13 = this.f10234d;
            if (i13 == 4) {
                l(bVar, 0, 0);
            } else if (i13 == 13) {
                p(bVar);
            } else if (i13 == 9) {
                q(bVar);
            } else if (i13 == 14) {
                x(bVar);
            }
        }
        a();
        if (!v) {
            return;
        }
        R();
    }

    private void Q(b bVar) throws IOException {
        ByteOrder S2 = S(bVar);
        this.f10238h = S2;
        bVar.f(S2);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i11 = this.f10234d;
        if (i11 == 7 || i11 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt >= 8) {
                int i12 = readInt - 8;
                if (i12 > 0) {
                    bVar.g(i12);
                    return;
                }
                return;
            }
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    private void R() {
        for (int i11 = 0; i11 < this.f10236f.length; i11++) {
            Log.d("ExifInterface", "The size of tag group[" + i11 + "]: " + this.f10236f[i11].size());
            for (Map.Entry next : this.f10236f[i11].entrySet()) {
                d dVar = (d) next.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) next.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.n(this.f10238h) + "'");
            }
        }
    }

    private ByteOrder S(b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    private void T(byte[] bArr, int i11) throws IOException {
        g gVar = new g(bArr);
        Q(gVar);
        U(gVar, i11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0283  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void U(androidx.exifinterface.media.a.g r30, int r31) throws java.io.IOException {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            java.util.Set<java.lang.Integer> r3 = r0.f10237g
            int r4 = r1.f10254c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            short r3 = r30.readShort()
            boolean r4 = v
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x002f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x002f:
            if (r3 > 0) goto L_0x0032
            return
        L_0x0032:
            r4 = 0
            r6 = 0
        L_0x0034:
            r7 = 5
            if (r6 >= r3) goto L_0x0323
            int r12 = r30.readUnsignedShort()
            int r13 = r30.readUnsignedShort()
            int r15 = r30.readInt()
            int r14 = r30.a()
            long r8 = (long) r14
            r18 = 4
            long r8 = r8 + r18
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.a$e>[] r14 = f10216l0
            r14 = r14[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Object r11 = r14.get(r11)
            androidx.exifinterface.media.a$e r11 = (androidx.exifinterface.media.a.e) r11
            boolean r14 = v
            r10 = 3
            if (r14 == 0) goto L_0x0090
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r23 = java.lang.Integer.valueOf(r31)
            r7[r4] = r23
            java.lang.Integer r23 = java.lang.Integer.valueOf(r12)
            r21 = 1
            r7[r21] = r23
            if (r11 == 0) goto L_0x0074
            java.lang.String r4 = r11.f10263b
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            r22 = 2
            r7[r22] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r7[r10] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r20 = 4
            r7[r20] = r4
            java.lang.String r4 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r4 = java.lang.String.format(r4, r7)
            android.util.Log.d(r5, r4)
        L_0x0090:
            r4 = 7
            if (r11 != 0) goto L_0x00ae
            if (r14 == 0) goto L_0x00a9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "Skip the tag entry since tag number is not defined: "
            r7.append(r10)
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
        L_0x00a9:
            r10 = r5
            r25 = r6
            goto L_0x012e
        L_0x00ae:
            if (r13 <= 0) goto L_0x0115
            int[] r7 = X
            int r10 = r7.length
            if (r13 < r10) goto L_0x00b6
            goto L_0x0115
        L_0x00b6:
            boolean r10 = r11.a(r13)
            if (r10 != 0) goto L_0x00e1
            if (r14 == 0) goto L_0x00a9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "Skip the tag entry since data format ("
            r7.append(r10)
            java.lang.String[] r10 = W
            r10 = r10[r13]
            r7.append(r10)
            java.lang.String r10 = ") is unexpected for tag: "
            r7.append(r10)
            java.lang.String r10 = r11.f10263b
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
            goto L_0x00a9
        L_0x00e1:
            if (r13 != r4) goto L_0x00e5
            int r13 = r11.f10264c
        L_0x00e5:
            r10 = r5
            long r4 = (long) r15
            r7 = r7[r13]
            r25 = r6
            long r6 = (long) r7
            long r4 = r4 * r6
            r6 = 0
            int r26 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r26 < 0) goto L_0x00fe
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r26 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r26 <= 0) goto L_0x00fc
            goto L_0x00fe
        L_0x00fc:
            r6 = 1
            goto L_0x0131
        L_0x00fe:
            if (r14 == 0) goto L_0x0130
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since the number of components is invalid: "
            r6.append(r7)
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r10, r6)
            goto L_0x0130
        L_0x0115:
            r10 = r5
            r25 = r6
            if (r14 == 0) goto L_0x012e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Skip the tag entry since data format is invalid: "
            r4.append(r5)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r10, r4)
        L_0x012e:
            r4 = 0
        L_0x0130:
            r6 = 0
        L_0x0131:
            if (r6 != 0) goto L_0x013b
            r1.j(r8)
            r26 = r3
            r8 = r10
            goto L_0x031a
        L_0x013b:
            java.lang.String r6 = "Compression"
            int r7 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r7 <= 0) goto L_0x01c5
            int r7 = r30.readInt()
            r26 = r3
            if (r14 == 0) goto L_0x0160
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r27 = r8
            java.lang.String r8 = "seek to data offset: "
            r3.append(r8)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r10, r3)
            goto L_0x0162
        L_0x0160:
            r27 = r8
        L_0x0162:
            int r3 = r0.f10234d
            r8 = 7
            if (r3 != r8) goto L_0x01bc
            java.lang.String r3 = r11.f10263b
            java.lang.String r8 = "MakerNote"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0174
            r0.q = r7
            goto L_0x01bc
        L_0x0174:
            r3 = 6
            if (r2 != r3) goto L_0x01bc
            java.lang.String r8 = r11.f10263b
            java.lang.String r9 = "ThumbnailImage"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x01bc
            r0.f10244r = r7
            r0.f10245s = r15
            java.nio.ByteOrder r8 = r0.f10238h
            androidx.exifinterface.media.a$d r3 = androidx.exifinterface.media.a.d.j(r3, r8)
            int r8 = r0.f10244r
            long r8 = (long) r8
            r18 = r15
            java.nio.ByteOrder r15 = r0.f10238h
            androidx.exifinterface.media.a$d r8 = androidx.exifinterface.media.a.d.f(r8, r15)
            int r9 = r0.f10245s
            r24 = r10
            long r9 = (long) r9
            java.nio.ByteOrder r15 = r0.f10238h
            androidx.exifinterface.media.a$d r9 = androidx.exifinterface.media.a.d.f(r9, r15)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r10 = r0.f10236f
            r15 = 4
            r10 = r10[r15]
            r10.put(r6, r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f10236f
            r3 = r3[r15]
            java.lang.String r10 = "JPEGInterchangeFormat"
            r3.put(r10, r8)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f10236f
            r3 = r3[r15]
            java.lang.String r8 = "JPEGInterchangeFormatLength"
            r3.put(r8, r9)
            goto L_0x01c0
        L_0x01bc:
            r24 = r10
            r18 = r15
        L_0x01c0:
            long r7 = (long) r7
            r1.j(r7)
            goto L_0x01cd
        L_0x01c5:
            r26 = r3
            r27 = r8
            r24 = r10
            r18 = r15
        L_0x01cd:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r3 = f10219o0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            java.lang.Object r3 = r3.get(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r14 == 0) goto L_0x01fa
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "nextIfdType: "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = " byteCount: "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            r8 = r24
            android.util.Log.d(r8, r7)
            goto L_0x01fc
        L_0x01fa:
            r8 = r24
        L_0x01fc:
            r7 = 8
            if (r3 == 0) goto L_0x02a0
            r4 = -1
            r6 = 3
            if (r13 == r6) goto L_0x0222
            r6 = 4
            if (r13 == r6) goto L_0x021d
            if (r13 == r7) goto L_0x0218
            r6 = 9
            if (r13 == r6) goto L_0x0213
            r6 = 13
            if (r13 == r6) goto L_0x0213
            goto L_0x0227
        L_0x0213:
            int r4 = r30.readInt()
            goto L_0x0226
        L_0x0218:
            short r4 = r30.readShort()
            goto L_0x0226
        L_0x021d:
            long r4 = r30.b()
            goto L_0x0227
        L_0x0222:
            int r4 = r30.readUnsignedShort()
        L_0x0226:
            long r4 = (long) r4
        L_0x0227:
            if (r14 == 0) goto L_0x0241
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            r9 = 0
            r6[r9] = r7
            java.lang.String r7 = r11.f10263b
            r9 = 1
            r6[r9] = r7
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.d(r8, r6)
        L_0x0241:
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0283
            java.util.Set<java.lang.Integer> r6 = r0.f10237g
            int r7 = (int) r4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x025f
            r1.j(r4)
            int r3 = r3.intValue()
            r0.U(r1, r3)
            goto L_0x0299
        L_0x025f:
            if (r14 == 0) goto L_0x0299
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = " (at "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = ")"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            android.util.Log.d(r8, r3)
            goto L_0x0299
        L_0x0283:
            if (r14 == 0) goto L_0x0299
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Skip jump into the IFD since its offset is invalid: "
            r3.append(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r8, r3)
        L_0x0299:
            r9 = r27
            r1.j(r9)
            goto L_0x031a
        L_0x02a0:
            r9 = r27
            int r3 = r30.a()
            int r12 = r0.f10243p
            int r3 = r3 + r12
            int r5 = (int) r4
            byte[] r4 = new byte[r5]
            r1.readFully(r4)
            androidx.exifinterface.media.a$d r5 = new androidx.exifinterface.media.a$d
            long r14 = (long) r3
            r19 = r14
            r14 = r5
            r3 = r18
            r15 = r13
            r16 = r3
            r17 = r19
            r19 = r4
            r14.<init>(r15, r16, r17, r19)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f10236f
            r3 = r3[r2]
            java.lang.String r4 = r11.f10263b
            r3.put(r4, r5)
            java.lang.String r3 = r11.f10263b
            java.lang.String r4 = "DNGVersion"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x02d7
            r3 = 3
            r0.f10234d = r3
        L_0x02d7:
            java.lang.String r3 = r11.f10263b
            java.lang.String r4 = "Make"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x02eb
            java.lang.String r3 = r11.f10263b
            java.lang.String r4 = "Model"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x02f9
        L_0x02eb:
            java.nio.ByteOrder r3 = r0.f10238h
            java.lang.String r3 = r5.n(r3)
            java.lang.String r4 = "PENTAX"
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x030c
        L_0x02f9:
            java.lang.String r3 = r11.f10263b
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x030e
            java.nio.ByteOrder r3 = r0.f10238h
            int r3 = r5.m(r3)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r4) goto L_0x030e
        L_0x030c:
            r0.f10234d = r7
        L_0x030e:
            int r3 = r30.a()
            long r3 = (long) r3
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x031a
            r1.j(r9)
        L_0x031a:
            int r6 = r25 + 1
            short r6 = (short) r6
            r5 = r8
            r3 = r26
            r4 = 0
            goto L_0x0034
        L_0x0323:
            r8 = r5
            int r2 = r30.readInt()
            boolean r3 = v
            if (r3 == 0) goto L_0x033f
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            android.util.Log.d(r8, r4)
        L_0x033f:
            long r4 = (long) r2
            r9 = 0
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0389
            java.util.Set<java.lang.Integer> r6 = r0.f10237g
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            boolean r6 = r6.contains(r9)
            if (r6 != 0) goto L_0x0372
            r1.j(r4)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r2 = r0.f10236f
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0364
            r0.U(r1, r3)
            goto L_0x039f
        L_0x0364:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r2 = r0.f10236f
            r2 = r2[r7]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x039f
            r0.U(r1, r7)
            goto L_0x039f
        L_0x0372:
            if (r3 == 0) goto L_0x039f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r8, r1)
            goto L_0x039f
        L_0x0389:
            if (r3 == 0) goto L_0x039f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r8, r1)
        L_0x039f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.U(androidx.exifinterface.media.a$g, int):void");
    }

    private void V(String str) {
        for (int i11 = 0; i11 < f10214j0.length; i11++) {
            this.f10236f[i11].remove(str);
        }
    }

    private void W(int i11, String str, String str2) {
        if (!this.f10236f[i11].isEmpty() && this.f10236f[i11].get(str) != null) {
            HashMap<String, d>[] hashMapArr = this.f10236f;
            hashMapArr[i11].put(str2, hashMapArr[i11].get(str));
            this.f10236f[i11].remove(str);
        }
    }

    private void X(g gVar, int i11) throws IOException {
        d dVar = this.f10236f[i11].get("ImageLength");
        d dVar2 = this.f10236f[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f10236f[i11].get("JPEGInterchangeFormat");
            d dVar4 = this.f10236f[i11].get("JPEGInterchangeFormatLength");
            if (dVar3 != null && dVar4 != null) {
                int m11 = dVar3.m(this.f10238h);
                int m12 = dVar3.m(this.f10238h);
                gVar.j((long) m11);
                byte[] bArr = new byte[m12];
                gVar.read(bArr);
                l(new b(bArr), m11, i11);
            }
        }
    }

    private void Z(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() == -1) {
            cVar.b(-1);
            if (bVar.readByte() == -40) {
                cVar.b(-40);
                d dVar = null;
                if (g("Xmp") != null && this.f10246u) {
                    dVar = this.f10236f[0].remove("Xmp");
                }
                cVar.b(-1);
                cVar.b(-31);
                k0(cVar);
                if (dVar != null) {
                    this.f10236f[0].put("Xmp", dVar);
                }
                byte[] bArr = new byte[4096];
                while (bVar.readByte() == -1) {
                    byte readByte = bVar.readByte();
                    if (readByte == -39 || readByte == -38) {
                        cVar.b(-1);
                        cVar.b(readByte);
                        b.e(bVar, cVar);
                        return;
                    } else if (readByte != -31) {
                        cVar.b(-1);
                        cVar.b(readByte);
                        int readUnsignedShort = bVar.readUnsignedShort();
                        cVar.t(readUnsignedShort);
                        int i11 = readUnsignedShort - 2;
                        if (i11 >= 0) {
                            while (i11 > 0) {
                                int read = bVar.read(bArr, 0, Math.min(i11, 4096));
                                if (read < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read);
                                i11 -= read;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = bVar.readUnsignedShort() - 2;
                        if (readUnsignedShort2 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (readUnsignedShort2 >= 6) {
                                if (bVar.read(bArr2) != 6) {
                                    throw new IOException("Invalid exif");
                                } else if (Arrays.equals(bArr2, f10221q0)) {
                                    bVar.g(readUnsignedShort2 - 6);
                                }
                            }
                            cVar.b(-1);
                            cVar.b(readByte);
                            cVar.t(readUnsignedShort2 + 2);
                            if (readUnsignedShort2 >= 6) {
                                readUnsignedShort2 -= 6;
                                cVar.write(bArr2);
                            }
                            while (readUnsignedShort2 > 0) {
                                int read2 = bVar.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                if (read2 < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read2);
                                readUnsignedShort2 -= read2;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    private void a() {
        String g11 = g("DateTimeOriginal");
        if (g11 != null && g("DateTime") == null) {
            this.f10236f[0].put("DateTime", d.e(g11));
        }
        if (g("ImageWidth") == null) {
            this.f10236f[0].put("ImageWidth", d.f(0, this.f10238h));
        }
        if (g("ImageLength") == null) {
            this.f10236f[0].put("ImageLength", d.f(0, this.f10238h));
        }
        if (g("Orientation") == null) {
            this.f10236f[0].put("Orientation", d.f(0, this.f10238h));
        }
        if (g("LightSource") == null) {
            this.f10236f[1].put("LightSource", d.f(0, this.f10238h));
        }
    }

    private void a0(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = H;
        b.f(bVar, cVar, bArr.length);
        int i11 = this.f10243p;
        if (i11 == 0) {
            int readInt = bVar.readInt();
            cVar.f(readInt);
            b.f(bVar, cVar, readInt + 4 + 4);
        } else {
            b.f(bVar, cVar, ((i11 - bArr.length) - 4) - 4);
            bVar.g(bVar.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                k0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f10256a).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.f((int) crc32.getValue());
                b.c(byteArrayOutputStream2);
                b.e(bVar, cVar);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                b.c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            b.c(byteArrayOutputStream);
            throw th;
        }
    }

    private String b(double d11) {
        long j11 = (long) d11;
        double d12 = d11 - ((double) j11);
        long j12 = (long) (d12 * 60.0d);
        long round = Math.round((d12 - (((double) j12) / 60.0d)) * 3600.0d * 1.0E7d);
        return j11 + "/1," + j12 + "/1," + round + "/10000000";
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ab A[Catch:{ Exception -> 0x01f0, all -> 0x01ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01b7 A[Catch:{ Exception -> 0x01f0, all -> 0x01ed }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b0(java.io.InputStream r21, java.io.OutputStream r22) throws java.io.IOException {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            boolean r3 = v
            if (r3 == 0) goto L_0x002d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "saveWebpAttributes starting with (inputStream: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ", outputStream: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ExifInterface"
            android.util.Log.d(r4, r3)
        L_0x002d:
            androidx.exifinterface.media.a$b r3 = new androidx.exifinterface.media.a$b
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            r3.<init>(r0, r4)
            androidx.exifinterface.media.a$c r5 = new androidx.exifinterface.media.a$c
            r5.<init>(r2, r4)
            byte[] r2 = L
            int r6 = r2.length
            androidx.exifinterface.media.b.f(r3, r5, r6)
            byte[] r6 = M
            int r7 = r6.length
            r8 = 4
            int r7 = r7 + r8
            r3.g(r7)
            r7 = 0
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x01f5 }
            r9.<init>()     // Catch:{ Exception -> 0x01f5 }
            androidx.exifinterface.media.a$c r10 = new androidx.exifinterface.media.a$c     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r10.<init>(r9, r4)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            int r4 = r1.f10243p     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            if (r4 == 0) goto L_0x006f
            int r0 = r2.length     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            int r0 = r0 + r8
            int r2 = r6.length     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            int r0 = r0 + r2
            int r4 = r4 - r0
            int r4 = r4 - r8
            int r4 = r4 - r8
            androidx.exifinterface.media.b.f(r3, r10, r4)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r3.g(r8)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            int r0 = r3.readInt()     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r3.g(r0)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r1.k0(r10)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            goto L_0x01cd
        L_0x006f:
            byte[] r2 = new byte[r8]     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            int r4 = r3.read(r2)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            if (r4 != r8) goto L_0x01e5
            byte[] r4 = P     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            boolean r6 = java.util.Arrays.equals(r2, r4)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r11 = 8
            r12 = 1
            r13 = 0
            if (r6 == 0) goto L_0x00d4
            int r2 = r3.readInt()     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            int r6 = r2 % 2
            if (r6 != r12) goto L_0x008e
            int r6 = r2 + 1
            goto L_0x008f
        L_0x008e:
            r6 = r2
        L_0x008f:
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r3.read(r6)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            byte r14 = r6[r13]     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r11 = r11 | r14
            byte r11 = (byte) r11     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r6[r13] = r11     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            byte r11 = r6[r13]     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            int r11 = r11 >> r12
            r11 = r11 & r12
            if (r11 != r12) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r12 = 0
        L_0x00a2:
            r10.write(r4)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r10.f(r2)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r10.write(r6)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            if (r12 == 0) goto L_0x00c8
            byte[] r2 = S     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r1.d(r3, r10, r2, r7)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
        L_0x00b2:
            byte[] r2 = new byte[r8]     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r0.read(r2)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            byte[] r4 = T     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            boolean r4 = java.util.Arrays.equals(r2, r4)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            if (r4 != 0) goto L_0x00c4
            r1.k0(r10)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            goto L_0x01cd
        L_0x00c4:
            r1.e(r3, r10, r2)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            goto L_0x00b2
        L_0x00c8:
            byte[] r0 = R     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            byte[] r2 = Q     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r1.d(r3, r10, r0, r2)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r1.k0(r10)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            goto L_0x01cd
        L_0x00d4:
            byte[] r0 = R     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            boolean r6 = java.util.Arrays.equals(r2, r0)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            if (r6 != 0) goto L_0x00e4
            byte[] r6 = Q     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            boolean r6 = java.util.Arrays.equals(r2, r6)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            if (r6 == 0) goto L_0x01cd
        L_0x00e4:
            int r6 = r3.readInt()     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            int r7 = r6 % 2
            if (r7 != r12) goto L_0x00ef
            int r7 = r6 + 1
            goto L_0x00f0
        L_0x00ef:
            r7 = r6
        L_0x00f0:
            r14 = 3
            byte[] r15 = new byte[r14]     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            boolean r16 = java.util.Arrays.equals(r2, r0)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r8 = 47
            if (r16 == 0) goto L_0x0125
            r3.read(r15)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            byte[] r12 = new byte[r14]     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            int r11 = r3.read(r12)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            if (r11 != r14) goto L_0x011d
            byte[] r11 = O     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            boolean r11 = java.util.Arrays.equals(r11, r12)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            if (r11 == 0) goto L_0x011d
            int r11 = r3.readInt()     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            int r12 = r11 << 18
            int r12 = r12 >> 18
            int r14 = r11 << 2
            int r14 = r14 >> 18
            int r7 = r7 + -10
            goto L_0x0157
        L_0x011d:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            java.lang.String r2 = "Encountered error while checking VP8 signature"
            r0.<init>(r2)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            throw r0     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
        L_0x0125:
            byte[] r11 = Q     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            boolean r11 = java.util.Arrays.equals(r2, r11)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            if (r11 == 0) goto L_0x0154
            byte r11 = r3.readByte()     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            if (r11 != r8) goto L_0x014c
            int r11 = r3.readInt()     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            int r14 = r11 << 18
            int r14 = r14 >> 18
            int r14 = r14 + r12
            int r17 = r11 << 4
            int r17 = r17 >> 18
            int r12 = r17 + 1
            r17 = r11 & 8
            int r7 = r7 + -5
            r19 = r14
            r14 = r12
            r12 = r19
            goto L_0x0159
        L_0x014c:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            java.lang.String r2 = "Encountered error while checking VP8L signature"
            r0.<init>(r2)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            throw r0     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
        L_0x0154:
            r11 = 0
            r12 = 0
            r14 = 0
        L_0x0157:
            r17 = 0
        L_0x0159:
            r10.write(r4)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r4 = 10
            r10.f(r4)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            byte r18 = r4[r13]     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r16 = 8
            r8 = r18 | 8
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r4[r13] = r8     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            byte r8 = r4[r13]     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r18 = 4
            int r17 = r17 << 4
            r8 = r8 | r17
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r4[r13] = r8     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            int r12 = r12 + -1
            int r14 = r14 + -1
            byte r8 = (byte) r12     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r4[r18] = r8     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r8 = 5
            int r13 = r12 >> 8
            byte r13 = (byte) r13     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r4[r8] = r13     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r8 = 6
            int r12 = r12 >> 16
            byte r12 = (byte) r12     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r4[r8] = r12     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r8 = 7
            byte r12 = (byte) r14     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r4[r8] = r12     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            int r8 = r14 >> 8
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r12 = 8
            r4[r12] = r8     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r8 = 9
            int r12 = r14 >> 16
            byte r12 = (byte) r12     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r4[r8] = r12     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r10.write(r4)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r10.write(r2)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r10.f(r6)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            if (r0 == 0) goto L_0x01b7
            r10.write(r15)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            byte[] r0 = O     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r10.write(r0)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r10.f(r11)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            goto L_0x01c7
        L_0x01b7:
            byte[] r0 = Q     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            if (r0 == 0) goto L_0x01c7
            r0 = 47
            r10.write(r0)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r10.f(r11)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
        L_0x01c7:
            androidx.exifinterface.media.b.f(r3, r10, r7)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r1.k0(r10)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
        L_0x01cd:
            androidx.exifinterface.media.b.e(r3, r10)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            int r0 = r9.size()     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            byte[] r2 = M     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            int r3 = r2.length     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            int r0 = r0 + r3
            r5.f(r0)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r5.write(r2)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            r9.writeTo(r5)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            androidx.exifinterface.media.b.c(r9)
            return
        L_0x01e5:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            java.lang.String r2 = "Encountered invalid length while parsing WebP chunk type"
            r0.<init>(r2)     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
            throw r0     // Catch:{ Exception -> 0x01f0, all -> 0x01ed }
        L_0x01ed:
            r0 = move-exception
            r7 = r9
            goto L_0x01fe
        L_0x01f0:
            r0 = move-exception
            r7 = r9
            goto L_0x01f6
        L_0x01f3:
            r0 = move-exception
            goto L_0x01fe
        L_0x01f5:
            r0 = move-exception
        L_0x01f6:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x01f3 }
            java.lang.String r3 = "Failed to save WebP file"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x01f3 }
            throw r2     // Catch:{ all -> 0x01f3 }
        L_0x01fe:
            androidx.exifinterface.media.b.c(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.b0(java.io.InputStream, java.io.OutputStream):void");
    }

    private static double c(String str, String str2) {
        try {
            String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
            String[] split2 = split[0].split("/", -1);
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble = (Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim())) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S")) {
                if (!str2.equals(AFMParser.CHARMETRICS_W)) {
                    if (!str2.equals("N")) {
                        if (!str2.equals("E")) {
                            throw new IllegalArgumentException();
                        }
                    }
                    return parseDouble;
                }
            }
            return -parseDouble;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private void d(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f10220p0;
                sb2.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb2.append(str);
                throw new IOException(sb2.toString());
            }
            e(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void e(b bVar, c cVar, byte[] bArr) throws IOException {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.f(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        b.f(bVar, cVar, readInt);
    }

    private void f0(b bVar) throws IOException {
        HashMap<String, d> hashMap = this.f10236f[4];
        d dVar = hashMap.get("Compression");
        if (dVar != null) {
            int m11 = dVar.m(this.f10238h);
            this.f10242o = m11;
            if (m11 != 1) {
                if (m11 == 6) {
                    z(bVar, hashMap);
                    return;
                } else if (m11 != 7) {
                    return;
                }
            }
            if (L(hashMap)) {
                A(bVar, hashMap);
                return;
            }
            return;
        }
        this.f10242o = 6;
        z(bVar, hashMap);
    }

    private static boolean g0(int i11) {
        return (i11 == 4 || i11 == 9 || i11 == 13 || i11 == 14) ? false : true;
    }

    private void h0(int i11, int i12) throws IOException {
        if (!this.f10236f[i11].isEmpty() && !this.f10236f[i12].isEmpty()) {
            d dVar = this.f10236f[i11].get("ImageLength");
            d dVar2 = this.f10236f[i11].get("ImageWidth");
            d dVar3 = this.f10236f[i12].get("ImageLength");
            d dVar4 = this.f10236f[i12].get("ImageWidth");
            if (dVar == null || dVar2 == null) {
                if (v) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (dVar3 != null && dVar4 != null) {
                int m11 = dVar.m(this.f10238h);
                int m12 = dVar2.m(this.f10238h);
                int m13 = dVar3.m(this.f10238h);
                int m14 = dVar4.m(this.f10238h);
                if (m11 < m13 && m12 < m14) {
                    HashMap<String, d>[] hashMapArr = this.f10236f;
                    HashMap<String, d> hashMap = hashMapArr[i11];
                    hashMapArr[i11] = hashMapArr[i12];
                    hashMapArr[i12] = hashMap;
                }
            } else if (v) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (v) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    private void i0(g gVar, int i11) throws IOException {
        d dVar;
        d dVar2;
        d dVar3 = this.f10236f[i11].get("DefaultCropSize");
        d dVar4 = this.f10236f[i11].get("SensorTopBorder");
        d dVar5 = this.f10236f[i11].get("SensorLeftBorder");
        d dVar6 = this.f10236f[i11].get("SensorBottomBorder");
        d dVar7 = this.f10236f[i11].get("SensorRightBorder");
        if (dVar3 != null) {
            if (dVar3.f10258a == 5) {
                f[] fVarArr = (f[]) dVar3.o(this.f10238h);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                }
                dVar2 = d.h(fVarArr[0], this.f10238h);
                dVar = d.h(fVarArr[1], this.f10238h);
            } else {
                int[] iArr = (int[]) dVar3.o(this.f10238h);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                dVar2 = d.j(iArr[0], this.f10238h);
                dVar = d.j(iArr[1], this.f10238h);
            }
            this.f10236f[i11].put("ImageWidth", dVar2);
            this.f10236f[i11].put("ImageLength", dVar);
        } else if (dVar4 == null || dVar5 == null || dVar6 == null || dVar7 == null) {
            X(gVar, i11);
        } else {
            int m11 = dVar4.m(this.f10238h);
            int m12 = dVar6.m(this.f10238h);
            int m13 = dVar7.m(this.f10238h);
            int m14 = dVar5.m(this.f10238h);
            if (m12 > m11 && m13 > m14) {
                d j11 = d.j(m12 - m11, this.f10238h);
                d j12 = d.j(m13 - m14, this.f10238h);
                this.f10236f[i11].put("ImageLength", j11);
                this.f10236f[i11].put("ImageWidth", j12);
            }
        }
    }

    private d j(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i11 = 0; i11 < f10214j0.length; i11++) {
            d dVar = this.f10236f[i11].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    private void j0() throws IOException {
        h0(0, 5);
        h0(0, 4);
        h0(5, 4);
        d dVar = this.f10236f[1].get("PixelXDimension");
        d dVar2 = this.f10236f[1].get("PixelYDimension");
        if (!(dVar == null || dVar2 == null)) {
            this.f10236f[0].put("ImageWidth", dVar);
            this.f10236f[0].put("ImageLength", dVar2);
        }
        if (this.f10236f[4].isEmpty() && N(this.f10236f[5])) {
            HashMap<String, d>[] hashMapArr = this.f10236f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!N(this.f10236f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        W(0, "ThumbnailOrientation", "Orientation");
        W(0, "ThumbnailImageLength", "ImageLength");
        W(0, "ThumbnailImageWidth", "ImageWidth");
        W(5, "ThumbnailOrientation", "Orientation");
        W(5, "ThumbnailImageLength", "ImageLength");
        W(5, "ThumbnailImageWidth", "ImageWidth");
        W(4, "Orientation", "ThumbnailOrientation");
        W(4, "ImageLength", "ThumbnailImageLength");
        W(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0138, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0141, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0142, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0145, code lost:
        throw r13;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x013a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k(androidx.exifinterface.media.a.g r13) throws java.io.IOException {
        /*
            r12 = this;
            java.lang.String r0 = "yes"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x0146
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            androidx.exifinterface.media.a$a r2 = new androidx.exifinterface.media.a$a     // Catch:{ RuntimeException -> 0x013a }
            r2.<init>(r13)     // Catch:{ RuntimeException -> 0x013a }
            androidx.exifinterface.media.b.C0060b.a(r1, r2)     // Catch:{ RuntimeException -> 0x013a }
            r2 = 33
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch:{ RuntimeException -> 0x013a }
            r3 = 34
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch:{ RuntimeException -> 0x013a }
            r4 = 26
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x013a }
            r5 = 17
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x013a }
            boolean r4 = r0.equals(r4)     // Catch:{ RuntimeException -> 0x013a }
            r6 = 0
            if (r4 == 0) goto L_0x0047
            r0 = 29
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r0 = 30
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r4 = 31
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x013a }
            goto L_0x0062
        L_0x0047:
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x013a }
            if (r0 == 0) goto L_0x0060
            r0 = 18
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r0 = 19
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r4 = 24
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x013a }
            goto L_0x0062
        L_0x0060:
            r0 = r6
            r4 = r0
        L_0x0062:
            r5 = 0
            if (r6 == 0) goto L_0x0078
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r7 = r12.f10236f     // Catch:{ RuntimeException -> 0x013a }
            r7 = r7[r5]     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r8 = "ImageWidth"
            int r9 = java.lang.Integer.parseInt(r6)     // Catch:{ RuntimeException -> 0x013a }
            java.nio.ByteOrder r10 = r12.f10238h     // Catch:{ RuntimeException -> 0x013a }
            androidx.exifinterface.media.a$d r9 = androidx.exifinterface.media.a.d.j(r9, r10)     // Catch:{ RuntimeException -> 0x013a }
            r7.put(r8, r9)     // Catch:{ RuntimeException -> 0x013a }
        L_0x0078:
            if (r0 == 0) goto L_0x008d
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r7 = r12.f10236f     // Catch:{ RuntimeException -> 0x013a }
            r7 = r7[r5]     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r8 = "ImageLength"
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x013a }
            java.nio.ByteOrder r10 = r12.f10238h     // Catch:{ RuntimeException -> 0x013a }
            androidx.exifinterface.media.a$d r9 = androidx.exifinterface.media.a.d.j(r9, r10)     // Catch:{ RuntimeException -> 0x013a }
            r7.put(r8, r9)     // Catch:{ RuntimeException -> 0x013a }
        L_0x008d:
            r7 = 6
            if (r4 == 0) goto L_0x00b7
            r8 = 1
            int r9 = java.lang.Integer.parseInt(r4)     // Catch:{ RuntimeException -> 0x013a }
            r10 = 90
            if (r9 == r10) goto L_0x00a7
            r10 = 180(0xb4, float:2.52E-43)
            if (r9 == r10) goto L_0x00a5
            r10 = 270(0x10e, float:3.78E-43)
            if (r9 == r10) goto L_0x00a2
            goto L_0x00a8
        L_0x00a2:
            r8 = 8
            goto L_0x00a8
        L_0x00a5:
            r8 = 3
            goto L_0x00a8
        L_0x00a7:
            r8 = 6
        L_0x00a8:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r9 = r12.f10236f     // Catch:{ RuntimeException -> 0x013a }
            r9 = r9[r5]     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r10 = "Orientation"
            java.nio.ByteOrder r11 = r12.f10238h     // Catch:{ RuntimeException -> 0x013a }
            androidx.exifinterface.media.a$d r8 = androidx.exifinterface.media.a.d.j(r8, r11)     // Catch:{ RuntimeException -> 0x013a }
            r9.put(r10, r8)     // Catch:{ RuntimeException -> 0x013a }
        L_0x00b7:
            if (r2 == 0) goto L_0x010a
            if (r3 == 0) goto L_0x010a
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ RuntimeException -> 0x013a }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x013a }
            if (r3 <= r7) goto L_0x0102
            long r8 = (long) r2     // Catch:{ RuntimeException -> 0x013a }
            r13.j(r8)     // Catch:{ RuntimeException -> 0x013a }
            byte[] r8 = new byte[r7]     // Catch:{ RuntimeException -> 0x013a }
            int r9 = r13.read(r8)     // Catch:{ RuntimeException -> 0x013a }
            if (r9 != r7) goto L_0x00fa
            int r2 = r2 + r7
            int r3 = r3 + -6
            byte[] r7 = f10221q0     // Catch:{ RuntimeException -> 0x013a }
            boolean r7 = java.util.Arrays.equals(r8, r7)     // Catch:{ RuntimeException -> 0x013a }
            if (r7 == 0) goto L_0x00f2
            byte[] r7 = new byte[r3]     // Catch:{ RuntimeException -> 0x013a }
            int r13 = r13.read(r7)     // Catch:{ RuntimeException -> 0x013a }
            if (r13 != r3) goto L_0x00ea
            r12.f10243p = r2     // Catch:{ RuntimeException -> 0x013a }
            r12.T(r7, r5)     // Catch:{ RuntimeException -> 0x013a }
            goto L_0x010a
        L_0x00ea:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Can't read exif"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x00f2:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Invalid identifier"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x00fa:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Can't read identifier"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x0102:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Invalid exif length"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x010a:
            boolean r13 = v     // Catch:{ RuntimeException -> 0x013a }
            if (r13 == 0) goto L_0x0134
            java.lang.String r13 = "ExifInterface"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x013a }
            r2.<init>()     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r3 = "Heif meta: "
            r2.append(r3)     // Catch:{ RuntimeException -> 0x013a }
            r2.append(r6)     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch:{ RuntimeException -> 0x013a }
            r2.append(r0)     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = ", rotation "
            r2.append(r0)     // Catch:{ RuntimeException -> 0x013a }
            r2.append(r4)     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = r2.toString()     // Catch:{ RuntimeException -> 0x013a }
            android.util.Log.d(r13, r0)     // Catch:{ RuntimeException -> 0x013a }
        L_0x0134:
            r1.release()
            return
        L_0x0138:
            r13 = move-exception
            goto L_0x0142
        L_0x013a:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r13.<init>(r0)     // Catch:{ all -> 0x0138 }
            throw r13     // Catch:{ all -> 0x0138 }
        L_0x0142:
            r1.release()
            throw r13
        L_0x0146:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.k(androidx.exifinterface.media.a$g):void");
    }

    private int k0(c cVar) throws IOException {
        c cVar2 = cVar;
        e[][] eVarArr = f10214j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f10215k0) {
            V(eVar.f10263b);
        }
        if (this.f10239i) {
            if (this.j) {
                V("StripOffsets");
                V("StripByteCounts");
            } else {
                V("JPEGInterchangeFormat");
                V("JPEGInterchangeFormatLength");
            }
        }
        for (int i11 = 0; i11 < f10214j0.length; i11++) {
            for (Object obj : this.f10236f[i11].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f10236f[i11].remove(entry.getKey());
                }
            }
        }
        if (!this.f10236f[1].isEmpty()) {
            this.f10236f[0].put(f10215k0[1].f10263b, d.f(0, this.f10238h));
        }
        if (!this.f10236f[2].isEmpty()) {
            this.f10236f[0].put(f10215k0[2].f10263b, d.f(0, this.f10238h));
        }
        if (!this.f10236f[3].isEmpty()) {
            this.f10236f[1].put(f10215k0[3].f10263b, d.f(0, this.f10238h));
        }
        if (this.f10239i) {
            if (this.j) {
                this.f10236f[4].put("StripOffsets", d.j(0, this.f10238h));
                this.f10236f[4].put("StripByteCounts", d.j(this.f10241m, this.f10238h));
            } else {
                this.f10236f[4].put("JPEGInterchangeFormat", d.f(0, this.f10238h));
                this.f10236f[4].put("JPEGInterchangeFormatLength", d.f((long) this.f10241m, this.f10238h));
            }
        }
        for (int i12 = 0; i12 < f10214j0.length; i12++) {
            int i13 = 0;
            for (Map.Entry<String, d> value : this.f10236f[i12].entrySet()) {
                int p11 = ((d) value.getValue()).p();
                if (p11 > 4) {
                    i13 += p11;
                }
            }
            iArr2[i12] = iArr2[i12] + i13;
        }
        int i14 = 8;
        for (int i15 = 0; i15 < f10214j0.length; i15++) {
            if (!this.f10236f[i15].isEmpty()) {
                iArr[i15] = i14;
                i14 += (this.f10236f[i15].size() * 12) + 2 + 4 + iArr2[i15];
            }
        }
        if (this.f10239i) {
            if (this.j) {
                this.f10236f[4].put("StripOffsets", d.j(i14, this.f10238h));
            } else {
                this.f10236f[4].put("JPEGInterchangeFormat", d.f((long) i14, this.f10238h));
            }
            this.f10240l = i14;
            i14 += this.f10241m;
        }
        if (this.f10234d == 4) {
            i14 += 8;
        }
        if (v) {
            for (int i16 = 0; i16 < f10214j0.length; i16++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", new Object[]{Integer.valueOf(i16), Integer.valueOf(iArr[i16]), Integer.valueOf(this.f10236f[i16].size()), Integer.valueOf(iArr2[i16]), Integer.valueOf(i14)}));
            }
        }
        if (!this.f10236f[1].isEmpty()) {
            this.f10236f[0].put(f10215k0[1].f10263b, d.f((long) iArr[1], this.f10238h));
        }
        if (!this.f10236f[2].isEmpty()) {
            this.f10236f[0].put(f10215k0[2].f10263b, d.f((long) iArr[2], this.f10238h));
        }
        if (!this.f10236f[3].isEmpty()) {
            this.f10236f[1].put(f10215k0[3].f10263b, d.f((long) iArr[3], this.f10238h));
        }
        int i17 = this.f10234d;
        if (i17 == 4) {
            cVar2.t(i14);
            cVar2.write(f10221q0);
        } else if (i17 == 13) {
            cVar2.f(i14);
            cVar2.write(I);
        } else if (i17 == 14) {
            cVar2.write(N);
            cVar2.f(i14);
        }
        cVar2.g(this.f10238h == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
        cVar2.a(this.f10238h);
        cVar2.t(42);
        cVar2.j(8);
        for (int i18 = 0; i18 < f10214j0.length; i18++) {
            if (!this.f10236f[i18].isEmpty()) {
                cVar2.t(this.f10236f[i18].size());
                int size = iArr[i18] + 2 + (this.f10236f[i18].size() * 12) + 4;
                for (Map.Entry next : this.f10236f[i18].entrySet()) {
                    int i19 = f10217m0[i18].get(next.getKey()).f10262a;
                    d dVar = (d) next.getValue();
                    int p12 = dVar.p();
                    cVar2.t(i19);
                    cVar2.t(dVar.f10258a);
                    cVar2.f(dVar.f10259b);
                    if (p12 > 4) {
                        cVar2.j((long) size);
                        size += p12;
                    } else {
                        cVar2.write(dVar.f10261d);
                        if (p12 < 4) {
                            while (p12 < 4) {
                                cVar2.b(0);
                                p12++;
                            }
                        }
                    }
                }
                if (i18 != 0 || this.f10236f[4].isEmpty()) {
                    cVar2.j(0);
                } else {
                    cVar2.j((long) iArr[4]);
                }
                for (Map.Entry<String, d> value2 : this.f10236f[i18].entrySet()) {
                    byte[] bArr = ((d) value2.getValue()).f10261d;
                    if (bArr.length > 4) {
                        cVar2.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f10239i) {
            cVar2.write(w());
        }
        if (this.f10234d == 14 && i14 % 2 == 1) {
            cVar2.b(0);
        }
        cVar2.a(ByteOrder.BIG_ENDIAN);
        return i14;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0184 A[LOOP:0: B:8:0x0038->B:60:0x0184, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l(androidx.exifinterface.media.a.b r22, int r23, int r24) throws java.io.IOException {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            boolean r3 = v
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L_0x0020
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "getJpegAttributes starting with: "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r4, r3)
        L_0x0020:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r1.f(r3)
            byte r3 = r22.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r3 != r6) goto L_0x01d8
            byte r7 = r22.readByte()
            r8 = -40
            if (r7 != r8) goto L_0x01bd
            r3 = 2
            r5 = 2
        L_0x0038:
            byte r7 = r22.readByte()
            if (r7 != r6) goto L_0x01a0
            r7 = 1
            int r5 = r5 + r7
            byte r8 = r22.readByte()
            boolean r9 = v
            if (r9 == 0) goto L_0x0062
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Found JPEG segment indicator: "
            r10.append(r11)
            r11 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r4, r10)
        L_0x0062:
            int r5 = r5 + r7
            r10 = -39
            if (r8 == r10) goto L_0x019a
            r10 = -38
            if (r8 != r10) goto L_0x006d
            goto L_0x019a
        L_0x006d:
            int r10 = r22.readUnsignedShort()
            int r10 = r10 - r3
            int r5 = r5 + r3
            if (r9 == 0) goto L_0x009e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "JPEG segment: "
            r9.append(r11)
            r11 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r9.append(r11)
            java.lang.String r11 = " (length: "
            r9.append(r11)
            int r11 = r10 + 2
            r9.append(r11)
            java.lang.String r11 = ")"
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L_0x009e:
            java.lang.String r9 = "Invalid length"
            if (r10 < 0) goto L_0x0194
            r11 = -31
            r12 = 0
            if (r8 == r11) goto L_0x0121
            r11 = -2
            if (r8 == r11) goto L_0x00f3
            switch(r8) {
                case -64: goto L_0x00ba;
                case -63: goto L_0x00ba;
                case -62: goto L_0x00ba;
                case -61: goto L_0x00ba;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            switch(r8) {
                case -59: goto L_0x00ba;
                case -58: goto L_0x00ba;
                case -57: goto L_0x00ba;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            switch(r8) {
                case -55: goto L_0x00ba;
                case -54: goto L_0x00ba;
                case -53: goto L_0x00ba;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            switch(r8) {
                case -51: goto L_0x00ba;
                case -50: goto L_0x00ba;
                case -49: goto L_0x00ba;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            r20 = r4
            goto L_0x0182
        L_0x00ba:
            r1.g(r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r7 = r0.f10236f
            r7 = r7[r2]
            r8 = 4
            if (r2 == r8) goto L_0x00c7
            java.lang.String r11 = "ImageLength"
            goto L_0x00c9
        L_0x00c7:
            java.lang.String r11 = "ThumbnailImageLength"
        L_0x00c9:
            int r12 = r22.readUnsignedShort()
            long r12 = (long) r12
            java.nio.ByteOrder r14 = r0.f10238h
            androidx.exifinterface.media.a$d r12 = androidx.exifinterface.media.a.d.f(r12, r14)
            r7.put(r11, r12)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r7 = r0.f10236f
            r7 = r7[r2]
            if (r2 == r8) goto L_0x00e0
            java.lang.String r8 = "ImageWidth"
            goto L_0x00e2
        L_0x00e0:
            java.lang.String r8 = "ThumbnailImageWidth"
        L_0x00e2:
            int r11 = r22.readUnsignedShort()
            long r11 = (long) r11
            java.nio.ByteOrder r13 = r0.f10238h
            androidx.exifinterface.media.a$d r11 = androidx.exifinterface.media.a.d.f(r11, r13)
            r7.put(r8, r11)
            int r10 = r10 + -5
            goto L_0x00b6
        L_0x00f3:
            byte[] r8 = new byte[r10]
            int r11 = r1.read(r8)
            if (r11 != r10) goto L_0x0119
            java.lang.String r10 = "UserComment"
            java.lang.String r11 = r0.g(r10)
            if (r11 != 0) goto L_0x0115
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r11 = r0.f10236f
            r7 = r11[r7]
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r13 = f10220p0
            r11.<init>(r8, r13)
            androidx.exifinterface.media.a$d r8 = androidx.exifinterface.media.a.d.e(r11)
            r7.put(r10, r8)
        L_0x0115:
            r20 = r4
            goto L_0x0181
        L_0x0119:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x0121:
            byte[] r8 = new byte[r10]
            r1.readFully(r8)
            int r11 = r5 + r10
            byte[] r13 = f10221q0
            boolean r14 = androidx.exifinterface.media.b.g(r8, r13)
            if (r14 == 0) goto L_0x0147
            int r7 = r13.length
            byte[] r7 = java.util.Arrays.copyOfRange(r8, r7, r10)
            int r5 = r23 + r5
            int r8 = r13.length
            int r5 = r5 + r8
            r0.f10243p = r5
            r0.T(r7, r2)
            androidx.exifinterface.media.a$b r5 = new androidx.exifinterface.media.a$b
            r5.<init>((byte[]) r7)
            r0.f0(r5)
            goto L_0x017e
        L_0x0147:
            byte[] r13 = f10222r0
            boolean r14 = androidx.exifinterface.media.b.g(r8, r13)
            if (r14 == 0) goto L_0x017e
            int r14 = r13.length
            int r5 = r5 + r14
            int r13 = r13.length
            byte[] r8 = java.util.Arrays.copyOfRange(r8, r13, r10)
            java.lang.String r10 = "Xmp"
            java.lang.String r13 = r0.g(r10)
            if (r13 != 0) goto L_0x017e
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r13 = r0.f10236f
            r13 = r13[r12]
            androidx.exifinterface.media.a$d r15 = new androidx.exifinterface.media.a$d
            r16 = 1
            int r14 = r8.length
            r20 = r4
            long r3 = (long) r5
            r5 = r14
            r14 = r15
            r6 = r15
            r15 = r16
            r16 = r5
            r17 = r3
            r19 = r8
            r14.<init>(r15, r16, r17, r19)
            r13.put(r10, r6)
            r0.f10246u = r7
            goto L_0x0180
        L_0x017e:
            r20 = r4
        L_0x0180:
            r5 = r11
        L_0x0181:
            r10 = 0
        L_0x0182:
            if (r10 < 0) goto L_0x018e
            r1.g(r10)
            int r5 = r5 + r10
            r4 = r20
            r3 = 2
            r6 = -1
            goto L_0x0038
        L_0x018e:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r9)
            throw r1
        L_0x0194:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r9)
            throw r1
        L_0x019a:
            java.nio.ByteOrder r2 = r0.f10238h
            r1.f(r2)
            return
        L_0x01a0:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r7 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01bd:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01d8:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.l(androidx.exifinterface.media.a$b, int, int):void");
    }

    private int n(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(CrashSender.CRASH_COLLECTOR_TIMEOUT);
        byte[] bArr = new byte[CrashSender.CRASH_COLLECTOR_TIMEOUT];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (F(bArr)) {
            return 4;
        }
        if (I(bArr)) {
            return 9;
        }
        if (E(bArr)) {
            return 12;
        }
        if (G(bArr)) {
            return 7;
        }
        if (J(bArr)) {
            return 10;
        }
        if (H(bArr)) {
            return 13;
        }
        return O(bArr) ? 14 : 0;
    }

    private void o(g gVar) throws IOException {
        r(gVar);
        d dVar = this.f10236f[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f10261d);
            gVar2.f(this.f10238h);
            byte[] bArr = F;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.j(0);
            byte[] bArr3 = G;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.j(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.j(12);
            }
            U(gVar2, 6);
            d dVar2 = this.f10236f[7].get("PreviewImageStart");
            d dVar3 = this.f10236f[7].get("PreviewImageLength");
            if (!(dVar2 == null || dVar3 == null)) {
                this.f10236f[5].put("JPEGInterchangeFormat", dVar2);
                this.f10236f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = this.f10236f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.f10238h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i11 = (iArr[2] - iArr[0]) + 1;
                    int i12 = (iArr[3] - iArr[1]) + 1;
                    if (i11 < i12) {
                        int i13 = i11 + i12;
                        i12 = i13 - i12;
                        i11 = i13 - i12;
                    }
                    d j11 = d.j(i11, this.f10238h);
                    d j12 = d.j(i12, this.f10238h);
                    this.f10236f[0].put("ImageWidth", j11);
                    this.f10236f[0].put("ImageLength", j12);
                }
            }
        }
    }

    private void p(b bVar) throws IOException {
        if (v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f(ByteOrder.BIG_ENDIAN);
        byte[] bArr = H;
        bVar.g(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i11 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i12 = i11 + 4;
                    if (i12 == 16) {
                        if (!Arrays.equals(bArr2, J)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, K)) {
                        if (Arrays.equals(bArr2, I)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f10243p = i12;
                                    T(bArr3, 0);
                                    j0();
                                    f0(new b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b.a(bArr2));
                        }
                        int i13 = readInt + 4;
                        bVar.g(i13);
                        length = i12 + i13;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void q(b bVar) throws IOException {
        boolean z11 = v;
        if (z11) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.g(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i11 = ByteBuffer.wrap(bArr).getInt();
        int i12 = ByteBuffer.wrap(bArr2).getInt();
        int i13 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i12];
        bVar.g(i11 - bVar.a());
        bVar.read(bArr4);
        l(new b(bArr4), i11, 5);
        bVar.g(i13 - bVar.a());
        bVar.f(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z11) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i14 = 0; i14 < readInt; i14++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f10209e0.f10262a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d j11 = d.j(readShort, this.f10238h);
                d j12 = d.j(readShort2, this.f10238h);
                this.f10236f[0].put("ImageLength", j11);
                this.f10236f[0].put("ImageWidth", j12);
                if (v) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            bVar.g(readUnsignedShort2);
        }
    }

    private void r(g gVar) throws IOException {
        d dVar;
        Q(gVar);
        U(gVar, 0);
        i0(gVar, 0);
        i0(gVar, 5);
        i0(gVar, 4);
        j0();
        if (this.f10234d == 8 && (dVar = this.f10236f[1].get("MakerNote")) != null) {
            g gVar2 = new g(dVar.f10261d);
            gVar2.f(this.f10238h);
            gVar2.g(6);
            U(gVar2, 9);
            d dVar2 = this.f10236f[9].get("ColorSpace");
            if (dVar2 != null) {
                this.f10236f[1].put("ColorSpace", dVar2);
            }
        }
    }

    private void t(g gVar) throws IOException {
        if (v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        r(gVar);
        d dVar = this.f10236f[0].get("JpgFromRaw");
        if (dVar != null) {
            l(new b(dVar.f10261d), (int) dVar.f10260c, 5);
        }
        d dVar2 = this.f10236f[0].get("ISO");
        d dVar3 = this.f10236f[1].get("PhotographicSensitivity");
        if (dVar2 != null && dVar3 == null) {
            this.f10236f[1].put("PhotographicSensitivity", dVar2);
        }
    }

    private void u(g gVar) throws IOException {
        byte[] bArr = f10221q0;
        gVar.g(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f10243p = bArr.length;
        T(bArr2, 0);
    }

    private void x(b bVar) throws IOException {
        if (v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f(ByteOrder.LITTLE_ENDIAN);
        bVar.g(L.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = M;
        bVar.g(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i11 = length + 4 + 4;
                    if (Arrays.equals(N, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f10243p = i11;
                            T(bArr3, 0);
                            f0(new b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b.a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i11 + readInt2;
                    if (length != readInt) {
                        if (length <= readInt) {
                            bVar.g(readInt2);
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:68|69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        java.lang.Double.parseDouble(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015c, code lost:
        return new android.util.Pair<>(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0162, code lost:
        return new android.util.Pair<>(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x014e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> y(java.lang.String r12) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r12.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r12 = r12.split(r0, r6)
            r0 = r12[r2]
            android.util.Pair r0 = y(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r12.length
            if (r3 >= r1) goto L_0x00a5
            r1 = r12[r3]
            android.util.Pair r1 = y(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = -1
            goto L_0x0055
        L_0x004d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0055:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0080
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0077
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0080
        L_0x0077:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0081
        L_0x0080:
            r1 = -1
        L_0x0081:
            if (r2 != r6) goto L_0x008b
            if (r1 != r6) goto L_0x008b
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x008b:
            if (r2 != r6) goto L_0x0097
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a2
        L_0x0097:
            if (r1 != r6) goto L_0x00a2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x00a5:
            return r0
        L_0x00a6:
            java.lang.String r0 = "/"
            boolean r1 = r12.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0105
            java.lang.String[] r12 = r12.split(r0, r6)
            int r0 = r12.length
            if (r0 != r4) goto L_0x00ff
            r0 = r12[r2]     // Catch:{ NumberFormatException -> 0x00ff }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
            r12 = r12[r3]     // Catch:{ NumberFormatException -> 0x00ff }
            double r2 = java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
            r12 = 10
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x00f5
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d0
            goto L_0x00f5
        L_0x00d0:
            r4 = 5
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x00eb
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r0.<init>(r12, r1)     // Catch:{ NumberFormatException -> 0x00ff }
            return r0
        L_0x00eb:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00f5:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            r0.<init>(r12, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r0
        L_0x00ff:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x0105:
            long r0 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014e }
            long r1 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            r3 = 4
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0130
            long r1 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            r10 = 65535(0xffff, double:3.23786E-319)
            int r4 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x0130
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0130:
            long r0 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0144
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0144:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x014e:
            java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x015d }
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x015d }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x015d }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x015d }
            return r12
        L_0x015d:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.y(java.lang.String):android.util.Pair");
    }

    private void z(b bVar, HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar != null && dVar2 != null) {
            int m11 = dVar.m(this.f10238h);
            int m12 = dVar2.m(this.f10238h);
            if (this.f10234d == 7) {
                m11 += this.q;
            }
            if (m11 > 0 && m12 > 0) {
                this.f10239i = true;
                if (this.f10231a == null && this.f10233c == null && this.f10232b == null) {
                    byte[] bArr = new byte[m12];
                    bVar.skip((long) m11);
                    bVar.read(bArr);
                    this.n = bArr;
                }
                this.f10240l = m11;
                this.f10241m = m12;
            }
            if (v) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m11 + ", length: " + m12);
            }
        }
    }

    public boolean D() {
        int i11 = i("Orientation", 1);
        return i11 == 2 || i11 == 7 || i11 == 4 || i11 == 5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ef, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f0, code lost:
        r9 = null;
        r1 = r6;
        r6 = r8;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f5, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f6, code lost:
        r8 = null;
        r9 = null;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00fa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fb, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0110, code lost:
        androidx.exifinterface.media.b.a.c(r13.f10232b, 0, android.system.OsConstants.SEEK_SET);
        r5 = r13.f10232b;
        r4 = io.sentry.instrumentation.file.l.b.c(new java.io.FileOutputStream(r5), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0123, code lost:
        r5 = r13.f10231a;
        r4 = io.sentry.instrumentation.file.l.b.d(new java.io.FileOutputStream(r5), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0172, code lost:
        r2.delete();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00fa A[ExcHandler: all (th java.lang.Throwable), Splitter:B:27:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0110 A[Catch:{ Exception -> 0x0142, all -> 0x0140, all -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0123 A[Catch:{ Exception -> 0x0142, all -> 0x0140, all -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Y() throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r13.f10234d
            boolean r0 = M(r0)
            if (r0 == 0) goto L_0x0197
            java.io.FileDescriptor r0 = r13.f10232b
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = r13.f10231a
            if (r0 == 0) goto L_0x0011
            goto L_0x0019
        L_0x0011:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes for the current input."
            r0.<init>(r1)
            throw r0
        L_0x0019:
            boolean r0 = r13.f10239i
            if (r0 == 0) goto L_0x002e
            boolean r0 = r13.j
            if (r0 == 0) goto L_0x002e
            boolean r0 = r13.k
            if (r0 == 0) goto L_0x0026
            goto L_0x002e
        L_0x0026:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            r0 = 1
            r13.t = r0
            byte[] r1 = r13.v()
            r13.n = r1
            r1 = 0
            java.lang.String r2 = "temp"
            java.lang.String r3 = "tmp"
            java.io.File r2 = java.io.File.createTempFile(r2, r3)     // Catch:{ Exception -> 0x0185, all -> 0x0182 }
            java.lang.String r3 = r13.f10231a     // Catch:{ Exception -> 0x0185, all -> 0x0182 }
            r4 = 0
            if (r3 == 0) goto L_0x0052
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0185, all -> 0x0182 }
            java.lang.String r6 = r13.f10231a     // Catch:{ Exception -> 0x0185, all -> 0x0182 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0185, all -> 0x0182 }
            java.io.FileInputStream r3 = io.sentry.instrumentation.file.h.b.c(r3, r6)     // Catch:{ Exception -> 0x0185, all -> 0x0182 }
            goto L_0x0064
        L_0x0052:
            java.io.FileDescriptor r3 = r13.f10232b     // Catch:{ Exception -> 0x0185, all -> 0x0182 }
            int r6 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0185, all -> 0x0182 }
            androidx.exifinterface.media.b.a.c(r3, r4, r6)     // Catch:{ Exception -> 0x0185, all -> 0x0182 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0185, all -> 0x0182 }
            java.io.FileDescriptor r6 = r13.f10232b     // Catch:{ Exception -> 0x0185, all -> 0x0182 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0185, all -> 0x0182 }
            java.io.FileInputStream r3 = io.sentry.instrumentation.file.h.b.b(r3, r6)     // Catch:{ Exception -> 0x0185, all -> 0x0182 }
        L_0x0064:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x017e, all -> 0x017a }
            r6.<init>(r2)     // Catch:{ Exception -> 0x017e, all -> 0x017a }
            java.io.FileOutputStream r6 = io.sentry.instrumentation.file.l.b.a(r6, r2)     // Catch:{ Exception -> 0x017e, all -> 0x017a }
            androidx.exifinterface.media.b.e(r3, r6)     // Catch:{ Exception -> 0x0178, all -> 0x0176 }
            androidx.exifinterface.media.b.c(r3)
            androidx.exifinterface.media.b.c(r6)
            r3 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00fe, all -> 0x00fa }
            r6.<init>(r2)     // Catch:{ Exception -> 0x00fe, all -> 0x00fa }
            java.io.FileInputStream r6 = io.sentry.instrumentation.file.h.b.a(r6, r2)     // Catch:{ Exception -> 0x00fe, all -> 0x00fa }
            java.lang.String r7 = r13.f10231a     // Catch:{ Exception -> 0x00f5, all -> 0x00fa }
            if (r7 == 0) goto L_0x0090
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00f5, all -> 0x00fa }
            java.lang.String r8 = r13.f10231a     // Catch:{ Exception -> 0x00f5, all -> 0x00fa }
            r7.<init>(r8)     // Catch:{ Exception -> 0x00f5, all -> 0x00fa }
            java.io.FileOutputStream r7 = io.sentry.instrumentation.file.l.b.d(r7, r8)     // Catch:{ Exception -> 0x00f5, all -> 0x00fa }
            goto L_0x00a2
        L_0x0090:
            java.io.FileDescriptor r7 = r13.f10232b     // Catch:{ Exception -> 0x00f5, all -> 0x00fa }
            int r8 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x00f5, all -> 0x00fa }
            androidx.exifinterface.media.b.a.c(r7, r4, r8)     // Catch:{ Exception -> 0x00f5, all -> 0x00fa }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00f5, all -> 0x00fa }
            java.io.FileDescriptor r8 = r13.f10232b     // Catch:{ Exception -> 0x00f5, all -> 0x00fa }
            r7.<init>(r8)     // Catch:{ Exception -> 0x00f5, all -> 0x00fa }
            java.io.FileOutputStream r7 = io.sentry.instrumentation.file.l.b.c(r7, r8)     // Catch:{ Exception -> 0x00f5, all -> 0x00fa }
        L_0x00a2:
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00ef, all -> 0x00fa }
            r8.<init>(r6)     // Catch:{ Exception -> 0x00ef, all -> 0x00fa }
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00e9, all -> 0x00e5 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x00e9, all -> 0x00e5 }
            int r10 = r13.f10234d     // Catch:{ Exception -> 0x00e0 }
            r11 = 4
            if (r10 != r11) goto L_0x00b5
            r13.Z(r8, r9)     // Catch:{ Exception -> 0x00e0 }
            goto L_0x00d4
        L_0x00b5:
            r11 = 13
            if (r10 != r11) goto L_0x00bd
            r13.a0(r8, r9)     // Catch:{ Exception -> 0x00e0 }
            goto L_0x00d4
        L_0x00bd:
            r11 = 14
            if (r10 != r11) goto L_0x00c5
            r13.b0(r8, r9)     // Catch:{ Exception -> 0x00e0 }
            goto L_0x00d4
        L_0x00c5:
            r11 = 3
            if (r10 == r11) goto L_0x00ca
            if (r10 != 0) goto L_0x00d4
        L_0x00ca:
            androidx.exifinterface.media.a$c r10 = new androidx.exifinterface.media.a$c     // Catch:{ Exception -> 0x00e0 }
            java.nio.ByteOrder r11 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x00e0 }
            r10.<init>(r9, r11)     // Catch:{ Exception -> 0x00e0 }
            r13.k0(r10)     // Catch:{ Exception -> 0x00e0 }
        L_0x00d4:
            androidx.exifinterface.media.b.c(r8)
            androidx.exifinterface.media.b.c(r9)
            r2.delete()
            r13.n = r1
            return
        L_0x00e0:
            r1 = move-exception
            r12 = r6
            r6 = r1
            r1 = r12
            goto L_0x0103
        L_0x00e5:
            r0 = move-exception
            r9 = r1
            goto L_0x0169
        L_0x00e9:
            r9 = move-exception
            r12 = r9
            r9 = r1
            r1 = r6
            r6 = r12
            goto L_0x0103
        L_0x00ef:
            r8 = move-exception
            r9 = r1
            r1 = r6
            r6 = r8
            r8 = r9
            goto L_0x0103
        L_0x00f5:
            r7 = move-exception
            r8 = r1
            r9 = r8
            r1 = r6
            goto L_0x0101
        L_0x00fa:
            r0 = move-exception
            r9 = r1
            goto L_0x016a
        L_0x00fe:
            r7 = move-exception
            r8 = r1
            r9 = r8
        L_0x0101:
            r6 = r7
            r7 = r9
        L_0x0103:
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0142, all -> 0x0140 }
            r10.<init>(r2)     // Catch:{ Exception -> 0x0142, all -> 0x0140 }
            java.io.FileInputStream r1 = io.sentry.instrumentation.file.h.b.a(r10, r2)     // Catch:{ Exception -> 0x0142, all -> 0x0140 }
            java.lang.String r10 = r13.f10231a     // Catch:{ Exception -> 0x0142, all -> 0x0140 }
            if (r10 != 0) goto L_0x0123
            java.io.FileDescriptor r10 = r13.f10232b     // Catch:{ Exception -> 0x0142, all -> 0x0140 }
            int r11 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0142, all -> 0x0140 }
            androidx.exifinterface.media.b.a.c(r10, r4, r11)     // Catch:{ Exception -> 0x0142, all -> 0x0140 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0142, all -> 0x0140 }
            java.io.FileDescriptor r5 = r13.f10232b     // Catch:{ Exception -> 0x0142, all -> 0x0140 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0142, all -> 0x0140 }
            java.io.FileOutputStream r4 = io.sentry.instrumentation.file.l.b.c(r4, r5)     // Catch:{ Exception -> 0x0142, all -> 0x0140 }
            goto L_0x012e
        L_0x0123:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0142, all -> 0x0140 }
            java.lang.String r5 = r13.f10231a     // Catch:{ Exception -> 0x0142, all -> 0x0140 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0142, all -> 0x0140 }
            java.io.FileOutputStream r4 = io.sentry.instrumentation.file.l.b.d(r4, r5)     // Catch:{ Exception -> 0x0142, all -> 0x0140 }
        L_0x012e:
            r7 = r4
            androidx.exifinterface.media.b.e(r1, r7)     // Catch:{ Exception -> 0x0142, all -> 0x0140 }
            androidx.exifinterface.media.b.c(r1)     // Catch:{ all -> 0x0168 }
            androidx.exifinterface.media.b.c(r7)     // Catch:{ all -> 0x0168 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0168 }
            java.lang.String r1 = "Failed to save new file"
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0168 }
            throw r0     // Catch:{ all -> 0x0168 }
        L_0x0140:
            r0 = move-exception
            goto L_0x0161
        L_0x0142:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x015e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x015e }
            r5.<init>()     // Catch:{ all -> 0x015e }
            java.lang.String r6 = "Failed to save new file. Original file is stored in "
            r5.append(r6)     // Catch:{ all -> 0x015e }
            java.lang.String r6 = r2.getAbsolutePath()     // Catch:{ all -> 0x015e }
            r5.append(r6)     // Catch:{ all -> 0x015e }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x015e }
            r4.<init>(r5, r3)     // Catch:{ all -> 0x015e }
            throw r4     // Catch:{ all -> 0x015e }
        L_0x015e:
            r3 = move-exception
            r0 = r3
            r3 = 1
        L_0x0161:
            androidx.exifinterface.media.b.c(r1)     // Catch:{ all -> 0x0168 }
            androidx.exifinterface.media.b.c(r7)     // Catch:{ all -> 0x0168 }
            throw r0     // Catch:{ all -> 0x0168 }
        L_0x0168:
            r0 = move-exception
        L_0x0169:
            r1 = r8
        L_0x016a:
            androidx.exifinterface.media.b.c(r1)
            androidx.exifinterface.media.b.c(r9)
            if (r3 != 0) goto L_0x0175
            r2.delete()
        L_0x0175:
            throw r0
        L_0x0176:
            r0 = move-exception
            goto L_0x017c
        L_0x0178:
            r0 = move-exception
            goto L_0x0180
        L_0x017a:
            r0 = move-exception
            r6 = r1
        L_0x017c:
            r1 = r3
            goto L_0x0190
        L_0x017e:
            r0 = move-exception
            r6 = r1
        L_0x0180:
            r1 = r3
            goto L_0x0187
        L_0x0182:
            r0 = move-exception
            r6 = r1
            goto L_0x0190
        L_0x0185:
            r0 = move-exception
            r6 = r1
        L_0x0187:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x018f }
            java.lang.String r3 = "Failed to copy original file to temp file"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x018f }
            throw r2     // Catch:{ all -> 0x018f }
        L_0x018f:
            r0 = move-exception
        L_0x0190:
            androidx.exifinterface.media.b.c(r1)
            androidx.exifinterface.media.b.c(r6)
            throw r0
        L_0x0197:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface only supports saving attributes for JPEG, PNG, WebP, and DNG formats."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.Y():void");
    }

    public void c0(double d11) {
        String str = d11 >= 0.0d ? PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES : "1";
        d0("GPSAltitude", new f(Math.abs(d11)).toString());
        d0("GPSAltitudeRef", str);
    }

    public void d0(String str, String str2) {
        e eVar;
        int i11;
        String str3;
        String str4 = str;
        String str5 = str2;
        Objects.requireNonNull(str4, "tag shouldn't be null");
        if (("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) && str5 != null) {
            boolean find = f10225u0.matcher(str5).find();
            boolean find2 = f10226v0.matcher(str5).find();
            if (str2.length() != 19 || (!find && !find2)) {
                Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                return;
            } else if (find2) {
                str5 = str5.replaceAll("-", Constants.COLON_SEPARATOR);
            }
        }
        if ("ISOSpeedRatings".equals(str4)) {
            if (v) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str4 = "PhotographicSensitivity";
        }
        int i12 = 2;
        int i13 = 1;
        if (str5 != null && f10218n0.contains(str4)) {
            if (str4.equals("GPSTimeStamp")) {
                Matcher matcher = f10224t0.matcher(str5);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                    return;
                }
                str5 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str5 = new f(Double.parseDouble(str5)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                    return;
                }
            }
        }
        char c11 = 0;
        int i14 = 0;
        while (i14 < f10214j0.length) {
            if ((i14 != 4 || this.f10239i) && (eVar = f10217m0[i14].get(str4)) != null) {
                if (str5 == null) {
                    this.f10236f[i14].remove(str4);
                } else {
                    Pair<Integer, Integer> y11 = y(str5);
                    int i15 = -1;
                    if (eVar.f10264c == ((Integer) y11.first).intValue() || eVar.f10264c == ((Integer) y11.second).intValue()) {
                        i11 = eVar.f10264c;
                    } else {
                        int i16 = eVar.f10265d;
                        if (i16 == -1 || !(i16 == ((Integer) y11.first).intValue() || eVar.f10265d == ((Integer) y11.second).intValue())) {
                            int i17 = eVar.f10264c;
                            if (i17 == i13 || i17 == 7 || i17 == i12) {
                                i11 = i17;
                            } else if (v) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str4);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = W;
                                sb2.append(strArr[eVar.f10264c]);
                                String str6 = "";
                                if (eVar.f10265d == -1) {
                                    str3 = str6;
                                } else {
                                    str3 = ", " + strArr[eVar.f10265d];
                                }
                                sb2.append(str3);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) y11.first).intValue()]);
                                if (((Integer) y11.second).intValue() != -1) {
                                    str6 = ", " + strArr[((Integer) y11.second).intValue()];
                                }
                                sb2.append(str6);
                                sb2.append(")");
                                Log.d("ExifInterface", sb2.toString());
                            }
                        } else {
                            i11 = eVar.f10265d;
                        }
                    }
                    switch (i11) {
                        case 1:
                            this.f10236f[i14].put(str4, d.a(str5));
                            continue;
                        case 2:
                        case 7:
                            this.f10236f[i14].put(str4, d.e(str5));
                            continue;
                        case 3:
                            String[] split = str5.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            int[] iArr = new int[split.length];
                            for (int i18 = 0; i18 < split.length; i18++) {
                                iArr[i18] = Integer.parseInt(split[i18]);
                            }
                            this.f10236f[i14].put(str4, d.k(iArr, this.f10238h));
                            continue;
                        case 4:
                            String[] split2 = str5.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            long[] jArr = new long[split2.length];
                            for (int i19 = 0; i19 < split2.length; i19++) {
                                jArr[i19] = Long.parseLong(split2[i19]);
                            }
                            this.f10236f[i14].put(str4, d.g(jArr, this.f10238h));
                            continue;
                        case 5:
                            String[] split3 = str5.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            f[] fVarArr = new f[split3.length];
                            int i21 = 0;
                            while (i21 < split3.length) {
                                String[] split4 = split3[i21].split("/", i15);
                                fVarArr[i21] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                i21++;
                                i15 = -1;
                            }
                            this.f10236f[i14].put(str4, d.i(fVarArr, this.f10238h));
                            continue;
                        case 9:
                            String[] split5 = str5.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i22 = 0; i22 < split5.length; i22++) {
                                iArr2[i22] = Integer.parseInt(split5[i22]);
                            }
                            this.f10236f[i14].put(str4, d.c(iArr2, this.f10238h));
                            break;
                        case 10:
                            String[] split6 = str5.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            f[] fVarArr2 = new f[split6.length];
                            int i23 = 0;
                            while (i23 < split6.length) {
                                String[] split7 = split6[i23].split("/", -1);
                                fVarArr2[i23] = new f((long) Double.parseDouble(split7[c11]), (long) Double.parseDouble(split7[i13]));
                                i23++;
                                split6 = split6;
                                c11 = 0;
                                i13 = 1;
                            }
                            this.f10236f[i14].put(str4, d.d(fVarArr2, this.f10238h));
                            break;
                        case 12:
                            String[] split8 = str5.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            double[] dArr = new double[split8.length];
                            for (int i24 = 0; i24 < split8.length; i24++) {
                                dArr[i24] = Double.parseDouble(split8[i24]);
                            }
                            this.f10236f[i14].put(str4, d.b(dArr, this.f10238h));
                            break;
                        default:
                            if (v) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i11);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
            i14++;
            i12 = 2;
            c11 = 0;
            i13 = 1;
        }
    }

    public void e0(double d11, double d12) {
        if (d11 < -90.0d || d11 > 90.0d || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Latitude value " + d11 + " is not valid.");
        } else if (d12 < -180.0d || d12 > 180.0d || Double.isNaN(d12)) {
            throw new IllegalArgumentException("Longitude value " + d12 + " is not valid.");
        } else {
            d0("GPSLatitudeRef", d11 >= 0.0d ? "N" : "S");
            d0("GPSLatitude", b(Math.abs(d11)));
            d0("GPSLongitudeRef", d12 >= 0.0d ? "E" : AFMParser.CHARMETRICS_W);
            d0("GPSLongitude", b(Math.abs(d12)));
        }
    }

    public double f(double d11) {
        double h11 = h("GPSAltitude", -1.0d);
        int i11 = -1;
        int i12 = i("GPSAltitudeRef", -1);
        if (h11 < 0.0d || i12 < 0) {
            return d11;
        }
        if (i12 != 1) {
            i11 = 1;
        }
        return h11 * ((double) i11);
    }

    public String g(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        d j11 = j(str);
        if (j11 != null) {
            if (!f10218n0.contains(str)) {
                return j11.n(this.f10238h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i11 = j11.f10258a;
                if (i11 == 5 || i11 == 10) {
                    f[] fVarArr = (f[]) j11.o(this.f10238h);
                    if (fVarArr == null || fVarArr.length != 3) {
                        Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                        return null;
                    }
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) fVarArr[0].f10266a) / ((float) fVarArr[0].f10267b))), Integer.valueOf((int) (((float) fVarArr[1].f10266a) / ((float) fVarArr[1].f10267b))), Integer.valueOf((int) (((float) fVarArr[2].f10266a) / ((float) fVarArr[2].f10267b)))});
                }
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + j11.f10258a);
                return null;
            }
            try {
                return Double.toString(j11.l(this.f10238h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public double h(String str, double d11) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        d j11 = j(str);
        if (j11 == null) {
            return d11;
        }
        try {
            return j11.l(this.f10238h);
        } catch (NumberFormatException unused) {
            return d11;
        }
    }

    public int i(String str, int i11) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        d j11 = j(str);
        if (j11 == null) {
            return i11;
        }
        try {
            return j11.m(this.f10238h);
        } catch (NumberFormatException unused) {
            return i11;
        }
    }

    public double[] m() {
        String g11 = g("GPSLatitude");
        String g12 = g("GPSLatitudeRef");
        String g13 = g("GPSLongitude");
        String g14 = g("GPSLongitudeRef");
        if (g11 == null || g12 == null || g13 == null || g14 == null) {
            return null;
        }
        try {
            return new double[]{c(g11, g12), c(g13, g14)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", new Object[]{g11, g12, g13, g14}));
            return null;
        }
    }

    public int s() {
        switch (i("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public byte[] v() {
        int i11 = this.f10242o;
        if (i11 == 6 || i11 == 7) {
            return w();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059 A[SYNTHETIC, Splitter:B:31:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0094 A[Catch:{ Exception -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] w() {
        /*
            r11 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r11.f10239i
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            byte[] r1 = r11.n
            if (r1 == 0) goto L_0x000d
            return r1
        L_0x000d:
            android.content.res.AssetManager$AssetInputStream r1 = r11.f10233c     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            if (r1 == 0) goto L_0x002e
            boolean r3 = r1.markSupported()     // Catch:{ Exception -> 0x0029, all -> 0x0025 }
            if (r3 == 0) goto L_0x001c
            r1.reset()     // Catch:{ Exception -> 0x0029, all -> 0x0025 }
        L_0x001a:
            r3 = r2
            goto L_0x0057
        L_0x001c:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch:{ Exception -> 0x0029, all -> 0x0025 }
            androidx.exifinterface.media.b.c(r1)
            return r2
        L_0x0025:
            r0 = move-exception
            r3 = r2
            goto L_0x00b8
        L_0x0029:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L_0x00a9
        L_0x002e:
            java.lang.String r1 = r11.f10231a     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            if (r1 == 0) goto L_0x003e
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            java.lang.String r3 = r11.f10231a     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            java.io.FileInputStream r1 = io.sentry.instrumentation.file.h.b.c(r1, r3)     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            goto L_0x001a
        L_0x003e:
            java.io.FileDescriptor r1 = r11.f10232b     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            java.io.FileDescriptor r1 = androidx.exifinterface.media.b.a.b(r1)     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            r3 = 0
            int r5 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            androidx.exifinterface.media.b.a.c(r1, r3, r5)     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            r3.<init>(r1)     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            java.io.FileInputStream r3 = io.sentry.instrumentation.file.h.b.b(r3, r1)     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            r10 = r3
            r3 = r1
            r1 = r10
        L_0x0057:
            if (r1 == 0) goto L_0x0094
            int r4 = r11.f10240l     // Catch:{ Exception -> 0x0092 }
            int r5 = r11.f10243p     // Catch:{ Exception -> 0x0092 }
            int r4 = r4 + r5
            long r4 = (long) r4     // Catch:{ Exception -> 0x0092 }
            long r4 = r1.skip(r4)     // Catch:{ Exception -> 0x0092 }
            int r6 = r11.f10240l     // Catch:{ Exception -> 0x0092 }
            int r7 = r11.f10243p     // Catch:{ Exception -> 0x0092 }
            int r6 = r6 + r7
            long r6 = (long) r6
            java.lang.String r8 = "Corrupted image"
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x008c
            int r4 = r11.f10241m     // Catch:{ Exception -> 0x0092 }
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0092 }
            int r5 = r1.read(r4)     // Catch:{ Exception -> 0x0092 }
            int r6 = r11.f10241m     // Catch:{ Exception -> 0x0092 }
            if (r5 != r6) goto L_0x0086
            r11.n = r4     // Catch:{ Exception -> 0x0092 }
            androidx.exifinterface.media.b.c(r1)
            if (r3 == 0) goto L_0x0085
            androidx.exifinterface.media.b.b(r3)
        L_0x0085:
            return r4
        L_0x0086:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x0092 }
            r4.<init>(r8)     // Catch:{ Exception -> 0x0092 }
            throw r4     // Catch:{ Exception -> 0x0092 }
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x0092 }
            r4.<init>(r8)     // Catch:{ Exception -> 0x0092 }
            throw r4     // Catch:{ Exception -> 0x0092 }
        L_0x0092:
            r4 = move-exception
            goto L_0x00a9
        L_0x0094:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException     // Catch:{ Exception -> 0x0092 }
            r4.<init>()     // Catch:{ Exception -> 0x0092 }
            throw r4     // Catch:{ Exception -> 0x0092 }
        L_0x009a:
            r0 = move-exception
            r3 = r1
            goto L_0x00b9
        L_0x009d:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
            goto L_0x00a9
        L_0x00a2:
            r0 = move-exception
            r3 = r2
            goto L_0x00b9
        L_0x00a5:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
        L_0x00a9:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch:{ all -> 0x00b7 }
            androidx.exifinterface.media.b.c(r1)
            if (r3 == 0) goto L_0x00b6
            androidx.exifinterface.media.b.b(r3)
        L_0x00b6:
            return r2
        L_0x00b7:
            r0 = move-exception
        L_0x00b8:
            r2 = r1
        L_0x00b9:
            androidx.exifinterface.media.b.c(r2)
            if (r3 == 0) goto L_0x00c1
            androidx.exifinterface.media.b.b(r3)
        L_0x00c1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.w():byte[]");
    }

    /* compiled from: ExifInterface */
    private static class g extends b {
        g(byte[] bArr) throws IOException {
            super(bArr);
            this.f10252a.mark(Integer.MAX_VALUE);
        }

        public void j(long j) throws IOException {
            int i11 = this.f10254c;
            if (((long) i11) > j) {
                this.f10254c = 0;
                this.f10252a.reset();
            } else {
                j -= (long) i11;
            }
            g((int) j);
        }

        g(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f10252a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* compiled from: ExifInterface */
    static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f10262a;

        /* renamed from: b  reason: collision with root package name */
        public final String f10263b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10264c;

        /* renamed from: d  reason: collision with root package name */
        public final int f10265d;

        e(String str, int i11, int i12) {
            this.f10263b = str;
            this.f10262a = i11;
            this.f10264c = i12;
            this.f10265d = -1;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i11) {
            int i12;
            int i13 = this.f10264c;
            if (i13 == 7 || i11 == 7 || i13 == i11 || (i12 = this.f10265d) == i11) {
                return true;
            }
            if ((i13 == 4 || i12 == 4) && i11 == 3) {
                return true;
            }
            if ((i13 == 9 || i12 == 9) && i11 == 8) {
                return true;
            }
            if ((i13 == 12 || i12 == 12) && i11 == 11) {
                return true;
            }
            return false;
        }

        e(String str, int i11, int i12, int i13) {
            this.f10263b = str;
            this.f10262a = i11;
            this.f10264c = i12;
            this.f10265d = i13;
        }
    }

    public a(String str) throws IOException {
        e[][] eVarArr = f10214j0;
        this.f10236f = new HashMap[eVarArr.length];
        this.f10237g = new HashSet(eVarArr.length);
        this.f10238h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(str, "filename cannot be null");
        B(str);
    }

    public a(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    public a(InputStream inputStream, int i11) throws IOException {
        e[][] eVarArr = f10214j0;
        this.f10236f = new HashMap[eVarArr.length];
        this.f10237g = new HashSet(eVarArr.length);
        this.f10238h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.f10231a = null;
        if (i11 == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f10221q0.length);
            if (!C(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f10235e = true;
            this.f10233c = null;
            this.f10232b = null;
            inputStream = bufferedInputStream;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f10233c = (AssetManager.AssetInputStream) inputStream;
            this.f10232b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (K(fileInputStream.getFD())) {
                    this.f10233c = null;
                    this.f10232b = fileInputStream.getFD();
                }
            }
            this.f10233c = null;
            this.f10232b = null;
        }
        P(inputStream);
    }
}
