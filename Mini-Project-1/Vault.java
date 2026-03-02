class Vault {

    private Credential[] vault;
    private int count;

    public Vault() {
        vault = new Credential[2];
        count = 0;
    }

    public void addCredential(Credential credential) {
        if (count == vault.length) {
            expandVault();
        }
        vault[count++] = credential;
        System.out.println("Credential saved successfully.");
    }

    private void expandVault() {
        Credential[] newVault = new Credential[vault.length * 2];
        for (int i = 0; i < vault.length; i++) {
            newVault[i] = vault[i];
        }
        vault = newVault;
        System.out.println("Vault expanded. New size: " + vault.length);
    }

    public void viewCredential(String website, String masterKey) {
        for (int i = 0; i < count; i++) {
            if (vault[i].getWebsite().equalsIgnoreCase(website)) {
                System.out.println("Website : " + vault[i].getWebsite());
                System.out.println("Username: " + vault[i].getUsername());
                System.out.println("Password: " + vault[i].getPassword(masterKey));
                return;
            }
        }
        System.out.println("Credential not found.");
    }
}
