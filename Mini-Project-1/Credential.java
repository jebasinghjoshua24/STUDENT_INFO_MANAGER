class Credential {

    private String website;
    private String username;
    private String encryptedPassword;

    public Credential(String website, String username, String password) {
        this.website = website;
        this.username = username;
        this.encryptedPassword = encrypt(password);
    }

    private String encrypt(String password) {
        return password + "#ENC";
    }

    private String decrypt(String encrypted) {
        return encrypted.replace("#ENC", "");
    }

    public String getWebsite() {
        return website;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword(String masterKey) {
        if (masterKey.equals("vault123")) {
            return decrypt(encryptedPassword);
        }
        return "ACCESS DENIED";
    }
}
