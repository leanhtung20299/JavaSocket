package Entity;

public class Game {
	private int idGame;
	private String nameGame;
	private String levelGame;
	private String pathaddress;
	private String note;
	public Game() {
		// TODO Auto-generated constructor stub
	}
	public Game(int idGame, String nameGame, String levelGame, String pathaddress, String note) {
		super();
		this.idGame = idGame;
		this.nameGame = nameGame;
		this.levelGame = levelGame;
		this.pathaddress = pathaddress;
		this.note = note;
	}
	public int getIdGame() {
		return idGame;
	}
	public void setIdGame(int idGame) {
		this.idGame = idGame;
	}
	public String getNameGame() {
		return nameGame;
	}
	public void setNameGame(String nameGame) {
		this.nameGame = nameGame;
	}
	public String getLevelGame() {
		return levelGame;
	}
	public void setLevelGame(String levelGame) {
		this.levelGame = levelGame;
	}
	public String getPathaddress() {
		return pathaddress;
	}
	public void setPathaddress(String pathaddress) {
		this.pathaddress = pathaddress;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
