package if21;
public class Enkapsulasi_Ernest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pegawai ernest = new Pegawai();
		//ernest.nama = "Ernest";
		ernest.setNama("Ernest Wijaya");
		//ernest.gajiPokok = 100000;
		ernest.setGajiPokok(100000);
		//ernest.tunjangan = 1000000;
		ernest.setTunjangan(1000000);
		
		ernest.kataKata = "Baik Hati dan Suka Menabung";
		ernest.tampilBiodata();
		
	}
}
class Pegawai {
	String nama;
	int gajiPokok;
	int tunjangan;
	String kataKata;
	
	//setter method 
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setGajiPokok(int gajiPokok) {
		this.gajiPokok = gajiPokok;
	}
	public void setTunjangan(int tunjangan) {
		this.tunjangan = tunjangan;
	}
	
	//getter method 
	public String getNama() {
		return nama;
	}
	
	public int getGajiPokok() {
		return gajiPokok;
	}
	
	
	int totalGaji() {
		return gajiPokok + tunjangan;
	}
	
	void tampilBiodata() {
		System.out.println("Nama Lengkap = " + nama);
		System.out.println("Gaji Pokok Rp" + gajiPokok);
		System.out.println("Tunjangan Rp" + tunjangan);
		System.out.println("Kata Kata = " + kataKata);
		System.out.println("Total Gaji Rp " + totalGaji());
	}
}