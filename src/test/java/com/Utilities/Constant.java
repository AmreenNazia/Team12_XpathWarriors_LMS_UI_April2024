package com.Utilities;

public class Constant {
	//Implicit wait applies globally to the whole script and it can sometimes cause unnecessary delays
    public static final int IMPLICIT_PAGE_LOAD=30;
    public static final int IMPLICIT_ELEMENT_WAIT_TIME=10;

//Explicit wait applies to specific web elements. It is more precise & helps avoid unnecessary delays.
    public static final int EXPLICIT_ELEMENT_WAIT_TIME=10;
    public static final String HOME_PAGE_TITLE= "LMS";
}
