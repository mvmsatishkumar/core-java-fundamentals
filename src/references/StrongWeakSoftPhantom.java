package references;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class StrongWeakSoftPhantom {
    public static void main(String[] args) {
        Object strong = new Object();
        WeakReference<Object> weak = new WeakReference<>(strong);
        SoftReference<Object> soft = new SoftReference<>(strong);

        ReferenceQueue<Object> queue = new ReferenceQueue<>();
        PhantomReference<Object> phantom = new PhantomReference<>(strong, queue);

        System.out.println(strong != null);
        System.out.println(weak.get() != null);
        System.out.println(soft.get() != null);
        System.out.println(phantom.get() == null); // PhantomReference.get() always returns null.
    }
}
// Interview map: strong prevents collection; weak is for weakly held objects; soft is memory-sensitive; phantom supports post-mortem cleanup tracking.
