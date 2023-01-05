import io.spectralpowered.api.rs.Client;
import io.spectralpowered.injector.annotations.Mixin;
import io.spectralpowered.injector.annotations.callback.CallbackInfo;
import io.spectralpowered.injector.annotations.injection.At;
import io.spectralpowered.injector.annotations.injection.Inject;

@Mixin(value = client.class)
public abstract class ClientMixin implements Client {

    @Override
    public abstract boolean isOnLoginScreen();

    @Inject(method = "isOnLoginScreen()Z", at = @At("HEAD"))
    private void inject$isOnLoginScreen(CallbackInfo info) {
        System.out.println("Dab is a bitch!");
    }
}
