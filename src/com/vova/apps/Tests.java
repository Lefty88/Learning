package com.vova.apps;

public class Tests {
    public static void main(String[] args) {
        testSort("123456", "654321");
        testSort("1234321", "4332211");
        testSort("556677", "776655");
        testSort("11", "11");
        testSort("01", "10");
        testSort("10", "10");
        testSort("101", "110");
        testSort("0000000001", "1000000000");
    }

    private static void testSort(String seqToSort, String expectedResult) {
        String result = App3.sort(seqToSort);

        if (!result.equals(expectedResult)) {
            throw new RuntimeException("Не совпадает!!! Получилось: " + result + ". Ожидалось: " + expectedResult);
        }
    }
}
