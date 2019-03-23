public class SteamGame
{
	private String game;
	private int harga;

	public void SetHarga(int harga){
	this.harga = harga;
	}
	
	public void SetGame(String game){
	this.game=game;
	}

	public int GetHarga(){
		return harga;
	}

	public String GetGame(){
		return game;
	}
	


	public static void main (String [] args)
	{

		SteamGame steam = new SteamGame();
		steam.SetGame("PUBG");
		steam.SetHarga(195500);
		
		String game=steam.GetGame();
		int harga=steam.GetHarga();
		System.out.println("Nama Game : "+game);
		System.out.println("Harga : "+harga);
	}
	
}