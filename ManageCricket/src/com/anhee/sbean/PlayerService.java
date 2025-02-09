package com.anhee.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerService {
	
	@Autowired
	private Player player; 
	
	public void displayPlayerInfo() {
		
		System.out.println("playe Id : "+player.getPlayerId());
		System.out.println("playe Name : "+player.getPlayerName());
		System.out.println("player Team : "+player.getTeamName());
		System.out.println("Number of Year "+player.getYearsNumber());
		
	}

}
