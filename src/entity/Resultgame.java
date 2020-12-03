package Entity;

public class Resultgame {
	private int idResult;
	private int idGame;
	private String usernameAccountwin;
	private String usernameAccountLose;
	private float timeAccountwin;
	private float timeAccountlose;
	private boolean statusdraw;
	
	
	public Resultgame() {
		// TODO Auto-generated constructor stub
	}


	public Resultgame(int idResult, int idGame, String usernameAccountwin, String usernameAccountLose,
			float timeAccountwin, float timeAccountlose, boolean statusdraw) {
		super();
		this.idResult = idResult;
		this.idGame = idGame;
		this.usernameAccountwin = usernameAccountwin;
		this.usernameAccountLose = usernameAccountLose;
		this.timeAccountwin = timeAccountwin;
		this.timeAccountlose = timeAccountlose;
		this.statusdraw = statusdraw;
	}


	public int getIdResult() {
		return idResult;
	}


	public void setIdResult(int idResult) {
		this.idResult = idResult;
	}


	public int getIdGame() {
		return idGame;
	}


	public void setIdGame(int idGame) {
		this.idGame = idGame;
	}


	public String getUsernameAccountwin() {
		return usernameAccountwin;
	}


	public void setUsernameAccountwin(String usernameAccountwin) {
		this.usernameAccountwin = usernameAccountwin;
	}


	public String getUsernameAccountLose() {
		return usernameAccountLose;
	}


	public void setUsernameAccountLose(String usernameAccountLose) {
		this.usernameAccountLose = usernameAccountLose;
	}


	public float getTimeAccountwin() {
		return timeAccountwin;
	}


	public void setTimeAccountwin(float timeAccountwin) {
		this.timeAccountwin = timeAccountwin;
	}


	public float getTimeAccountlose() {
		return timeAccountlose;
	}


	public void setTimeAccountlose(float timeAccountlose) {
		this.timeAccountlose = timeAccountlose;
	}


	public boolean isStatusdraw() {
		return statusdraw;
	}


	public void setStatusdraw(boolean statusdraw) {
		this.statusdraw = statusdraw;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
