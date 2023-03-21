package w5;

import android.location.Location;
import android.media.ExifInterface;
import android.util.Log;
import co.hyperverge.hypersnapsdk.objects.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import p5.a;
import z5.b;

/* compiled from: ExifHelper */
public class d {

    /* renamed from: w  reason: collision with root package name */
    private static final String f17543w = "co.hyperverge.hypersnapsdk.c.d";

    /* renamed from: a  reason: collision with root package name */
    private String f17544a = null;

    /* renamed from: b  reason: collision with root package name */
    private String f17545b = null;

    /* renamed from: c  reason: collision with root package name */
    private String f17546c = null;

    /* renamed from: d  reason: collision with root package name */
    private String f17547d = null;

    /* renamed from: e  reason: collision with root package name */
    private String f17548e = null;

    /* renamed from: f  reason: collision with root package name */
    private String f17549f = null;

    /* renamed from: g  reason: collision with root package name */
    private String f17550g = null;

    /* renamed from: h  reason: collision with root package name */
    private String f17551h = null;

    /* renamed from: i  reason: collision with root package name */
    private String f17552i = null;
    private String j = null;
    private String k = null;

    /* renamed from: l  reason: collision with root package name */
    private String f17553l = null;

    /* renamed from: m  reason: collision with root package name */
    private String f17554m = null;
    private String n = null;

    /* renamed from: o  reason: collision with root package name */
    private String f17555o = null;

    /* renamed from: p  reason: collision with root package name */
    private String f17556p = null;
    private String q = null;

    /* renamed from: r  reason: collision with root package name */
    private final String f17557r = null;

    /* renamed from: s  reason: collision with root package name */
    private String f17558s = null;
    private String t = null;

    /* renamed from: u  reason: collision with root package name */
    private final double f17559u = 0.0d;
    private final double v = 0.0d;

    public String a(String str, e eVar) {
        StringBuilder sb2 = new StringBuilder("hvsdk_android_");
        String appId = a.t().s().getAppId();
        sb2.append("3.6.23");
        sb2.append("_");
        sb2.append(appId);
        if (!z5.e.a(str)) {
            sb2.append("_");
            sb2.append(str);
        } else if (!z5.e.a(o.r())) {
            sb2.append("_");
            sb2.append(o.r());
        }
        if (eVar != null) {
            try {
                String ip2 = eVar.getIp();
                String city = eVar.getGeoDetails().getCity();
                String country = eVar.getGeoDetails().getCountry();
                String countryCode = eVar.getGeoDetails().getCountryCode();
                sb2.append("_");
                sb2.append(ip2);
                sb2.append("_");
                sb2.append(city);
                sb2.append("_");
                sb2.append(country);
                sb2.append("_");
                sb2.append(countryCode);
            } catch (Exception e11) {
                Log.e(f17543w, "getUserCommentString: ", e11);
            }
        }
        return String.valueOf(sb2);
    }

    public void b(File file, Location location) throws IOException {
        Objects.toString(file);
        Objects.toString(location);
        ExifInterface exifInterface = new ExifInterface(file.getPath());
        this.f17544a = exifInterface.getAttribute("FNumber");
        this.f17545b = exifInterface.getAttribute("DateTime");
        this.f17546c = exifInterface.getAttribute("ExposureTime");
        this.f17547d = exifInterface.getAttribute("Flash");
        this.f17548e = exifInterface.getAttribute("FocalLength");
        this.f17549f = exifInterface.getAttribute("GPSAltitude");
        this.f17550g = exifInterface.getAttribute("GPSAltitudeRef");
        this.f17551h = exifInterface.getAttribute("GPSDateStamp");
        if (location != null) {
            this.f17552i = b.a(location.getLatitude());
            this.k = b.a(location.getLongitude());
            this.j = b.b(location.getLatitude());
            this.f17553l = b.b(location.getLongitude());
        }
        this.f17554m = exifInterface.getAttribute("GPSProcessingMethod");
        this.n = exifInterface.getAttribute("GPSTimeStamp");
        this.f17555o = exifInterface.getAttribute("ISOSpeedRatings");
        this.f17556p = exifInterface.getAttribute("Make");
        this.q = exifInterface.getAttribute("Model");
        this.f17558s = exifInterface.getAttribute("WhiteBalance");
        this.t = exifInterface.getAttribute("UserComment");
        exifInterface.getLatLong(new float[2]);
    }

    public void c(String str, String str2, e eVar) {
        try {
            ExifInterface exifInterface = new ExifInterface(str);
            String str3 = this.f17544a;
            if (str3 != null) {
                exifInterface.setAttribute("FNumber", str3);
            }
            String str4 = this.f17545b;
            if (str4 != null) {
                exifInterface.setAttribute("DateTime", str4);
            }
            String str5 = this.f17546c;
            if (str5 != null) {
                exifInterface.setAttribute("ExposureTime", str5);
            }
            String str6 = this.f17547d;
            if (str6 != null) {
                exifInterface.setAttribute("Flash", str6);
            }
            String str7 = this.f17548e;
            if (str7 != null) {
                exifInterface.setAttribute("FocalLength", str7);
            }
            String str8 = this.f17549f;
            if (str8 != null) {
                exifInterface.setAttribute("GPSAltitude", str8);
            }
            String str9 = this.f17550g;
            if (str9 != null) {
                exifInterface.setAttribute("GPSAltitudeRef", str9);
            }
            String str10 = this.f17551h;
            if (str10 != null) {
                exifInterface.setAttribute("GPSDateStamp", str10);
            }
            exifInterface.setAttribute("GPSLatitude", this.f17552i);
            exifInterface.setAttribute("GPSLongitude", this.k);
            exifInterface.setAttribute("GPSLatitudeRef", this.j);
            exifInterface.setAttribute("GPSLongitudeRef", this.f17553l);
            String a11 = a(str2, eVar);
            this.t = a11;
            exifInterface.setAttribute("UserComment", a11);
            String str11 = this.f17554m;
            if (str11 != null) {
                exifInterface.setAttribute("GPSProcessingMethod", str11);
            }
            String str12 = this.n;
            if (str12 != null) {
                exifInterface.setAttribute("GPSTimeStamp", str12);
            }
            String str13 = this.f17555o;
            if (str13 != null) {
                exifInterface.setAttribute("ISOSpeedRatings", str13);
            }
            String str14 = this.f17556p;
            if (str14 != null) {
                exifInterface.setAttribute("Make", str14);
            }
            String str15 = this.q;
            if (str15 != null) {
                exifInterface.setAttribute("Model", str15);
            }
            String str16 = this.f17558s;
            if (str16 != null) {
                exifInterface.setAttribute("WhiteBalance", str16);
            }
            exifInterface.saveAttributes();
        } catch (Exception e11) {
            Log.e(f17543w, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void d(byte[] bArr, String str, Location location) {
        File file = new File(str);
        try {
            new FileOutputStream(file).write(bArr);
            ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
            this.f17544a = exifInterface.getAttribute("FNumber");
            this.f17545b = exifInterface.getAttribute("DateTime");
            this.f17546c = exifInterface.getAttribute("ExposureTime");
            this.f17547d = exifInterface.getAttribute("Flash");
            this.f17548e = exifInterface.getAttribute("FocalLength");
            this.f17549f = exifInterface.getAttribute("GPSAltitude");
            this.f17550g = exifInterface.getAttribute("GPSAltitudeRef");
            this.f17551h = exifInterface.getAttribute("GPSDateStamp");
            if (location != null) {
                this.f17552i = b.a(location.getLatitude());
                this.k = b.a(location.getLongitude());
                this.j = b.b(location.getLatitude());
                this.f17553l = b.b(location.getLongitude());
            }
            this.f17554m = exifInterface.getAttribute("GPSProcessingMethod");
            this.n = exifInterface.getAttribute("GPSTimeStamp");
            this.f17555o = exifInterface.getAttribute("ISOSpeedRatings");
            this.f17556p = exifInterface.getAttribute("Make");
            this.q = exifInterface.getAttribute("Model");
            this.f17558s = exifInterface.getAttribute("WhiteBalance");
            this.t = exifInterface.getAttribute("UserComment");
            exifInterface.getLatLong(new float[2]);
            file.delete();
        } catch (Exception e11) {
            Log.e(f17543w, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }
}
