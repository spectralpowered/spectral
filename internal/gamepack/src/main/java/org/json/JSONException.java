package org.json;

public class JSONException extends Exception {
	Throwable cause;

	public JSONException(Throwable var1) {
		super(var1.getMessage());
		this.cause = var1;
	}

	public Throwable getCause() {
		return this.cause;
	}

	public JSONException(String var1) {
		super(var1);
	}
}
