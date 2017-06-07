package org.thexxturboxx.rfintegration.core;

public class Global {
	/*
	 * //Config public static boolean THAUMCRAFT; public static boolean PROJECTE;
	 */

	/** All the Dependencies for our mod */
	public static final String Deps = "required-after:reforged;after:baubles;after:thaumcraft;after:projecte;after:botania;after:jei";

	/** All the Dependencies for the child mods */
	public static final String ChildDeps = "required-after:reforged;required-after:reforgedintegrationcore";

	/** Accepted Minecraft Versions */
	public static final String AcceptedVersions = "[1.11, 1.11.2]";

	/** The version of the mods */
	public static final String VERSION = "0.4";

	/** The version of the mods */
	public static final String updateJSON = "https://raw.githubusercontent.com/ThexXTURBOXx/UpdateJSONs/master/rf-integration.json";
}
