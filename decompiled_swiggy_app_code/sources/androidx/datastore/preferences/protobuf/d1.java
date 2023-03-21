package androidx.datastore.preferences.protobuf;

/* compiled from: TextFormatEscaper */
final class d1 {

    /* compiled from: TextFormatEscaper */
    static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ByteString f9989a;

        a(ByteString byteString) {
            this.f9989a = byteString;
        }

        public byte byteAt(int i11) {
            return this.f9989a.c(i11);
        }

        public int size() {
            return this.f9989a.size();
        }
    }

    /* compiled from: TextFormatEscaper */
    private interface b {
        byte byteAt(int i11);

        int size();
    }

    static String a(ByteString byteString) {
        return b(new a(byteString));
    }

    static String b(b bVar) {
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i11 = 0; i11 < bVar.size(); i11++) {
            byte byteAt = bVar.byteAt(i11);
            if (byteAt == 34) {
                sb2.append("\\\"");
            } else if (byteAt == 39) {
                sb2.append("\\'");
            } else if (byteAt != 92) {
                switch (byteAt) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (byteAt >= 32 && byteAt <= 126) {
                            sb2.append((char) byteAt);
                            break;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb2.append((char) (((byteAt >>> 3) & 7) + 48));
                            sb2.append((char) ((byteAt & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    static String c(String str) {
        return a(ByteString.i(str));
    }
}
