/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Coste {
    private static int nCount=1;
    private int nRow;
    private Date accountingDate;
    private Date date;
    private String supplier;
    private String nDeliveryNote;
    private String carRegistration;
    private String concepto;
    private double amount;
    private double price;
    private double Total;
    private String imputacionCode;
    
    
    
    
    
    
    
    
/**
 * Es importante saber que cada tipo de dato ocupa un determinado espacio
 * Long 8 bytes
 * integer 4 bytes
 * short 2 bytes
 * byte 1 byte
 * Double 8 bytes
 * Float 4 bytes
 * Boolean 1 byte
 * Char 2 bytes
 * String 2 bytes por caracter
 */    
  public Coste(){
      this.nRow=Coste.nCount;
      nCount++;
    };
  public Coste(int nRow ,Date accountingDate,Date date,String supplier,String nDeliveryNote,String carRegistration,String concepto ,double amount,double price,String imputacionCode ){
      this.nRow=Coste.nCount;
      this.accountingDate=accountingDate;
      this.date=date;
      this.supplier=supplier;
      this.nDeliveryNote=nDeliveryNote;
      this.carRegistration=carRegistration;
      this.concepto=concepto;
      this.amount=amount;
      this.price=price;
      this.imputacionCode=imputacionCode;
      nCount++;
  };

    public int getnRow() {
        return nRow;
    }

    public void setnRow() {
        this.nRow = Coste.nCount;
    }

    public Date getAccountingDate() {
        return accountingDate;
    }

    public void setAccountingDate(Date accountingDate) {
        this.accountingDate = accountingDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getnDeliveryNote() {
        return nDeliveryNote;
    }

    public void setnDeliveryNote(String nDeliveryNote) {
        this.nDeliveryNote = nDeliveryNote;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public String getImputacionCode() {
        return imputacionCode;
    }

    public void setImputacionCode(String imputacionCode) {
        this.imputacionCode = imputacionCode;
    }


  
            
            
            
    
}
