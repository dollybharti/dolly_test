package com.test.vagrant;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Assignment {

	public static String filePath = "/home/qqa0029/fareye/bd-del-react/DollyTestVagrant/Dolly_TestVagrant/jsonfile/jsonData.json";

	@Test
	public static void forigenPlayer() throws Exception {
		JsonPath jsonPath = JsonPath.from(new File(filePath));
		for (int i = 0; i < jsonPath.getList("player.country").size(); i++) {
			String countryName = (String) jsonPath.getList("player.country").get(i);
			if (countryName.equals("India"))
				continue;
			{
				System.out.println("Forigen player:" + countryName);
			}
		}
	}

	@Test
	public static void WicketKeeper() throws Exception {
		JsonPath jsonPath = JsonPath.from(new File(filePath));
		for (int i = 0; i < jsonPath.getList("player.role").size(); i++) {
			String playerRole = (String) jsonPath.getList("player.role").get(i);
			if (playerRole.equals("Wicket-keeper")) {
				System.out.println("Player is:" + playerRole);
			}
		}
	}
}
