package bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

public class AggregateException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private List<Throwable> f12641a;

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        int i11 = -1;
        for (Throwable printStackTrace : this.f12641a) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i11++;
            printStream.append(Integer.toString(i11));
            printStream.append(": ");
            printStackTrace.printStackTrace(printStream);
            printStream.append("\n");
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i11 = -1;
        for (Throwable printStackTrace : this.f12641a) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i11++;
            printWriter.append(Integer.toString(i11));
            printWriter.append(": ");
            printStackTrace.printStackTrace(printWriter);
            printWriter.append("\n");
        }
    }
}
