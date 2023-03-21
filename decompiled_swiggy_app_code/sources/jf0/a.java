package jf0;

import in.swiggy.android.tejas.utils.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import os.u;

/* compiled from: DateUtils */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f19626a = "a";

    public static String a(Long l11, String str) {
        try {
            Date date = new Date(l11.longValue());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(DateUtils.TIME_ZONE_ASIA_KOLKATA));
            return simpleDateFormat.format(date);
        } catch (Throwable th2) {
            u.h(f19626a, th2);
            return "";
        }
    }

    public static int b(long j, long j11) {
        int i11 = (j > j11 ? 1 : (j == j11 ? 0 : -1));
        if (i11 == 0) {
            return 0;
        }
        long j12 = i11 < 0 ? j : j11;
        if (i11 <= 0) {
            j = j11;
        }
        int convert = (int) TimeUnit.DAYS.convert(j - j12, TimeUnit.MILLISECONDS);
        return i11 < 0 ? convert : -convert;
    }
}
