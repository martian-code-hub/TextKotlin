package com.martian.kotlin.test;

public class StringUtil {

    public static int compareVersions(String oldVersion, String newVersion) {

        if (oldVersion == null || oldVersion.isEmpty()) oldVersion = "0";
        if (newVersion == null || newVersion.isEmpty()) newVersion = "0";

        String[] parts1 = newVersion.split("\\.");
        String[] parts2 = oldVersion.split("\\.");

        int maxLength = Math.max(parts1.length, parts2.length);

        for (int i = 0; i < maxLength; i++) {
            int num1 = (i < parts1.length) ? toInt(parts1[i]) : 0;
            int num2 = (i < parts2.length) ? toInt(parts2[i]) : 0;

            if (num1 != num2) {
                return Integer.compare(num1, num2);
            }
        }
        return 0;
    }

    /**
     * String转Int
     *
     * @param data
     * @return
     */
    public static int toInt(String data) {
        int result = 0;
        if (data != null && !data.isEmpty()) {
            try {
                result = Integer.valueOf(data);
            } catch (Exception e) {
                e.printStackTrace();
                result = 0;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(StringUtil.compareVersions("2.0.0", "1.0.12"));
    }

}
