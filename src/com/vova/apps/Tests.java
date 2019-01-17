package com.vova.apps;

public class Tests {
    public static void main(String[] args) {
        testSort("123456", "654321", true);
        testSort("1234321", "4332211", true);
        testSort("556677", "776655", true);
        testSort("11", "11", true);
        testSort("01", "10", true);
        testSort("10", "10", true);
        testSort("101", "110", true);
        testSort("0000000001", "1000000000", true);

    }

    private static void testSort(String seqToSort, String expectedResult, boolean desc) {
        String result = App3.sort(seqToSort, desc);

        if (!result.equals(expectedResult)) {
            throw new RuntimeException("Не совпадает!!! Получилось: " + result + ". Ожидалось: " + expectedResult);
        }
    }
}
