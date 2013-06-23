package com.musescore.api.v1.model;

import java.util.HashMap;
import java.util.Map;

public enum KeySignature {
	SEVEN_FLAT	("Seven flats", 	-7),
	SIX_FLAT	("Six flats", 	-6),
	FIVE_FLAT	("Five flats", 	-5),
	FOUR_FLAT	("Four flats", 	-4),
	THREE_FLAT	("Three flats", 	-3),
	TWO_FLAT	("Two flats", 	-2),
	ONE_FLAT	("One flat", 	-1),
	
	NATURAL		("Natural", 	0),
	
	ONE_SHARP	("One sharp", 	+1),
	TWO_SHARP	("Two sharps", 	+2),
	THREE_SHARP	("Three sharps", +3),
	FOUR_SHARP	("Four sharps", 	+4),
	FIVE_SHARP	("Five sharps", 	+5),
	SIX_SHARP	("Six sharps", 	+6),
	SEVEN_SHARP	("Seven sharps", +7);
	
	private String label;
	private int code;
	
	private KeySignature(String label, int code){
		this.label = label;
		this.code = code;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	private static Map<Integer, KeySignature> mapping = new HashMap<Integer, KeySignature>();

	static { // executed when the class is loaded
		for (KeySignature keysig : values()) {
			mapping.put(keysig.getCode(), keysig);
		}
	}

	public static KeySignature toKeySignature(int code) {
		return mapping.get(code);
	}

}
