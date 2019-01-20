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
        testSort("654321", "123456", false);
        testSort("1234321", "1122334", false);
        testSort("776655", "556677", false);
        testSort("11", "11", false);
        testSort("01", "01", false);
        testSort("10", "01", false);
        testSort("101", "011", false);
        testSort("1000000000", "0000000001", false);

    }

    private static void testSort(String seqToSort, String expectedResult, boolean desc) {
        String result = App3.sort(seqToSort, desc);

        if (!result.equals(expectedResult)) {
            throw new RuntimeException("Не совпадает!!! Получилось: " + result + ". Ожидалось: " + expectedResult);
        }
    }
}
