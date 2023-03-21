package e7;

import d7.a;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class i implements a {

    /* renamed from: a  reason: collision with root package name */
    private int f14400a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f14401b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f14402c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f14403d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f14404e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f14405f = 0;

    /* renamed from: g  reason: collision with root package name */
    private TimeZone f14406g = null;

    /* renamed from: h  reason: collision with root package name */
    private int f14407h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f14408i = false;
    private boolean j = false;
    private boolean k = false;

    public i() {
    }

    public i(Calendar calendar) {
        Date time = calendar.getTime();
        TimeZone timeZone = calendar.getTimeZone();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(timeZone);
        gregorianCalendar.setTime(time);
        this.f14400a = gregorianCalendar.get(1);
        this.f14401b = gregorianCalendar.get(2) + 1;
        this.f14402c = gregorianCalendar.get(5);
        this.f14403d = gregorianCalendar.get(11);
        this.f14404e = gregorianCalendar.get(12);
        this.f14405f = gregorianCalendar.get(13);
        this.f14407h = gregorianCalendar.get(14) * 1000000;
        this.f14406g = gregorianCalendar.getTimeZone();
        this.k = true;
        this.j = true;
        this.f14408i = true;
    }

    public boolean D() {
        return this.j;
    }

    public boolean H() {
        return this.f14408i;
    }

    public int H0() {
        return this.f14405f;
    }

    public int M() {
        return this.f14407h;
    }

    public void N0(int i11) {
        if (i11 < 1) {
            this.f14401b = 1;
        } else if (i11 > 12) {
            this.f14401b = 12;
        } else {
            this.f14401b = i11;
        }
        this.f14408i = true;
    }

    public void P(int i11) {
        if (i11 < 1) {
            this.f14402c = 1;
        } else if (i11 > 31) {
            this.f14402c = 31;
        } else {
            this.f14402c = i11;
        }
        this.f14408i = true;
    }

    public void S0(int i11) {
        this.f14403d = Math.min(Math.abs(i11), 23);
        this.j = true;
    }

    public void U0(int i11) {
        this.f14404e = Math.min(Math.abs(i11), 59);
        this.j = true;
    }

    public void X0(int i11) {
        this.f14400a = Math.min(Math.abs(i11), 9999);
        this.f14408i = true;
    }

    public int Y0() {
        return this.f14404e;
    }

    public int compareTo(Object obj) {
        a aVar = (a) obj;
        long timeInMillis = q0().getTimeInMillis() - aVar.q0().getTimeInMillis();
        if (timeInMillis == 0) {
            timeInMillis = (long) (this.f14407h - aVar.M());
        }
        return (int) Math.signum((float) timeInMillis);
    }

    public int e0() {
        return this.f14403d;
    }

    public void e1(TimeZone timeZone) {
        this.f14406g = timeZone;
        this.j = true;
        this.k = true;
    }

    public int getDay() {
        return this.f14402c;
    }

    public int getMonth() {
        return this.f14401b;
    }

    public TimeZone getTimeZone() {
        return this.f14406g;
    }

    public int getYear() {
        return this.f14400a;
    }

    public String h() {
        return c.c(this);
    }

    public void h1(int i11) {
        this.f14405f = Math.min(Math.abs(i11), 59);
        this.j = true;
    }

    public boolean hasTimeZone() {
        return this.k;
    }

    public Calendar q0() {
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        if (this.k) {
            gregorianCalendar.setTimeZone(this.f14406g);
        }
        gregorianCalendar.set(1, this.f14400a);
        gregorianCalendar.set(2, this.f14401b - 1);
        gregorianCalendar.set(5, this.f14402c);
        gregorianCalendar.set(11, this.f14403d);
        gregorianCalendar.set(12, this.f14404e);
        gregorianCalendar.set(13, this.f14405f);
        gregorianCalendar.set(14, this.f14407h / 1000000);
        return gregorianCalendar;
    }

    public String toString() {
        return h();
    }

    public void x0(int i11) {
        this.f14407h = i11;
        this.j = true;
    }
}
