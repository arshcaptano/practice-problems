package elan;

import static elan.IntroOneKt.enterAnotherBedroom;
import static elan.IntroOneKt.kotlinMain;

public class Intro {
    public String name = "";
    public final double count = 0D;

    public static void main(String[] args) {
        enterMasterBedroom();
        // enterKitchen();
    }

    private static void enterMasterBedroom() {
        MasterBedroom.name = "i";

        MasterBedroom.count = 1*10.2; // 10.2

        kotlinMain();
        enterAnotherBedroom();

        new AnotherBedroom().openWindow();
    }

   static class MasterBedroom {
        public static String name = "";
        public static double count = 0D;

        void openWindow() {

        }
    }
}


