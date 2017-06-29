package org.solanki.ankit.webmessengr.database;

import java.util.HashMap;
import java.util.Map;

import org.solanki.ankit.webmessengr.model.Message;
import org.solanki.ankit.webmessengr.model.Profile;

public class Database {
	
	private static Map<Long, Message> meesages = new HashMap<>();
	private static Map<Long,Profile> profiles = new HashMap<>();
	public static Map<Long, Message> getMeesages() {
		return meesages;
	}
	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}
}
