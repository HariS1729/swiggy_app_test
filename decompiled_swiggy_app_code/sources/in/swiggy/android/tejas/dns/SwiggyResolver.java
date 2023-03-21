package in.swiggy.android.tejas.dns;

import bp0.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lp0.q;
import org.xbill.DNS.Message;
import org.xbill.DNS.Resolver;
import org.xbill.DNS.ResolverListener;
import org.xbill.DNS.SimpleResolver;
import org.xbill.DNS.TSIG;

public class SwiggyResolver implements Resolver {
    private q<Integer, String, Integer, k> logger;
    /* access modifiers changed from: private */
    public List resolvers;
    /* access modifiers changed from: private */
    public int retries = 3;

    private static class Resolution implements ResolverListener {
        boolean done;
        Object[] inprogress;
        ResolverListener listener;
        q<Integer, String, Integer, k> logger;
        int outstanding;
        Message query;
        Resolver[] resolvers;
        Message response;
        int retries;
        int[] sent;
        Throwable thrown;

        Resolution(SwiggyResolver swiggyResolver, Message message, q<Integer, String, Integer, k> qVar) {
            this.logger = qVar;
            List access$000 = swiggyResolver.resolvers;
            Resolver[] resolverArr = (Resolver[]) access$000.toArray(new Resolver[access$000.size()]);
            this.resolvers = resolverArr;
            this.sent = new int[resolverArr.length];
            this.inprogress = new Object[resolverArr.length];
            this.retries = swiggyResolver.retries;
            this.query = message;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:61:0x007f, code lost:
            if ((r5.thrown instanceof java.lang.Exception) != false) goto L_0x008e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0081, code lost:
            r5.thrown = new java.lang.RuntimeException(r5.thrown.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x008e, code lost:
            r5.listener.handleException(r5, (java.lang.Exception) r5.thrown);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0097, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleException(java.lang.Object r6, java.lang.Exception r7) {
            /*
                r5 = this;
                monitor-enter(r5)
                int r0 = r5.outstanding     // Catch:{ all -> 0x0098 }
                r1 = 1
                int r0 = r0 - r1
                r5.outstanding = r0     // Catch:{ all -> 0x0098 }
                boolean r0 = r5.done     // Catch:{ all -> 0x0098 }
                if (r0 == 0) goto L_0x000d
                monitor-exit(r5)     // Catch:{ all -> 0x0098 }
                return
            L_0x000d:
                r0 = 0
                r2 = 0
            L_0x000f:
                java.lang.Object[] r3 = r5.inprogress     // Catch:{ all -> 0x0098 }
                int r4 = r3.length     // Catch:{ all -> 0x0098 }
                if (r2 >= r4) goto L_0x001c
                r4 = r3[r2]     // Catch:{ all -> 0x0098 }
                if (r4 != r6) goto L_0x0019
                goto L_0x001c
            L_0x0019:
                int r2 = r2 + 1
                goto L_0x000f
            L_0x001c:
                int r6 = r3.length     // Catch:{ all -> 0x0098 }
                if (r2 != r6) goto L_0x0021
                monitor-exit(r5)     // Catch:{ all -> 0x0098 }
                return
            L_0x0021:
                int[] r6 = r5.sent     // Catch:{ all -> 0x0098 }
                r3 = r6[r2]     // Catch:{ all -> 0x0098 }
                if (r3 != r1) goto L_0x002e
                org.xbill.DNS.Resolver[] r3 = r5.resolvers     // Catch:{ all -> 0x0098 }
                int r3 = r3.length     // Catch:{ all -> 0x0098 }
                int r3 = r3 - r1
                if (r2 >= r3) goto L_0x002e
                r0 = 1
            L_0x002e:
                boolean r3 = r7 instanceof java.io.InterruptedIOException     // Catch:{ all -> 0x0098 }
                if (r3 == 0) goto L_0x0042
                r6 = r6[r2]     // Catch:{ all -> 0x0098 }
                int r3 = r5.retries     // Catch:{ all -> 0x0098 }
                if (r6 >= r3) goto L_0x003b
                r5.send(r2)     // Catch:{ all -> 0x0098 }
            L_0x003b:
                java.lang.Throwable r6 = r5.thrown     // Catch:{ all -> 0x0098 }
                if (r6 != 0) goto L_0x0053
                r5.thrown = r7     // Catch:{ all -> 0x0098 }
                goto L_0x0053
            L_0x0042:
                boolean r6 = r7 instanceof java.net.SocketException     // Catch:{ all -> 0x0098 }
                if (r6 == 0) goto L_0x0051
                java.lang.Throwable r6 = r5.thrown     // Catch:{ all -> 0x0098 }
                if (r6 == 0) goto L_0x004e
                boolean r6 = r6 instanceof java.io.InterruptedIOException     // Catch:{ all -> 0x0098 }
                if (r6 == 0) goto L_0x0053
            L_0x004e:
                r5.thrown = r7     // Catch:{ all -> 0x0098 }
                goto L_0x0053
            L_0x0051:
                r5.thrown = r7     // Catch:{ all -> 0x0098 }
            L_0x0053:
                boolean r6 = r5.done     // Catch:{ all -> 0x0098 }
                if (r6 == 0) goto L_0x0059
                monitor-exit(r5)     // Catch:{ all -> 0x0098 }
                return
            L_0x0059:
                if (r0 == 0) goto L_0x005f
                int r2 = r2 + r1
                r5.send(r2)     // Catch:{ all -> 0x0098 }
            L_0x005f:
                boolean r6 = r5.done     // Catch:{ all -> 0x0098 }
                if (r6 == 0) goto L_0x0065
                monitor-exit(r5)     // Catch:{ all -> 0x0098 }
                return
            L_0x0065:
                int r6 = r5.outstanding     // Catch:{ all -> 0x0098 }
                if (r6 != 0) goto L_0x0074
                r5.done = r1     // Catch:{ all -> 0x0098 }
                org.xbill.DNS.ResolverListener r6 = r5.listener     // Catch:{ all -> 0x0098 }
                if (r6 != 0) goto L_0x0074
                r5.notifyAll()     // Catch:{ all -> 0x0098 }
                monitor-exit(r5)     // Catch:{ all -> 0x0098 }
                return
            L_0x0074:
                boolean r6 = r5.done     // Catch:{ all -> 0x0098 }
                if (r6 != 0) goto L_0x007a
                monitor-exit(r5)     // Catch:{ all -> 0x0098 }
                return
            L_0x007a:
                monitor-exit(r5)     // Catch:{ all -> 0x0098 }
                java.lang.Throwable r6 = r5.thrown
                boolean r6 = r6 instanceof java.lang.Exception
                if (r6 != 0) goto L_0x008e
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.Throwable r7 = r5.thrown
                java.lang.String r7 = r7.getMessage()
                r6.<init>(r7)
                r5.thrown = r6
            L_0x008e:
                org.xbill.DNS.ResolverListener r6 = r5.listener
                java.lang.Throwable r7 = r5.thrown
                java.lang.Exception r7 = (java.lang.Exception) r7
                r6.handleException(r5, r7)
                return
            L_0x0098:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0098 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.dns.SwiggyResolver.Resolution.handleException(java.lang.Object, java.lang.Exception):void");
        }

        public void receiveMessage(Object obj, Message message) {
            synchronized (this) {
                if (!this.done) {
                    int i11 = 0;
                    while (true) {
                        Object[] objArr = this.inprogress;
                        if (i11 < objArr.length) {
                            if (objArr[i11] == obj && (this.resolvers[i11] instanceof SimpleResolver)) {
                                this.logger.invoke(Integer.valueOf(message.getRcode()), ((SimpleResolver) this.resolvers[i11]).getAddress().getHostString(), Integer.valueOf(this.sent[i11]));
                                break;
                            }
                            i11++;
                        } else {
                            break;
                        }
                    }
                    this.response = message;
                    this.done = true;
                    ResolverListener resolverListener = this.listener;
                    if (resolverListener == null) {
                        notifyAll();
                    } else {
                        resolverListener.receiveMessage(this, message);
                    }
                }
            }
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void send(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.sent
                r1 = r0[r5]
                r2 = 1
                int r1 = r1 + r2
                r0[r5] = r1
                int r0 = r4.outstanding
                int r0 = r0 + r2
                r4.outstanding = r0
                java.lang.Object[] r0 = r4.inprogress     // Catch:{ all -> 0x001c }
                org.xbill.DNS.Resolver[] r1 = r4.resolvers     // Catch:{ all -> 0x001c }
                r1 = r1[r5]     // Catch:{ all -> 0x001c }
                org.xbill.DNS.Message r3 = r4.query     // Catch:{ all -> 0x001c }
                java.lang.Object r1 = r1.sendAsync(r3, r4)     // Catch:{ all -> 0x001c }
                r0[r5] = r1     // Catch:{ all -> 0x001c }
                goto L_0x002a
            L_0x001c:
                r5 = move-exception
                monitor-enter(r4)
                r4.thrown = r5     // Catch:{ all -> 0x002b }
                r4.done = r2     // Catch:{ all -> 0x002b }
                org.xbill.DNS.ResolverListener r5 = r4.listener     // Catch:{ all -> 0x002b }
                if (r5 != 0) goto L_0x0029
                r4.notifyAll()     // Catch:{ all -> 0x002b }
            L_0x0029:
                monitor-exit(r4)     // Catch:{ all -> 0x002b }
            L_0x002a:
                return
            L_0x002b:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x002b }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.dns.SwiggyResolver.Resolution.send(int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
            if (r6.done == false) goto L_0x005b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            wait();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
            r0 = r6.response;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
            if (r0 != null) goto L_0x0064;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
            r0 = r6.thrown;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
            if ((r0 instanceof java.io.IOException) == false) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
            if ((r0 instanceof java.lang.RuntimeException) == false) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
            if ((r0 instanceof java.lang.Error) != false) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
            throw ((java.lang.Error) r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
            throw new java.lang.IllegalStateException("ExtendedResolver failure");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
            throw ((java.lang.RuntimeException) r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0083, code lost:
            throw ((java.io.IOException) r0);
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0057 */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0057 A[LOOP:0: B:9:0x0057->B:37:0x0057, LOOP_START, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public org.xbill.DNS.Message start() throws java.io.IOException {
            /*
                r6 = this;
                r0 = 0
                int[] r1 = r6.sent     // Catch:{ Exception -> 0x004e }
                r2 = r1[r0]     // Catch:{ Exception -> 0x004e }
                int r2 = r2 + 1
                r1[r0] = r2     // Catch:{ Exception -> 0x004e }
                int r1 = r6.outstanding     // Catch:{ Exception -> 0x004e }
                int r1 = r1 + 1
                r6.outstanding = r1     // Catch:{ Exception -> 0x004e }
                java.lang.Object[] r1 = r6.inprogress     // Catch:{ Exception -> 0x004e }
                java.lang.Object r2 = new java.lang.Object     // Catch:{ Exception -> 0x004e }
                r2.<init>()     // Catch:{ Exception -> 0x004e }
                r1[r0] = r2     // Catch:{ Exception -> 0x004e }
                org.xbill.DNS.Resolver[] r1 = r6.resolvers     // Catch:{ Exception -> 0x004e }
                r1 = r1[r0]     // Catch:{ Exception -> 0x004e }
                org.xbill.DNS.Message r2 = r6.query     // Catch:{ Exception -> 0x004e }
                org.xbill.DNS.Message r1 = r1.send(r2)     // Catch:{ Exception -> 0x004e }
                org.xbill.DNS.Resolver[] r2 = r6.resolvers     // Catch:{ Exception -> 0x004e }
                r2 = r2[r0]     // Catch:{ Exception -> 0x004e }
                boolean r2 = r2 instanceof org.xbill.DNS.SimpleResolver     // Catch:{ Exception -> 0x004e }
                if (r2 == 0) goto L_0x004d
                lp0.q<java.lang.Integer, java.lang.String, java.lang.Integer, bp0.k> r2 = r6.logger     // Catch:{ Exception -> 0x004e }
                int r3 = r1.getRcode()     // Catch:{ Exception -> 0x004e }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x004e }
                org.xbill.DNS.Resolver[] r4 = r6.resolvers     // Catch:{ Exception -> 0x004e }
                r4 = r4[r0]     // Catch:{ Exception -> 0x004e }
                org.xbill.DNS.SimpleResolver r4 = (org.xbill.DNS.SimpleResolver) r4     // Catch:{ Exception -> 0x004e }
                java.net.InetSocketAddress r4 = r4.getAddress()     // Catch:{ Exception -> 0x004e }
                java.lang.String r4 = r4.getHostString()     // Catch:{ Exception -> 0x004e }
                int[] r5 = r6.sent     // Catch:{ Exception -> 0x004e }
                r5 = r5[r0]     // Catch:{ Exception -> 0x004e }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x004e }
                r2.invoke(r3, r4, r5)     // Catch:{ Exception -> 0x004e }
            L_0x004d:
                return r1
            L_0x004e:
                r1 = move-exception
                java.lang.Object[] r2 = r6.inprogress
                r0 = r2[r0]
                r6.handleException(r0, r1)
                monitor-enter(r6)
            L_0x0057:
                boolean r0 = r6.done     // Catch:{ all -> 0x0084 }
                if (r0 != 0) goto L_0x005f
                r6.wait()     // Catch:{ InterruptedException -> 0x0057 }
                goto L_0x0057
            L_0x005f:
                monitor-exit(r6)     // Catch:{ all -> 0x0084 }
                org.xbill.DNS.Message r0 = r6.response
                if (r0 == 0) goto L_0x0065
                return r0
            L_0x0065:
                java.lang.Throwable r0 = r6.thrown
                boolean r1 = r0 instanceof java.io.IOException
                if (r1 != 0) goto L_0x0081
                boolean r1 = r0 instanceof java.lang.RuntimeException
                if (r1 != 0) goto L_0x007e
                boolean r1 = r0 instanceof java.lang.Error
                if (r1 == 0) goto L_0x0076
                java.lang.Error r0 = (java.lang.Error) r0
                throw r0
            L_0x0076:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "ExtendedResolver failure"
                r0.<init>(r1)
                throw r0
            L_0x007e:
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
                throw r0
            L_0x0081:
                java.io.IOException r0 = (java.io.IOException) r0
                throw r0
            L_0x0084:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x0084 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.dns.SwiggyResolver.Resolution.start():org.xbill.DNS.Message");
        }

        /* access modifiers changed from: package-private */
        public void startAsync(ResolverListener resolverListener) {
            this.listener = resolverListener;
            send(0);
        }
    }

    public SwiggyResolver(Resolver[] resolverArr, q<Integer, String, Integer, k> qVar) {
        ArrayList arrayList = new ArrayList();
        this.resolvers = arrayList;
        this.logger = qVar;
        arrayList.addAll(Arrays.asList(resolverArr));
    }

    public Message send(Message message) throws IOException {
        return new Resolution(this, message, this.logger).start();
    }

    public Object sendAsync(Message message, ResolverListener resolverListener) {
        Resolution resolution = new Resolution(this, message, this.logger);
        resolution.startAsync(resolverListener);
        return resolution;
    }

    public void setEDNS(int i11) {
        for (int i12 = 0; i12 < this.resolvers.size(); i12++) {
            ((Resolver) this.resolvers.get(i12)).setEDNS(i11);
        }
    }

    public void setIgnoreTruncation(boolean z11) {
        for (int i11 = 0; i11 < this.resolvers.size(); i11++) {
            ((Resolver) this.resolvers.get(i11)).setIgnoreTruncation(z11);
        }
    }

    public void setPort(int i11) {
        for (int i12 = 0; i12 < this.resolvers.size(); i12++) {
            ((Resolver) this.resolvers.get(i12)).setPort(i11);
        }
    }

    public void setTCP(boolean z11) {
        for (int i11 = 0; i11 < this.resolvers.size(); i11++) {
            ((Resolver) this.resolvers.get(i11)).setTCP(z11);
        }
    }

    public void setTSIGKey(TSIG tsig) {
        for (int i11 = 0; i11 < this.resolvers.size(); i11++) {
            ((Resolver) this.resolvers.get(i11)).setTSIGKey(tsig);
        }
    }

    public void setTimeout(int i11, int i12) {
        for (int i13 = 0; i13 < this.resolvers.size(); i13++) {
            ((Resolver) this.resolvers.get(i13)).setTimeout(i11, i12);
        }
    }

    public void setEDNS(int i11, int i12, int i13, List list) {
        for (int i14 = 0; i14 < this.resolvers.size(); i14++) {
            ((Resolver) this.resolvers.get(i14)).setEDNS(i11, i12, i13, list);
        }
    }

    public void setTimeout(int i11) {
        setTimeout(i11, 0);
    }
}
