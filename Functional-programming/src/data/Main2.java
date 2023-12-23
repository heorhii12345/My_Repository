package data;

import java.util.function.Supplier;

public class Main2 {

    static String name;
    static String phone;

    public static void main(String[] args) {

        name = "Tom";
        phone = "555 123-8596";

        User user = getUsername(User::new);
        user.setName(name);
        user.setPhone(phone);
        System.out.println("User name is " + user.getName() +
                ", phone is " + user.getPhone());

        user = getUsername(() -> new User(name,  phone));
        System.out.println("User name is " + user.getName() +
                ", phone is " + user.getPhone());
    }

    public static User getUsername(Supplier<User> supplier) {
        return supplier.get();
    }
}
