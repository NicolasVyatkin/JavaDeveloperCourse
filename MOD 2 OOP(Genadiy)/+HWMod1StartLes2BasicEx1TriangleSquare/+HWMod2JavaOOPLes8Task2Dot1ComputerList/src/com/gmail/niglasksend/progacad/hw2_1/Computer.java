package com.gmail.niglasksend.progacad.hw2_1;
/**
 * Class that construct the computer
 */
public class Computer {
    private String mark;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private float frequencyCPU;

    public Computer(final String mark, final int serialNumber, final float price, final int quantityCPU, final float frequencyCPU) {
        this.mark = mark;
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(final String mark) {
        this.mark = mark;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(final int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(final float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(final int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public float getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(final int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    @Override
    public String toString() {
        return "com.gmail.niglasksend.progacad.hw2_1.Computer{" +
                "Trade mark - " + mark + '\'' +
                ", Serial number - " + serialNumber + '\'' +
                ", Price - " + price +
                ", CPU quantity - " + quantityCPU +
                ", CPU frequency - " + frequencyCPU +
                '}';
    }

}
