package v5;

import android.util.Base64;
import android.util.Log;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Headers;
import org.json.JSONException;
import org.json.JSONObject;
import p5.a;
import w5.n;

/* compiled from: SignatureHelper */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f17325a = "co.hyperverge.hypersnapsdk.b.g.f";

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f17326b = "0123456789abcdef".toCharArray();

    static String a(String str) {
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDFusF4/wCAVrq6m0uomaGHD9O2YpwBZulbyaSb5s8WMyyy/xT4zMGrghJEsQV8REAH9pAqZk06YvkT01fMP8mTr9uUwW3CngVdjgrxGKfL1YZACS93SfvAXXX95w/EYkUiDr3sby7YV7NaqlcmTeRFDzJLFRPkDLxzAj+l3QCdkQIDAQAB", 0)));
            byte[] decode = Base64.decode(str, 0);
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(2, generatePublic);
            return new String(instance.doFinal(decode));
        } catch (Exception e11) {
            Log.e(f17325a, e11.getMessage());
            if (n.w().s() == null) {
                return null;
            }
            n.w().s().a(e11);
            return null;
        }
    }

    static String b(String str, String str2) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(str.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
            return f(instance.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e11) {
            Log.e(f17325a, e11.getMessage());
            if (n.w().s() == null) {
                return null;
            }
            n.w().s().a(e11);
            return null;
        }
    }

    public static String c(String str, String str2, JSONObject jSONObject) {
        if (!a.t().s().isShouldUseSignature()) {
            return null;
        }
        if (jSONObject.has(AnalyticsAttribute.UUID_ATTRIBUTE)) {
            try {
                return jSONObject.getString(AnalyticsAttribute.UUID_ATTRIBUTE);
            } catch (JSONException e11) {
                Log.e(f17325a, e11.getMessage());
            }
        }
        String m11 = m(str);
        String m12 = m(str2);
        if (m11 == null || m12 == null) {
            return null;
        }
        return m11 + m12;
    }

    public static String d(String str, JSONObject jSONObject) {
        if (!a.t().s().isShouldUseSignature()) {
            return null;
        }
        if (jSONObject.has(AnalyticsAttribute.UUID_ATTRIBUTE)) {
            try {
                return jSONObject.getString(AnalyticsAttribute.UUID_ATTRIBUTE);
            } catch (JSONException e11) {
                Log.e(f17325a, e11.getMessage());
            }
        }
        return m(str);
    }

    static String e(Headers headers) {
        if (headers == null) {
            return null;
        }
        return headers.get("X-Response-Signature");
    }

    public static String f(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b11 = bArr[i11] & 255;
            int i12 = i11 * 2;
            char[] cArr2 = f17326b;
            cArr[i12] = cArr2[b11 >>> 4];
            cArr[i12 + 1] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    private static MessageDigest g() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e11) {
            Log.e(f17325a, "Exception while getting digest", e11);
            if (n.w().s() == null) {
                return null;
            }
            n.w().s().a(e11);
            return null;
        }
    }

    static boolean h(String str, String str2, String str3) {
        if (str == null || str2 == null) {
            return false;
        }
        String a11 = a(str2);
        String b11 = b(str3, str);
        if (a11 == null || b11 == null || !a11.equals(b11)) {
            return false;
        }
        return true;
    }

    static boolean i(String str, Headers headers, String str2) {
        if (!a.t().s().isShouldUseSignature() || str2 == null) {
            return true;
        }
        return h(str, e(headers), str2);
    }

    private static InputStream j(String str) {
        try {
            return new FileInputStream(str);
        } catch (FileNotFoundException e11) {
            Log.e(f17325a, "Exception while getting FileInputStream", e11);
            if (n.w().s() == null) {
                return null;
            }
            n.w().s().a(e11);
            return null;
        }
    }

    private static StringBuilder k(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b11 : bArr) {
            String hexString = Integer.toHexString(b11 & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        sb2.length();
        return sb2;
    }

    static boolean l(String str, Headers headers, String str2) {
        TreeMap<String, Object> treeMap;
        try {
            treeMap = e6.a.a(new JSONObject(str));
        } catch (JSONException e11) {
            Log.e(f17325a, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
            treeMap = null;
        }
        String b11 = e6.a.b(treeMap);
        if (b11 != null) {
            str = b11;
        }
        if (!a.t().s().isShouldUseSignature() || str2 == null) {
            return true;
        }
        return h(str, e(headers), str2);
    }

    public static String m(String str) {
        InputStream j;
        MessageDigest g11 = g();
        if (g11 == null || (j = j(str)) == null) {
            return null;
        }
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = j.read(bArr);
                if (read <= 0) {
                    break;
                }
                g11.update(bArr, 0, read);
            } catch (Exception e11) {
                Log.e(f17325a, "Exception on closing SHA_256 input stream", e11);
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
                try {
                    j.close();
                } catch (IOException e12) {
                    Log.e(f17325a, "Exception on closing SHA_256 input stream", e12);
                    if (n.w().s() != null) {
                        n.w().s().a(e12);
                    }
                }
                return null;
            } catch (Throwable th2) {
                try {
                    j.close();
                } catch (IOException e13) {
                    Log.e(f17325a, "Exception on closing SHA_256 input stream", e13);
                    if (n.w().s() != null) {
                        n.w().s().a(e13);
                    }
                }
                throw th2;
            }
        }
        String sb2 = k(g11.digest()).toString();
        try {
            j.close();
        } catch (IOException e14) {
            Log.e(f17325a, "Exception on closing SHA_256 input stream", e14);
            if (n.w().s() != null) {
                n.w().s().a(e14);
            }
        }
        return sb2;
    }
}
