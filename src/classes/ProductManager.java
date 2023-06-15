package classes;

public class ProductManager {
    public void Add (product product){
        System.out.println("Ürün eklendi: "+ product.getName());
    }
    public void description ( product product){
        System.out.println("ürün bilgisi: "+ product.getDescription());
    }
    public void name (product product){
        System.out.println("Ürün adı: "+ product.getName());
    }
    public void stock ( product product ){
        System.out.println("Depo'daki ürün miktarı: "+ product.getStockAmount());
    }
    public void Id ( product product){
        System.out.println("Ürünün depo'daki ıd numarası: "+ product.getId());

    }
    public void fiyat(product product){
        System.out.println("Ürünün fiyatı: "+ product.getPrice());
    }
}

