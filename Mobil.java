 public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double waktu;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {
        kecepatan = rubahKecepatan(i);
    }

    public void setWaktu(double jam){
        waktu = rubahSekon(jam);
    }

    private double rubahSekon(double jam){
        return jam * 3600;
    }
    
    private double rubahKecepatan(double kmJam){
        return (kmJam* 1000) / 3600;
    }

    public double hitungJarak(){
        return kecepatan * waktu;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.printf("mampu menempuh kecepatan %.2f m/s\n",kecepatan);
        System.out.println("waktu yang ditempuh " + waktu +" detik" );

        double jarakMeter = hitungJarak(); 
        double jarakKm = jarakMeter / 1000; 
        System.out.println("Jarak yang dapat ditempuh adalah " + jarakKm + " km");
    
    }

}