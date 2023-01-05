package com.jagex.oldscape.pub;

public interface OAuthApi {
   void setOtlTokenRequester(OtlTokenRequester var1);

   boolean nn();

   void setRefreshTokenRequester(RefreshAccessTokenRequester var1);

   long getAccountHash();

   boolean isOnLoginScreen();

   void ni(OtlTokenRequester var1);

   void nz(RefreshAccessTokenRequester var1);

   void nt(OtlTokenRequester var1);

   void nj(RefreshAccessTokenRequester var1);

   boolean ng();

   boolean nc();
}
