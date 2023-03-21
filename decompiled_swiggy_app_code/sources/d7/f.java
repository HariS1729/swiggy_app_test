package d7;

import com.adobe.xmp.XMPException;
import e7.c;

public class f {
    public static String a(a aVar) {
        return c.c(aVar);
    }

    public static a b(String str) throws XMPException {
        if (str != null && str.length() != 0) {
            return c.a(str);
        }
        throw new XMPException("Empty convert-string", 5);
    }
}
