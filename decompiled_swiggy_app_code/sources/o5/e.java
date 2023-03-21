package o5;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class e {

    /* renamed from: a  reason: collision with root package name */
    static SimpleDateFormat f15932a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f15932a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
