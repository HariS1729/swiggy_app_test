package amazonpay.silentpay;

import android.net.Uri;
import in.swiggy.android.tejas.network.HttpRequest;
import in.swiggy.android.tejas.oldapi.models.KeySeparator;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

final class q {
    static Uri a(Uri uri, Map<String, String> map) {
        if (map == null) {
            return uri;
        }
        if (uri == null) {
            return null;
        }
        for (String next : map.keySet()) {
            uri = uri.buildUpon().appendQueryParameter(next, map.get(next)).build();
        }
        return uri;
    }

    static Uri b(URL url, Map<String, String> map, String str) {
        if (url == null) {
            return null;
        }
        Uri parse = Uri.parse(url.toString());
        if (str != null && !str.isEmpty()) {
            String str2 = "/";
            if (str.startsWith(str2)) {
                str2 = "";
            }
            Uri.Builder buildUpon = parse.buildUpon();
            parse = buildUpon.path(parse.getPath() + str2 + str).build();
        }
        return (map == null || map.size() <= 0) ? parse : a(parse, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032 A[SYNTHETIC, Splitter:B:19:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041 A[SYNTHETIC, Splitter:B:26:0x0041] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String c(java.io.InputStream r6) {
        /*
            java.lang.String r0 = "unable to close stream"
            java.lang.String r1 = "UrlHelper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x002a }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x002a }
            r5.<init>(r6)     // Catch:{ IOException -> 0x002a }
            r4.<init>(r5)     // Catch:{ IOException -> 0x002a }
        L_0x0014:
            java.lang.String r6 = r4.readLine()     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            if (r6 == 0) goto L_0x001e
            r2.append(r6)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            goto L_0x0014
        L_0x001e:
            r4.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003a
        L_0x0022:
            r6 = move-exception
            r3 = r4
            goto L_0x003f
        L_0x0025:
            r6 = move-exception
            r3 = r4
            goto L_0x002b
        L_0x0028:
            r6 = move-exception
            goto L_0x003f
        L_0x002a:
            r6 = move-exception
        L_0x002b:
            java.lang.String r4 = "unable to read response"
            amazonpay.silentpay.j.g(r1, r4, r6)     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x003a
            r3.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r6 = move-exception
            amazonpay.silentpay.j.g(r1, r0, r6)
        L_0x003a:
            java.lang.String r6 = r2.toString()
            return r6
        L_0x003f:
            if (r3 == 0) goto L_0x0049
            r3.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            r2 = move-exception
            amazonpay.silentpay.j.g(r1, r0, r2)
        L_0x0049:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: amazonpay.silentpay.q.c(java.io.InputStream):java.lang.String");
    }

    static Map<String, String> d(String str) {
        if (str == null || str.trim().length() < 1) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : str.split(KeySeparator.AMP)) {
            int indexOf = str2.indexOf("=");
            if (indexOf != -1) {
                hashMap.put(str2.substring(0, indexOf).trim(), str2.substring(indexOf + 1).trim());
            }
        }
        return hashMap;
    }

    static void e(HttpURLConnection httpURLConnection, byte[] bArr, String str) throws IOException {
        httpURLConnection.setRequestMethod(HttpRequest.METHOD_POST);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Type", str);
        httpURLConnection.setRequestProperty("charset", HttpRequest.CHARSET_UTF8);
        httpURLConnection.setRequestProperty("Content-Length", Integer.toString(bArr.length));
        httpURLConnection.setUseCaches(false);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
    }
}
