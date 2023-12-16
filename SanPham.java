/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tth.sanpham;

/**
 *
 * @author Administrator
 */
public class SanPham extends QLSP {
    private static int dem;
    private int Id = ++dem;
    private String ten;
    private double gia;
    private String nhaSX;
    private String moTa;

    public SanPham() {
    }
    
    public SanPham(String ten, double gia, String nhaSX, String moTa) {
        this.ten = ten;
        this.gia = gia;
        this.nhaSX = nhaSX;
        this.moTa = moTa;
    }
    public void hienThi(){
        System.out.printf("Ma san pham: %d\nTen: %s\nGia: %.2f\nNha san xuat: %s\nMo ta: %s\n",
                this.Id,this.ten,this.gia,this.nhaSX,this.moTa);
    }
    public void nhap1SP(){
        System.out.print("Nhap ten: ");
        this.ten = CauHinh.SC.nextLine();
        System.out.print("Nhap gia: ");
        this.gia = Double.parseDouble(CauHinh.SC.nextLine());
        System.out.print("Nhap nha san xuat: ");
        this.nhaSX = CauHinh.SC.nextLine();
        System.out.print("Nhap mo ta: ");
        this.moTa = CauHinh.SC.nextLine();
        
    }
    public int soSanh(SanPham p){
        double g1 = this.getGia();
        double g2 = p.getGia();
        if(g1>g2)
            return 1;
        else if(g1<g2)
            return -1;
        return 0;
    }
    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the gia
     */
    public double getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(double gia) {
        this.gia = gia;
    }

    /**
     * @return the nhaSX
     */
    public String getNhaSX() {
        return nhaSX;
    }

    /**
     * @param nhaSX the nhaSX to set
     */
    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    /**
     * @return the moTa
     */
    public String getMoTa() {
        return moTa;
    }

    /**
     * @param moTa the moTa to set
     */
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    
    
}
