package com.company;

class MyArrayDataException extends CustomException {
    MyArrayDataException(int i, int k) {
        super(String.format("Неверные данные находятся в ячейке [%d, %d]\n", i, k));

    }
}
