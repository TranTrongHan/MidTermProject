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
public class Sach extends SanPham {
     private int soTrang;

    public Sach() {
    }

    public Sach( String ten, double gia, String nhaSX, String moTa,int soTrang) {
        super(ten, gia, nhaSX, moTa);
        this.soTrang = soTrang;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("So trang: %d\n", this.getSoTrang());
    }

    @Override
    public void nhap1SP() {
        super.nhap1SP(); 
        System.out.print("Nhap so trang: ");
        this.soTrang = Integer.parseInt(CauHinh.SC.nextLine());
    }
    

    /**
     * @return the soTrang
     */
    public int getSoTrang() {
        return soTrang;
    }

    /**
     * @param soTrang the soTrang to set
     */
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
     
}
