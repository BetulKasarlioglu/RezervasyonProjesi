import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIInput;
import javax.faces.event.ActionEvent;
 

public class RezervasyonBean {

	private static int masanumarasý;
	private Masalar masalar=new Masalar(); 
	private Rezervasyon rezervasyon=new Rezervasyon();
	public static List<Masalar> masaliste = new ArrayList<Masalar>();
	private static  List<KisiBilgileri> kisiliste = new ArrayList<KisiBilgileri>();
	 
	public void masaEkle(){
		getMasaliste().add(getMasalar());
		setMasalar(new Masalar());
	
	}
	public void kisiEkle(ActionEvent e){
	   // UIInput veri=(UIInput)e.getComponent().findComponent("masaNo");
	//	String gelen=veri.getValue().toString();
		//masanumarasý=Integer.parseInt(gelen);
		getKisiliste().add(getMasalar().getBilgileri());
		getMasalar().setBilgileri(new KisiBilgileri());
		
		
		
	}
	
	public void duzenle(){
		getMasaliste().add(getMasalar());
		setMasalar(new Masalar());
	}
 
	public List<Masalar> getMasaliste() {
		return masaliste;
	}
	public void setMasaliste(List<Masalar> masaliste) {
		this.masaliste = masaliste;
	}
	public List<KisiBilgileri> getKisiliste() {
		return kisiliste;
	}
	public void setKisiliste(List<KisiBilgileri> kisiliste) {
		this.kisiliste = kisiliste;
	}
	 
	public Masalar getMasalar() {
		return masalar;
	}
	public void setMasalar(Masalar masalar) {
		this.masalar = masalar;
	}
	public Rezervasyon getRezervasyon() {
		return rezervasyon;
	}
	public void setRezervasyon(Rezervasyon rezervasyon) {
		this.rezervasyon = rezervasyon;
	}
	public int getMasanumarasý() {
		return masanumarasý;
	}
	public void setMasanumarasý(int masanumarasý) {
		this.masanumarasý = masanumarasý;
	}
 
}
