package com.jagex.oldscape.pub;

import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "com/jagex/oldscape/pub/OAuthApi"
)
public interface OAuthApi {
	@ObfInfo(
		owner = "com/jagex/oldscape/pub/OAuthApi",
		name = "isOnLoginScreen",
		desc = "()Z"
	)
	boolean isOnLoginScreen();

	@ObfInfo(
		owner = "com/jagex/oldscape/pub/OAuthApi",
		name = "getAccountHash",
		desc = "()J"
	)
	long getAccountHash();

	@ObfInfo(
		owner = "com/jagex/oldscape/pub/OAuthApi",
		name = "setOtlTokenRequester",
		desc = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	void setOtlTokenRequester(OtlTokenRequester var1);

	@ObfInfo(
		owner = "com/jagex/oldscape/pub/OAuthApi",
		name = "setRefreshTokenRequester",
		desc = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	void setRefreshTokenRequester(RefreshAccessTokenRequester var1);
}
