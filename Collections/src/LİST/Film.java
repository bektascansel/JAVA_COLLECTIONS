package LİST;

import java.io.Serializable;

public class Film implements Serializable{
       
	private String ad;
	private String yonetmen;
	private FilmTipi filmTipi;
	private int yayınlanmaYılı;
	
	public Film(String ad, String yönetmen, FilmTipi filmTipi, int yayınlanmaYılı) {
		super();
		this.ad = ad;
		this.yonetmen = yönetmen;
		this.filmTipi = filmTipi;
		this.yayınlanmaYılı = yayınlanmaYılı;
	}

	public Film() {
		super();
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getYönetmen() {
		return yonetmen;
	}

	public void setYönetmen(String yönetmen) {
		this.yonetmen = yönetmen;
	}

	public FilmTipi getFilmTipi() {
		return filmTipi;
	}

	public void setFilmTipi(FilmTipi filmTipi) {
		this.filmTipi = filmTipi;
	}

	public int getYayınlanmaYılı() {
		return yayınlanmaYılı;
	}

	public void setYayınlanmaYılı(int yayınlanmaYılı) {
		this.yayınlanmaYılı = yayınlanmaYılı;
	}
	
	@Override
	public String toString() {
		return " Ad: "+ad+" Yönetmen: "+yonetmen+" Film Tipi: "+filmTipi+" Yayınlanma Yılı: "+yayınlanmaYılı;
	}
	
	@Override
	public boolean equals(Object o) {
	   Film film=(Film)o;
	  
	   return film.ad.equals(this.ad)&&film.yayınlanmaYılı==this.yayınlanmaYılı;
	}
	
	
	public int hashCode() {
		return this.yayınlanmaYılı+this.ad.hashCode();
		
	}
	
	
	
	
}
