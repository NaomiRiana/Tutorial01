public class Dosen{
	private String nama;
	private String nik;

	public Dosen(String nama, String nik){
		this.nama = nama;
		this.nik = nik;
	}
	
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public String getNama(){
		return this.nama;
	}
	
	public void setnik(String nik){
		this.nik = nik;
	}
	
	public String getnik(){
		return this.nik;
	}
}
}