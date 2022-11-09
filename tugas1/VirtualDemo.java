public class VirtualDemo {
    public static void main(String[] args) {
        Gaji s =  new Gaji("Wahyu", "KUBAR", 3, 5000.00);//membuat objek seperti biasa
        //Polymorphic
        Pegawai e = new Gaji("Ini nama", "Samarinda", 2, 2500.00);//Upcasting, mengambil objek dari subclass Gaji dan mengcastingnya sebagai tipe data superclassnya yaitu Pegawai
        System.out.println("Memanggil mailCheck Berdasarkan referensi Gaji --"); 
        s.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();
    }
}
