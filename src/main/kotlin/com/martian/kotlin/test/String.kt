package com.martian.kotlin.test

class StringUtils {

    fun compareVersions(oldVersion: String?, newVersion: String?): Int {
        // 处理空字符串，统一替换为 "0"
        var oldVersion = oldVersion
        var newVersion = newVersion
        if (oldVersion == null || oldVersion.isEmpty()) oldVersion = "0"
        if (newVersion == null || newVersion.isEmpty()) newVersion = "0"
        val parts1 = newVersion.split("\\.".toRegex()).toTypedArray()
        val parts2 = oldVersion.split("\\.".toRegex()).toTypedArray()
        val maxLength = Math.max(parts1.size, parts2.size)
        for (i in 0 until maxLength) {
            // 空位补零并转换为整数进行比较
            val num1 = if (i < parts1.size) toInt(parts1[i]) else 0
            val num2 = if (i < parts2.size) toInt(parts2[i]) else 0
            if (num1 != num2) {
                return Integer.compare(num1, num2)
            }
        }
        return 0
    }

    /**
     * String转Int
     *
     * @param data
     * @return
     */
    fun toInt(data: String?): Int {
        var result = 0
        if (data != null && !data.isEmpty()) {
            result = try {
                Integer.valueOf(data)
            } catch (e: Exception) {
                e.printStackTrace()
                0
            }
        }
        return result
    }
}

fun main(args: Array<String>) {
    val utils = StringUtils();
    println(utils.compareVersions("2.0.0", "1.0.12"));
}