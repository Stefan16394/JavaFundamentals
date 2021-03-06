package P05_security_system;

public class PinCodeCheck extends SecurityCheck {

    private PinCodeUI pinCodeUI;

    public PinCodeCheck(PinCodeUI securityUI) {
        this.pinCodeUI = securityUI;
    }

    @Override
    public boolean validateUser() {
        int pin = pinCodeUI.requestPinCode();
        if (isValid(pin)) {
            return true;
        }

        return false;
    }

    private boolean isValid(int pin) {
        return pin==1234;
    }
}
