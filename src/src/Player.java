package src;

public class Player {

	String ipAddress;
	String teamName;
	String teamColor;

	public Player() {
		ipAddress = "";
		teamName = "";
		teamColor = "";
	}

	public void setIPAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getIPAddress() {
		return ipAddress;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamColor(String teamColor) {
		this.teamColor = teamColor;
	}

	public String getTeamColor() {
		return teamColor;
	}
}
