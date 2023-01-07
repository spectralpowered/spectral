package com.jagex.oldscape.pub;

import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "com/jagex/oldscape/pub/RefreshAccessTokenResponse"
)
public interface RefreshAccessTokenResponse {
	@ObfInfo(
		owner = "com/jagex/oldscape/pub/RefreshAccessTokenResponse",
		name = "isSuccess",
		desc = "()Z"
	)
	boolean isSuccess();

	@ObfInfo(
		owner = "com/jagex/oldscape/pub/RefreshAccessTokenResponse",
		name = "getAccessToken",
		desc = "()Ljava/lang/String;"
	)
	String getAccessToken();

	@ObfInfo(
		owner = "com/jagex/oldscape/pub/RefreshAccessTokenResponse",
		name = "getRefreshToken",
		desc = "()Ljava/lang/String;"
	)
	String getRefreshToken();
}
