package com.jagex.oldscape.pub;

import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "com/jagex/oldscape/pub/OtlTokenResponse"
)
public interface OtlTokenResponse {
	@ObfInfo(
		owner = "com/jagex/oldscape/pub/OtlTokenResponse",
		name = "isSuccess",
		desc = "()Z"
	)
	boolean isSuccess();

	@ObfInfo(
		owner = "com/jagex/oldscape/pub/OtlTokenResponse",
		name = "getToken",
		desc = "()Ljava/lang/String;"
	)
	String getToken();
}
