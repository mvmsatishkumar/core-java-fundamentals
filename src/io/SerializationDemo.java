package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {
    static class User implements Serializable {
        private static final long serialVersionUID = 1L;
        String name;
        transient String password;

        User(String name, String password) {
            this.name = name;
            this.password = password;
        }
    }

    public static void main(String[] args) throws Exception {
        User user = new User("Satish", "secret");

        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        try (ObjectOutputStream out = new ObjectOutputStream(bytes)) {
            out.writeObject(user);
        }

        try (ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bytes.toByteArray()))) {
            User restored = (User) in.readObject();
            System.out.println(restored.name);
            System.out.println(restored.password); // null because transient fields are not serialized.
        }
    }
}
// Interview trap: static fields are not serialized, and transient instance fields are skipped.
