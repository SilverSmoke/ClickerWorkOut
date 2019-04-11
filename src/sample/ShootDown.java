package sample;

import java.io.IOException;

public class ShootDown {
    public static void shutdown() throws RuntimeException, IOException {
        System.out.println("Shootdown");
        Runtime.getRuntime().exec("shutdown.exe -s -t 0");
    }
}
